package gui.listeners;

import exec.*;
import gui.combinations.*;
import java.awt.event.*;
import javax.swing.*;
import mods.*;


public class UpdateSemaphores implements ActionListener
  {
  private JCheckBox checkBox;
  private LabeledButton labeledButton;

  public UpdateSemaphores(JCheckBox checkBox, LabeledButton labeledButton)
    {
    this.checkBox = checkBox;
    this.labeledButton = labeledButton;
    }

  public void actionPerformed(ActionEvent event)
    {
    labeledButton.setSemaphoreColor(checkBox.isSelected());
    }

  public static void updateSemaphores()
    {
    for (int i = 0; i < CommonMod.NUMBER_OF_MODS; i += 1)
      {
      LabeledButton modButton = Main.mainWindow.getModButton(i);
      boolean modIsActive = Main.modWindows[i].getIsActiveLabeledCheckBox().isActive();

      modButton.setSemaphoreColor(modIsActive);
      }
    }
  }