package gui.combinations;

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

  public void setToolTip(String toolTipText)
    {
    setLabelToolTip(toolTipText);
    textField.setToolTipText(toolTipText);
    }

  private void createAndAddTextField(String defaultValue)
    {
    textField = new JTextField(defaultValue);

    this.add(textField);
    }

  private void tailorTextField()
    {
    textField.setHorizontalAlignment(JTextField.CENTER);
    }
  }