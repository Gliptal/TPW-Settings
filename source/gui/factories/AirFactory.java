package gui.factories;

import exec.mods.*;
import gui.*;
import gui.combinations.*;


public class AirFactory
  {
  public static LabeledField delayField;
  public static LabeledField timeField;
  public static LabeledField maxField;

  public static void fillWindowWithParameters(ModWindow airWindow)
    {
    airWindow.setIfModIsActive(ParametersAir.IS_ACTIVE);
    delayField = new LabeledField(ParametersAir.PARAMETER_NAMES[0], ParametersAir.PARAMETERS[0]);
    timeField = new LabeledField(ParametersAir.PARAMETER_NAMES[1], ParametersAir.PARAMETERS[1]);
    maxField = new LabeledField(ParametersAir.PARAMETER_NAMES[2], ParametersAir.PARAMETERS[2]);

    airWindow.addParameter(delayField);
    airWindow.addParameter(timeField);
    airWindow.addParameter(maxField);
    createAndAddPlaceholders(airWindow);
    }

  private static void createAndAddPlaceholders(ModWindow airWindow)
    {
    for (int i = 0; i < CommonMod.MAXIMUM_PARAMETERS-ParametersAir.PARAMETERS.length; i += 1)
      airWindow.addPlaceHolder();
    }
  }