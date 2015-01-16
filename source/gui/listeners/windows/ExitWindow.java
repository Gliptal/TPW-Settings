package gui.listeners.windows;

import java.awt.*;
import java.awt.event.*;


public class ExitWindow implements ActionListener
  {
  private Window frame;

  public ExitWindow(Window frame)
    {
    this.frame = frame;
    }

  public void actionPerformed(ActionEvent event)
    {
    frame.getToolkit().getSystemEventQueue().postEvent(new WindowEvent(frame, WindowEvent.WINDOW_CLOSING));
    }
  }