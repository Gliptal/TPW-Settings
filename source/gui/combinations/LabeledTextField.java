package gui.combinations;

import exec.userinterface.*;
import fileio.*;
import java.awt.*;
import javax.swing.*;


public class LabeledTextField extends LabeledComponent
  {
  private JTextField textField;

  public LabeledTextField(String labelText)
    {
    super(new GridLayout(1, 2, Spacing.COMBINATIONS, Spacing.COMBINATIONS), labelText);

    addComponent(new JTextField(FileTemplate.LOADING));
    textField = (JTextField)component;

    tailorTextField();
    }

  public String getValue()
    {
    return textField.getText();
    }

  public void setValue(String value)
    {
    textField.setText(value);
    }

  private void tailorTextField()
    {
    textField.setHorizontalAlignment(JTextField.CENTER);
    }
  }