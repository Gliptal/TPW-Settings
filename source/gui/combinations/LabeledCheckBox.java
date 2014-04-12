package gui.combinations;

import java.awt.*;
import javax.swing.*;


public class LabeledCheckBox extends CommonLabeled
  {
  private JCheckBox checkBox;

  public LabeledCheckBox(String labelText)
    {
    super(labelText);
    createAndAddCheckBox();
    }

  public void setStatus(boolean isSelected)
    {
    checkBox.setSelected(isSelected);
    }

  private void createAndAddCheckBox()
    {
    checkBox = new JCheckBox();

    this.add(checkBox, BorderLayout.CENTER);
    }
  }