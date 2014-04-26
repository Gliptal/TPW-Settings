package gui.listeners.presets;

import exec.*;
import gui.combinations.*;
import java.awt.event.*;


public class RevertListener implements ActionListener
  {
  public void actionPerformed(ActionEvent event)
    {
    Main.mainWindow.getComboBox().setSelectedIndex(LabeledComboBox.COMBO_BOX_TOP);
    }
  }