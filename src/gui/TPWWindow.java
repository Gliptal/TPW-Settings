package gui;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

import exec.*;



public class TPWWindow extends JFrame
  {
  protected JPanel mainPanel;


  protected TPWWindow(int width, int height, String title)
    {
    setSize(width, height);
    setTitle(title);

    buildAndAttachMainPanel();
    }

  private void buildAndAttachMainPanel()
    {
    mainPanel = new JPanel(new BorderLayout(Ui.LAYOUT_BORDER, Ui.LAYOUT_BORDER));
    mainPanel.setBorder(new EmptyBorder(Ui.WINDOW_BORDER, Ui.WINDOW_BORDER, Ui.WINDOW_BORDER, Ui.WINDOW_BORDER));

    this.add(mainPanel);
    }
  }