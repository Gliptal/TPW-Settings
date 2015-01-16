package gui;

import java.awt.*;
import javax.swing.*;

import exec.*;
import exec.theme.*;
import gui.components.*;
import gui.listeners.windows.*;


public class ModWindow extends Window
  {
  private   JPanel commonPanel;
  protected JPanel parametersPanel;

  private CheckBoxParameter isActiveCheckBox;
  private JButton           backButton;

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
    Layouts.fillWithPlaceholders(parametersPanel);
    }

  public CheckBoxParameter getIsActiveLabeledCheckBox()
    {
    return isActiveCheckBox;
    }

  public void setIfModIsActive(String isActive)
    {
    isActiveCheckBox.setValue(isActive);
    }

  public void setUntogglableMod()
    {
    isActiveCheckBox.disableCheckBox();
    }

  private void forgePanels()
    {
    commonPanel     = new JPanel(Layouts.MOD_GENERAL());
    parametersPanel = new JPanel(Layouts.PARAMETERS_GRID());

    mainPanel.add(commonPanel, BorderLayout.NORTH);
    mainPanel.add(parametersPanel, BorderLayout.CENTER);
    }

  private void forgeIsActiveCheckBox()
    {
    isActiveCheckBox = new CheckBoxParameter(Text.MOD_STATE);

    commonPanel.add(isActiveCheckBox);
    }

  private void forgeBackButton()
    {
    backButton = new JButton(Text.BACK);

    commonPanel.add(Layouts.summonPlaceholder());
    commonPanel.add(backButton);
    }

  private void setBackButtonAction()
    {
    backButton.addActionListener(new ToggleWindow(this, false));
    }
  }