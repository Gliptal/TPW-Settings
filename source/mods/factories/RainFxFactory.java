package mods.factories;

import gui.*;
import gui.combinations.*;
import mods.*;


public class RainFxFactory extends ModFactory
  {
  public RainFxFactory(ModWindow rainFxWindow)
    {
    super(rainFxWindow);

    parameters = new LabeledComponent[] {};
    }

  protected void addToolTips()
    {
    for (int i = 0; i < parameters.length; i += 1)
      parameters[i].setToolTip(ToolTips.RAIN_FX[i]);
    }
  }