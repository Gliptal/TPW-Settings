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

  private void createElementsSeparation()
    {
    this.setLayout(new BorderLayout(Spacing.COMBINATIONS, Spacing.COMBINATIONS));
    }

  private void createAndAddLabel(String labelText)
    {
    label = new JLabel(labelText);

    this.add(label, BorderLayout.WEST);
    }
  }