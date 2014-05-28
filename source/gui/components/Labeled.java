package gui.components;

import java.awt.*;
import javax.swing.*;

import exec.laf.*;


public abstract class Labeled extends JPanel
  {
  protected JLabel label;

  public Labeled()
    {
    setLayout(Layouts.LABELED());

    forgeLabel(Spacing.BUTTON_LABEL_WIDTH);
    }

  private void forgeLabel(String labelText)
    {
    label = new JLabel(labelText);

    label.setOpaque(true);

    add(label, BorderLayout.WEST);
    }
  }