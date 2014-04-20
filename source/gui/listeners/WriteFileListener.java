package gui.listeners;

import fileio.*;
import java.awt.event.*;


public class WriteFileListener implements ActionListener
  {
  String fileName;

  public WriteFileListener(String fileName)
    {
    this.fileName = fileName;
    }

  public void actionPerformed(ActionEvent event)
    {
    ActionBuffer.writeWholeFile(fileName);
    }
  }