package gui;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.*;
import javax.swing.*;

import exec.*;
import exec.theme.*;
import fileio.*;
import gui.components.*;
import gui.listeners.presets.*;
import gui.listeners.windows.*;
import mods.*;


public class MainWindow extends Window
  {
  public class PrepareInput implements ActionListener
    {
    public void actionPerformed(ActionEvent event)
      {
      presetsComboBox.setEditable(true);
      presetsComboBox.grabFocus();
      }
    }

  private class OpenLink extends MouseAdapter
    {
    private URI link;

    private OpenLink(String link)
      {
      try
        {
        this.link = new URI(link);
        }
      catch (URISyntaxException exception) {}
      }

    public void mouseClicked(MouseEvent event)
      {
      try
        {
        Desktop.getDesktop().browse(link);
        }
      catch (IOException exception) {}
      }
    }

  private JPanel presetsPanel;
  private JPanel modsPanel;

  private JComboBox<String> presetsComboBox;
  private JButton           presetsDeleteButton;
  private JButton           presetsSaveButton;
  private JLabel            versionLabel;
  private LabeledButton[]   modButtons;

  public MainWindow()
    {
    super(Frames.MAIN_WIDTH, Frames.MAIN_HEIGHT, Text.PROGRAM);

    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    forgePanels();
    forgePresetsComboBox();
    forgePresetsButtons();
    forgeVersionLabel();
    forgeModButtons();

    tailorVersionLabel();
    tailorModButtons();

    setPresetsActions();
    setLabelAction();
    setModButtonsAction();
    }

  public JComboBox<String> getPresetsComboBox()
    {
    return presetsComboBox;
    }

  public LabeledButton getModButton(int mod)
    {
    return modButtons[mod];
    }

  public void addPresetsToComboBox()
    {
    String[] presetFiles = FileParser.getFilteredFiles(Files.PRESET_EXTENSION);

    for (String preset:presetFiles)
      presetsComboBox.addItem(preset.replaceFirst(Files.PRESET_EXTENSION, ""));

    presetsComboBox.insertItemAt(Files.REVERT, ComboBoxParameter.COMBO_BOX_TOP);
    presetsComboBox.setSelectedIndex(ComboBoxParameter.COMBO_BOX_TOP);
    }

  private void forgePanels()
    {
    presetsPanel = new JPanel(Layouts.PRESETS());
    modsPanel    = new JPanel(Layouts.MODS_GRID());

    mainPanel.add(presetsPanel, BorderLayout.NORTH);
    mainPanel.add(modsPanel, BorderLayout.CENTER);
    }

  private void forgePresetsComboBox()
    {
    presetsComboBox = new JComboBox<String>();

    presetsPanel.add(presetsComboBox);
    }

  private void forgePresetsButtons()
    {
    presetsDeleteButton = new JButton(Text.PRESETS_DELETE);
    presetsSaveButton   = new JButton(Text.PRESETS_SAVE);

    presetsPanel.add(presetsDeleteButton);
    presetsPanel.add(presetsSaveButton);
    }

  private void forgeVersionLabel()
    {
    versionLabel = new JLabel("<html> <a href=link>["+Text.PROGRAM_VERSION+"] HELP</a> </html>");

    presetsPanel.add(versionLabel);
    }

  private void forgeModButtons()
    {
    modButtons = new LabeledButton[Mods.NUMBER_OF_MODS];

    for (int i = 0; i < Mods.NUMBER_OF_MODS; i += 1)
      {
      modButtons[i] = new LabeledButton(Mods.MOD_NAMES[i]);

      modsPanel.add(modButtons[i]);
      }
    }

  private void tailorVersionLabel()
    {
    versionLabel.setHorizontalAlignment(JLabel.RIGHT);
    }

  private void tailorModButtons()
    {
    for (int i = 0; i < Mods.NUMBER_OF_MODS; i += 1)
      modButtons[i].setToolTip(ToolTips.MODS[i]);
    }

  private void setPresetsActions()
    {
    presetsComboBox.addActionListener(new SavePreset(presetsComboBox));
    presetsComboBox.addItemListener(new LoadPreset(presetsComboBox));

    presetsDeleteButton.addActionListener(new DeletePreset(presetsComboBox));
    presetsSaveButton.addActionListener(new PrepareInput());
    }

  private void setLabelAction()
    {
    versionLabel.addMouseListener(new OpenLink(Files.README_URL));
    }

  private void setModButtonsAction()
    {
    for (int i = 0; i < Mods.NUMBER_OF_MODS; i += 1)
      modButtons[i].addButtonListener(new ToggleWindow(Main.modWindows[i], true));
    }
  }