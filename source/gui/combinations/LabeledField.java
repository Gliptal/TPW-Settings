package gui.combinations;

import exec.userinterface.*;
import java.awt.*;
import javax.swing.*;


public class LabeledField extends CommonLabeled
  {
  private JTextField textField;

  public LabeledField(String labelText, String defaultValue)
    {
    super(labelText);
    createAndAddTextField(defaultValue);
    tailorTextField();
    }

  private void createAndAddTextField(String defaultValue)
    {
    textField = new JTextField(defaultValue, Spacing.TEXT_FIELD_WIDTH);

    this.add(textField, BorderLayout.CENTER);
    }

  private void tailorTextField()
    {
    textField.setHorizontalAlignment(JTextField.CENTER);
    }
  }