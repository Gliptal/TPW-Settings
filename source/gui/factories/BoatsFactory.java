package gui.factories;

import exec.mods.*;
import gui.*;
import gui.combinations.*;


public class BoatsFactory
  {
  public static LabeledField delayField;
  public static LabeledField radiusField;
  public static LabeledField waypointsField;
  public static LabeledField maximumField;

  public static void fillWindowWithParameters(ModWindow boatsWindow)
    {
    boatsWindow.setIfModIsActive(ParametersBoats.IS_ACTIVE);
    delayField = new LabeledField(ParametersBoats.PARAMETER_NAMES[0], ParametersBoats.PARAMETERS[0]);
    radiusField = new LabeledField(ParametersBoats.PARAMETER_NAMES[1], ParametersBoats.PARAMETERS[1]);
    waypointsField = new LabeledField(ParametersBoats.PARAMETER_NAMES[2], ParametersBoats.PARAMETERS[2]);
    maximumField = new LabeledField(ParametersBoats.PARAMETER_NAMES[3], ParametersBoats.PARAMETERS[3]);

    boatsWindow.addParameter(delayField);
    boatsWindow.addParameter(radiusField);
    boatsWindow.addParameter(waypointsField);
    boatsWindow.addParameter(maximumField);
    createAndAddPlaceholders(boatsWindow);
    }

  private static void createAndAddPlaceholders(ModWindow boatsWindow)
    {
    for (int i = 0; i < CommonMod.MAXIMUM_PARAMETERS-ParametersBoats.PARAMETERS.length; i += 1)
      boatsWindow.addPlaceHolder();
    }
  }