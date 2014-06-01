package mods.factories;

import gui.*;
import gui.components.*;
import mods.*;


public class SkirmishFactory extends ModFactory
  {
  private TextFieldParameter enemySquadMax = new TextFieldParameter(ModParameters.SKIRMISH[1]);
  private TextFieldParameter enemyVehiclesMax = new TextFieldParameter(ModParameters.SKIRMISH[2]);
  private TextFieldParameter friendlySquadMax = new TextFieldParameter(ModParameters.SKIRMISH[3]);
  private TextFieldParameter friendlyVehiclesMax = new TextFieldParameter(ModParameters.SKIRMISH[4]);
  private TextFieldParameter minSpawnRadius = new TextFieldParameter(ModParameters.SKIRMISH[5]);
  private TextFieldParameter maxSpawnRadius = new TextFieldParameter(ModParameters.SKIRMISH[6]);
  private CheckBoxParameter support = new CheckBoxParameter(ModParameters.SKIRMISH[7]);
  private ComboBoxParameter friendlyType = new ComboBoxParameter(ModParameters.SKIRMISH[8], ModParameters.SKIRMISH_FRIENDLY);
  private ComboBoxParameter enemyType = new ComboBoxParameter(ModParameters.SKIRMISH[9], ModParameters.SKIRMISH_ENEMY);
  private TextFieldParameter spawnTime = new TextFieldParameter(ModParameters.SKIRMISH[10]);

  public SkirmishFactory(ModWindow skirmishWindow)
    {
    super(skirmishWindow);

    parameters = new Parameter[] {enemySquadMax, enemyVehiclesMax, friendlySquadMax, friendlyVehiclesMax, minSpawnRadius, maxSpawnRadius, support, friendlyType, enemyType, spawnTime};
    visualParameters = new Parameter[] {minSpawnRadius, maxSpawnRadius, spawnTime, friendlySquadMax, friendlyVehiclesMax, enemySquadMax, enemyVehiclesMax, friendlyType, enemyType, support};
    }
  }