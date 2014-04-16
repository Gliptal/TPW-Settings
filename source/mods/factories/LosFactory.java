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

  public static void addParametersToWindow(ModWindow losWindow)
    {
    losWindow.setIfModIsActive(LosParameters.IS_ACTIVE);
    debugParameter = new LabeledCheckBox(LosParameters.PARAMETER_NAMES[0], LosParameters.PARAMETERS[0]);
    maxDistParameter = new LabeledField(LosParameters.PARAMETER_NAMES[1], LosParameters.PARAMETERS[1]);
    minDistParameter = new LabeledField(LosParameters.PARAMETER_NAMES[2], LosParameters.PARAMETERS[2]);
    delayParameter = new LabeledField(LosParameters.PARAMETER_NAMES[3], LosParameters.PARAMETERS[3]);

    debugParameter.setToolTip(ToolTips.LOS[0]);
    maxDistParameter.setToolTip(ToolTips.LOS[1]);
    minDistParameter.setToolTip(ToolTips.LOS[2]);
    delayParameter.setToolTip(ToolTips.LOS[3]);

    losWindow.addParameter(debugParameter);
    losWindow.addParameter(maxDistParameter);
    losWindow.addParameter(minDistParameter);
    losWindow.addParameter(delayParameter);
    Spacing.addPlaceholdersToModWindow(losWindow, LosParameters.PARAMETERS);
    }
  }