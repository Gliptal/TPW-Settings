package gui.listeners;

import exec.userinterface.*;
import gui.*;
import gui.combinations.*;
import java.awt.event.*;


public class OpenColorChooser extends MouseAdapter
  {
  private LabeledTextField destinationField;

  public OpenColorChooser(LabeledTextField destinationField)
    {
    this.destinationField = destinationField;
    }

  public void mouseClicked(MouseEvent event)
    {
    ColorWindow colorWindow = new ColorWindow(Windows.COLOR_WIDTH, Windows.COLOR_HEIGHT, Text.COLOR_WINDOW_TITLE, destinationField);
    colorWindow.setLocationRelativeTo(null);
    colorWindow.setVisible(true);
    }
  }