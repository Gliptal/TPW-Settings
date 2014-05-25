package gui.listeners;

import exec.laf.Text;
import exec.laf.Frames;
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
    ColorWindow colorWindow = new ColorWindow(Frames.COLOR_WIDTH, Frames.COLOR_HEIGHT, Text.COLOR_CHOOSER_TITLE, destinationField);
    colorWindow.setLocationRelativeTo(null);
    colorWindow.setVisible(true);
    }
  }