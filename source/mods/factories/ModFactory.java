package mods.factories;

import gui.*;
import gui.components.*;
import mods.*;


public abstract class ModFactory
  {
  protected ModWindow modWindow;

  protected Parameter[] parameters;
  protected Parameter[] visualParameters;

  public ModFactory(ModWindow modWindow)
    {
    this.modWindow = modWindow;
    }

  public String getValueFromParameter(int parameter)
    {
    if (parameter == 0)
      return modWindow.getIsActiveLabeledCheckBox().getValue();
    else
      return parameters[parameter-1].getValue();
    }

  public void setValueToParameter(String value, int parameter)
    {
    if (parameter == 0)
      modWindow.getIsActiveLabeledCheckBox().setValue(value);
    else
      parameters[parameter-1].setValue(value);
    }

  public void addToolTips(int mod)
    {
    for (int i = 0; i < parameters.length; i += 1)
      parameters[i].setToolTip(ToolTips.MOD_TOOLTIPS[mod][i]);
    }

  public void addParameters()
    {
    for (Parameter parameter:visualParameters)
      modWindow.addParameter(parameter);

    modWindow.fillWithPlaceholders();
    }
  }