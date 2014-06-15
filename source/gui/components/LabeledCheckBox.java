package gui.components;

import exec.laf.*;
import javax.swing.*;


public class LabeledCheckBox extends JPanel
  {
  private JCheckBox checkBox;

  public LabeledCheckBox(String checkBoxText)
    {
    setLayout(Layouts.LABELED_CHECKBOX());
    forgeCheckBox(checkBoxText);
    }

  public JCheckBox getCheckBox()
    {
    return checkBox;
    }

  private void forgeCheckBox(String checkBoxText)
    {
    checkBox = new JCheckBox(checkBoxText);

    add(checkBox);
    }
  }