package gui.combinations;

import java.awt.*;
import javax.swing.*;


public class LabeledCheckBox extends JPanel
  {
  private JLabel label;
  private JCheckBox checkBox;

  public LabeledCheckBox(String labelText)
    {
    buildAndAttachElements(labelText);
    }

  private void buildAndAttachElements(String labelText)
    {
    label = new JLabel(labelText);
    checkBox = new JCheckBox();

    this.add(label, BorderLayout.WEST);
    this.add(checkBox, BorderLayout.CENTER);
    }
  }