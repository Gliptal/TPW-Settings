package mods.factories;

import exec.userinterface.*;
import gui.*;
import gui.combinations.*;
import mods.parameters.*;


public class LosFactory
  {
  public static LabeledCheckBox debugParameter;
  public static LabeledField maxDistParameter;
  public static LabeledField minDistParameter;
  public static LabeledField delayParameter;

  public static void addParametersToWindow(ModWindow losWindow)
    {
    losWindow.setIfModIsActive(ParametersLos.IS_ACTIVE);
    debugParameter = new LabeledCheckBox(ParametersLos.PARAMETER_NAMES[0], ParametersLos.PARAMETERS[0]);
    maxDistParameter = new LabeledField(ParametersLos.PARAMETER_NAMES[1], ParametersLos.PARAMETERS[1]);
    minDistParameter = new LabeledField(ParametersLos.PARAMETER_NAMES[2], ParametersLos.PARAMETERS[2]);
    delayParameter = new LabeledField(ParametersLos.PARAMETER_NAMES[3], ParametersLos.PARAMETERS[3]);

    losWindow.addParameter(debugParameter);
    losWindow.addParameter(maxDistParameter);
    losWindow.addParameter(minDistParameter);
    losWindow.addParameter(delayParameter);
    Spacing.addPlaceholdersToModWindow(losWindow, ParametersLos.PARAMETERS);
    }
  }