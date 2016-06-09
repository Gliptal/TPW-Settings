package gui.components;

import java.awt.*;
import javax.swing.*;

import exec.theme.*;


public abstract class Parameter extends JPanel
  {
  private   JLabel     label;
  protected JComponent component;

  protected Parameter(String labelText)
    {
    setLayout(Layouts.PARAMETER());

    forgeLabel(labelText);

    tailorLabel();
    }

  public abstract String getValue();

  public abstract void setValue(String value);

  public void setToolTip(String toolTipText)
    {
    setToolTipText(toolTipText);
    component.setToolTipText(toolTipText);
    }

  public void setClickable()
    {
    component.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }

  protected void addComponent(JComponent component)
    {
    this.component = component;
    add(component);
    }

  private void forgeLabel(String labelText)
    {
    label = new JLabel(labelText);

    add(label);
    }

  private void tailorLabel()
    {
    label.setHorizontalAlignment(JLabel.RIGHT);
    }
  }