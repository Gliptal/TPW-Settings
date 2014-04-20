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

  public static void createAndAddParametersToModWindow(ModWindow fallWindow)
    {
    fallWindow.setIfModIsActive(FallParameters.PARAMETERS[0]);
    sensitivityParameter = new LabeledField(FallParameters.PARAMETER_NAMES[1], FallParameters.PARAMETERS[1]);
    thresholdParameter = new LabeledField(FallParameters.PARAMETER_NAMES[2], FallParameters.PARAMETERS[2]);
    delayParameter = new LabeledField(FallParameters.PARAMETER_NAMES[3], FallParameters.PARAMETERS[3]);
    ragdollParameter = new LabeledCheckBox(FallParameters.PARAMETER_NAMES[4], FallParameters.PARAMETERS[4]);
    fallTimeSupParameter = new LabeledField(FallParameters.PARAMETER_NAMES[5], FallParameters.PARAMETERS[5]);

    sensitivityParameter.setToolTip(ToolTips.FALL[1]);
    thresholdParameter.setToolTip(ToolTips.FALL[2]);
    delayParameter.setToolTip(ToolTips.FALL[3]);
    ragdollParameter.setToolTip(ToolTips.FALL[4]);
    fallTimeSupParameter.setToolTip(ToolTips.FALL[5]);

    fallWindow.addParameter(sensitivityParameter);
    fallWindow.addParameter(thresholdParameter);
    fallWindow.addParameter(delayParameter);
    fallWindow.addParameter(ragdollParameter);
    fallWindow.addParameter(fallTimeSupParameter);
    Spacing.addPlaceholdersToModWindow(fallWindow, FallParameters.PARAMETERS);
    }

  public static void linkComponentsToArray(ModWindow fallWindow)
    {
    fallWindow.getIsActiveCheckBox().linkToArray(FallParameters.PARAMETERS, 0);
    sensitivityParameter.linkToArray(FallParameters.PARAMETERS, 1);
    thresholdParameter.linkToArray(FallParameters.PARAMETERS, 2);
    delayParameter.linkToArray(FallParameters.PARAMETERS, 3);
    ragdollParameter.linkToArray(FallParameters.PARAMETERS, 4);
    fallTimeSupParameter.linkToArray(FallParameters.PARAMETERS, 5);
    }
  }