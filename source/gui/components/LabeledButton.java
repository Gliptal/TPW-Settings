package gui.components;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import exec.theme.*;
import gui.listeners.semaphores.*;


public class LabeledButton extends JPanel
  {
  private JLabel  label;
  private CursoredButton button;

  public LabeledButton(String buttonText)
    {
    setLayout(Layouts.LABELED_BUTTON());

    forgeLabel();
    forgeButton(buttonText);

    tailorLabel();
    }

  public void setToolTip(String toolTipText)
    {
    setToolTipText(toolTipText);
    button.setToolTipText(toolTipText);
    }

  public void setSemaphoreColor(boolean modIsActive)
    {
    if (modIsActive)
      label.setBackground(Colors.MOD_ACTIVE);
    else
      label.setBackground(Colors.MOD_INACTIVE);
    }

  public void addButtonListener(ActionListener listener)
    {
    button.addActionListener(listener);
    }

  public void linkToCheckBox(CheckBoxParameter checkBox)
    {
    label.addMouseListener(new ToggleModState(checkBox));
    }

  private void forgeLabel()
    {
    label = new JLabel(Spacings.SEMAPHORE);

    add(label, BorderLayout.WEST);
    }

  private void forgeButton(String buttonText)
    {
    button = new CursoredButton(buttonText);

    add(button, BorderLayout.CENTER);
    }

  private void tailorLabel()
    {
    label.setOpaque(true);
    label.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }
  }