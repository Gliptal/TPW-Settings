package mods.factories;

import exec.userinterface.*;
import gui.*;
import gui.combinations.*;
import mods.*;
import mods.parameters.*;


public class AirFactory
  {
  private static LabeledField delayParameter;
  private static LabeledField timeParameter;
  private static LabeledField maxParameter;

  public static void createAndAddParametersToModWindow(ModWindow airWindow)
    {
    airWindow.setIfModIsActive(AirParameters.PARAMETERS[0]);
    delayParameter = new LabeledField(AirParameters.PARAMETER_NAMES[1], AirParameters.PARAMETERS[1]);
    timeParameter = new LabeledField(AirParameters.PARAMETER_NAMES[2], AirParameters.PARAMETERS[2]);
    maxParameter = new LabeledField(AirParameters.PARAMETER_NAMES[3], AirParameters.PARAMETERS[3]);

    delayParameter.setToolTip(ToolTips.AIR[1]);
    timeParameter.setToolTip(ToolTips.AIR[2]);
    maxParameter.setToolTip(ToolTips.AIR[3]);

    airWindow.addParameter(delayParameter);
    airWindow.addParameter(timeParameter);
    airWindow.addParameter(maxParameter);
    Spacing.addPlaceholdersToModWindow(airWindow, AirParameters.PARAMETERS);
    }

  public static void linkComponentsToArray(ModWindow airWindow)
    {
    airWindow.getIsActiveCheckBox().linkToArray(AirParameters.PARAMETERS, 0);
    delayParameter.linkToArray(AirParameters.PARAMETERS, 1);
    timeParameter.linkToArray(AirParameters.PARAMETERS, 2);
    maxParameter.linkToArray(AirParameters.PARAMETERS, 3);
    }
  }