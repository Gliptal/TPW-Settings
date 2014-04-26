package gui.combinations;

import exec.userinterface.*;
import java.awt.*;
import javax.swing.*;


public class LabeledComboBox extends LabeledComponent
  {
  public static final int COMBO_BOX_TOP = 0;

  private JComboBox comboBox;

  public LabeledComboBox(String labelText, String[] choices)
    {
    super(new GridLayout(1, 2, Spacing.COMBINATIONS, Spacing.COMBINATIONS), labelText);

    addComponent(new JComboBox<String>(choices));
    comboBox = (JComboBox)component;
    }

  public String getValue()
    {
    int valueAsInt = comboBox.getSelectedIndex();

    return Integer.toString(valueAsInt);
    }

  public void setValue(String value)
    {
    int valueAsInt = Integer.parseInt(value);

    comboBox.setSelectedIndex(valueAsInt);
    }
  }