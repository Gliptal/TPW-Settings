package gui.listeners.presets;

import java.awt.event.*;
import java.io.*;
import javax.swing.*;

import exec.laf.*;


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
      int selectedPreset = comboBox.getSelectedIndex();
      String presetName = comboBox.getItemAt(selectedPreset);
      File preset = new File(presetName+Files.PRESET_EXTENSION);

      if (preset.delete())
        comboBox.removeItemAt(selectedPreset);
      }
    }
  }