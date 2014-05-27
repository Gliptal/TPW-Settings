package gui.listeners.semaphores;

import java.awt.event.*;

import gui.components.*;


public class ToggleModState extends MouseAdapter
  {
  private CheckBoxParameter checkBoxParameter;

  public ToggleModState(CheckBoxParameter checkBoxParameter)
    {
    this.checkBoxParameter = checkBoxParameter;
    }

  public void mouseClicked(MouseEvent event)
    {
    if (checkBoxParameter.isActive())
      checkBoxParameter.setValue(CheckBoxParameter.NOT_SELECTED);
    else
      checkBoxParameter.setValue(CheckBoxParameter.SELECTED);

    UpdateSemaphores.updateSemaphores();
    }
  }