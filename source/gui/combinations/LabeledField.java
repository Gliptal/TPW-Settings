package gui.combinations;

import exec.userinterface.*;
import java.awt.*;
import javax.swing.*;


public class LabeledField extends CommonLabeled
  {
  private JTextField textField;

  public LabeledField(String labelText, String initialValue)
    {
    super(labelText);
    createAndAddTextField(initialValue);
    tailorTextField();
    }

  private void createAndAddTextField(String initialValue)
    {
    textField = new JTextField(initialValue, Spacing.TEXT_FIELD_WIDTH);

    this.add(textField, BorderLayout.CENTER);
    }

  private void tailorTextField()
    {
    textField.setHorizontalAlignment(JTextField.CENTER);
    }
  }