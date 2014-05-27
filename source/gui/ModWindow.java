package gui;

import java.awt.*;
import javax.swing.*;

import exec.laf.*;
import gui.components.*;
import gui.listeners.windows.*;


public class ModWindow extends Window
  {
  private JPanel commonPanel;
  protected JPanel parametersPanel;

  private CheckBoxParameter isActiveCheckBox;
  private JButton backButton;

  public ModWindow(String title)
    {
    super(Frames.MOD_WIDTH, Frames.MOD_HEIGHT, title);

    setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);

    forgePanels();

    forgeIsActiveCheckBox();
    forgeBackButton();

    setBackButtonAction();
    }

  public void overrideParametersPanelLayout(LayoutManager layout)
    {
    parametersPanel = new JPanel(layout);

    mainPanel.add(parametersPanel, BorderLayout.CENTER);
    }

  public void addParameter(Parameter parameter)
    {
    parametersPanel.add(parameter);
    }

  public void fillWithPlaceholders()
    {
    Spacing.addPlaceholdersToEmptySlots(parametersPanel);
    }

  public CheckBoxParameter getIsActiveLabeledCheckBox()
    {
    return isActiveCheckBox;
    }

  public void setIfModIsActive(String isActive)
    {
    isActiveCheckBox.setValue(isActive);
    }

  private void forgePanels()
    {
    commonPanel = new JPanel(Layouts.FRAME_MOD_GENERAL());
    parametersPanel = new JPanel(Layouts.FRAME_MOD_PARAMETERS());

    mainPanel.add(commonPanel, BorderLayout.NORTH);
    mainPanel.add(parametersPanel, BorderLayout.CENTER);
    }

  private void forgeIsActiveCheckBox()
    {
    isActiveCheckBox = new CheckBoxParameter(Text.CHECKBOX_ACTIVE);

    commonPanel.add(isActiveCheckBox, BorderLayout.NORTH);
    }

  private void forgeBackButton()
    {
    backButton = new JButton(Text.BUTTON_BACK);

    commonPanel.add(Spacing.summonPlaceholder());
    commonPanel.add(backButton, BorderLayout.NORTH);
    }

  private void setBackButtonAction()
    {
    backButton.addActionListener(new ShowWindow(this, false));
    }
  }