package mods.factories;

import exec.userinterface.*;
import gui.*;
import gui.combinations.*;
import mods.*;
import mods.parameters.*;


public class ParkFactory
  {
  public static LabeledField percParameter;
  public static LabeledField createDistParameter;
  public static LabeledField hideDistParameter;
  public static LabeledField simDistParameter;
  public static LabeledField maxParameter;

  public static void createAndAddParametersToModWindow(ModWindow parkWindow)
    {
    parkWindow.setIfModIsActive(ParkParameters.PARAMETERS[0]);
    percParameter = new LabeledField(ParkParameters.PARAMETER_NAMES[1], ParkParameters.PARAMETERS[1]);
    createDistParameter = new LabeledField(ParkParameters.PARAMETER_NAMES[2], ParkParameters.PARAMETERS[2]);
    hideDistParameter = new LabeledField(ParkParameters.PARAMETER_NAMES[3], ParkParameters.PARAMETERS[3]);
    simDistParameter = new LabeledField(ParkParameters.PARAMETER_NAMES[4], ParkParameters.PARAMETERS[4]);
    maxParameter = new LabeledField(ParkParameters.PARAMETER_NAMES[5], ParkParameters.PARAMETERS[5]);

    percParameter.setToolTip(ToolTips.PARK[1]);
    createDistParameter.setToolTip(ToolTips.PARK[2]);
    hideDistParameter.setToolTip(ToolTips.PARK[3]);
    simDistParameter.setToolTip(ToolTips.PARK[4]);
    maxParameter.setToolTip(ToolTips.PARK[5]);

    parkWindow.addParameter(percParameter);
    parkWindow.addParameter(createDistParameter);
    parkWindow.addParameter(hideDistParameter);
    parkWindow.addParameter(simDistParameter);
    parkWindow.addParameter(maxParameter);
    Spacing.addPlaceholdersToModWindow(parkWindow, ParkParameters.PARAMETERS);
    }

  public static void linkComponentsToArray(ModWindow parkWindow)
    {
    parkWindow.getIsActiveCheckBox().linkToArray(ParkParameters.PARAMETERS, 0);
    percParameter.linkToArray(ParkParameters.PARAMETERS, 1);
    createDistParameter.linkToArray(ParkParameters.PARAMETERS, 2);
    hideDistParameter.linkToArray(ParkParameters.PARAMETERS, 3);
    simDistParameter.linkToArray(ParkParameters.PARAMETERS, 4);
    maxParameter.linkToArray(ParkParameters.PARAMETERS, 5);
    }
  }