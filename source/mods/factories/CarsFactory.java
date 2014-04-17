package mods.factories;

import exec.userinterface.*;
import gui.*;
import gui.combinations.*;
import mods.*;
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
    carsWindow.setIfModIsActive(CarsParameters.PARAMETERS[0]);
    delayParameter = new LabeledField(CarsParameters.PARAMETER_NAMES[1], CarsParameters.PARAMETERS[1]);
    waypointsParameter = new LabeledField(CarsParameters.PARAMETER_NAMES[2], CarsParameters.PARAMETERS[2]);
    numParameter = new LabeledField(CarsParameters.PARAMETER_NAMES[3], CarsParameters.PARAMETERS[3]);
    radiusParameter = new LabeledField(CarsParameters.PARAMETER_NAMES[4], CarsParameters.PARAMETERS[4]);
    noCombatSpawnParameter = new LabeledCheckBox(CarsParameters.PARAMETER_NAMES[5], CarsParameters.PARAMETERS[5]);

    delayParameter.setToolTip(ToolTips.CARS[1]);
    waypointsParameter.setToolTip(ToolTips.CARS[2]);
    numParameter.setToolTip(ToolTips.CARS[3]);
    radiusParameter.setToolTip(ToolTips.CARS[4]);
    noCombatSpawnParameter.setToolTip(ToolTips.CARS[5]);

    carsWindow.addParameter(delayParameter);
    carsWindow.addParameter(waypointsParameter);
    carsWindow.addParameter(numParameter);
    carsWindow.addParameter(radiusParameter);
    carsWindow.addParameter(noCombatSpawnParameter);
    Spacing.addPlaceholdersToModWindow(carsWindow, CarsParameters.PARAMETERS);
    }
  }