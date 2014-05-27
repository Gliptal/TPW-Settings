package gui.listeners.fileio;

import java.awt.event.*;
import javax.swing.*;

import exec.*;
import exec.laf.*;
import fileio.*;
import gui.components.*;
import gui.listeners.semaphores.*;


public class RevertValues implements ActionListener
  {
  public void actionPerformed(ActionEvent event)
    {
    JComboBox presetsComboBox =  Main.mainWindow.getPresetsComboBox();

    if (presetsComboBox.getSelectedIndex() == ComboBoxParameter.COMBO_BOX_TOP)
      {
      FileParser.readFile(Files.REVERT);
      FileParser.writeFile(Files.CONFIG);

      UpdateSemaphores.updateSemaphores();
      }
    else
      presetsComboBox.setSelectedIndex(ComboBoxParameter.COMBO_BOX_TOP);
    }
  }