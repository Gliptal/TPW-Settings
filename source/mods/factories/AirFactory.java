package mods.factories;

import exec.userinterface.*;
import gui.*;
import gui.combinations.*;
import mods.*;
import mods.parameters.*;


public class AirFactory
  {
  public static LabeledField delayParameter;
  public static LabeledField timeParameter;
  public static LabeledField maxParameter;

  public static void addParametersToWindow(ModWindow airWindow)
    {
    airWindow.setIfModIsActive(AirParameters.IS_ACTIVE);
    delayParameter = new LabeledField(AirParameters.PARAMETER_NAMES[0], AirParameters.PARAMETERS[0]);
    timeParameter = new LabeledField(AirParameters.PARAMETER_NAMES[1], AirParameters.PARAMETERS[1]);
    maxParameter = new LabeledField(AirParameters.PARAMETER_NAMES[2], AirParameters.PARAMETERS[2]);

    delayParameter.setToolTip(ToolTips.AIR[0]);
    timeParameter.setToolTip(ToolTips.AIR[1]);
    maxParameter.setToolTip(ToolTips.AIR[2]);

    airWindow.addParameter(delayParameter);
    airWindow.addParameter(timeParameter);
    airWindow.addParameter(maxParameter);
    Spacing.addPlaceholdersToModWindow(airWindow, AirParameters.PARAMETERS);
    }
  }