package gui.components;

import java.awt.*;
import javax.swing.*;


public class LabeledCheckBox extends Labeled
  {
  private JCheckBox checkBox;

  public LabeledCheckBox(String checkBoxText)
    {
    forgeCheckBox(checkBoxText);
    }

  public JCheckBox getCheckBox()
    {
    return checkBox;
    }

  private void forgeCheckBox(String checkBoxText)
    {
    checkBox = new JCheckBox(checkBoxText);

    add(checkBox, BorderLayout.CENTER);
    }
  }