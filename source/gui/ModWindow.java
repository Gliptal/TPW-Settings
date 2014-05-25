package gui;

import exec.laf.Text;
import exec.laf.Spacing;
import exec.laf.Layouts;
import exec.laf.Frames;
import gui.combinations.*;
import gui.listeners.*;
import java.awt.*;
import javax.swing.*;


public class ModWindow extends CommonWindow
  {
  private JPanel generalPanel;
  protected JPanel parametersPanel;

  private LabeledCheckBox isActiveCheckBox;
  private JButton backButton;

  public ModWindow(String title)
    {
    super(Frames.MOD_WIDTH, Frames.MOD_HEIGHT, title);
    setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);

    createAndAddPanels();
    createAndAddGeneralElements();

    setBackButtonAction();
    }

  public void fillModWindowWithPlaceholders()
    {
    Spacing.addPlaceholdersToEmptySlots(parametersPanel);
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
    generalPanel = new JPanel(Layouts.FRAME_MOD_GENERAL());
    parametersPanel = new JPanel(Layouts.FRAME_MOD_PARAMETERS());

    mainPanel.add(generalPanel, BorderLayout.NORTH);
    mainPanel.add(parametersPanel, BorderLayout.CENTER);
    }

  private void createAndAddGeneralElements()
    {
    isActiveCheckBox = new LabeledCheckBox(Text.CHECKBOX_ACTIVE);
    backButton = new JButton(Text.BUTTON_BACK);

    generalPanel.add(isActiveCheckBox, BorderLayout.NORTH);
    generalPanel.add(Spacing.summonPlaceholder());
    generalPanel.add(backButton, BorderLayout.NORTH);
    }

  private void setBackButtonAction()
    {
    backButton.addActionListener(new ShowWindow(this, false));
    }
  }