package gui.combinations;

import exec.*;
import fileio.*;
import java.awt.*;
import javax.swing.*;


public abstract class LabeledComponent extends JPanel
  {
  private JLabel label;
  protected JComponent component;

  private String labelText;

  protected LabeledComponent(LayoutManager layout, String labelText)
    {
    this.labelText = labelText;

    setLayout(layout);
    createAndAddLabel();
    }

  public abstract String getParameter();

  public abstract void setParameter(String value);

  public void setToolTip(String toolTipText)
    {
    setToolTipText(toolTipText);
    component.setToolTipText(toolTipText);
    }

  protected void addComponent(JComponent component)
    {
    this.component = component;

    if (layoutIs("java.awt.BorderLayout"))
      add(component, BorderLayout.CENTER);
    else
      add(component);
    }

  protected void changeLabelColor(Color color)
    {
    label.setBackground(color);
    }

  private void createAndAddLabel()
    {
    label = new JLabel(labelText);

    label.setOpaque(true);
    label.setHorizontalAlignment(JLabel.RIGHT);

    if (layoutIs("java.awt.BorderLayout"))
      add(label, BorderLayout.WEST);
    else
      add(label);
    }

  private boolean layoutIs(String comparedClass)
    {
    return Utils.compareClass(getLayout(), comparedClass);
    }
  }