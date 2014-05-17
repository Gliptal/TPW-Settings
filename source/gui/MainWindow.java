package gui;

import exec.*;
import exec.userinterface.*;
import fileio.*;
import gui.combinations.*;
import gui.listeners.*;
import gui.listeners.presets.*;
import java.awt.*;
import javax.swing.*;
import mods.*;


public class MainWindow extends CommonWindow
  {
  private JPanel presetsPanel;
  private JPanel modsPanel;

  private JComboBox<String> presetsComboBox;
  private JButton presetsDeleteButton;
  private JButton presetsSaveButton;

  private JLabel versionLabel;

  private LabeledButton[] modButtons;

  public MainWindow()
    {
    super(Windows.MAIN_WIDTH, Windows.MAIN_HEIGHT, Text.PROGRAM_NAME);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    createAndAddPanels();
    createAndAddPresetsElements();
    createAndAddVersionLabel();
    createAndAddModButtons();

    setPresetsActions();
    setModButtonsAction();
    setLabelAction();
    }

  public void addPresetsToComboBox()
    {
    String[] presetFiles = FileBuffer.parseDirectoryFor(Files.PRESET_EXTENSION);

    for (int i = 0; i < presetFiles.length; i += 1)
      presetsComboBox.addItem(presetFiles[i].replaceFirst(Files.PRESET_EXTENSION, ""));

    presetsComboBox.insertItemAt(Files.REVERT, LabeledComboBox.COMBO_BOX_TOP);
    presetsComboBox.setSelectedIndex(LabeledComboBox.COMBO_BOX_TOP);
    }

  public LabeledButton getModButton(int which)
    {
    return modButtons[which];
    }

  public JComboBox<String> getPresetsComboBox()
    {
    return presetsComboBox;
    }

  private void createAndAddPanels()
    {
    presetsPanel = new JPanel(Layouts.MAIN_PRESETS());
    modsPanel = new JPanel(Layouts.MAIN_MODS());

    mainPanel.add(presetsPanel, BorderLayout.NORTH);
    mainPanel.add(modsPanel, BorderLayout.CENTER);
    }

  private void createAndAddPresetsElements()
    {
    createAndAddPresetsComboBox();
    createAndAddPresetsButtons();
    }

  private void createAndAddVersionLabel()
    {
    versionLabel = new JLabel(Text.PROGRAM_VERSION);

    versionLabel.setHorizontalAlignment(JLabel.RIGHT);

    presetsPanel.add(versionLabel);
    }

  private void createAndAddModButtons()
    {
    modButtons = new LabeledButton[CommonMod.NUMBER_OF_MODS];

    for (int i = 0; i < CommonMod.NUMBER_OF_MODS; i += 1)
      {
      modButtons[i] = new LabeledButton(CommonMod.MOD_NAMES[i]);

      modButtons[i].setToolTip(ToolTips.MODS[i]);

      modsPanel.add(modButtons[i]);
      }
    }

  private void createAndAddPresetsComboBox()
    {
    presetsComboBox = new JComboBox<String>();

    presetsPanel.add(presetsComboBox);
    }

  private void createAndAddPresetsButtons()
    {
    presetsDeleteButton = new JButton(Text.BUTTON_PRESETS_DELETE);
    presetsSaveButton = new JButton(Text.BUTTON_PRESETS_SAVE);

    presetsPanel.add(presetsDeleteButton);
    presetsPanel.add(presetsSaveButton);
    }

  private void setPresetsActions()
    {
    presetsComboBox.addActionListener(new AddPreset(presetsComboBox));
    presetsComboBox.addItemListener(new LoadPreset(presetsComboBox));

    presetsDeleteButton.addActionListener(new DeletePreset(presetsComboBox));
    presetsSaveButton.addActionListener(new SavePreset(presetsComboBox));
    }

  private void setModButtonsAction()
    {
    for (int i = 0; i < CommonMod.NUMBER_OF_MODS; i += 1)
      {
      if (i == CommonMod.HUD_ID)
        modButtons[i].addButtonListener(new ShowTwoWindows(Main.modWindows[i], Main.colorWindow, true));
      else
        modButtons[i].addButtonListener(new ShowWindow(Main.modWindows[i], true));
      }
    }

  private void setLabelAction()
    {
    versionLabel.addMouseListener(new OpenOnlineReadme());
    }
  }