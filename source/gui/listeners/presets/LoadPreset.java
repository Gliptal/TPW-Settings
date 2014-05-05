package gui.listeners.presets;

import exec.*;
import exec.userinterface.*;
import fileio.*;
import gui.combinations.*;
import java.awt.event.*;
import javax.swing.*;
import mods.*;

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

      if (FileBuffer.readWholeFile(fileToRead))
        {
        FileBuffer.writeWholeFile(Files.CONFIG);
        updateSemaphores();
        }
      }
    }

  private void updateSemaphores()
    {
    for (int i = 0; i < CommonMod.NUMBER_OF_MODS; i += 1)
      {
      LabeledButton modButton = Main.mainWindow.getModButton(i);
      boolean modIsActive = Main.modWindows[i].getIsActiveLabeledCheckBox().isActive();

      modButton.setSemaphoreColor(modIsActive);
      }
    }
  }