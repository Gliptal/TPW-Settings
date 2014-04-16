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

  public static void addParametersToWindow(ModWindow bleedoutWindow)
    {
    bleedoutWindow.setIfModIsActive(BleedoutParameters.IS_ACTIVE);
    incParameter = new LabeledField(BleedoutParameters.PARAMETER_NAMES[0], BleedoutParameters.PARAMETERS[0]);
    cThreshParameter = new LabeledField(BleedoutParameters.PARAMETER_NAMES[1], BleedoutParameters.PARAMETERS[1]);
    pThreshParameter = new LabeledField(BleedoutParameters.PARAMETER_NAMES[2], BleedoutParameters.PARAMETERS[2]);
    iThreshParameter = new LabeledField(BleedoutParameters.PARAMETER_NAMES[3], BleedoutParameters.PARAMETERS[3]);

    incParameter.setToolTip(ToolTips.BLEEDOUT[0]);
    cThreshParameter.setToolTip(ToolTips.BLEEDOUT[1]);
    pThreshParameter.setToolTip(ToolTips.BLEEDOUT[2]);
    iThreshParameter.setToolTip(ToolTips.BLEEDOUT[3]);

    bleedoutWindow.addParameter(incParameter);
    bleedoutWindow.addParameter(cThreshParameter);
    bleedoutWindow.addParameter(pThreshParameter);
    bleedoutWindow.addParameter(iThreshParameter);
    Spacing.addPlaceholdersToModWindow(bleedoutWindow, BleedoutParameters.PARAMETERS);
    }
  }