package gui.listeners;

import gui.combinations.*;
import java.awt.event.*;
import javax.swing.*;


public class ModSemaphoreListener implements ActionListener
  {
  private JCheckBox checkBox;
  private LabeledButton labeledButton;

  public ModSemaphoreListener(JCheckBox checkBox, LabeledButton labeledButton)
    {
    this.checkBox = checkBox;
    this.labeledButton = labeledButton;
    }

  public void actionPerformed(ActionEvent event)
    {
    labeledButton.setCorrespondingColor(checkBox.isSelected());
    }
  }