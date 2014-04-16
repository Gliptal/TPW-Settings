package gui.combinations;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class LabeledCheckBox extends CommonLabeled
  {
  private JCheckBox checkBox;

  public LabeledCheckBox(String labelText)
    {
    super(labelText);
    createAndAddCheckBox();
    }

  public LabeledCheckBox(String labelText, String isSelected)
    {
    super(labelText);
    createAndAddCheckBox(isSelected);
    }

  public void setStatus(boolean isSelected)
    {
    checkBox.setSelected(isSelected);
    }

  public void setToolTip(String toolTipText)
    {
    setLabelToolTip(toolTipText);
    checkBox.setToolTipText(toolTipText);
    }

  public void connectWith(final LabeledButton labeledButtonToBeRegistered)
    {
    checkBox.addActionListener
        (
        new ActionListener()
          {
          public void actionPerformed(ActionEvent event)
            {
            labeledButtonToBeRegistered.setIfRelativeModIsActive(checkBox.isSelected());
            }
          }
        );
    }

  private void createAndAddCheckBox()
    {
    checkBox = new JCheckBox();

    this.add(checkBox);
    }

  private void createAndAddCheckBox(String isSelectedString)
    {
    checkBox = new JCheckBox();

    setStatus(Boolean.valueOf(isSelectedString));

    this.add(checkBox);
    }
  }