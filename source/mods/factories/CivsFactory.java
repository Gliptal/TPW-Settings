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

  public static void createAndAddParametersToModWindow(ModWindow civsWindow)
    {
    civsWindow.setIfModIsActive(CivsParameters.PARAMETERS[0]);
    delayParameter = new LabeledField(CivsParameters.PARAMETER_NAMES[1], CivsParameters.PARAMETERS[1]);
    radiusParameter = new LabeledField(CivsParameters.PARAMETER_NAMES[2], CivsParameters.PARAMETERS[2]);
    waypointsParameter = new LabeledField(CivsParameters.PARAMETER_NAMES[3], CivsParameters.PARAMETERS[3]);
    densityParameter = new LabeledField(CivsParameters.PARAMETER_NAMES[4], CivsParameters.PARAMETERS[4]);
    maxSquadCasParameter = new LabeledField(CivsParameters.PARAMETER_NAMES[5], CivsParameters.PARAMETERS[5]);
    maxAllCasParameter = new LabeledField(CivsParameters.PARAMETER_NAMES[6], CivsParameters.PARAMETERS[6]);
    casDisplayParameter = new LabeledComboBox(CivsParameters.PARAMETER_NAMES[7], CivsParameters.PARAMETERS[7], CivsParameters.CAS_DISPLAY);
    maxCivParameter = new LabeledField(CivsParameters.PARAMETER_NAMES[8], CivsParameters.PARAMETERS[8]);
    interactParameter = new LabeledField(CivsParameters.PARAMETER_NAMES[9], CivsParameters.PARAMETERS[9]);
    noCombatSpawnCheckBox = new LabeledCheckBox(CivsParameters.PARAMETER_NAMES[10], CivsParameters.PARAMETERS[10]);

    delayParameter.setToolTip(ToolTips.CIVS[1]);
    radiusParameter.setToolTip(ToolTips.CIVS[2]);
    waypointsParameter.setToolTip(ToolTips.CIVS[3]);
    densityParameter.setToolTip(ToolTips.CIVS[4]);
    maxSquadCasParameter.setToolTip(ToolTips.CIVS[5]);
    maxAllCasParameter.setToolTip(ToolTips.CIVS[6]);
    casDisplayParameter.setToolTip(ToolTips.CIVS[7]);
    maxCivParameter.setToolTip(ToolTips.CIVS[8]);
    interactParameter.setToolTip(ToolTips.CIVS[9]);
    noCombatSpawnCheckBox.setToolTip(ToolTips.CIVS[10]);

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

  public static void linkComponentsToArray(ModWindow civsWindow)
    {
    civsWindow.getIsActiveCheckBox().linkToArray(CivsParameters.PARAMETERS, 0);
    delayParameter.linkToArray(CivsParameters.PARAMETERS, 1);
    radiusParameter.linkToArray(CivsParameters.PARAMETERS, 2);
    waypointsParameter.linkToArray(CivsParameters.PARAMETERS, 3);
    densityParameter.linkToArray(CivsParameters.PARAMETERS, 4);
    maxSquadCasParameter.linkToArray(CivsParameters.PARAMETERS, 5);
    maxAllCasParameter.linkToArray(CivsParameters.PARAMETERS, 6);
    casDisplayParameter.linkToArray(CivsParameters.PARAMETERS, 7);
    maxCivParameter.linkToArray(CivsParameters.PARAMETERS, 8);
    interactParameter.linkToArray(CivsParameters.PARAMETERS, 9);
    noCombatSpawnCheckBox.linkToArray(CivsParameters.PARAMETERS, 10);
    }
  }