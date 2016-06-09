package gui.components;

import java.awt.*;
import javax.swing.*;

import exec.*;
import exec.theme.*;
import gui.listeners.semaphores.*;


public class CheckBoxParameter extends Parameter
  {
  public static final String NOT_SELECTED = "0";
  public static final String SELECTED     = "1";

  private JCheckBox checkBox;

  public CheckBoxParameter(String labelText)
    {
    super(labelText);

    Ui.switchToWindowsLaF();
    addComponent(new JCheckBox());
    Ui.switchToEditedLaF();

    checkBox = (JCheckBox)component;

    tailorCheckBox();
    }

  public String getValue()
    {
    boolean boolValue = checkBox.isSelected();

    return Utils.booleanToString(boolValue);
    }

  public void setValue(String value)
    {
    boolean boolValue = Utils.stringToBoolean(value);

    checkBox.setSelected(boolValue);
    }

  public void linkToButton(LabeledButton button)
    {
    checkBox.addActionListener(new UpdateSemaphores(checkBox, button));
    }

  public boolean isActive()
    {
    return checkBox.isSelected();
    }

  public void disableCheckBox()
    {
    checkBox.setEnabled(false);
    }

  private void tailorCheckBox()
    {
    checkBox.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }
  }