package mods.factories;

import java.awt.event.*;

import gui.*;
import gui.components.*;
import mods.*;


public class SkirmishFactory extends ModFactory
  {
  private class ToggleStringState implements ActionListener
    {
    private ComboBoxParameter  comboBox;
    private TextFieldParameter unitString;
    private TextFieldParameter vehicleString;

    private ToggleStringState(ComboBoxParameter comboBox, TextFieldParameter unitString, TextFieldParameter vehicleString)
      {
      this.comboBox      = comboBox;
      this.unitString    = unitString;
      this.vehicleString = vehicleString;
      }

    public void actionPerformed(ActionEvent event)
      {
      if (comboBox.checkSelectedIndex(0))
        {
        unitString.setState(true);
        vehicleString.setState(true);
        }
      else
        {
        unitString.setState(false);
        vehicleString.setState(false);
        }
      }
    }

  private TextFieldParameter enemySquadMax         = new TextFieldParameter(ModParameters.SKIRMISH[1]);
  private TextFieldParameter enemyVehiclesMax      = new TextFieldParameter(ModParameters.SKIRMISH[2]);
  private TextFieldParameter friendlySquadMax      = new TextFieldParameter(ModParameters.SKIRMISH[3]);
  private TextFieldParameter friendlyVehiclesMax   = new TextFieldParameter(ModParameters.SKIRMISH[4]);
  private TextFieldParameter minSpawnRadius        = new TextFieldParameter(ModParameters.SKIRMISH[5]);
  private TextFieldParameter maxSpawnRadius        = new TextFieldParameter(ModParameters.SKIRMISH[6]);
  private CheckBoxParameter  support               = new CheckBoxParameter (ModParameters.SKIRMISH[7]);
  private TextFieldParameter friendlyType          = new TextFieldParameter(ModParameters.SKIRMISH[8]);
  private TextFieldParameter enemyType             = new TextFieldParameter(ModParameters.SKIRMISH[9]);
  private TextFieldParameter spawnTime             = new TextFieldParameter(ModParameters.SKIRMISH[10]);
  private TextFieldParameter friendlyUnitString    = new TextFieldParameter(ModParameters.SKIRMISH[11]);
  private TextFieldParameter friendlyVehicleString = new TextFieldParameter(ModParameters.SKIRMISH[12]);
  private TextFieldParameter enemyUnitString       = new TextFieldParameter(ModParameters.SKIRMISH[13]);
  private TextFieldParameter enemyVehicleString    = new TextFieldParameter(ModParameters.SKIRMISH[14]);
  private TextFieldParameter casString             = new TextFieldParameter(ModParameters.SKIRMISH[15]);
  private TextFieldParameter chsString             = new TextFieldParameter(ModParameters.SKIRMISH[16]);

  public SkirmishFactory(ModWindow skirmishWindow)
    {
    super(skirmishWindow);

    parameters       = new Parameter[] {enemySquadMax, enemyVehiclesMax, friendlySquadMax, friendlyVehiclesMax, minSpawnRadius, maxSpawnRadius, support, friendlyType, enemyType, spawnTime, friendlyUnitString, friendlyVehicleString, enemyUnitString, enemyVehicleString, casString, chsString};
    visualParameters = new Parameter[] {minSpawnRadius, maxSpawnRadius, spawnTime, friendlySquadMax, friendlyVehiclesMax, enemySquadMax, enemyVehiclesMax, support, friendlyType, enemyType, friendlyUnitString, enemyUnitString, friendlyVehicleString, enemyVehicleString, casString, chsString};
    }
  }