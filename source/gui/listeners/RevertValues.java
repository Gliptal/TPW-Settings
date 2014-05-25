package gui.listeners;

import exec.laf.Files;
import gui.listeners.semaphores.UpdateSemaphores;
import exec.*;
import fileio.*;
import gui.combinations.*;
import java.awt.event.*;
import javax.swing.*;


public class RevertValues implements ActionListener
  {
  public void actionPerformed(ActionEvent event)
    {
    JComboBox presetComboBox =  Main.mainWindow.getPresetsComboBox();

    if (presetComboBox.getSelectedIndex() == 0)
      {
      FileParser.readFile(Files.REVERT);
      FileParser.writeFile(Files.CONFIG);

      UpdateSemaphores.updateSemaphores();
      }
    else
      presetComboBox.setSelectedIndex(LabeledComboBox.COMBO_BOX_TOP);
    }
  }