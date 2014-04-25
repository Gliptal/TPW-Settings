package mods.factories;

import gui.*;
import gui.combinations.*;
import mods.*;


public class CivsFactory extends ModFactory
  {
  private LabeledTextField delay = new LabeledTextField(ModParameters.CIVS[1]);
  private LabeledTextField radius = new LabeledTextField(ModParameters.CIVS[2]);
  private LabeledTextField waypoints = new LabeledTextField(ModParameters.CIVS[3]);
  private LabeledTextField density = new LabeledTextField(ModParameters.CIVS[4]);
  private LabeledTextField maxSquadCas = new LabeledTextField(ModParameters.CIVS[5]);
  private LabeledTextField maxAllCas = new LabeledTextField(ModParameters.CIVS[6]);
  private LabeledComboBox casDisplay = new LabeledComboBox(ModParameters.CIVS[7], ModParameters.CIVS_CAS_DISPLAY);
  private LabeledTextField maxCiv = new LabeledTextField(ModParameters.CIVS[8]);
  private LabeledTextField interact = new LabeledTextField(ModParameters.CIVS[9]);
  private LabeledCheckBox noCombatSpawn = new LabeledCheckBox(ModParameters.CIVS[10]);

  public CivsFactory(ModWindow civsFactory)
    {
    super(civsFactory);

    parameters = new LabeledComponent[] {delay, radius, waypoints, density, maxSquadCas, maxAllCas, casDisplay, maxCiv, interact, noCombatSpawn};
    }

  protected void addToolTips()
    {
    for (int i = 0; i < parameters.length; i += 1)
      parameters[i].setToolTip(ToolTips.CIVS[i]);
    }
  }