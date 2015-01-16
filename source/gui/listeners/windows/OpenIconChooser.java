package gui.listeners.windows;

import java.awt.event.*;

import exec.*;
import exec.theme.*;
import gui.choosers.*;
import gui.components.*;


public class OpenIconChooser extends MouseAdapter
  {
  private TextFieldParameter destinationField;

  public OpenIconChooser(TextFieldParameter destinationField)
    {
    this.destinationField = destinationField;
    }

  public void mouseClicked(MouseEvent event)
    {
    IconChooser iconChooser = new IconChooser(Frames.ICON_CHOOSER_WIDTH, Frames.ICON_CHOOSER_HEIGHT, Text.ICON_CHOOSER, destinationField);
    iconChooser.setLocationRelativeTo(null);
    iconChooser.setVisible(true);
    }
  }