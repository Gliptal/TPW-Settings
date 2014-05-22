package gui.combinations;

import exec.userinterface.*;
import java.awt.event.*;
import javax.swing.*;


public class LabeledTextField extends LabeledComponent
  {
  private JTextField textField;

  public LabeledTextField(String labelText)
    {
    super(Layouts.LABELED_GRID(), labelText);

    addComponent(new JTextField(Files.ERROR));
    textField = (JTextField)component;

    tailorTextField();
    }

  public void addMouseListener(MouseListener listener)
    {
    textField.addMouseListener(listener);
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