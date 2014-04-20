package gui.listeners;

import gui.combinations.*;
import java.awt.event.*;
import javax.swing.*;


public class ActiveModListener implements ActionListener
  {
  JCheckBox checkBox;
  LabeledButton labeledButton;

  public ActiveModListener(JCheckBox checkBox, LabeledButton labeledButton)
    {
    this.checkBox = checkBox;
    this.labeledButton = labeledButton;
    }

  public void actionPerformed(ActionEvent event)
    {
    labeledButton.setCorrespondingColor(checkBox.isSelected());
    }
  }