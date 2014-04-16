package mods.factories;

import exec.userinterface.*;
import gui.*;
import gui.combinations.*;
import mods.*;
import mods.parameters.*;


public class BoatsFactory
  {
  public static LabeledField delayParameter;
  public static LabeledField radiusParameter;
  public static LabeledField waypointsParameter;
  public static LabeledField numParameter;

  public static void addParametersToWindow(ModWindow boatsWindow)
    {
    boatsWindow.setIfModIsActive(BoatsParameters.IS_ACTIVE);
    delayParameter = new LabeledField(BoatsParameters.PARAMETER_NAMES[0], BoatsParameters.PARAMETERS[0]);
    radiusParameter = new LabeledField(BoatsParameters.PARAMETER_NAMES[1], BoatsParameters.PARAMETERS[1]);
    waypointsParameter = new LabeledField(BoatsParameters.PARAMETER_NAMES[2], BoatsParameters.PARAMETERS[2]);
    numParameter = new LabeledField(BoatsParameters.PARAMETER_NAMES[3], BoatsParameters.PARAMETERS[3]);

    delayParameter.setToolTip(ToolTips.BOATS[0]);
    radiusParameter.setToolTip(ToolTips.BOATS[1]);
    waypointsParameter.setToolTip(ToolTips.BOATS[2]);
    numParameter.setToolTip(ToolTips.BOATS[3]);

    boatsWindow.addParameter(delayParameter);
    boatsWindow.addParameter(radiusParameter);
    boatsWindow.addParameter(waypointsParameter);
    boatsWindow.addParameter(numParameter);
    Spacing.addPlaceholdersToModWindow(boatsWindow, BoatsParameters.PARAMETERS);
    }
  }