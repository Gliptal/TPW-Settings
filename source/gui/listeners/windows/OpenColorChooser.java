package gui.listeners.windows;

import gui.components.TextFieldParameter;
import exec.laf.Text;
import exec.laf.Frames;
import gui.*;
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
    ColorChooser colorWindow = new ColorChooser(Frames.COLOR_WIDTH, Frames.COLOR_HEIGHT, Text.COLOR_CHOOSER_TITLE, destinationField);
    colorWindow.setLocationRelativeTo(null);
    colorWindow.setVisible(true);
    }
  }