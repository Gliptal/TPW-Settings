package mods.factories;

import exec.userinterface.*;
import gui.*;
import gui.combinations.*;
import mods.*;
import mods.parameters.*;


public class StreetlightsFactory
  {
  public static LabeledField factorParameter;
  public static LabeledField rangeParameter;
  public static LabeledComboBox colourParameter;
  public static LabeledCheckBox mothsParameter;

  public static void createAndAddParametersToModWindow(ModWindow streetlightsWindow)
    {
    streetlightsWindow.setIfModIsActive(StreetlightsParameters.PARAMETERS[0]);
    factorParameter = new LabeledField(StreetlightsParameters.PARAMETER_NAMES[1], StreetlightsParameters.PARAMETERS[1]);
    rangeParameter = new LabeledField(StreetlightsParameters.PARAMETER_NAMES[2], StreetlightsParameters.PARAMETERS[2]);
    colourParameter = new LabeledComboBox(StreetlightsParameters.PARAMETER_NAMES[3], StreetlightsParameters.PARAMETERS[3], StreetlightsParameters.COLOUR);
    mothsParameter = new LabeledCheckBox(StreetlightsParameters.PARAMETER_NAMES[4], StreetlightsParameters.PARAMETERS[4]);

    factorParameter.setToolTip(ToolTips.STREETLIGHTS[1]);
    rangeParameter.setToolTip(ToolTips.STREETLIGHTS[2]);
    colourParameter.setToolTip(ToolTips.STREETLIGHTS[3]);
    mothsParameter.setToolTip(ToolTips.STREETLIGHTS[4]);

    streetlightsWindow.addParameter(factorParameter);
    streetlightsWindow.addParameter(rangeParameter);
    streetlightsWindow.addParameter(colourParameter);
    streetlightsWindow.addParameter(mothsParameter);
    Spacing.addPlaceholdersToModWindow(streetlightsWindow, StreetlightsParameters.PARAMETERS);
    }

  public static void linkComponentsToArray(ModWindow streetlightsWindow)
    {
    streetlightsWindow.getIsActiveCheckBox().linkToArray(StreetlightsParameters.PARAMETERS, 0);
    factorParameter.linkToArray(StreetlightsParameters.PARAMETERS, 1);
    rangeParameter.linkToArray(StreetlightsParameters.PARAMETERS, 2);
    colourParameter.linkToArray(StreetlightsParameters.PARAMETERS, 3);
    mothsParameter.linkToArray(StreetlightsParameters.PARAMETERS, 4);
    }
  }