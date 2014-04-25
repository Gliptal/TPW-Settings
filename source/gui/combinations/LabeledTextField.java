package gui.combinations;

import exec.userinterface.*;
import fileio.*;
import java.awt.*;
import javax.swing.*;


public class LabeledTextField extends LabeledComponent
  {
  public LabeledTextField(String labelText)
    {
    super(new GridLayout(1, 2, Spacing.COMBINATIONS, Spacing.COMBINATIONS), labelText);

    addComponent(new JTextField(FileTemplate.LOADING));
    tailorTextField();
    }

  public String getParameter()
    {
    return ((JTextField)component).getText();
    }

  public void setParameter(String value)
    {
    ((JTextField)component).setText(value);
    }

  private void tailorTextField()
    {
    ((JTextField)component).setHorizontalAlignment(JTextField.CENTER);
    }
  }