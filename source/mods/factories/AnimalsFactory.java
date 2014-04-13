package mods.factories;

import exec.userinterface.*;
import gui.*;
import gui.combinations.*;
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
    animalsWindow.setIfModIsActive(ParametersAnimals.IS_ACTIVE);
    delayParameter = new LabeledField(ParametersAnimals.PARAMETER_NAMES[0], ParametersAnimals.PARAMETERS[0]);
    maxParameter = new LabeledField(ParametersAnimals.PARAMETER_NAMES[1], ParametersAnimals.PARAMETERS[1]);
    maxRadiusParameter = new LabeledField(ParametersAnimals.PARAMETER_NAMES[2], ParametersAnimals.PARAMETERS[2]);
    minRadiusParameter = new LabeledField(ParametersAnimals.PARAMETER_NAMES[3], ParametersAnimals.PARAMETERS[3]);
    noiseTimeParameter = new LabeledField(ParametersAnimals.PARAMETER_NAMES[4], ParametersAnimals.PARAMETERS[4]);

    animalsWindow.addParameter(delayParameter);
    animalsWindow.addParameter(maxParameter);
    animalsWindow.addParameter(maxRadiusParameter);
    animalsWindow.addParameter(minRadiusParameter);
    animalsWindow.addParameter(noiseTimeParameter);
    Spacing.addPlaceholdersToModWindow(animalsWindow, ParametersAnimals.PARAMETERS);
    }
  }