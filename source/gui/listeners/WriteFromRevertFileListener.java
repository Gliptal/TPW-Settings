package gui.listeners;

import exec.*;
import fileio.*;
import java.awt.event.*;
import mods.*;


public class WriteFromRevertFileListener implements ActionListener
  {
  String fileName;

  public WriteFromRevertFileListener(String fileName)
    {
    this.fileName = fileName;
    }

  public void actionPerformed(ActionEvent event)
    {
    ActionBuffer.readWholeFile(ActionBuffer.REVERT_FILE_NAME);
    ActionBuffer.writeWholeFile(fileName);

    for (int i = 0; i < CommonMod.NUMBER_OF_MODS; i += 1)
      Main.mainWindow.getModButton(i).setCorrespondingColor(Main.modWindows[i].getIsActiveLabeledCheckBox().isActive());
    }
  }