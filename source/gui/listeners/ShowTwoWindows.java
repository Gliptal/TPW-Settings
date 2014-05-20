package gui.listeners;

import gui.*;
import javax.swing.*;
import java.awt.event.*;


public class ShowTwoWindows implements ActionListener
  {
  private ModWindow modWindow;
  private JFrame secondWindow;
  private boolean isVisible;

  public ShowTwoWindows(ModWindow modWindow, JFrame secondWindow, boolean isVisible)
    {
    this.modWindow = modWindow;
    this.secondWindow = secondWindow;
    this.isVisible = isVisible;
    }

  public void actionPerformed(ActionEvent event)
    {
    modWindow.setVisible(isVisible);

    ((ColorWindow)secondWindow).setFrameBelow(modWindow);
    secondWindow.setVisible(isVisible);
    }
  }