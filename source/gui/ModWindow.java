package gui;

import exec.userinterface.*;
import gui.combinations.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import mods.*;


public class ModWindow extends CommonWindow
  {
  private JPanel generalPanel;
  private JPanel parametersPanel;

  private LabeledCheckBox isActiveCheckBox;

  private JButton backButton;

  public ModWindow(String title)
    {
    super(Windows.MOD_WINDOW_WIDTH, Windows.MOD_WINDOW_HEIGHT, title);
    setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);

    createAndAddPanels();
    createAndAddGeneralElements();

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

  public LabeledCheckBox getCheckBox()
    {
    return isActiveCheckBox;
    }

  public void setIfModIsActive(boolean isActive)
    {
    isActiveCheckBox.setStatus(isActive);
    }

  private void createAndAddPanels()
    {
    generalPanel = new JPanel(new GridLayout(1, 4, Spacing.GRID_PARAMETERS_X, Spacing.GRID_PARAMETERS_Y));
    parametersPanel = new JPanel(new GridLayout(Spacing.PARAMETERS_ROWS, Spacing.PARAMETERS_COLUMNS, Spacing.GRID_PARAMETERS_X, Spacing.GRID_PARAMETERS_Y));

    addToMainPanel(generalPanel, BorderLayout.NORTH);
    addToMainPanel(parametersPanel, BorderLayout.CENTER);
    }

  private void createAndAddGeneralElements()
    {
    isActiveCheckBox = new LabeledCheckBox(CommonMod.PARAMETERS_ACTIVE);
    backButton = new JButton(Buttons.MOD_BACK);

    generalPanel.add(isActiveCheckBox, BorderLayout.NORTH);
    for (int i = 0; i < 2; i += 1)
      generalPanel.add(Spacing.createPlaceholder(), BorderLayout.NORTH);
    generalPanel.add(backButton, BorderLayout.NORTH);
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