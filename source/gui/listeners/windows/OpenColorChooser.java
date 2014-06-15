package gui.listeners.windows;

import gui.components.TextFieldParameter;
import exec.laf.Text;
import exec.laf.Frames;
import gui.choosers.*;
import java.awt.event.*;


public class OpenColorChooser extends MouseAdapter
  {
  private TextFieldParameter destinationField;

  public OpenColorChooser(TextFieldParameter destinationField)
    {
    this.destinationField = destinationField;
    }

  public void mouseClicked(MouseEvent event)
    {
    ColorChooser colorChooser = new ColorChooser(Frames.COLOR_CHOOSER_WIDTH, Frames.COLOR_CHOOSER_HEIGHT, Text.COLOR_CHOOSER_TITLE, destinationField);
    colorChooser.setLocationRelativeTo(null);
    colorChooser.setVisible(true);
    }
  }