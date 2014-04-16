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

  public static void addParametersToWindow(ModWindow ebsWindow)
    {
    ebsWindow.setIfModIsActive(EbsParameters.IS_ACTIVE);
    threshParameter = new LabeledField(EbsParameters.PARAMETER_NAMES[0], EbsParameters.PARAMETERS[0]);
    delayParameter = new LabeledField(EbsParameters.PARAMETER_NAMES[1], EbsParameters.PARAMETERS[1]);
    debugParameter = new LabeledCheckBox(EbsParameters.PARAMETER_NAMES[2], EbsParameters.PARAMETERS[2]);
    radiusParameter = new LabeledField(EbsParameters.PARAMETER_NAMES[3], EbsParameters.PARAMETERS[3]);
    playerSupParameter = new LabeledCheckBox(EbsParameters.PARAMETER_NAMES[4], EbsParameters.PARAMETERS[4]);
    aiSupParameter = new LabeledCheckBox(EbsParameters.PARAMETER_NAMES[5], EbsParameters.PARAMETERS[5]);
    findCoverParameter = new LabeledCheckBox(EbsParameters.PARAMETER_NAMES[6], EbsParameters.PARAMETERS[6]);

    threshParameter.setToolTip(ToolTips.EBS[0]);
    delayParameter.setToolTip(ToolTips.EBS[1]);
    debugParameter.setToolTip(ToolTips.EBS[2]);
    radiusParameter.setToolTip(ToolTips.EBS[3]);
    playerSupParameter.setToolTip(ToolTips.EBS[4]);
    aiSupParameter.setToolTip(ToolTips.EBS[5]);
    findCoverParameter.setToolTip(ToolTips.EBS[6]);

    ebsWindow.addParameter(threshParameter);
    ebsWindow.addParameter(delayParameter);
    ebsWindow.addParameter(debugParameter);
    ebsWindow.addParameter(radiusParameter);
    ebsWindow.addParameter(playerSupParameter);
    ebsWindow.addParameter(aiSupParameter);
    ebsWindow.addParameter(findCoverParameter);
    Spacing.addPlaceholdersToModWindow(ebsWindow, EbsParameters.PARAMETERS);
    }
  }