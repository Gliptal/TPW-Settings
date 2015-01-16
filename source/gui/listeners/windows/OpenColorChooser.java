package gui.listeners.windows;

import java.awt.event.*;

import exec.*;
import exec.theme.*;
import gui.choosers.*;
import gui.components.*;


public class OpenColorChooser extends MouseAdapter
  {
  private TextFieldParameter destinationField;

  public OpenColorChooser(TextFieldParameter destinationField)
    {
    this.destinationField = destinationField;
    }

  public void mouseClicked(MouseEvent event)
    {
    ColorChooser colorChooser = new ColorChooser(Frames.COLOR_CHOOSER_WIDTH, Frames.COLOR_CHOOSER_HEIGHT, Text.COLOR_CHOOSER, destinationField);
    colorChooser.setLocationRelativeTo(null);
    colorChooser.setVisible(true);
    }
  }