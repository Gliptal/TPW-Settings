package gui.combinations;

import exec.userinterface.*;
import java.awt.*;
import javax.swing.*;


public class LabeledComboBox extends LabeledComponent
  {
  public LabeledComboBox(String labelText, String[] choices)
    {
    super(new GridLayout(1, 2, Spacing.COMBINATIONS, Spacing.COMBINATIONS), labelText);

    addComponent(new JComboBox<String>(choices));
    }

  public String getParameter()
    {
    return Integer.toString((((JComboBox)component).getSelectedIndex()));
    }

  public void setParameter(String value)
    {
    ((JComboBox)component).setSelectedIndex(Integer.parseInt(value));
    }
  }