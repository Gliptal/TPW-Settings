package gui.combinations;

import java.awt.*;
import javax.swing.*;


public class LabeledComboBox extends CommonLabeled
  {
  private JComboBox<String> comboBox;

  public LabeledComboBox(String labelText, String defaultChoice, String[] choices)
    {
    super(labelText);
    createAndAddComboBox(defaultChoice, choices);
    }

  private void createAndAddComboBox(String defaultChoice, String[] choices)
    {
    comboBox = new JComboBox<String>(choices);

    comboBox.setSelectedIndex(Integer.parseInt(defaultChoice));

    this.add(comboBox, BorderLayout.CENTER);
    }
  }