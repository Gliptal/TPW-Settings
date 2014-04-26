package gui.listeners;

import gui.*;
import java.awt.event.*;


public class WindowVisibilityListener implements ActionListener
  {
  private ModWindow modWindow;
  private boolean isVisible;

  public WindowVisibilityListener(ModWindow modWindow, boolean isVisible)
    {
    this.modWindow = modWindow;
    this.isVisible = isVisible;
    }

  public void actionPerformed(ActionEvent event)
    {
    modWindow.setVisible(isVisible);
    }
  }