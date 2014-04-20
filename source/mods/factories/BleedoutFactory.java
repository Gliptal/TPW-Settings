package mods.factories;

import exec.userinterface.*;
import gui.*;
import gui.combinations.*;
import mods.*;
import mods.parameters.*;


public class BleedoutFactory
  {
  public static LabeledField incParameter;
  public static LabeledField cThreshParameter;
  public static LabeledField pThreshParameter;
  public static LabeledField iThreshParameter;

  public static void createAndAddParametersToModWindow(ModWindow bleedoutWindow)
    {
    bleedoutWindow.setIfModIsActive(BleedoutParameters.PARAMETERS[0]);
    incParameter = new LabeledField(BleedoutParameters.PARAMETER_NAMES[1], BleedoutParameters.PARAMETERS[1]);
    cThreshParameter = new LabeledField(BleedoutParameters.PARAMETER_NAMES[2], BleedoutParameters.PARAMETERS[2]);
    pThreshParameter = new LabeledField(BleedoutParameters.PARAMETER_NAMES[3], BleedoutParameters.PARAMETERS[3]);
    iThreshParameter = new LabeledField(BleedoutParameters.PARAMETER_NAMES[4], BleedoutParameters.PARAMETERS[4]);

    incParameter.setToolTip(ToolTips.BLEEDOUT[1]);
    cThreshParameter.setToolTip(ToolTips.BLEEDOUT[2]);
    pThreshParameter.setToolTip(ToolTips.BLEEDOUT[3]);
    iThreshParameter.setToolTip(ToolTips.BLEEDOUT[4]);

    bleedoutWindow.addParameter(incParameter);
    bleedoutWindow.addParameter(cThreshParameter);
    bleedoutWindow.addParameter(pThreshParameter);
    bleedoutWindow.addParameter(iThreshParameter);
    Spacing.addPlaceholdersToModWindow(bleedoutWindow, BleedoutParameters.PARAMETERS);
    }

  public static void linkComponentsToArray(ModWindow bleedoutWindow)
    {
    bleedoutWindow.getIsActiveCheckBox().linkToArray(BleedoutParameters.PARAMETERS, 0);
    incParameter.linkToArray(BleedoutParameters.PARAMETERS, 1);
    cThreshParameter.linkToArray(BleedoutParameters.PARAMETERS, 2);
    pThreshParameter.linkToArray(BleedoutParameters.PARAMETERS, 3);
    iThreshParameter.linkToArray(BleedoutParameters.PARAMETERS, 4);
    }
  }