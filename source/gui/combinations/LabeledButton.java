package gui.combinations;

import exec.*;
import exec.userinterface.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import mods.*;


public class LabeledButton extends CommonLabeled
  {
  private JButton button;

  public LabeledButton(String buttonText, String modIsActive)
    {
    super(Spacing.BUTTON_LABEL_WIDTH);

    changeLayout(new BorderLayout(Spacing.COMBINATIONS, Spacing.COMBINATIONS));
    moveLabel(BorderLayout.WEST);
    createAndAddButton(buttonText);
    setIfRelativeModIsActive(Utils.stringToBoolean(modIsActive));
    }

  public void connectToCheckBox(LabeledCheckBox checkBoxToBeConnected)
    {
    checkBoxToBeConnected.connectWith(this);
    }

  public void addActionListener(ActionListener listener)
    {
    button.addActionListener(listener);
    }

  public void setToolTip(String toolTipText)
    {
    setLabelToolTip(toolTipText);
    button.setToolTipText(toolTipText);
    }

  protected void setIfRelativeModIsActive(boolean modIsActive)
    {
    if (modIsActive)
      changeLabelColor(CommonMod.ACTIVE_COLOR);
    else
      changeLabelColor(CommonMod.INACTIVE_COLOR);
    }

  private void createAndAddButton(String buttonText)
    {
    button = new JButton(buttonText);

    this.add(button, BorderLayout.CENTER);
    }
  }