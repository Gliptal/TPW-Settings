package gui.combinations;

import exec.userinterface.*;
import java.awt.*;
import javax.swing.*;


public class CommonLabeled extends JPanel
  {
  private JLabel label;

  public CommonLabeled(String labelText)
    {
    createElementsSeparation();
    createAndAddLabel(labelText);
    }

  public void changeLabelColor(Color newColor)
    {
    label.setBackground(newColor);
    }

  private void createElementsSeparation()
    {
    this.setLayout(new BorderLayout(Spacing.COMBINATIONS, Spacing.COMBINATIONS));
    }

  private void createAndAddLabel(String labelText)
    {
    label = new JLabel(labelText);

    label.setOpaque(true);

    this.add(label, BorderLayout.WEST);
    }
  }