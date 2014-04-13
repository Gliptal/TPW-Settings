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

  public void setStatus(boolean isSelected)
    {
    checkBox.setSelected(isSelected);
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

    this.add(checkBox, BorderLayout.CENTER);
    }
  }