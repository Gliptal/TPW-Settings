package gui.components;

import java.awt.*;
import javax.swing.*;

import exec.theme.*;


public class LabeledCheckBox extends JPanel
  {
  private JCheckBox checkBox;

  public LabeledCheckBox(String checkBoxText)
    {
    setLayout(Layouts.LABELED_CHECKBOX());

    forgeCheckBox(checkBoxText);
    tailorCheckBox();
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

  private void tailorCheckBox()
    {
    checkBox.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }
  }