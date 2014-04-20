package mods.factories;

import exec.userinterface.*;
import gui.*;
import gui.combinations.*;
import mods.*;
import mods.parameters.*;


public class LosFactory
  {
  public static LabeledCheckBox debugParameter;
  public static LabeledField maxDistParameter;
  public static LabeledField minDistParameter;
  public static LabeledField delayParameter;

  public static void createAndAddParametersToModWindow(ModWindow losWindow)
    {
    losWindow.setIfModIsActive(LosParameters.PARAMETERS[0]);
    debugParameter = new LabeledCheckBox(LosParameters.PARAMETER_NAMES[1], LosParameters.PARAMETERS[1]);
    maxDistParameter = new LabeledField(LosParameters.PARAMETER_NAMES[2], LosParameters.PARAMETERS[2]);
    minDistParameter = new LabeledField(LosParameters.PARAMETER_NAMES[3], LosParameters.PARAMETERS[3]);
    delayParameter = new LabeledField(LosParameters.PARAMETER_NAMES[4], LosParameters.PARAMETERS[4]);

    debugParameter.setToolTip(ToolTips.LOS[1]);
    maxDistParameter.setToolTip(ToolTips.LOS[2]);
    minDistParameter.setToolTip(ToolTips.LOS[3]);
    delayParameter.setToolTip(ToolTips.LOS[4]);

    losWindow.addParameter(debugParameter);
    losWindow.addParameter(maxDistParameter);
    losWindow.addParameter(minDistParameter);
    losWindow.addParameter(delayParameter);
    Spacing.addPlaceholdersToModWindow(losWindow, LosParameters.PARAMETERS);
    }

  public static void linkComponentsToArray(ModWindow losWindow)
    {
    losWindow.getIsActiveCheckBox().linkToArray(LosParameters.PARAMETERS, 0);
    debugParameter.linkToArray(LosParameters.PARAMETERS, 1);
    maxDistParameter.linkToArray(LosParameters.PARAMETERS, 2);
    minDistParameter.linkToArray(LosParameters.PARAMETERS, 3);
    delayParameter.linkToArray(LosParameters.PARAMETERS, 4);
    }
  }