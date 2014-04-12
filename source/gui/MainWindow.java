package gui;

import exec.*;
import exec.mods.*;
import exec.userinterface.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class MainWindow extends CommonWindow
  {
  private JPanel presetsPanel;
  private JPanel modsPanel;

  private JButton presetsDeleteButton;
  private JButton presetsSaveButton;
  private JButton presetsLoadButton;
  private JButton[] modButtons;

  private JComboBox presetsCombo;

  public MainWindow()
    {
    super(Windows.MAIN_WINDOW_WIDTH, Windows.MAIN_WINDOW_HEIGHT, Windows.MAIN_WINDOW_TITLE);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    createAndAddPanels();
    createAndAddCombos();
    createAndAddButtons();

    registerButtons();
    }

  private void createAndAddPanels()
    {
    presetsPanel = new JPanel(new GridLayout(1, 5, Spacing.GRID_LAYOUT, Spacing.GRID_LAYOUT));
    modsPanel = new JPanel(new GridLayout(4, 4, Spacing.GRID_LAYOUT, Spacing.GRID_LAYOUT));

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

  private void registerButtons()
    {
    registerModButtons();
    }

  private void createAndAddPresetsCombos()
    {
    presetsCombo = new JComboBox();

    presetsPanel.add(presetsCombo);
    }

  private void createAndAddPresetsButtons()
    {
    presetsDeleteButton = new JButton(Buttons.PRESETS_DELETE);
    presetsSaveButton = new JButton(Buttons.PRESETS_SAVE);
    presetsLoadButton = new JButton(Buttons.PRESETS_LOAD);

    presetsPanel.add(presetsDeleteButton);
    presetsPanel.add(Spacing.createPlaceholder());
    presetsPanel.add(presetsSaveButton);
    presetsPanel.add(presetsLoadButton);
    }

  private void createAndAddModButtons()
    {
    modButtons = new JButton[CommonMod.NUMBER_OF_MODS];

    for (int i = 0; i < CommonMod.NUMBER_OF_MODS; i += 1)
      {
      modButtons[i] = new JButton(CommonMod.MOD_NAMES[i]);
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