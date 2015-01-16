package gui.listeners.windows;

import java.awt.*;
import java.awt.event.*;


public class IconifyWindow implements ActionListener
  {
  private Window frame;

  public IconifyWindow(Window frame)
    {
    this.frame = frame;
    }

  public void actionPerformed(ActionEvent event)
    {
    ((Frame)frame).setState(Frame.ICONIFIED);
    }
  }