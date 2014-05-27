package mods.factories;

import gui.*;
import gui.components.*;
import mods.*;


public class FallFactory extends ModFactory
  {
  private TextFieldParameter sensitivity = new TextFieldParameter(ModParameters.FALL[1]);
  private TextFieldParameter threshold = new TextFieldParameter(ModParameters.FALL[2]);
  private TextFieldParameter delay = new TextFieldParameter(ModParameters.FALL[3]);
  private CheckBoxParameter ragdoll = new CheckBoxParameter(ModParameters.FALL[4]);
  private TextFieldParameter fallTimeSup = new TextFieldParameter(ModParameters.FALL[5]);
  private CheckBoxParameter fallPlayer = new CheckBoxParameter(ModParameters.FALL[6]);

  public FallFactory(ModWindow fallWindow)
    {
    super(fallWindow);

    parameters = new Parameter[] {sensitivity, threshold, delay, ragdoll, fallTimeSup, fallPlayer};
    visualParameters = new Parameter[] {delay, threshold, sensitivity, fallTimeSup, ragdoll, fallPlayer};
    }
  }