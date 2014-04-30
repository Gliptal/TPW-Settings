package gui.listeners.presets;

import java.awt.event.*;
import javax.swing.*;


public class SavePreset implements ActionListener
  {
  private JComboBox<String> comboBox;

  public SavePreset(JComboBox<String> comboBox)
    {
    this.comboBox = comboBox;
    }

  public void actionPerformed(ActionEvent event)
    {
    comboBox.setEditable(true);
    comboBox.grabFocus();
    }
  }