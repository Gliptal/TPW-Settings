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
    carsWindow.setIfModIsActive(CarsParameters.IS_ACTIVE);
    delayParameter = new LabeledField(CarsParameters.PARAMETER_NAMES[0], CarsParameters.PARAMETERS[0]);
    waypointsParameter = new LabeledField(CarsParameters.PARAMETER_NAMES[1], CarsParameters.PARAMETERS[1]);
    numParameter = new LabeledField(CarsParameters.PARAMETER_NAMES[2], CarsParameters.PARAMETERS[2]);
    radiusParameter = new LabeledField(CarsParameters.PARAMETER_NAMES[3], CarsParameters.PARAMETERS[3]);
    noCombatSpawnParameter = new LabeledCheckBox(CarsParameters.PARAMETER_NAMES[4], CarsParameters.PARAMETERS[4]);

    delayParameter.setToolTip(ToolTips.CARS[0]);
    waypointsParameter.setToolTip(ToolTips.CARS[1]);
    numParameter.setToolTip(ToolTips.CARS[2]);
    radiusParameter.setToolTip(ToolTips.CARS[3]);
    noCombatSpawnParameter.setToolTip(ToolTips.CARS[4]);

    carsWindow.addParameter(delayParameter);
    carsWindow.addParameter(waypointsParameter);
    carsWindow.addParameter(numParameter);
    carsWindow.addParameter(radiusParameter);
    carsWindow.addParameter(noCombatSpawnParameter);
    Spacing.addPlaceholdersToModWindow(carsWindow, CarsParameters.PARAMETERS);
    }
  }