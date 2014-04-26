package gui;

import exec.*;
import exec.userinterface.*;
import fileio.*;
import gui.combinations.*;
import gui.listeners.*;
import gui.listeners.presets.*;
import java.awt.*;
import java.io.*;
import javax.swing.*;
import mods.*;


public class MainWindow extends CommonWindow
  {
  private JPanel presetsPanel;
  private JPanel modsPanel;

  private JComboBox<String> presetsComboBox;
  private JButton presetsDeleteButton;
  private JButton presetsSaveButton;

  private LabeledButton[] modButtons;

  public MainWindow()
    {
    super(Windows.MAIN_WINDOW_WIDTH, Windows.MAIN_WINDOW_HEIGHT, Windows.MAIN_WINDOW_TITLE);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    createAndAddPanels();
    createAndAddComboBoxes();
    createAndAddButtons();

    setListeners();
    }

  public JComboBox<String> getComboBox()
    {
    return presetsComboBox;
    }

  public LabeledButton getModButton(int which)
    {
    return modButtons[which];
    }

  public void savePresetsToComboBox()
    {
    File directory = new File(".");
    //System.out.println(System.getProperty("user.dir"));
    String[] presetFiles = directory.list(new FilenameFilter()
                                            {
                                            public boolean accept(File directory, String name)
                                              {
                                              return name.endsWith(ActionBuffer.PRESET_EXTENSION);
                                              }
                                            }
                                          );

    for (int i = 0; i < presetFiles.length; i += 1)
      presetsComboBox.addItem(presetFiles[i].replaceFirst(ActionBuffer.PRESET_EXTENSION, ""));

    presetsComboBox.insertItemAt(ActionBuffer.REVERT_FILE_NAME, LabeledComboBox.COMBO_BOX_TOP);
    presetsComboBox.setSelectedIndex(LabeledComboBox.COMBO_BOX_TOP);
    }

  private void createAndAddPanels()
    {
    presetsPanel = new JPanel(new GridLayout(1, 5, Spacing.GRID_BUTTONS, Spacing.GRID_BUTTONS));
    modsPanel = new JPanel(new GridLayout(4, 4, Spacing.GRID_BUTTONS, Spacing.GRID_BUTTONS));

    mainPanel.add(presetsPanel, BorderLayout.NORTH);
    mainPanel.add(modsPanel, BorderLayout.CENTER);
    }

  private void createAndAddComboBoxes()
    {
    createAndAddPresetComboBoxes();
    }

  private void createAndAddButtons()
    {
    createAndAddPresetsButtons();
    createAndAddModButtons();
    }

  private void setListeners()
    {
    setPresetsListeners();
    setModButtonsListeners();
    }

  private void createAndAddPresetComboBoxes()
    {
    presetsComboBox = new JComboBox<String>();

    presetsPanel.add(presetsComboBox);
    }

  private void createAndAddPresetsButtons()
    {
    presetsDeleteButton = new JButton(Buttons.PRESETS_DELETE);
    presetsSaveButton = new JButton(Buttons.PRESETS_SAVE);

    presetsPanel.add(Spacing.createPlaceholder());
    presetsPanel.add(presetsDeleteButton);
    presetsPanel.add(presetsSaveButton);
    presetsPanel.add(Spacing.createPlaceholder());
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

  private void setPresetsListeners()
    {
    presetsComboBox.addActionListener(new PresetInsertEntryListener(presetsComboBox));
    presetsComboBox.addItemListener(new PresetLoadListener(presetsComboBox));

    presetsDeleteButton.addActionListener(new PresetDeleteListener(presetsComboBox));
    presetsSaveButton.addActionListener(new PresetSaveListener(presetsComboBox));
    }

  private void setModButtonsListeners()
    {
    for (int i = 0; i < CommonMod.NUMBER_OF_MODS; i += 1)
      modButtons[i].addButtonListener(new WindowVisibilityListener(Main.modWindows[i], true));
    }
  }