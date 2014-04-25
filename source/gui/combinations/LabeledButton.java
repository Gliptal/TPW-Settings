package gui.combinations;

import exec.userinterface.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class LabeledButton extends LabeledComponent
  {
  public LabeledButton(String buttonText)
    {
    super(new BorderLayout(Spacing.COMBINATIONS, Spacing.COMBINATIONS), Spacing.BUTTON_LABEL_WIDTH);

    addComponent(new JButton(buttonText));
    }

  public void addButtonListener(ActionListener listener)
    {
    ((JButton)component).addActionListener(listener);
    }

  public void setCorrespondingColor(boolean linkedIsActive)
    {
    if (linkedIsActive)
      changeLabelColor(Buttons.ACTIVE_MOD_COLOR);
    else
      changeLabelColor(Buttons.INACTIVE_MOD_COLOR);
    }

  public String getParameter() {return "";}  // Dummy function

  public void setParameter(String value) {}  // Dummy function
  }