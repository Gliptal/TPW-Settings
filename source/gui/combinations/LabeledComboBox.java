package gui.combinations;

import exec.userinterface.*;
import gui.listeners.*;
import java.awt.*;
import javax.swing.*;


public class LabeledComboBox extends CommonLabeled
  {
  private JComboBox<String> comboBox;

  public LabeledComboBox(String labelText, String defaultChoice, String[] choices)
    {
    super(new GridLayout(1, 2, Spacing.COMBINATIONS, Spacing.COMBINATIONS), labelText);
    createAndAddComboBox(choices, defaultChoice);
    }

  public void setToolTip(String toolTipText)
    {
    setPanelToolTip(toolTipText);
    comboBox.setToolTipText(toolTipText);
    }

  public void linkToArray(String[] parameterArray, int parameterIndex)
    {
    comboBox.addActionListener(new ParameterUpdateListener(comboBox, parameterArray, parameterIndex));
    }

  private void createAndAddComboBox(String[] choices, String defaultChoice)
    {
    comboBox = new JComboBox<String>(choices);

    comboBox.setSelectedIndex(Integer.parseInt(defaultChoice));

    this.add(comboBox);
    }
  }