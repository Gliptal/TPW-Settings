package gui;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.*;
import javax.swing.*;

import exec.*;
import exec.laf.*;
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
  private JButton presetsDeleteButton;
  private JButton presetsSaveButton;
  private JLabel versionLabel;
  private LabeledButton[] modButtons;

  public MainWindow()
    {
    super(Frames.MAIN_WIDTH, Frames.MAIN_HEIGHT, Text.PROGRAM_NAME);

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

  public LabeledButton getModButton(int which)
    {
    return modButtons[which];
    }

  public void addPresetsToComboBox()
    {
    String[] presetFiles = FileParser.parseDirectoryFor(Files.PRESET_EXTENSION);

    for (int i = 0; i < presetFiles.length; i += 1)
      {
      String presetWithoutExtension = presetFiles[i].replaceFirst(Files.PRESET_EXTENSION, "");

      presetsComboBox.addItem(presetWithoutExtension);
      }

    presetsComboBox.insertItemAt(Files.REVERT, ComboBoxParameter.COMBO_BOX_TOP);
    presetsComboBox.setSelectedIndex(ComboBoxParameter.COMBO_BOX_TOP);
    }

  private void forgePanels()
    {
    presetsPanel = new JPanel(Layouts.FRAME_MAIN_PRESETS());
    modsPanel = new JPanel(Layouts.FRAME_MAIN_MODS());

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
    presetsDeleteButton = new JButton(Text.BUTTON_PRESETS_DELETE);
    presetsSaveButton = new JButton(Text.BUTTON_PRESETS_SAVE);

    presetsPanel.add(presetsDeleteButton);
    presetsPanel.add(presetsSaveButton);
    }

  private void forgeVersionLabel()
    {
    versionLabel = new JLabel(Text.PROGRAM_VERSION);

    presetsPanel.add(versionLabel);
    }

  private void forgeModButtons()
    {
    modButtons = new LabeledButton[CommonMod.NUMBER_OF_MODS];

    for (int i = 0; i < CommonMod.NUMBER_OF_MODS; i += 1)
      {
      modButtons[i] = new LabeledButton(CommonMod.MOD_NAMES[i]);

      modsPanel.add(modButtons[i]);
      }
    }

  private void tailorVersionLabel()
    {
    versionLabel.setHorizontalAlignment(JLabel.RIGHT);
    }

  private void tailorModButtons()
    {
    for (int i = 0; i < CommonMod.NUMBER_OF_MODS; i += 1)
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
    versionLabel.addMouseListener(new OpenLink(Text.README_URL));
    }

  private void setModButtonsAction()
    {
    for (int i = 0; i < CommonMod.NUMBER_OF_MODS; i += 1)
      modButtons[i].addButtonListener(new ShowWindow(Main.modWindows[i], true));
    }
  }