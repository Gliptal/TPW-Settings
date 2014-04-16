package mods.factories;

import exec.userinterface.*;
import gui.*;
import gui.combinations.*;
import mods.*;
import mods.parameters.*;


public class HouselightsFactory
  {
  public static LabeledField delayParameter;

  public static void addParametersToWindow(ModWindow houselightsWindow)
    {
    houselightsWindow.setIfModIsActive(HouselightsParameters.IS_ACTIVE);
    delayParameter = new LabeledField(HouselightsParameters.PARAMETER_NAMES[0], HouselightsParameters.PARAMETERS[0]);

    delayParameter.setToolTip(ToolTips.HOUSELIGHTS[0]);

    houselightsWindow.addParameter(delayParameter);
    Spacing.addPlaceholdersToModWindow(houselightsWindow, HouselightsParameters.PARAMETERS);
    }
  }