package gui.listeners;

import java.awt.event.*;
import java.net.*;
import java.awt.*;
import java.io.*;
import javax.swing.*;


public class OpenOnlineReadme extends MouseAdapter
  {
  private JLabel label;

  public OpenOnlineReadme(JLabel label)
    {
    this.label = label;
    }

  public void mouseClicked(MouseEvent event)
    {
    try
      {
      URI onlineReadme = new URI("https://github.com/Gliptal/TPW-Settings#usage");
      Desktop.getDesktop().browse(onlineReadme);
      }
    catch (URISyntaxException | IOException exception) {}
    }
  }