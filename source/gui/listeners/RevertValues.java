package gui.listeners;

import exec.*;
import gui.combinations.*;
import java.awt.event.*;


public class RevertValues implements ActionListener
  {
  public void actionPerformed(ActionEvent event)
    {
    Main.mainWindow.getPresetsComboBox().setSelectedIndex(LabeledComboBox.COMBO_BOX_TOP);
    }
  }