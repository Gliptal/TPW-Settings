package gui.combinations;

import javax.swing.*;


public class LabeledComboBox extends CommonLabeled
  {
  private JComboBox<String> comboBox;

  public LabeledComboBox(String labelText, String defaultChoice, String[] choices)
    {
    super(labelText);
    createAndAddComboBox(defaultChoice, choices);
    }

  public void setToolTip(String toolTipText)
    {
    setLabelToolTip(toolTipText);
    comboBox.setToolTipText(toolTipText);
    }

  private void createAndAddComboBox(String defaultChoice, String[] choices)
    {
    comboBox = new JComboBox<String>(choices);

    comboBox.setSelectedIndex(Integer.parseInt(defaultChoice));

    this.add(comboBox);
    }
  }