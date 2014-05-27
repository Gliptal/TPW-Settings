package mods.factories;

import gui.*;
import gui.components.*;
import mods.*;


public class CivsFactory extends ModFactory
  {
  private TextFieldParameter delay = new TextFieldParameter(ModParameters.CIVS[1]);
  private TextFieldParameter radius = new TextFieldParameter(ModParameters.CIVS[2]);
  private TextFieldParameter waypoints = new TextFieldParameter(ModParameters.CIVS[3]);
  private TextFieldParameter density = new TextFieldParameter(ModParameters.CIVS[4]);
  private TextFieldParameter maxSquadCas = new TextFieldParameter(ModParameters.CIVS[5]);
  private TextFieldParameter maxAllCas = new TextFieldParameter(ModParameters.CIVS[6]);
  private ComboBoxParameter casDisplay = new ComboBoxParameter(ModParameters.CIVS[7], ModParameters.CIVS_CAS_DISPLAY);
  private TextFieldParameter maxCiv = new TextFieldParameter(ModParameters.CIVS[8]);
  private TextFieldParameter interact = new TextFieldParameter(ModParameters.CIVS[9]);
  private CheckBoxParameter noCombatSpawn = new CheckBoxParameter(ModParameters.CIVS[10]);

  public CivsFactory(ModWindow civsFactory)
    {
    super(civsFactory);

    parameters = new Parameter[] {delay, radius, waypoints, density, maxSquadCas, maxAllCas, casDisplay, maxCiv, interact, noCombatSpawn};
    visualParameters = new Parameter[] {delay, maxCiv, density, radius, waypoints, interact, noCombatSpawn, maxAllCas, maxSquadCas, casDisplay};
    }
  }