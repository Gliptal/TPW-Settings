package mods.factories;

import exec.userinterface.*;
import gui.*;
import gui.combinations.*;
import mods.parameters.*;


public class BoatsFactory
  {
  public static LabeledField delayParameter;
  public static LabeledField radiusParameter;
  public static LabeledField waypointsParameter;
  public static LabeledField numParameter;

  public static void addParametersToWindow(ModWindow boatsWindow)
    {
    boatsWindow.setIfModIsActive(ParametersBoats.IS_ACTIVE);
    delayParameter = new LabeledField(ParametersBoats.PARAMETER_NAMES[0], ParametersBoats.PARAMETERS[0]);
    radiusParameter = new LabeledField(ParametersBoats.PARAMETER_NAMES[1], ParametersBoats.PARAMETERS[1]);
    waypointsParameter = new LabeledField(ParametersBoats.PARAMETER_NAMES[2], ParametersBoats.PARAMETERS[2]);
    numParameter = new LabeledField(ParametersBoats.PARAMETER_NAMES[3], ParametersBoats.PARAMETERS[3]);

    boatsWindow.addParameter(delayParameter);
    boatsWindow.addParameter(radiusParameter);
    boatsWindow.addParameter(waypointsParameter);
    boatsWindow.addParameter(numParameter);
    Spacing.addPlaceholdersToModWindow(boatsWindow, ParametersBoats.PARAMETERS);
    }
  }