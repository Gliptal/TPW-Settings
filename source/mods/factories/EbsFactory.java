package mods.factories;

import exec.userinterface.*;
import gui.*;
import gui.combinations.*;
import mods.parameters.*;


public class EbsFactory
  {
  public static LabeledField threshParameter;
  public static LabeledField delayParameter;
  public static LabeledCheckBox debugParameter;
  public static LabeledField radiusParameter;
  public static LabeledCheckBox playerSupParameter;
  public static LabeledCheckBox aiSupParameter;
  public static LabeledCheckBox findCoverParameter;

  public static void addParametersToWindow(ModWindow ebsWindow)
    {
    ebsWindow.setIfModIsActive(ParametersEbs.IS_ACTIVE);
    threshParameter = new LabeledField(ParametersEbs.PARAMETER_NAMES[0], ParametersEbs.PARAMETERS[0]);
    delayParameter = new LabeledField(ParametersEbs.PARAMETER_NAMES[1], ParametersEbs.PARAMETERS[1]);
    debugParameter = new LabeledCheckBox(ParametersEbs.PARAMETER_NAMES[2], ParametersEbs.PARAMETERS[2]);
    radiusParameter = new LabeledField(ParametersEbs.PARAMETER_NAMES[3], ParametersEbs.PARAMETERS[3]);
    playerSupParameter = new LabeledCheckBox(ParametersEbs.PARAMETER_NAMES[4], ParametersEbs.PARAMETERS[4]);
    aiSupParameter = new LabeledCheckBox(ParametersEbs.PARAMETER_NAMES[5], ParametersEbs.PARAMETERS[5]);
    findCoverParameter = new LabeledCheckBox(ParametersEbs.PARAMETER_NAMES[6], ParametersEbs.PARAMETERS[6]);

    ebsWindow.addParameter(threshParameter);
    ebsWindow.addParameter(delayParameter);
    ebsWindow.addParameter(debugParameter);
    ebsWindow.addParameter(radiusParameter);
    ebsWindow.addParameter(playerSupParameter);
    ebsWindow.addParameter(aiSupParameter);
    ebsWindow.addParameter(findCoverParameter);
    Spacing.addPlaceholdersToModWindow(ebsWindow, ParametersEbs.PARAMETERS);
    }
  }