package gui.components;

import javax.swing.*;

import exec.laf.*;


public abstract class Parameter extends JPanel
  {
  private JLabel label;
  protected JComponent component;

  protected Parameter(String labelText)
    {
    setLayout(Layouts.PARAMETER());

    forgeLabel(labelText);
    }

  public abstract String getValue();

  public abstract void setValue(String value);

  public void setToolTip(String toolTipText)
    {
    setToolTipText(toolTipText);
    component.setToolTipText(toolTipText);
    }

  protected void addComponent(JComponent component)
    {
    this.component = component;
    add(component);
    }

  private void forgeLabel(String labelText)
    {
    label = new JLabel(labelText);

    label.setHorizontalAlignment(JLabel.RIGHT);

    add(label);
    }
  }