package mods.factories;

import exec.userinterface.*;
import gui.*;
import gui.combinations.*;
import mods.*;
import mods.parameters.*;


public class HouselightsFactory
  {
  public static LabeledField delayParameter;

  public static void createAndAddParametersToModWindow(ModWindow houselightsWindow)
    {
    houselightsWindow.setIfModIsActive(HouselightsParameters.PARAMETERS[0]);
    delayParameter = new LabeledField(HouselightsParameters.PARAMETER_NAMES[1], HouselightsParameters.PARAMETERS[1]);

    delayParameter.setToolTip(ToolTips.HOUSELIGHTS[1]);

    houselightsWindow.addParameter(delayParameter);
    Spacing.addPlaceholdersToModWindow(houselightsWindow, HouselightsParameters.PARAMETERS);
    }

  public static void linkComponentsToArray(ModWindow houselightsWindow)
    {
    houselightsWindow.getIsActiveCheckBox().linkToArray(HouselightsParameters.PARAMETERS, 0);
    delayParameter.linkToArray(HouselightsParameters.PARAMETERS, 1);
    }
  }