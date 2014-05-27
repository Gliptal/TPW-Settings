package mods.factories;

import gui.*;
import gui.components.*;
import mods.*;


abstract public class ModFactory
  {
  protected ModWindow modWindow;

  protected Parameter[] parameters;
  protected Parameter[] visualParameters;

  public ModFactory(ModWindow modWindow)
    {
    this.modWindow = modWindow;
    }

  public void addParametersAndTooltips(int mod)
    {
    addParameters();
    addToolTips(mod);
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

  protected void addToolTips(int mod)
    {
    for (int i = 0; i < parameters.length; i += 1)
      parameters[i].setToolTip(ToolTips.MOD_TOOLTIPS[mod][i]);
    }

  private void addParameters()
    {
    for (int i = 0; i < visualParameters.length; i += 1)
      modWindow.addParameter(visualParameters[i]);

    modWindow.fillWithPlaceholders();
    }
  }