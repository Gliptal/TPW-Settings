package gui.components;

import java.awt.*;
import javax.swing.*;


public class CursoredButton extends JButton
  {
  public CursoredButton()
    {
    super();
    setCursor(new Cursor(Cursor.HAND_CURSOR));
    }

  public CursoredButton(String buttonText)
    {
    super(buttonText);
    setCursor(new Cursor(Cursor.HAND_CURSOR));
    }
  }