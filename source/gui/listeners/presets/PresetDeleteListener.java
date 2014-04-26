package gui.listeners.presets;

import fileio.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;


public class PresetDeleteListener implements ActionListener
  {
  private JComboBox<String> comboBox;

  public PresetDeleteListener(JComboBox<String> comboBox)
    {
    this.comboBox = comboBox;
    }

  public void actionPerformed(ActionEvent event)
    {
    if (comboBox.getItemCount() != 0)
      {
      File preset = new File(comboBox.getItemAt(comboBox.getSelectedIndex())+ActionBuffer.PRESET_EXTENSION);

      if(preset.delete())
        comboBox.removeItemAt(comboBox.getSelectedIndex());
      }
    }
  }