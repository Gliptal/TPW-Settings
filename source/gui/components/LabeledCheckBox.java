package gui.components;

import javax.swing.*;

import exec.theme.*;


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
    Ui.switchToWindowsLaF();
    checkBox = new JCheckBox(checkBoxText);
    Ui.switchToEditedLaF();

    add(checkBox);
    }
  }