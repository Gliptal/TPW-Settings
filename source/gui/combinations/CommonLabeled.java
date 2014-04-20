package gui.combinations;

import exec.*;
import java.awt.*;
import javax.swing.*;


public class CommonLabeled extends JPanel
  {
  private JLabel label;

  protected CommonLabeled(LayoutManager layout, String labelText)
    {
    setLayout(layout);
    createAndAddLabel(labelText);
    }

  protected void changeLabelColor(Color newColor)
    {
    label.setBackground(newColor);
    }

  protected void setPanelToolTip(String toolTipText)
    {
    setToolTipText(toolTipText);
    }

  private void createAndAddLabel(String labelText)
    {
    label = new JLabel(labelText);

    label.setOpaque(true);
    label.setHorizontalAlignment(JLabel.RIGHT);

    if (Utils.compareClass(getLayout(), "java.awt.BorderLayout"))
      add(label, BorderLayout.WEST);
    else
      add(label);
    }
  }