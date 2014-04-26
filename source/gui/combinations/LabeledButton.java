package gui.combinations;

import exec.userinterface.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class LabeledButton extends LabeledComponent
  {
  private JButton button;

  public LabeledButton(String buttonText)
    {
    super(new BorderLayout(Spacing.COMBINATIONS, Spacing.COMBINATIONS), Spacing.BUTTON_LABEL_WIDTH);

    addComponent(new JButton(buttonText));
    button = (JButton)component;
    }

  public void addButtonListener(ActionListener listener)
    {
    button.addActionListener(listener);
    }

  public void setCorrespondingColor(boolean linkedIsActive)
    {
    if (linkedIsActive)
      setLabelColor(Buttons.ACTIVE_MOD_COLOR);
    else
      setLabelColor(Buttons.INACTIVE_MOD_COLOR);
    }

  public String getValue() {return "";}  // Dummy function

  public void setValue(String value) {}  // Dummy function
  }