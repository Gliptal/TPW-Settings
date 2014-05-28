package gui.listeners.windows;

import gui.components.TextFieldParameter;
import exec.laf.Text;
import exec.laf.Frames;
import gui.*;
import java.awt.event.*;


public class OpenIconChooser extends MouseAdapter
  {
  private TextFieldParameter destinationField;

  public OpenIconChooser(TextFieldParameter destinationField)
    {
    this.destinationField = destinationField;
    }

  public void mouseClicked(MouseEvent event)
    {
    IconChooser iconChooser = new IconChooser(Frames.ICON_CHOOSER_WIDTH, Frames.ICON_CHOOSER_HEIGHT, Text.ICON_CHOOSER_TITLE, destinationField);
    iconChooser.setLocationRelativeTo(null);
    iconChooser.setVisible(true);
    }
  }