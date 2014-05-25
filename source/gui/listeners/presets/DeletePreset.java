package gui.listeners.presets;

import exec.laf.Files;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;


public class DeletePreset implements ActionListener
  {
  private JComboBox<String> comboBox;

  public DeletePreset(JComboBox<String> comboBox)
    {
    this.comboBox = comboBox;
    }

  public void actionPerformed(ActionEvent event)
    {
    if (comboBox.getItemCount() != 0)
      {
      File preset = new File(comboBox.getItemAt(comboBox.getSelectedIndex())+Files.PRESET_EXTENSION);

      if(preset.delete())
        comboBox.removeItemAt(comboBox.getSelectedIndex());
      }
    }
  }