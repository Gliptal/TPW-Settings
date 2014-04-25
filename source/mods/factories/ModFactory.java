package mods.factories;

import exec.userinterface.*;
import gui.*;
import gui.combinations.*;


abstract public class ModFactory
  {
  protected ModWindow modWindow;
  protected LabeledComponent[] parameters;

  public ModFactory(ModWindow modWindow)
    {
    this.modWindow = modWindow;
    }

  public void fillModWindow()
    {
    addParameters();
    addToolTips();
    }

  public String getParameterValue(int which)
    {
    if (which == 0)
      return modWindow.getIsActiveLabeledCheckBox().getParameter();
    else
      return parameters[which-1].getParameter();
    }

  public void setValueToParameter(String value, int which)
    {
    if (which == 0)
      modWindow.getIsActiveLabeledCheckBox().setParameter(value);
    else
      parameters[which-1].setParameter(value);
    }

  protected abstract void addToolTips();

  private void addParameters()
    {
    for (int i = 0; i < parameters.length; i += 1)
      modWindow.addParameter(parameters[i]);

    Spacing.addPlaceholdersToModWindow(modWindow, parameters);
    }
  }