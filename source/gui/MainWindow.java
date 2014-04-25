package gui;

import exec.*;
import exec.userinterface.*;
import gui.combinations.*;
import gui.listeners.*;
import java.awt.*;
import javax.swing.*;
import mods.*;


public class MainWindow extends CommonWindow
  {
  private JPanel presetsPanel;
  private JPanel modsPanel;

  private JComboBox presetsComboBox;

  private JButton presetsDeleteButton;
  private JButton presetsSaveButton;
  private JButton presetsRenameButton;
  private LabeledButton[] modButtons;

  public MainWindow()
    {
    super(Windows.MAIN_WINDOW_WIDTH, Windows.MAIN_WINDOW_HEIGHT, Windows.MAIN_WINDOW_TITLE);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    createAndAddPanels();
    createAndAddCombos();
    createAndAddButtons();

    setButtonListeners();
    }

  public LabeledButton getModButton(int which)
    {
    return modButtons[which];
    }

  private void createAndAddPanels()
    {
    presetsPanel = new JPanel(new GridLayout(1, 5, Spacing.GRID_BUTTONS, Spacing.GRID_BUTTONS));
    modsPanel = new JPanel(new GridLayout(4, 4, Spacing.GRID_BUTTONS, Spacing.GRID_BUTTONS));

    mainPanel.add(presetsPanel, BorderLayout.NORTH);
    mainPanel.add(modsPanel, BorderLayout.CENTER);
    }

  private void createAndAddCombos()
    {
    createAndAddPresetsCombos();
    }

  private void createAndAddButtons()
    {
    createAndAddPresetsButtons();
    createAndAddModButtons();
    }

  private void setButtonListeners()
    {
    setModButtonsListeners();
    }

  private void createAndAddPresetsCombos()
    {
    presetsComboBox = new JComboBox();

    presetsPanel.add(presetsComboBox);
    }

  private void createAndAddPresetsButtons()
    {
    presetsDeleteButton = new JButton(Buttons.PRESETS_DELETE);
    presetsSaveButton = new JButton(Buttons.PRESETS_SAVE);
    presetsRenameButton = new JButton(Buttons.PRESETS_RENAME);

    presetsPanel.add(presetsDeleteButton);
    presetsPanel.add(Spacing.createPlaceholder());
    presetsPanel.add(presetsSaveButton);
    presetsPanel.add(presetsRenameButton);
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

  private void setModButtonsListeners()
    {
    for (int i = 0; i < CommonMod.NUMBER_OF_MODS; i += 1)
      modButtons[i].addButtonListener(new WindowVisibilityListener(Main.modWindows[i], true));
    }
  }