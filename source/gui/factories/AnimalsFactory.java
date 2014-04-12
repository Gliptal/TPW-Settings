package gui.factories;

import exec.mods.*;
import gui.*;
import gui.combinations.*;


public class AnimalsFactory
  {
  public static LabeledField delayField;
  public static LabeledField maxField;
  public static LabeledField maxRadiusField;
  public static LabeledField minRadiusField;
  public static LabeledField noiseTimeField;

  public static void fillWindowWithParameters(ModWindow animalsWindow)
    {
    animalsWindow.setIfModIsActive(ParametersAnimals.IS_ACTIVE);
    delayField = new LabeledField(ParametersAnimals.PARAMETER_NAMES[0], ParametersAnimals.PARAMETERS[0]);
    maxField = new LabeledField(ParametersAnimals.PARAMETER_NAMES[1], ParametersAnimals.PARAMETERS[1]);
    maxRadiusField = new LabeledField(ParametersAnimals.PARAMETER_NAMES[2], ParametersAnimals.PARAMETERS[2]);
    minRadiusField = new LabeledField(ParametersAnimals.PARAMETER_NAMES[3], ParametersAnimals.PARAMETERS[3]);
    noiseTimeField = new LabeledField(ParametersAnimals.PARAMETER_NAMES[4], ParametersAnimals.PARAMETERS[4]);

    animalsWindow.addParameter(delayField);
    animalsWindow.addParameter(maxField);
    animalsWindow.addParameter(maxRadiusField);
    animalsWindow.addParameter(minRadiusField);
    animalsWindow.addParameter(noiseTimeField);
    createAndAddPlaceholders(animalsWindow);
    }

  private static void createAndAddPlaceholders(ModWindow animalsWindow)
    {
    for (int i = 0; i < CommonMod.MAXIMUM_PARAMETERS-ParametersAnimals.PARAMETERS.length; i += 1)
      animalsWindow.addPlaceHolder();
    }
  }