package gui.listeners;

import gui.combinations.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class CopyToParameter implements ActionListener
  {
  private JTextField originField;
  private LabeledTextField destinationField;

  public CopyToParameter(JTextField originField, LabeledTextField destinationField)
    {
    this.originField = originField;
    this.destinationField = destinationField;
    }

  public void actionPerformed(ActionEvent event)
    {
    destinationField.setValue(originField.getText());
    }
  }