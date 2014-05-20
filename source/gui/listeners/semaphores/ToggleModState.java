package gui.listeners.semaphores;

import gui.combinations.*;
import java.awt.event.*;


public class ToggleModState extends MouseAdapter
  {
  private LabeledCheckBox labeledCheckBox;

  public ToggleModState(LabeledCheckBox labeledCheckBox)
    {
    this.labeledCheckBox = labeledCheckBox;
    }

  public void mouseClicked(MouseEvent event)
    {
    if (labeledCheckBox.isActive())
      labeledCheckBox.setValue("0");
    else
      labeledCheckBox.setValue("1");

    UpdateSemaphores.updateSemaphores();
    }
  }