package mods.factories;

import exec.userinterface.*;
import gui.*;
import gui.combinations.*;
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
    civsWindow.setIfModIsActive(ParametersCivs.IS_ACTIVE);
    delayParameter = new LabeledField(ParametersCivs.PARAMETER_NAMES[0], ParametersCivs.PARAMETERS[0]);
    radiusParameter = new LabeledField(ParametersCivs.PARAMETER_NAMES[1], ParametersCivs.PARAMETERS[1]);
    waypointsParameter = new LabeledField(ParametersCivs.PARAMETER_NAMES[2], ParametersCivs.PARAMETERS[2]);
    densityParameter = new LabeledField(ParametersCivs.PARAMETER_NAMES[3], ParametersCivs.PARAMETERS[3]);
    maxSquadCasParameter = new LabeledField(ParametersCivs.PARAMETER_NAMES[4], ParametersCivs.PARAMETERS[4]);
    maxAllCasParameter = new LabeledField(ParametersCivs.PARAMETER_NAMES[5], ParametersCivs.PARAMETERS[5]);
    casDisplayParameter = new LabeledComboBox(ParametersCivs.PARAMETER_NAMES[6], ParametersCivs.PARAMETERS[6], ParametersCivs.CAS_DISPLAY);
    maxCivParameter = new LabeledField(ParametersCivs.PARAMETER_NAMES[7], ParametersCivs.PARAMETERS[7]);
    interactParameter = new LabeledField(ParametersCivs.PARAMETER_NAMES[8], ParametersCivs.PARAMETERS[8]);
    noCombatSpawnCheckBox = new LabeledCheckBox(ParametersCivs.PARAMETER_NAMES[9], ParametersCivs.PARAMETERS[9]);

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
    Spacing.addPlaceholdersToModWindow(civsWindow, ParametersCivs.PARAMETERS);
    }
  }