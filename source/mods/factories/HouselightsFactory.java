package mods.factories;

import exec.userinterface.*;
import gui.*;
import gui.combinations.*;
import mods.parameters.*;


public class HouselightsFactory
  {
  public static LabeledField delayParameter;

  public static void addParametersToWindow(ModWindow houselightsWindow)
    {
    houselightsWindow.setIfModIsActive(ParametersHouselights.IS_ACTIVE);
    delayParameter = new LabeledField(ParametersHouselights.PARAMETER_NAMES[0], ParametersHouselights.PARAMETERS[0]);

    houselightsWindow.addParameter(delayParameter);
    Spacing.addPlaceholdersToModWindow(houselightsWindow, ParametersHouselights.PARAMETERS);
    }
  }