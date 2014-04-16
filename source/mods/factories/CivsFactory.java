package mods.factories;

import exec.userinterface.*;
import gui.*;
import gui.combinations.*;
import mods.*;
import mods.parameters.*;


public class CivsFactory
  {
  public static LabeledField delayParameter;
  public static LabeledField radiusParameter;
  public static LabeledField waypointsParameter;
  public static LabeledField densityParameter;
  public static LabeledField maxSquadCasParameter;
  public static LabeledField maxAllCasParameter;
  public static LabeledComboBox casDisplayParameter;
  public static LabeledField maxCivParameter;
  public static LabeledField interactParameter;
  public static LabeledCheckBox noCombatSpawnCheckBox;

  public static void addParametersToWindow(ModWindow civsWindow)
    {
    civsWindow.setIfModIsActive(CivsParameters.IS_ACTIVE);
    delayParameter = new LabeledField(CivsParameters.PARAMETER_NAMES[0], CivsParameters.PARAMETERS[0]);
    radiusParameter = new LabeledField(CivsParameters.PARAMETER_NAMES[1], CivsParameters.PARAMETERS[1]);
    waypointsParameter = new LabeledField(CivsParameters.PARAMETER_NAMES[2], CivsParameters.PARAMETERS[2]);
    densityParameter = new LabeledField(CivsParameters.PARAMETER_NAMES[3], CivsParameters.PARAMETERS[3]);
    maxSquadCasParameter = new LabeledField(CivsParameters.PARAMETER_NAMES[4], CivsParameters.PARAMETERS[4]);
    maxAllCasParameter = new LabeledField(CivsParameters.PARAMETER_NAMES[5], CivsParameters.PARAMETERS[5]);
    casDisplayParameter = new LabeledComboBox(CivsParameters.PARAMETER_NAMES[6], CivsParameters.PARAMETERS[6], CivsParameters.CAS_DISPLAY);
    maxCivParameter = new LabeledField(CivsParameters.PARAMETER_NAMES[7], CivsParameters.PARAMETERS[7]);
    interactParameter = new LabeledField(CivsParameters.PARAMETER_NAMES[8], CivsParameters.PARAMETERS[8]);
    noCombatSpawnCheckBox = new LabeledCheckBox(CivsParameters.PARAMETER_NAMES[9], CivsParameters.PARAMETERS[9]);

    delayParameter.setToolTip(ToolTips.CIVS[0]);
    radiusParameter.setToolTip(ToolTips.CIVS[1]);
    waypointsParameter.setToolTip(ToolTips.CIVS[2]);
    densityParameter.setToolTip(ToolTips.CIVS[3]);
    maxSquadCasParameter.setToolTip(ToolTips.CIVS[4]);
    maxAllCasParameter.setToolTip(ToolTips.CIVS[5]);
    casDisplayParameter.setToolTip(ToolTips.CIVS[6]);
    maxCivParameter.setToolTip(ToolTips.CIVS[7]);
    interactParameter.setToolTip(ToolTips.CIVS[8]);
    noCombatSpawnCheckBox.setToolTip(ToolTips.CIVS[9]);

    civsWindow.addParameter(delayParameter);
    civsWindow.addParameter(radiusParameter);
    civsWindow.addParameter(waypointsParameter);
    civsWindow.addParameter(densityParameter);
    civsWindow.addParameter(maxSquadCasParameter);
    civsWindow.addParameter(maxAllCasParameter);
    civsWindow.addParameter(casDisplayParameter);
    civsWindow.addParameter(maxCivParameter);
    civsWindow.addParameter(interactParameter);
    civsWindow.addParameter(noCombatSpawnCheckBox);
    Spacing.addPlaceholdersToModWindow(civsWindow, CivsParameters.PARAMETERS);
    }
  }