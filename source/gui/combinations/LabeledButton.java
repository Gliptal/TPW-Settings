package gui.combinations;

import mods.CommonMod;
import exec.userinterface.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class LabeledButton extends CommonLabeled
  {
  private JButton button;

  public LabeledButton(String buttonText, boolean isActive)
    {
    super(Spacing.BUTTON_LABEL_WIDTH);
    createAndAddButton(buttonText);
    setIfRelativeModIsActive(isActive);
    }

  public void setIfRelativeModIsActive(boolean isActive)
    {
    if (isActive)
      changeLabelColor(CommonMod.ACTIVE_COLOR);
    else
      changeLabelColor(CommonMod.INACTIVE_COLOR);
    }

  public void connectToCheckBox(LabeledCheckBox checkBoxToBeConnected)
    {
    checkBoxToBeConnected.connectWith(this);
    }

  public void addActionListener(ActionListener listener)
    {
    button.addActionListener(listener);
    }

  private void createAndAddButton(String buttonText)
    {
    button = new JButton(buttonText);

    this.add(button, BorderLayout.CENTER);
    }
  }