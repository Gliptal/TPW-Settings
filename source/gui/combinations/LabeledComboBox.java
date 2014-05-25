package gui.combinations;

import exec.laf.Layouts;
import javax.swing.*;


public class LabeledComboBox extends LabeledComponent
  {
  public static final int COMBO_BOX_TOP = 0;

  private JComboBox comboBox;

  public LabeledComboBox(String labelText, String[] choices)
    {
    super(Layouts.LABELED_GRID(), labelText);

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