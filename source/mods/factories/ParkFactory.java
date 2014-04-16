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

  public static void addParametersToWindow(ModWindow parkWindow)
    {
    parkWindow.setIfModIsActive(ParkParameters.IS_ACTIVE);
    percParameter = new LabeledField(ParkParameters.PARAMETER_NAMES[0], ParkParameters.PARAMETERS[0]);
    createDistParameter = new LabeledField(ParkParameters.PARAMETER_NAMES[1], ParkParameters.PARAMETERS[1]);
    hideDistParameter = new LabeledField(ParkParameters.PARAMETER_NAMES[2], ParkParameters.PARAMETERS[2]);
    simDistParameter = new LabeledField(ParkParameters.PARAMETER_NAMES[3], ParkParameters.PARAMETERS[3]);
    maxParameter = new LabeledField(ParkParameters.PARAMETER_NAMES[4], ParkParameters.PARAMETERS[4]);

    percParameter.setToolTip(ToolTips.PARK[0]);
    createDistParameter.setToolTip(ToolTips.PARK[1]);
    hideDistParameter.setToolTip(ToolTips.PARK[2]);
    simDistParameter.setToolTip(ToolTips.PARK[3]);
    maxParameter.setToolTip(ToolTips.PARK[4]);

    parkWindow.addParameter(percParameter);
    parkWindow.addParameter(createDistParameter);
    parkWindow.addParameter(hideDistParameter);
    parkWindow.addParameter(simDistParameter);
    parkWindow.addParameter(maxParameter);
    Spacing.addPlaceholdersToModWindow(parkWindow, ParkParameters.PARAMETERS);
    }
  }