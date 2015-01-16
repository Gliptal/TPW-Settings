package gui.listeners.presets;

import java.awt.event.*;
import javax.swing.*;

import exec.*;
import fileio.*;
import gui.listeners.semaphores.*;

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
      String fileToRead = (String)comboBox.getSelectedItem();

      if (!comboBox.getSelectedItem().equals(Files.REVERT))
        fileToRead += Files.PRESET_EXTENSION;

      if (FileParser.readFile(fileToRead))
        {
        FileParser.writeFile(Files.CONFIG);
        UpdateSemaphores.updateSemaphores();
        }
      }
    }
  }