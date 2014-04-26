package gui.listeners.fileio;

import exec.*;
import fileio.*;
import java.awt.event.*;


public class WriteFromReadListener implements ActionListener
  {
  private String fileToRead;
  private String fileToWrite;

  public WriteFromReadListener(String fileToRead, String fileToWrite)
    {
    this.fileToRead = fileToRead;
    this.fileToWrite = fileToWrite;
    }

  public void actionPerformed(ActionEvent event)
    {
    ActionBuffer.readWholeFile(fileToRead);
    ActionBuffer.writeWholeFile(fileToWrite);

    Main.updateSemaphores();
    }
  }