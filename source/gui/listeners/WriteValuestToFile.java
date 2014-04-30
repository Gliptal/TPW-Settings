package gui.listeners;

import fileio.*;
import java.awt.event.*;


public class WriteValuestToFile implements ActionListener
  {
  private String fileName;

  public WriteValuestToFile(String fileName)
    {
    this.fileName = fileName;
    }

  public void actionPerformed(ActionEvent event)
    {
    FileBuffer.writeWholeFile(fileName);
    }
  }