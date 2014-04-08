package gui;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

import exec.*;


public class CommonWindow extends JFrame
  {
  protected JPanel mainPanel;

  protected CommonWindow(int width, int height, String title)
    {
    setSize(width, height);
    setTitle(title);

    buildAndAttachMainPanel();
    }

  private void buildAndAttachMainPanel()
    {
    mainPanel = new JPanel(new BorderLayout(UserInterface.BORDER_BORDER_LAYOUT, UserInterface.BORDER_BORDER_LAYOUT));
    mainPanel.setBorder(new EmptyBorder(UserInterface.BORDER_WINDOW, UserInterface.BORDER_WINDOW, UserInterface.BORDER_WINDOW, UserInterface.BORDER_WINDOW));

    this.add(mainPanel);
    }
  }