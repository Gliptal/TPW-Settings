package gui.listeners.fileio;

import java.awt.event.*;

import fileio.*;


public class WriteValuesToFile implements ActionListener
  {
  private String fileName;

  public WriteValuesToFile(String fileName)
    {
    this.fileName = fileName;
    }

  public void actionPerformed(ActionEvent event)
    {
    FileParser.writeFile(fileName);
    }
  }