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

  public void addParametersAndTooltips()
    {
    addParameters();
    addToolTips();
    }

  public String getValueValue(int which)
    {
    if (which == 0)
      return modWindow.getIsActiveLabeledCheckBox().getValue();
    else
      return parameters[which-1].getValue();
    }

  public void setValueToParameter(String value, int which)
    {
    if (which == 0)
      modWindow.getIsActiveLabeledCheckBox().setValue(value);
    else
      parameters[which-1].setValue(value);
    }

  protected abstract void addToolTips();

  private void addParameters()
    {
    for (int i = 0; i < parameters.length; i += 1)
      modWindow.addParameter(parameters[i]);

    Spacing.addPlaceholdersToModWindow(modWindow, parameters);
    }
  }