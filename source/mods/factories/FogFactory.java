package mods.factories;

import exec.userinterface.*;
import gui.*;
import gui.combinations.*;
import mods.parameters.*;


public class FogFactory
  {
  public static LabeledField radiusParameter;
  public static LabeledField delayParameter;
  public static LabeledCheckBox breathParameter;
  public static LabeledCheckBox groundFogParameter;
  public static LabeledCheckBox rainFogSupParameter;
  public static LabeledCheckBox heatHazeParameter;
  public static LabeledCheckBox canSnowParameter;

  public static void addParametersToWindow(ModWindow fogWindow)
    {
    fogWindow.setIfModIsActive(ParametersFog.IS_ACTIVE);
    radiusParameter = new LabeledField(ParametersFog.PARAMETER_NAMES[0], ParametersFog.PARAMETERS[0]);
    delayParameter = new LabeledField(ParametersFog.PARAMETER_NAMES[1], ParametersFog.PARAMETERS[1]);
    breathParameter = new LabeledCheckBox(ParametersFog.PARAMETER_NAMES[2], ParametersFog.PARAMETERS[2]);
    groundFogParameter = new LabeledCheckBox(ParametersFog.PARAMETER_NAMES[3], ParametersFog.PARAMETERS[3]);
    rainFogSupParameter = new LabeledCheckBox(ParametersFog.PARAMETER_NAMES[4], ParametersFog.PARAMETERS[4]);
    heatHazeParameter = new LabeledCheckBox(ParametersFog.PARAMETER_NAMES[5], ParametersFog.PARAMETERS[5]);
    canSnowParameter = new LabeledCheckBox(ParametersFog.PARAMETER_NAMES[6], ParametersFog.PARAMETERS[6]);

    fogWindow.addParameter(radiusParameter);
    fogWindow.addParameter(delayParameter);
    fogWindow.addParameter(breathParameter);
    fogWindow.addParameter(groundFogParameter);
    fogWindow.addParameter(rainFogSupParameter);
    fogWindow.addParameter(heatHazeParameter);
    fogWindow.addParameter(canSnowParameter);
    Spacing.addPlaceholdersToModWindow(fogWindow, ParametersFog.PARAMETERS);
    }
  }