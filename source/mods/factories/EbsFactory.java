package mods.factories;

import exec.userinterface.*;
import gui.*;
import gui.combinations.*;
import mods.*;
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

  public static void createAndAddParametersToModWindow(ModWindow ebsWindow)
    {
    ebsWindow.setIfModIsActive(EbsParameters.PARAMETERS[0]);
    threshParameter = new LabeledField(EbsParameters.PARAMETER_NAMES[1], EbsParameters.PARAMETERS[1]);
    delayParameter = new LabeledField(EbsParameters.PARAMETER_NAMES[2], EbsParameters.PARAMETERS[2]);
    debugParameter = new LabeledCheckBox(EbsParameters.PARAMETER_NAMES[3], EbsParameters.PARAMETERS[3]);
    radiusParameter = new LabeledField(EbsParameters.PARAMETER_NAMES[4], EbsParameters.PARAMETERS[4]);
    playerSupParameter = new LabeledCheckBox(EbsParameters.PARAMETER_NAMES[5], EbsParameters.PARAMETERS[5]);
    aiSupParameter = new LabeledCheckBox(EbsParameters.PARAMETER_NAMES[6], EbsParameters.PARAMETERS[6]);
    findCoverParameter = new LabeledCheckBox(EbsParameters.PARAMETER_NAMES[7], EbsParameters.PARAMETERS[7]);

    threshParameter.setToolTip(ToolTips.EBS[1]);
    delayParameter.setToolTip(ToolTips.EBS[2]);
    debugParameter.setToolTip(ToolTips.EBS[3]);
    radiusParameter.setToolTip(ToolTips.EBS[4]);
    playerSupParameter.setToolTip(ToolTips.EBS[5]);
    aiSupParameter.setToolTip(ToolTips.EBS[6]);
    findCoverParameter.setToolTip(ToolTips.EBS[7]);

    ebsWindow.addParameter(threshParameter);
    ebsWindow.addParameter(delayParameter);
    ebsWindow.addParameter(debugParameter);
    ebsWindow.addParameter(radiusParameter);
    ebsWindow.addParameter(playerSupParameter);
    ebsWindow.addParameter(aiSupParameter);
    ebsWindow.addParameter(findCoverParameter);
    Spacing.addPlaceholdersToModWindow(ebsWindow, EbsParameters.PARAMETERS);
    }

  public static void linkComponentsToArray(ModWindow ebsWindow)
    {
    ebsWindow.getIsActiveCheckBox().linkToArray(EbsParameters.PARAMETERS, 0);
    threshParameter.linkToArray(EbsParameters.PARAMETERS, 1);
    delayParameter.linkToArray(EbsParameters.PARAMETERS, 2);
    debugParameter.linkToArray(EbsParameters.PARAMETERS, 3);
    radiusParameter.linkToArray(EbsParameters.PARAMETERS, 4);
    playerSupParameter.linkToArray(EbsParameters.PARAMETERS, 5);
    aiSupParameter.linkToArray(EbsParameters.PARAMETERS, 6);
    findCoverParameter.linkToArray(EbsParameters.PARAMETERS, 7);
    }
  }