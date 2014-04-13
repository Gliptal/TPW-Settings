package mods.factories;

import exec.userinterface.*;
import gui.*;
import gui.combinations.*;
import mods.parameters.*;


public class AirFactory
  {
  public static LabeledField delayParameter;
  public static LabeledField timeParameter;
  public static LabeledField maxParameter;

  public static void addParametersToWindow(ModWindow airWindow)
    {
    airWindow.setIfModIsActive(ParametersAir.IS_ACTIVE);
    delayParameter = new LabeledField(ParametersAir.PARAMETER_NAMES[0], ParametersAir.PARAMETERS[0]);
    timeParameter = new LabeledField(ParametersAir.PARAMETER_NAMES[1], ParametersAir.PARAMETERS[1]);
    maxParameter = new LabeledField(ParametersAir.PARAMETER_NAMES[2], ParametersAir.PARAMETERS[2]);

    airWindow.addParameter(delayParameter);
    airWindow.addParameter(timeParameter);
    airWindow.addParameter(maxParameter);
    Spacing.addPlaceholdersToModWindow(airWindow, ParametersAir.PARAMETERS);
    }
  }