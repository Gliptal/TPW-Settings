package gui.listeners;

import exec.*;
import gui.*;
import java.awt.event.*;


public class ShowWindow implements ActionListener
  {
  private ModWindow modWindow;
  private boolean isVisible;

  public ShowWindow(ModWindow modWindow, boolean isVisible)
    {
    this.modWindow = modWindow;
    this.isVisible = isVisible;
    }

  public void actionPerformed(ActionEvent event)
    {
    modWindow.setVisible(isVisible);

    if (!isVisible)
      Main.colorWindow.setVisible(isVisible);
    }
  }