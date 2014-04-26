package gui.listeners.presets;

import fileio.*;
import java.awt.event.*;
import javax.swing.*;


public class PresetInsertEntryListener implements ActionListener
  {
  private JComboBox<String> comboBox;

  public PresetInsertEntryListener(JComboBox<String> comboBox)
    {
    this.comboBox = comboBox;
    }

  public void actionPerformed(ActionEvent event)
    {
    if (comboBox.isEditable())
      {
      String newEntry = entryToUpperCase();

      ActionBuffer.writeWholeFile(newEntry+ActionBuffer.PRESET_EXTENSION);

      if (!entryExists(newEntry))
        comboBox.addItem(newEntry);

      comboBox.setEditable(false);
      }
    }

  private String entryToUpperCase()
    {
    comboBox.setSelectedItem(((String)comboBox.getSelectedItem()).toUpperCase());

    return (String)comboBox.getSelectedItem();
    }

  private boolean entryExists(String entry)
    {
    for (int i = 0; i < comboBox.getItemCount(); i += 1)
      {
      if (comboBox.getItemAt(i).equals(entry))
        return true;
      }

    return false;
    }
  }