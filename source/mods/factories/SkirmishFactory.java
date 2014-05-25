package mods.factories;

import gui.*;
import gui.combinations.*;
import mods.*;


public class SkirmishFactory extends ModFactory
  {
  private LabeledTextField enemySquadMax = new LabeledTextField(ModParameters.SKIRMISH[1]);
  private LabeledTextField enemyVehiclesMax = new LabeledTextField(ModParameters.SKIRMISH[2]);
  private LabeledTextField friendlySquadMax = new LabeledTextField(ModParameters.SKIRMISH[3]);
  private LabeledTextField friendlyVehiclesMax = new LabeledTextField(ModParameters.SKIRMISH[4]);
  private LabeledTextField minSpawnRadius = new LabeledTextField(ModParameters.SKIRMISH[5]);
  private LabeledTextField maxSpawnRadius = new LabeledTextField(ModParameters.SKIRMISH[6]);
  private LabeledCheckBox support = new LabeledCheckBox(ModParameters.SKIRMISH[7]);
  private LabeledComboBox friendlyType = new LabeledComboBox(ModParameters.SKIRMISH[8], ModParameters.SKIRMISH_FRIENDLY);
  private LabeledComboBox enemyType = new LabeledComboBox(ModParameters.SKIRMISH[9], ModParameters.SKIRMISH_ENEMY);

  public SkirmishFactory(ModWindow skirmishWindow)
    {
    super(skirmishWindow);

    parameters = new LabeledComponent[] {enemySquadMax, enemyVehiclesMax, friendlySquadMax, friendlyVehiclesMax, minSpawnRadius, maxSpawnRadius, support, friendlyType, enemyType};
    visualParameters = new LabeledComponent[] {minSpawnRadius, maxSpawnRadius, friendlySquadMax, friendlyVehiclesMax, enemySquadMax, enemyVehiclesMax, friendlyType, enemyType, support};
    }

  protected void addToolTips()
    {
    for (int i = 0; i < parameters.length; i += 1)
      parameters[i].setToolTip(ToolTips.SKIRMISH[i]);
    }
  }