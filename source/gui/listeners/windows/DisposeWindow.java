package gui.listeners.windows;

import javax.swing.*;
import java.awt.event.*;


public class DisposeWindow implements ActionListener
  {
  private JFrame frame;

  public DisposeWindow(JFrame frame)
    {
    this.frame = frame;
    }

  public void actionPerformed(ActionEvent event)
    {
    frame.dispose();
    }
  }