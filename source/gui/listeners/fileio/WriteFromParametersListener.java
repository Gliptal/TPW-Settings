package gui.listeners.fileio;

import fileio.*;
import java.awt.event.*;


public class WriteFromParametersListener implements ActionListener
  {
  private String fileName;

  public WriteFromParametersListener(String fileName)
    {
    this.fileName = fileName;
    }

  public void actionPerformed(ActionEvent event)
    {
    ActionBuffer.writeWholeFile(fileName);
    }
  }