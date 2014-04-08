package gui;

import exec.*;
import exec.mods.*;
import java.awt.*;
import javax.swing.*;



public class ModListWindow extends TPWWindow
  {
  private JPanel modSelectionPanel;
  private JPanel commitActionPanel;

  private JButton[] modButtons;
  private JButton saveAndExitButton;
  private JButton cancelAndExitButton;


  public ModListWindow()
    {
    super(Ui.MOD_LIST_WINDOW_WIDTH, Ui.MOD_LIST_WINDOW_HEIGHT, Ui.MOD_LIST_WINDOW_TITLE);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    buildAndAttachPanels();
    buildAndAttachButtons();
    }

  private void buildAndAttachPanels()
    {
    modSelectionPanel = new JPanel(new GridLayout(4, 4, Ui.LAYOUT_BORDER, Ui.LAYOUT_BORDER));
    commitActionPanel = new JPanel(new GridLayout(1, 2, Ui.LAYOUT_BORDER, Ui.LAYOUT_BORDER));

    mainPanel.add(modSelectionPanel, BorderLayout.CENTER);
    mainPanel.add(commitActionPanel, BorderLayout.SOUTH);
    }

  private void buildAndAttachButtons()
    {
    buildAndAttachModButtons();
    buildAndAttachCommitButtons();
    }

  private void buildAndAttachModButtons()
    {
    modButtons = new JButton[ModCommon.NUMBER_OF_MODS];

    for (int i = 0; i < ModCommon.NUMBER_OF_MODS; i += 1)
      {
      modButtons[i] = new JButton(ModCommon.MOD_NAMES[i]);
      modSelectionPanel.add(modButtons[i]);
      }
    }

  private void buildAndAttachCommitButtons()
    {
    saveAndExitButton = new JButton("SAVE");
    cancelAndExitButton = new JButton("CANCEL");

    commitActionPanel.add(saveAndExitButton);
    commitActionPanel.add(cancelAndExitButton);
    }
  }