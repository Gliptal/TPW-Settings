package gui.combinations;

import exec.*;
import exec.userinterface.*;
import gui.listeners.*;
import java.awt.*;
import javax.swing.*;


public class LabeledCheckBox extends LabeledComponent
  {
  public LabeledCheckBox(String labelText)
    {
    super(new GridLayout(1, 2, Spacing.COMBINATIONS, Spacing.COMBINATIONS), labelText);

    addComponent(new JCheckBox());
    }

  public String getParameter()
    {
    return Utils.booleanToString(((JCheckBox)component).isSelected());
    }

  public void setParameter(String value)
    {
    ((JCheckBox)component).setSelected(Utils.stringToBoolean(value));
    }

  public void linkToButton(LabeledButton button)
    {
    ((JCheckBox)component).addActionListener(new ActiveModListener(((JCheckBox)component), button));
    }

  public boolean isActive()
    {
    return ((JCheckBox)component).isSelected();
    }
  }