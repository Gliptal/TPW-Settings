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

  public static void addParametersToWindow(ModWindow streetlightsWindow)
    {

    streetlightsWindow.setIfModIsActive(StreetlightsParameters.IS_ACTIVE);
    factorParameter = new LabeledField(StreetlightsParameters.PARAMETER_NAMES[0], StreetlightsParameters.PARAMETERS[0]);
    rangeParameter = new LabeledField(StreetlightsParameters.PARAMETER_NAMES[1], StreetlightsParameters.PARAMETERS[1]);
    colourParameter = new LabeledComboBox(StreetlightsParameters.PARAMETER_NAMES[2], StreetlightsParameters.PARAMETERS[2], StreetlightsParameters.COLOUR);
    mothsParameter = new LabeledCheckBox(StreetlightsParameters.PARAMETER_NAMES[3], StreetlightsParameters.PARAMETERS[3]);

    factorParameter.setToolTip(ToolTips.STREETLIGHTS[0]);
    rangeParameter.setToolTip(ToolTips.STREETLIGHTS[1]);
    colourParameter.setToolTip(ToolTips.STREETLIGHTS[2]);
    mothsParameter.setToolTip(ToolTips.STREETLIGHTS[3]);

    streetlightsWindow.addParameter(factorParameter);
    streetlightsWindow.addParameter(rangeParameter);
    streetlightsWindow.addParameter(colourParameter);
    streetlightsWindow.addParameter(mothsParameter);
    Spacing.addPlaceholdersToModWindow(streetlightsWindow, StreetlightsParameters.PARAMETERS);
    }
  }