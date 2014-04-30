package gui.combinations;

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

    if (layoutIs("BorderLayout"))
      add(component, BorderLayout.CENTER);
    else
      add(component);
    }

  protected void setLabelColor(Color color)
    {
    label.setBackground(color);
    }

  private void createAndAddLabel()
    {
    label = new JLabel(labelText);

    label.setOpaque(true);
    label.setHorizontalAlignment(JLabel.RIGHT);

    if (layoutIs("BorderLayout"))
      add(label, BorderLayout.WEST);
    else
      add(label);
    }

  private boolean layoutIs(String className)
    {
    String layoutClass = getLayout().getClass().getName();

    return layoutClass.equals("java.awt."+className);
    }
  }