package gui.listeners.presets;

import exec.*;
import fileio.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;

public class PresetLoadListener implements ItemListener
  {
  private JComboBox<String> comboBox;

  public PresetLoadListener(JComboBox<String> comboBox)
    {
    this.comboBox = comboBox;
    }

  public void itemStateChanged(ItemEvent event)
    {
    if (event.getStateChange() == ItemEvent.SELECTED && Main.everythingLoaded)
      {
      String fileToRead;

      if (comboBox.getSelectedItem().equals(ActionBuffer.REVERT_FILE_NAME))
        fileToRead = (String)comboBox.getSelectedItem();
      else
        fileToRead = (String)comboBox.getSelectedItem()+ActionBuffer.PRESET_EXTENSION;

      if (new File("./"+fileToRead).canRead())
        {
        ActionBuffer.readWholeFile(fileToRead);
        ActionBuffer.writeWholeFile(ActionBuffer.CONFIG_FILE_NAME);

        Main.updateSemaphores();
        }
      }
    }
  }