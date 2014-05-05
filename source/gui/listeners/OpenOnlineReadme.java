package gui.listeners;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.*;


public class OpenOnlineReadme extends MouseAdapter
  {
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