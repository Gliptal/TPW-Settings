package gui.listeners.fileio;

import java.awt.event.*;
import javax.swing.*;

import gui.components.*;


public class CopyValue implements ActionListener
  {
  private JTextField originField;
  private TextFieldParameter destinationField;

  public CopyValue(JTextField originField, TextFieldParameter destinationField)
    {
    this.originField = originField;
    this.destinationField = destinationField;
    }

  public void actionPerformed(ActionEvent event)
    {
    destinationField.setValue(originField.getText());
    }
  }