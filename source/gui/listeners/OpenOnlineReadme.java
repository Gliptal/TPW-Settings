package gui.listeners;

import exec.laf.Text;
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
      URI onlineReadme = new URI(Text.README_URL);
      Desktop.getDesktop().browse(onlineReadme);
      }
    catch (URISyntaxException | IOException exception) {}
    }
  }