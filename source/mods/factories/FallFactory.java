package mods.factories;

import exec.userinterface.*;
import gui.*;
import gui.combinations.*;
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
    fallWindow.setIfModIsActive(ParametersFall.IS_ACTIVE);
    sensitivityParameter = new LabeledField(ParametersFall.PARAMETER_NAMES[0], ParametersFall.PARAMETERS[0]);
    thresholdParameter = new LabeledField(ParametersFall.PARAMETER_NAMES[1], ParametersFall.PARAMETERS[1]);
    delayParameter = new LabeledField(ParametersFall.PARAMETER_NAMES[2], ParametersFall.PARAMETERS[2]);
    ragdollParameter = new LabeledCheckBox(ParametersFall.PARAMETER_NAMES[3], ParametersFall.PARAMETERS[3]);
    fallTimeSupParameter = new LabeledField(ParametersFall.PARAMETER_NAMES[4], ParametersFall.PARAMETERS[4]);

    fallWindow.addParameter(sensitivityParameter);
    fallWindow.addParameter(thresholdParameter);
    fallWindow.addParameter(delayParameter);
    fallWindow.addParameter(ragdollParameter);
    fallWindow.addParameter(fallTimeSupParameter);
    Spacing.addPlaceholdersToModWindow(fallWindow, ParametersFall.PARAMETERS);
    }
  }