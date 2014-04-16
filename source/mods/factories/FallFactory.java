package mods.factories;

import exec.userinterface.*;
import gui.*;
import gui.combinations.*;
import mods.*;
import mods.parameters.*;


public class FallFactory
  {
  public static LabeledField sensitivityParameter;
  public static LabeledField thresholdParameter;
  public static LabeledField delayParameter;
  public static LabeledCheckBox ragdollParameter;
  public static LabeledField fallTimeSupParameter;

  public static void addParametersToWindow(ModWindow fallWindow)
    {
    fallWindow.setIfModIsActive(FallParameters.IS_ACTIVE);
    sensitivityParameter = new LabeledField(FallParameters.PARAMETER_NAMES[0], FallParameters.PARAMETERS[0]);
    thresholdParameter = new LabeledField(FallParameters.PARAMETER_NAMES[1], FallParameters.PARAMETERS[1]);
    delayParameter = new LabeledField(FallParameters.PARAMETER_NAMES[2], FallParameters.PARAMETERS[2]);
    ragdollParameter = new LabeledCheckBox(FallParameters.PARAMETER_NAMES[3], FallParameters.PARAMETERS[3]);
    fallTimeSupParameter = new LabeledField(FallParameters.PARAMETER_NAMES[4], FallParameters.PARAMETERS[4]);

    sensitivityParameter.setToolTip(ToolTips.FALL[0]);
    thresholdParameter.setToolTip(ToolTips.FALL[1]);
    delayParameter.setToolTip(ToolTips.FALL[2]);
    ragdollParameter.setToolTip(ToolTips.FALL[3]);
    fallTimeSupParameter.setToolTip(ToolTips.FALL[4]);

    fallWindow.addParameter(sensitivityParameter);
    fallWindow.addParameter(thresholdParameter);
    fallWindow.addParameter(delayParameter);
    fallWindow.addParameter(ragdollParameter);
    fallWindow.addParameter(fallTimeSupParameter);
    Spacing.addPlaceholdersToModWindow(fallWindow, FallParameters.PARAMETERS);
    }
  }