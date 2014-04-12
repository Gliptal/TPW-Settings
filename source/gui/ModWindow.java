package gui;

import exec.mods.*;
import exec.userinterface.*;
import gui.combinations.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class ModWindow extends CommonWindow
  {
  private JPanel commonElementsPanel;
  private JPanel parametersPanel;

  private JButton backButton;

  private LabeledCheckBox activeCheckBox;

  public ModWindow(String title)
    {
    super(Windows.MOD_WINDOW_WIDTH, Windows.MOD_WINDOW_HEIGHT, title);
    setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);

    createAndAddPanels();
    createAndAddCommonElements();

    registerButtons();
    }

  public void addParameter(JPanel parameter)
    {
    parametersPanel.add(parameter);
    }

  public void addPlaceHolder()
    {
    parametersPanel.add(Spacing.createPlaceholder());
    }

  public void setIfModIsActive(boolean isActive)
    {
    activeCheckBox.setStatus(isActive);
    }

  private void createAndAddPanels()
    {
    commonElementsPanel = new JPanel(new GridLayout(1, 5, Spacing.GRID_LAYOUT, Spacing.GRID_LAYOUT));
    parametersPanel = new JPanel(new GridLayout(6, 3, Spacing.GRID_LAYOUT, Spacing.GRID_LAYOUT));

    mainPanel.add(commonElementsPanel, BorderLayout.NORTH);
    mainPanel.add(parametersPanel, BorderLayout.CENTER);
    }

  private void createAndAddCommonElements()
    {
    activeCheckBox = new LabeledCheckBox(CommonMod.PARAMETERS_ACTIVE);
    backButton = new JButton(Buttons.BACK);

    commonElementsPanel.add(activeCheckBox, BorderLayout.NORTH);
    for (int i = 0; i < 3; i += 1)
      commonElementsPanel.add(Spacing.createPlaceholder(), BorderLayout.NORTH);
    commonElementsPanel.add(backButton, BorderLayout.NORTH);
    }

  private void registerButtons()
    {
    backButton.addActionListener
      (
      new ActionListener()
        {
        public void actionPerformed(ActionEvent event)
          {
          setVisible(false);
          }
        }
      );
    }
  }