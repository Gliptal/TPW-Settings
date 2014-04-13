package mods.factories;

import exec.userinterface.*;
import gui.*;
import gui.combinations.*;
import mods.parameters.*;


public class BleedoutFactory
  {
  public static LabeledField incParameter;
  public static LabeledField cThreshParameter;
  public static LabeledField pThreshParameter;
  public static LabeledField iThreshParameter;

  public static void addParametersToWindow(ModWindow bleedoutWindow)
    {
    bleedoutWindow.setIfModIsActive(ParametersBleedout.IS_ACTIVE);
    incParameter = new LabeledField(ParametersBleedout.PARAMETER_NAMES[0], ParametersBleedout.PARAMETERS[0]);
    cThreshParameter = new LabeledField(ParametersBleedout.PARAMETER_NAMES[1], ParametersBleedout.PARAMETERS[1]);
    pThreshParameter = new LabeledField(ParametersBleedout.PARAMETER_NAMES[2], ParametersBleedout.PARAMETERS[2]);
    iThreshParameter = new LabeledField(ParametersBleedout.PARAMETER_NAMES[3], ParametersBleedout.PARAMETERS[3]);

    bleedoutWindow.addParameter(incParameter);
    bleedoutWindow.addParameter(cThreshParameter);
    bleedoutWindow.addParameter(pThreshParameter);
    bleedoutWindow.addParameter(iThreshParameter);
    Spacing.addPlaceholdersToModWindow(bleedoutWindow, ParametersBleedout.PARAMETERS);
    }
  }