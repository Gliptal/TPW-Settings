package mods.factories;

import exec.userinterface.*;
import gui.*;
import gui.combinations.*;
import mods.*;
import mods.parameters.*;


public class AnimalsFactory
  {
  public static LabeledField delayParameter;
  public static LabeledField maxParameter;
  public static LabeledField maxRadiusParameter;
  public static LabeledField minRadiusParameter;
  public static LabeledField noiseTimeParameter;

  public static void addParametersToWindow(ModWindow animalsWindow)
    {
    animalsWindow.setIfModIsActive(AnimalsParameters.IS_ACTIVE);
    delayParameter = new LabeledField(AnimalsParameters.PARAMETER_NAMES[0], AnimalsParameters.PARAMETERS[0]);
    maxParameter = new LabeledField(AnimalsParameters.PARAMETER_NAMES[1], AnimalsParameters.PARAMETERS[1]);
    maxRadiusParameter = new LabeledField(AnimalsParameters.PARAMETER_NAMES[2], AnimalsParameters.PARAMETERS[2]);
    minRadiusParameter = new LabeledField(AnimalsParameters.PARAMETER_NAMES[3], AnimalsParameters.PARAMETERS[3]);
    noiseTimeParameter = new LabeledField(AnimalsParameters.PARAMETER_NAMES[4], AnimalsParameters.PARAMETERS[4]);

    delayParameter.setToolTip(ToolTips.ANIMALS[0]);
    maxParameter.setToolTip(ToolTips.ANIMALS[1]);
    maxRadiusParameter.setToolTip(ToolTips.ANIMALS[2]);
    minRadiusParameter.setToolTip(ToolTips.ANIMALS[3]);
    noiseTimeParameter.setToolTip(ToolTips.ANIMALS[4]);

    animalsWindow.addParameter(delayParameter);
    animalsWindow.addParameter(maxParameter);
    animalsWindow.addParameter(maxRadiusParameter);
    animalsWindow.addParameter(minRadiusParameter);
    animalsWindow.addParameter(noiseTimeParameter);
    Spacing.addPlaceholdersToModWindow(animalsWindow, AnimalsParameters.PARAMETERS);
    }
  }