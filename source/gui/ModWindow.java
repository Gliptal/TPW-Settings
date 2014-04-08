package gui;

import exec.*;
import gui.combinations.*;
import java.awt.*;
import javax.swing.*;


public class ModWindow extends CommonWindow
  {
  private JPanel commonElementsPanel;
  private JPanel parametersPanel;

  private LabeledCheckBox modActive;

  public ModWindow(String title)
    {
    super(UserInterface.MOD_LIST_WINDOW_WIDTH, UserInterface.MOD_LIST_WINDOW_HEIGHT, title);
    setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);

    buildAndAttachPanels();
    buildAndAttachCommonElements();
    }

  private void buildAndAttachPanels()
    {
    commonElementsPanel = new JPanel(new GridLayout(1, 6, UserInterface.BORDER_GRID_LAYOUT, UserInterface.BORDER_GRID_LAYOUT));
    parametersPanel = new JPanel(new GridLayout(3, 6, UserInterface.BORDER_GRID_LAYOUT, UserInterface.BORDER_GRID_LAYOUT));

    mainPanel.add(commonElementsPanel, BorderLayout.NORTH);
    mainPanel.add(parametersPanel, BorderLayout.CENTER);
    }

  private void buildAndAttachCommonElements()
    {
    modActive = new LabeledCheckBox(UserInterface.PARAMETERS_ACTIVE);

    commonElementsPanel.add(modActive, BorderLayout.NORTH);
    for (int i = 0; i < 5; i += 1)
      {
      commonElementsPanel.add(new JPanel());
      }
    }
  }