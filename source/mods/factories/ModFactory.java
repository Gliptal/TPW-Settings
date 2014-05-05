package mods.factories;

import gui.*;
import gui.combinations.*;


abstract public class ModFactory
  {
  protected ModWindow modWindow;

  protected LabeledComponent[] parameters;
  protected LabeledComponent[] visualParameters;

  public ModFactory(ModWindow modWindow)
    {
    this.modWindow = modWindow;
    }

  public void addParametersAndTooltips()
    {
    addParameters();
    addToolTips();
    }

  public String getValueFromParameter(int which)
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
    for (int i = 0; i < visualParameters.length; i += 1)
      modWindow.addParameter(visualParameters[i]);

    modWindow.fillModWindowWithPlaceholders();
    }
  }