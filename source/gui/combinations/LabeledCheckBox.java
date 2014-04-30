package gui.combinations;

import exec.*;
import exec.userinterface.*;
import gui.listeners.*;
import javax.swing.*;


public class LabeledCheckBox extends LabeledComponent
  {
  private JCheckBox checkBox;

  public LabeledCheckBox(String labelText)
    {
    super(Layouts.LABELED_GRID(), labelText);

    addComponent(new JCheckBox());
    checkBox = (JCheckBox)component;
    }

  public String getValue()
    {
    boolean valueAsBoolean = checkBox.isSelected();

    return Utils.booleanToString(valueAsBoolean);
    }

  public void setValue(String value)
    {
    boolean valueAsBoolean = Utils.stringToBoolean(value);

    checkBox.setSelected(valueAsBoolean);
    }

  public void linkToButton(LabeledButton button)
    {
    checkBox.addActionListener(new UpdateSemaphores(checkBox, button));
    }

  public boolean isActive()
    {
    return checkBox.isSelected();
    }
  }