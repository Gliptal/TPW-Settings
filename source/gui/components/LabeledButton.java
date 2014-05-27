package gui.components;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import exec.laf.*;
import gui.listeners.semaphores.*;


public class LabeledButton extends JPanel
  {
  private JLabel label;
  private JButton button;

  public LabeledButton(String buttonText)
    {
    setLayout(Layouts.LABELED_BUTTON());

    forgeLabel(Spacing.BUTTON_LABEL_WIDTH);
    forgeButton(buttonText);
    }

  public void setToolTip(String toolTipText)
    {
    setToolTipText(toolTipText);
    button.setToolTipText(toolTipText);
    }

  public void setSemaphoreColor(boolean modIsActive)
    {
    if (modIsActive)
      label.setBackground(Colors.ACTIVE_MOD);
    else
      label.setBackground(Colors.INACTIVE_MOD);
    }

  public void addButtonListener(ActionListener listener)
    {
    button.addActionListener(listener);
    }

  public void linkToCheckBox(CheckBoxParameter checkBox)
    {
    label.addMouseListener(new ToggleModState(checkBox));
    }

  private void forgeLabel(String labelText)
    {
    label = new JLabel(labelText);

    label.setOpaque(true);

    add(label, BorderLayout.WEST);
    }

  private void forgeButton(String buttonText)
    {
    button = new JButton(buttonText);

    add(button, BorderLayout.CENTER);
    }
  }