package gui.listeners;

import exec.*;
import java.awt.event.*;
import javax.swing.*;


public class ParameterUpdateListener implements ActionListener
  {
  JComponent component;
  String[] parameterArray;
  int parameterIndex;

  public ParameterUpdateListener(JComponent component, String[] parameterArray, int parameterIndex)
    {
    this.component = component;
    this.parameterArray = parameterArray;
    this.parameterIndex = parameterIndex;
    }

  public void actionPerformed(ActionEvent event)
    {
    if (Utils.compareClass(component, "javax.swing.JCheckBox"))
      parameterArray[parameterIndex] = Utils.booleanToString(((JCheckBox)component).isSelected());
    else if (Utils.compareClass(component, "javax.swing.JComboBox"))
      parameterArray[parameterIndex] = new Integer(((JComboBox)component).getSelectedIndex()).toString();
    else if (Utils.compareClass(component, "javax.swing.JTextField"))
      parameterArray[parameterIndex] = ((JTextField)component).getText();
    }
  }