package gui.factories;

import exec.mods.*;
import gui.*;
import gui.combinations.*;


public class BleedoutFactory
  {
  public static LabeledField increaseField;
  public static LabeledField crouchThresField;
  public static LabeledField proneThreshField;
  public static LabeledField incapThreshField;

  public static void fillWindowWithParameters(ModWindow bleedoutWindow)
    {
    bleedoutWindow.setIfModIsActive(ParametersBleedout.IS_ACTIVE);
    increaseField = new LabeledField(ParametersBleedout.PARAMETER_NAMES[0], ParametersBleedout.PARAMETERS[0]);
    crouchThresField = new LabeledField(ParametersBleedout.PARAMETER_NAMES[1], ParametersBleedout.PARAMETERS[1]);
    proneThreshField = new LabeledField(ParametersBleedout.PARAMETER_NAMES[2], ParametersBleedout.PARAMETERS[2]);
    incapThreshField = new LabeledField(ParametersBleedout.PARAMETER_NAMES[3], ParametersBleedout.PARAMETERS[3]);

    bleedoutWindow.addParameter(increaseField);
    bleedoutWindow.addParameter(crouchThresField);
    bleedoutWindow.addParameter(proneThreshField);
    bleedoutWindow.addParameter(incapThreshField);
    createAndAddPlaceholders(bleedoutWindow);
    }

  private static void createAndAddPlaceholders(ModWindow bleedoutWindow)
    {
    for (int i = 0; i < CommonMod.MAXIMUM_PARAMETERS-ParametersBleedout.PARAMETERS.length; i += 1)
      bleedoutWindow.addPlaceHolder();
    }
  }