package gui.components;

import javax.swing.*;


public class ComboBoxParameter extends Parameter
  {
  public static final int COMBO_BOX_TOP = 0;

  private JComboBox comboBox;

  public ComboBoxParameter(String labelText, String[] choices)
    {
    super(labelText);

    addComponent(new JComboBox<String>(choices));
    comboBox = (JComboBox)component;
    }

  public String getValue()
    {
    int intValue = comboBox.getSelectedIndex();

    return Integer.toString(intValue);
    }

  public void setValue(String value)
    {
    int intValue = Integer.parseInt(value);

    comboBox.setSelectedIndex(intValue);
    }
  }