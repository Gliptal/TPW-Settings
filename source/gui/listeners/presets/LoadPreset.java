package gui.listeners.presets;

import exec.laf.Files;
import gui.listeners.semaphores.UpdateSemaphores;
import fileio.*;
import gui.listeners.*;
import java.awt.event.*;
import javax.swing.*;

public class LoadPreset implements ItemListener
  {
  private JComboBox<String> comboBox;

  public LoadPreset(JComboBox<String> comboBox)
    {
    this.comboBox = comboBox;
    }

  public void itemStateChanged(ItemEvent event)
    {
    if (event.getStateChange() == ItemEvent.SELECTED)
      {
      String fileToRead;

      if (comboBox.getSelectedItem().equals(Files.REVERT))
        fileToRead = (String)comboBox.getSelectedItem();
      else
        fileToRead = (String)comboBox.getSelectedItem()+Files.PRESET_EXTENSION;

      if (FileParser.readFile(fileToRead))
        {
        FileParser.writeFile(Files.CONFIG);
        UpdateSemaphores.updateSemaphores();
        }
      }
    }
  }