package gui.combinations;

import exec.*;
import exec.userinterface.*;
import gui.listeners.*;
import java.awt.*;
import javax.swing.*;


public class LabeledCheckBox extends CommonLabeled
  {
  private JCheckBox checkBox;

  public LabeledCheckBox(String labelText)
    {
    super(new GridLayout(1, 2, Spacing.COMBINATIONS, Spacing.COMBINATIONS), labelText);
    createAndAddCheckBox();
    }

  public LabeledCheckBox(String labelText, String isSelected)
    {
    super(new GridLayout(1, 2, Spacing.COMBINATIONS, Spacing.COMBINATIONS), labelText);
    createAndAddCheckBox(isSelected);
    }

  public void setStatus(String isSelected)
    {
    checkBox.setSelected(Utils.stringToBoolean(isSelected));
    }

  public void setToolTip(String toolTipText)
    {
    setPanelToolTip(toolTipText);
    checkBox.setToolTipText(toolTipText);
    }

  public void linkToButton(LabeledButton button)
    {
    checkBox.addActionListener(new ActiveModListener(checkBox, button));
    }

  public void linkToArray(String[] parameterArray, int parameterIndex)
    {
    checkBox.addActionListener(new ParameterUpdateListener(checkBox, parameterArray, parameterIndex));
    }

  private void createAndAddCheckBox()
    {
    checkBox = new JCheckBox();

    this.add(checkBox);
    }

  private void createAndAddCheckBox(String isSelected)
    {
    checkBox = new JCheckBox();

    setStatus(isSelected);

    this.add(checkBox);
    }
  }