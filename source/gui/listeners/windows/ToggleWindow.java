package gui.listeners.windows;

import javax.swing.*;
import java.awt.event.*;


public class ToggleWindow implements ActionListener
  {
  private JFrame  window;
  private boolean isVisible;

  public ToggleWindow(JFrame window, boolean isVisible)
    {
    this.window    = window;
    this.isVisible = isVisible;
    }

  public void actionPerformed(ActionEvent event)
    {
    window.setVisible(isVisible);
    }
  }