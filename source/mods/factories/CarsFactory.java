package mods.factories;

import gui.*;
import gui.components.*;
import mods.*;


public class CarsFactory extends ModFactory
  {
  private TextFieldParameter delay         = new TextFieldParameter(ModParameters.CARS[1]);
  private TextFieldParameter waypoints     = new TextFieldParameter(ModParameters.CARS[2]);
  private TextFieldParameter num           = new TextFieldParameter(ModParameters.CARS[3]);
  private TextFieldParameter radius        = new TextFieldParameter(ModParameters.CARS[4]);
  private CheckBoxParameter  noCombatSpawn = new CheckBoxParameter (ModParameters.CARS[5]);

  public CarsFactory(ModWindow carsWindow)
    {
    super(carsWindow);

    parameters       = new Parameter[] {delay, waypoints, num, radius, noCombatSpawn};
    visualParameters = new Parameter[] {delay, num, radius, waypoints, noCombatSpawn};
    }
  }