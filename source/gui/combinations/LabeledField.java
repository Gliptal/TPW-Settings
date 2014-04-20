package gui.combinations;

import exec.userinterface.*;
import gui.listeners.*;
import java.awt.*;
import javax.swing.*;


public class LabeledField extends CommonLabeled
  {
  private JTextField textField;

  public LabeledField(String labelText, String defaultValue)
    {
    super(new GridLayout(1, 2, Spacing.COMBINATIONS, Spacing.COMBINATIONS), labelText);
    createAndAddTextField(defaultValue);
    tailorTextField();
    }

  public void setToolTip(String toolTipText)
    {
    setPanelToolTip(toolTipText);
    textField.setToolTipText(toolTipText);
    }

  public void linkToArray(String[] parameterArray, int parameterIndex)
    {
    textField.addActionListener(new ParameterUpdateListener(textField, parameterArray, parameterIndex));
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