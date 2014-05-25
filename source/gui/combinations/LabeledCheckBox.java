package gui.combinations;

import exec.laf.Layouts;
import gui.listeners.semaphores.UpdateSemaphores;
import exec.*;
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

    return Converters.booleanToString(valueAsBoolean);
    }

  public void setValue(String value)
    {
    boolean valueAsBoolean = Converters.stringToBoolean(value);

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