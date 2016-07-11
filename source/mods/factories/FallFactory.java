package mods.factories;

import gui.*;
import gui.components.*;
import mods.*;


public class FallFactory extends ModFactory
  {
  private TextFieldParameter sensitivity = new TextFieldParameter(ModParameters.FALL[1]);
  private TextFieldParameter threshold   = new TextFieldParameter(ModParameters.FALL[2]);
  private TextFieldParameter delay       = new TextFieldParameter(ModParameters.FALL[3]);
  private ComboBoxParameter  ragdoll     = new ComboBoxParameter (ModParameters.FALL[4], ModParameters.FALL_RAGDOLL);
  private TextFieldParameter fallTime    = new TextFieldParameter(ModParameters.FALL[5]);
  private CheckBoxParameter  player      = new CheckBoxParameter (ModParameters.FALL[6]);
  private CheckBoxParameter  bullet      = new CheckBoxParameter (ModParameters.FALL[7]);

  public FallFactory(ModWindow fallWindow)
    {
    super(fallWindow);

    parameters       = new Parameter[] {sensitivity, threshold, delay, ragdoll, fallTime, player, bullet};
    visualParameters = new Parameter[] {delay, threshold, sensitivity, fallTime, ragdoll, bullet, player};
    }
  }