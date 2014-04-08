package gui;

import exec.*;
import exec.mods.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;



public class ModListWindow extends CommonWindow
  {
  private JPanel presetsPanel;
  private JPanel modsPanel;
  private JPanel commitPanel;

  private JButton presetsDeleteButton;
  private JButton presetsSaveButton;
  private JButton presetsLoadButton;
  private JButton[] modButtons;
  private JButton commitNegativeButton;
  private JButton commitPositiveButton;

  private JComboBox presetsCombo;


  public ModListWindow()
    {
    super(UserInterface.MOD_LIST_WINDOW_WIDTH, UserInterface.MOD_LIST_WINDOW_HEIGHT, UserInterface.MOD_LIST_WINDOW_TITLE);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    buildAndAttachPanels();
    buildAndAttachCombos();
    buildAndAttachButtons();

    registerButtons();
    }

  private void buildAndAttachPanels()
    {
    presetsPanel = new JPanel(new GridLayout(1, 4, UserInterface.BORDER_GRID_LAYOUT, UserInterface.BORDER_GRID_LAYOUT));
    modsPanel = new JPanel(new GridLayout(4, 4, UserInterface.BORDER_GRID_LAYOUT, UserInterface.BORDER_GRID_LAYOUT));
    commitPanel = new JPanel(new GridLayout(1, 2, UserInterface.BORDER_GRID_LAYOUT, UserInterface.BORDER_GRID_LAYOUT));

    mainPanel.add(presetsPanel, BorderLayout.NORTH);
    mainPanel.add(modsPanel, BorderLayout.CENTER);
    mainPanel.add(commitPanel, BorderLayout.SOUTH);
    }

  private void buildAndAttachCombos()
    {
    buildAndAttachPresetsCombos();
    }

  private void buildAndAttachButtons()
    {
    buildAndAttachPresetsButtons();
    buildAndAttachModButtons();
    buildAndAttachCommitButtons();
    }

  private void registerButtons()
    {
    registerModButtons();
    }

  private void buildAndAttachPresetsCombos()
    {
    presetsCombo = new JComboBox();

    presetsPanel.add(presetsCombo);
    }

  private void buildAndAttachPresetsButtons()
    {
    presetsDeleteButton = new JButton(UserInterface.BUTTON_PRESETS_DELETE);
    presetsSaveButton = new JButton(UserInterface.BUTTON_PRESETS_SAVE);
    presetsLoadButton = new JButton(UserInterface.BUTTON_PRESETS_LOAD);

    presetsPanel.add(presetsDeleteButton);
    presetsPanel.add(presetsSaveButton);
    presetsPanel.add(presetsLoadButton);
    }

  private void buildAndAttachModButtons()
    {
    modButtons = new JButton[CommonMod.NUMBER_OF_MODS];

    for (int i = 0; i < CommonMod.NUMBER_OF_MODS; i += 1)
      {
      modButtons[i] = new JButton(CommonMod.MOD_NAMES[i]);
      modsPanel.add(modButtons[i]);
      }
    }

  private void buildAndAttachCommitButtons()
    {
    commitNegativeButton = new JButton(UserInterface.BUTTON_COMMIT_NEGATIVE);
    commitPositiveButton = new JButton(UserInterface.BUTTON_COMMIT_POSITIVE);

    commitPanel.add(commitNegativeButton);
    commitPanel.add(commitPositiveButton);
    }

  private void registerModButtons()
    {
    for (int i = 0; i < CommonMod.NUMBER_OF_MODS; i += 1)
      {
      final int windowToBeActivated = i;

      modButtons[i].addActionListener
        (
        new ActionListener()
          {
          public void actionPerformed(ActionEvent event)
            {
            Main.modWindows[windowToBeActivated].setVisible(true);
            }
          }
        );
      }
    }
  }