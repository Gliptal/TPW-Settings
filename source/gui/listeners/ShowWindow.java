package gui.listeners;

import javax.swing.*;
import java.awt.event.*;


public class ShowWindow implements ActionListener
  {
  private JFrame modWindow;
  private boolean isVisible;

  public ShowWindow(JFrame modWindow, boolean isVisible)
    {
    this.modWindow = modWindow;
    this.isVisible = isVisible;
    }

  public void actionPerformed(ActionEvent event)
    {
    modWindow.setVisible(isVisible);
    }
  }