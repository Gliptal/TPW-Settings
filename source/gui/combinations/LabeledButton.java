package gui.combinations;

import exec.userinterface.*;
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
      setLabelColor(Colors.ACTIVE_MOD_COLOR);
    else
      setLabelColor(Colors.INACTIVE_MOD_COLOR);
    }

  public String getValue() {return "";}  // Dummy function

  public void setValue(String value) {}  // Dummy function
  }