package gui.components;

import java.awt.event.*;
import javax.swing.*;

import exec.laf.Files;


public class TextFieldParameter extends Parameter
  {
  private JTextField textField;

  public TextFieldParameter(String labelText)
    {
    super(labelText);

    addComponent(new JTextField(Files.ERROR));
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

  public void setState(boolean active)
    {
    textField.setEnabled(active);
    }

  public void addMouseListener(MouseListener listener)
    {
    textField.addMouseListener(listener);
    }

  private void tailorTextField()
    {
    textField.setHorizontalAlignment(JTextField.CENTER);
    }
  }