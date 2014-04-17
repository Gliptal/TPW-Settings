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
    boatsWindow.setIfModIsActive(BoatsParameters.PARAMETERS[0]);
    delayParameter = new LabeledField(BoatsParameters.PARAMETER_NAMES[1], BoatsParameters.PARAMETERS[1]);
    radiusParameter = new LabeledField(BoatsParameters.PARAMETER_NAMES[2], BoatsParameters.PARAMETERS[2]);
    waypointsParameter = new LabeledField(BoatsParameters.PARAMETER_NAMES[3], BoatsParameters.PARAMETERS[3]);
    numParameter = new LabeledField(BoatsParameters.PARAMETER_NAMES[4], BoatsParameters.PARAMETERS[4]);

    delayParameter.setToolTip(ToolTips.BOATS[1]);
    radiusParameter.setToolTip(ToolTips.BOATS[2]);
    waypointsParameter.setToolTip(ToolTips.BOATS[3]);
    numParameter.setToolTip(ToolTips.BOATS[4]);

    boatsWindow.addParameter(delayParameter);
    boatsWindow.addParameter(radiusParameter);
    boatsWindow.addParameter(waypointsParameter);
    boatsWindow.addParameter(numParameter);
    Spacing.addPlaceholdersToModWindow(boatsWindow, BoatsParameters.PARAMETERS);
    }
  }