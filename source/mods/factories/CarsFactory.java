package mods.factories;

import gui.*;
import gui.combinations.*;
import mods.*;


public class CarsFactory extends ModFactory
  {
  private LabeledTextField delay = new LabeledTextField(ModParameters.CARS[1]);
  private LabeledTextField waypoints = new LabeledTextField(ModParameters.CARS[2]);
  private LabeledTextField num = new LabeledTextField(ModParameters.CARS[3]);
  private LabeledTextField radius = new LabeledTextField(ModParameters.CARS[4]);
  private LabeledCheckBox noCombatSpawn = new LabeledCheckBox(ModParameters.CARS[5]);

  public CarsFactory(ModWindow carsWindow)
    {
    super(carsWindow);

    parameters = new LabeledComponent[] {delay, waypoints, num, radius, noCombatSpawn};
    }

  protected void addToolTips()
    {
    for (int i = 0; i < parameters.length; i += 1)
      parameters[i].setToolTip(ToolTips.CARS[i]);
    }
  }