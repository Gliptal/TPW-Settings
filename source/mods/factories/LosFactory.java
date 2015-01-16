package mods.factories;

import gui.*;
import gui.components.*;
import mods.*;


public class LosFactory extends ModFactory
  {
  private CheckBoxParameter  debug   = new CheckBoxParameter (ModParameters.LOS[1]);
  private TextFieldParameter maxDist = new TextFieldParameter(ModParameters.LOS[2]);
  private TextFieldParameter minDist = new TextFieldParameter(ModParameters.LOS[3]);
  private TextFieldParameter delay   = new TextFieldParameter(ModParameters.LOS[4]);

  public LosFactory(ModWindow losWindow)
    {
    super(losWindow);

    parameters       = new Parameter[] {debug, maxDist, minDist, delay};
    visualParameters = new Parameter[] {debug, delay, minDist, maxDist};
    }
  }