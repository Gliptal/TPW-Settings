package gui;

import exec.*;
import exec.userinterface.*;
import gui.combinations.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import mods.*;


public class MainWindow extends CommonWindow
  {
  private JPanel presetsPanel;
  private JPanel modsPanel;

  private JComboBox presetsComboBox;

  private JButton presetsDeleteButton;
  private JButton presetsSaveButton;
  private JButton presetsLoadButton;
  private LabeledButton[] modButtons;

  public MainWindow()
    {
    super(Windows.MAIN_WINDOW_WIDTH, Windows.MAIN_WINDOW_HEIGHT, Windows.MAIN_WINDOW_TITLE);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    createAndAddPanels();
    createAndAddCombos();
    createAndAddButtons();

    subscribeButtons();
    }

  public LabeledButton getModButton(int which)
    {
    return modButtons[which];
    }

  private void createAndAddPanels()
    {
    presetsPanel = new JPanel(new GridLayout(1, 5, Spacing.GRID_BUTTONS, Spacing.GRID_BUTTONS));
    modsPanel = new JPanel(new GridLayout(4, 4, Spacing.GRID_BUTTONS, Spacing.GRID_BUTTONS));

    addToMainPanel(presetsPanel, BorderLayout.NORTH);
    addToMainPanel(modsPanel, BorderLayout.CENTER);
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

  private void subscribeButtons()
    {
    registerModButtons();
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
    presetsLoadButton = new JButton(Buttons.PRESETS_RENAME);

    presetsPanel.add(presetsDeleteButton);
    presetsPanel.add(Spacing.createPlaceholder());
    presetsPanel.add(presetsSaveButton);
    presetsPanel.add(presetsLoadButton);
    }

  private void createAndAddModButtons()
    {
    modButtons = new LabeledButton[CommonMod.NUMBER_OF_MODS];

    for (int i = 0; i < CommonMod.NUMBER_OF_MODS; i += 1)
      {
      modButtons[i] = new LabeledButton(CommonMod.MOD_NAMES[i], CommonMod.MOD_STATUSES[i]);
      modButtons[i].setToolTip(ToolTips.MODS[i]);
      modsPanel.add(modButtons[i]);
      }
    }

  private void registerModButtons()
    {
    for (int i = 0; i < CommonMod.NUMBER_OF_MODS; i += 1)
      {
      final int windowToBeOpened = i;

      modButtons[i].addActionListener
        (
        new ActionListener()
          {
          public void actionPerformed(ActionEvent event)
            {
            Main.modWindows[windowToBeOpened].setVisible(true);
            }
          }
        );
      }
    }
  }