package gui.combinations;

import exec.userinterface.*;
import java.awt.*;
import javax.swing.*;


public class CommonLabeled extends JPanel
  {
  private JLabel label;

  protected CommonLabeled(String labelText)
    {
    createElementsSeparation();
    createAndAddLabel(labelText);
    }

  protected void setLabelToolTip(String toolTipText)
    {
    setToolTipText(toolTipText);
    }

  protected void changeLayout(LayoutManager layout)
    {
    this.setLayout(layout);
    }

  protected void moveLabel(String position)
    {
    this.remove(label);
    this.add(label, position);
    }

  protected void changeLabelColor(Color newColor)
    {
    label.setBackground(newColor);
    }

  private void createElementsSeparation()
    {
    this.setLayout(new GridLayout(1, 2, Spacing.COMBINATIONS, Spacing.COMBINATIONS));
    }

  private void createAndAddLabel(String labelText)
    {
    label = new JLabel(labelText);

    label.setOpaque(true);
    label.setHorizontalAlignment(JLabel.RIGHT);

    this.add(label);
    }
  }