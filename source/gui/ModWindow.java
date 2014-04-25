package gui;

import exec.userinterface.*;
import gui.combinations.*;
import gui.listeners.*;
import java.awt.*;
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

    setButtonListeners();
    }

  public void addParameter(JPanel parameter)
    {
    parametersPanel.add(parameter);
    }

  public void addPlaceHolder()
    {
    parametersPanel.add(Spacing.createPlaceholder());
    }

  public LabeledCheckBox getIsActiveLabeledCheckBox()
    {
    return isActiveCheckBox;
    }

  public void setIfModIsActive(String isActive)
    {
    isActiveCheckBox.setParameter(isActive);
    }

  private void createAndAddPanels()
    {
    generalPanel = new JPanel(new GridLayout(1, 3, Spacing.GRID_PARAMETERS_X, Spacing.GRID_PARAMETERS_Y));
    parametersPanel = new JPanel(new GridLayout(Spacing.PARAMETERS_ROWS, Spacing.PARAMETERS_COLUMNS, Spacing.GRID_PARAMETERS_X, Spacing.GRID_PARAMETERS_Y));

    mainPanel.add(generalPanel, BorderLayout.NORTH);
    mainPanel.add(parametersPanel, BorderLayout.CENTER);
    }

  private void createAndAddGeneralElements()
    {
    isActiveCheckBox = new LabeledCheckBox(ModParameters.ACTIVE);
    backButton = new JButton(Buttons.MOD_BACK);

    generalPanel.add(isActiveCheckBox, BorderLayout.NORTH);
    generalPanel.add(Spacing.createPlaceholder());
    generalPanel.add(backButton, BorderLayout.NORTH);
    }

  private void setButtonListeners()
    {
    backButton.addActionListener(new WindowVisibilityListener(this, false));
    }
  }