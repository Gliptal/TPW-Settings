package gui.listeners.presets;

import java.awt.event.*;
import javax.swing.*;

import exec.*;
import fileio.*;


public class SavePreset implements ActionListener
  {
  private JComboBox<String> comboBox;

  public SavePreset(JComboBox<String> comboBox)
    {
    this.comboBox = comboBox;
    }

  public void actionPerformed(ActionEvent event)
    {
    if (comboBox.isEditable())
      {
      String newEntry = entryToUpperCase();

      if (!newEntry.equals(Files.REVERT))
        {
        FileParser.writeFile(newEntry+Files.PRESET_EXTENSION);

        if (!exists(newEntry))
          comboBox.addItem(newEntry);
        }

      comboBox.setEditable(false);
      }
    }

  private String entryToUpperCase()
    {
    String entry = (String)comboBox.getSelectedItem();

    comboBox.setSelectedItem(entry.toUpperCase());

    return (String)comboBox.getSelectedItem();
    }

  private boolean exists(String entry)
    {
    for (int i = 0; i < comboBox.getItemCount(); i += 1)
      {
      if (comboBox.getItemAt(i).equals(entry))
        return true;
      }

    return false;
    }
  }