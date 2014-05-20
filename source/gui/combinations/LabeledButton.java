package gui.combinations;

import exec.userinterface.*;
import gui.listeners.semaphores.*;
import java.awt.event.*;
import javax.swing.*;


public class LabeledButton extends LabeledComponent
  {
  private JButton button;

  public LabeledButton(String buttonText)
    {
    super(Layouts.LABELED_BORDER(), Spacing.BUTTON_LABEL_WIDTH);

    addComponent(new JButton(buttonText));
    button = (JButton)component;
    }

  public void addButtonListener(ActionListener listener)
    {
    button.addActionListener(listener);
    }

  public void setSemaphoreColor(boolean linkedIsActive)
    {
    if (linkedIsActive)
      setLabelColor(Colors.ACTIVE_MOD);
    else
      setLabelColor(Colors.INACTIVE_MOD);
    }

  public void linkToCheckBox(LabeledCheckBox checkBox)
    {
    label.addMouseListener(new ToggleModState(checkBox));
    }

  public String getValue() {return "";}  // Dummy function

  public void setValue(String value) {}  // Dummy function
  }