package gui;

import exec.userinterface.*;
import gui.combinations.*;
import gui.listeners.*;
import java.awt.*;
import javax.swing.*;


public class ModWindow extends CommonWindow
  {
  private JPanel generalPanel;
  private JPanel parametersPanel;

  private LabeledCheckBox isActiveCheckBox;
  private JButton backButton;

  public ModWindow(String title)
    {
    super(Sizes.MOD_WINDOW_WIDTH, Sizes.MOD_WINDOW_HEIGHT, title);
    setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);

    createAndAddPanels();
    createAndAddGeneralElements();

    setBackButtonAction();
    }

  public void overrideParametersPanelLayout(LayoutManager layout)
    {
    parametersPanel = new JPanel(layout);

    mainPanel.add(parametersPanel, BorderLayout.CENTER);
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
    isActiveCheckBox.setValue(isActive);
    }

  private void createAndAddPanels()
    {
    generalPanel = new JPanel(Layouts.MOD_GENERAL());
    parametersPanel = new JPanel(Layouts.MOD_PARAMETERS());

    mainPanel.add(generalPanel, BorderLayout.NORTH);
    mainPanel.add(parametersPanel, BorderLayout.CENTER);
    }

  private void createAndAddGeneralElements()
    {
    isActiveCheckBox = new LabeledCheckBox(Text.ACTIVE);
    backButton = new JButton(Text.BUTTON_BACK);

    generalPanel.add(isActiveCheckBox, BorderLayout.NORTH);
    generalPanel.add(Spacing.createPlaceholder());
    generalPanel.add(backButton, BorderLayout.NORTH);
    }

  private void setBackButtonAction()
    {
    backButton.addActionListener(new ShowWindow(this, false));
    }
  }