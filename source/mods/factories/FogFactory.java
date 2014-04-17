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
    fogWindow.setIfModIsActive(FogParameters.PARAMETERS[0]);
    radiusParameter = new LabeledField(FogParameters.PARAMETER_NAMES[1], FogParameters.PARAMETERS[1]);
    delayParameter = new LabeledField(FogParameters.PARAMETER_NAMES[2], FogParameters.PARAMETERS[2]);
    breathParameter = new LabeledCheckBox(FogParameters.PARAMETER_NAMES[3], FogParameters.PARAMETERS[3]);
    groundFogParameter = new LabeledCheckBox(FogParameters.PARAMETER_NAMES[4], FogParameters.PARAMETERS[4]);
    rainFogSupParameter = new LabeledCheckBox(FogParameters.PARAMETER_NAMES[5], FogParameters.PARAMETERS[5]);
    heatHazeParameter = new LabeledCheckBox(FogParameters.PARAMETER_NAMES[6], FogParameters.PARAMETERS[6]);
    canSnowParameter = new LabeledCheckBox(FogParameters.PARAMETER_NAMES[7], FogParameters.PARAMETERS[7]);

    radiusParameter.setToolTip(ToolTips.FOG[1]);
    delayParameter.setToolTip(ToolTips.FOG[2]);
    breathParameter.setToolTip(ToolTips.FOG[3]);
    groundFogParameter.setToolTip(ToolTips.FOG[4]);
    rainFogSupParameter.setToolTip(ToolTips.FOG[5]);
    heatHazeParameter.setToolTip(ToolTips.FOG[6]);
    canSnowParameter.setToolTip(ToolTips.FOG[7]);

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