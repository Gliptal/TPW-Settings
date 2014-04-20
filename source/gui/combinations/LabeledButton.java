package gui.combinations;

import exec.*;
import exec.userinterface.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class LabeledButton extends CommonLabeled
  {
  private JButton button;

  public LabeledButton(String buttonText, String modIsActive)
    {
    super(new BorderLayout(Spacing.COMBINATIONS, Spacing.COMBINATIONS), Spacing.BUTTON_LABEL_WIDTH);
    createAndAddButton(buttonText);
    setCorrespondingColor(Utils.stringToBoolean(modIsActive));
    }

  public void addActionListener(ActionListener listener)
    {
    button.addActionListener(listener);
    }

  public void setToolTip(String toolTipText)
    {
    setPanelToolTip(toolTipText);
    button.setToolTipText(toolTipText);
    }

  public void setCorrespondingColor(boolean modIsActive)
    {
    if (modIsActive)
      changeLabelColor(Buttons.ACTIVE_MOD_COLOR);
    else
      changeLabelColor(Buttons.INACTIVE_MOD_COLOR);
    }

  private void createAndAddButton(String buttonText)
    {
    button = new JButton(buttonText);

    add(button, BorderLayout.CENTER);
    }
  }