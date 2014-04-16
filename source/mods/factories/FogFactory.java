package mods.factories;

import exec.userinterface.*;
import gui.*;
import gui.combinations.*;
import mods.*;
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
    fogWindow.setIfModIsActive(FogParameters.IS_ACTIVE);
    radiusParameter = new LabeledField(FogParameters.PARAMETER_NAMES[0], FogParameters.PARAMETERS[0]);
    delayParameter = new LabeledField(FogParameters.PARAMETER_NAMES[1], FogParameters.PARAMETERS[1]);
    breathParameter = new LabeledCheckBox(FogParameters.PARAMETER_NAMES[2], FogParameters.PARAMETERS[2]);
    groundFogParameter = new LabeledCheckBox(FogParameters.PARAMETER_NAMES[3], FogParameters.PARAMETERS[3]);
    rainFogSupParameter = new LabeledCheckBox(FogParameters.PARAMETER_NAMES[4], FogParameters.PARAMETERS[4]);
    heatHazeParameter = new LabeledCheckBox(FogParameters.PARAMETER_NAMES[5], FogParameters.PARAMETERS[5]);
    canSnowParameter = new LabeledCheckBox(FogParameters.PARAMETER_NAMES[6], FogParameters.PARAMETERS[6]);

    radiusParameter.setToolTip(ToolTips.FOG[0]);
    delayParameter.setToolTip(ToolTips.FOG[1]);
    breathParameter.setToolTip(ToolTips.FOG[2]);
    groundFogParameter.setToolTip(ToolTips.FOG[3]);
    rainFogSupParameter.setToolTip(ToolTips.FOG[4]);
    heatHazeParameter.setToolTip(ToolTips.FOG[5]);
    canSnowParameter.setToolTip(ToolTips.FOG[6]);

    fogWindow.addParameter(radiusParameter);
    fogWindow.addParameter(delayParameter);
    fogWindow.addParameter(breathParameter);
    fogWindow.addParameter(groundFogParameter);
    fogWindow.addParameter(rainFogSupParameter);
    fogWindow.addParameter(heatHazeParameter);
    fogWindow.addParameter(canSnowParameter);
    Spacing.addPlaceholdersToModWindow(fogWindow, FogParameters.PARAMETERS);
    }
  }