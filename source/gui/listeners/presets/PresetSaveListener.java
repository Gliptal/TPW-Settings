package gui.listeners.presets;

import java.awt.event.*;
import javax.swing.*;


public class PresetSaveListener implements ActionListener
  {
  private JComboBox<String> comboBox;

  public PresetSaveListener(JComboBox<String> comboBox)
    {
    this.comboBox = comboBox;
    }

  public void actionPerformed(ActionEvent event)
    {
    comboBox.setEditable(true);
    comboBox.grabFocus();
    }
  }