package mods.factories;

import exec.userinterface.*;
import gui.*;
import gui.combinations.*;
import mods.parameters.*;


public class CarsFactory
  {
  public static LabeledField delayParameter;
  public static LabeledField waypointsParameter;
  public static LabeledField numParameter;
  public static LabeledField radiusParameter;
  public static LabeledCheckBox noCombatSpawnParameter;

  public static void addParametersToWindow(ModWindow carsWindow)
    {
    carsWindow.setIfModIsActive(ParametersCars.IS_ACTIVE);
    delayParameter = new LabeledField(ParametersCars.PARAMETER_NAMES[0], ParametersCars.PARAMETERS[0]);
    waypointsParameter = new LabeledField(ParametersCars.PARAMETER_NAMES[1], ParametersCars.PARAMETERS[1]);
    numParameter = new LabeledField(ParametersCars.PARAMETER_NAMES[2], ParametersCars.PARAMETERS[2]);
    radiusParameter = new LabeledField(ParametersCars.PARAMETER_NAMES[3], ParametersCars.PARAMETERS[3]);
    noCombatSpawnParameter = new LabeledCheckBox(ParametersCars.PARAMETER_NAMES[4], ParametersCars.PARAMETERS[4]);

    carsWindow.addParameter(delayParameter);
    carsWindow.addParameter(waypointsParameter);
    carsWindow.addParameter(numParameter);
    carsWindow.addParameter(radiusParameter);
    carsWindow.addParameter(noCombatSpawnParameter);
    Spacing.addPlaceholdersToModWindow(carsWindow, ParametersCars.PARAMETERS);
    }
  }