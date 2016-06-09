package mods.factories;

import gui.*;
import gui.components.*;
import mods.*;


public class PuddleFactory extends ModFactory
  {
  private TextFieldParameter max        = new TextFieldParameter(ModParameters.PUDDLE[1]);
  private TextFieldParameter radius     = new TextFieldParameter(ModParameters.PUDDLE[2]);
  private TextFieldParameter minRadius  = new TextFieldParameter(ModParameters.PUDDLE[3]);
  private TextFieldParameter gradient   = new TextFieldParameter(ModParameters.PUDDLE[4]);
  private TextFieldParameter time       = new TextFieldParameter(ModParameters.PUDDLE[5]);
  private TextFieldParameter rainThresh = new TextFieldParameter(ModParameters.PUDDLE[6]);
  private CheckBoxParameter  ripple     = new CheckBoxParameter(ModParameters.PUDDLE[7]);

  public PuddleFactory(ModWindow puddleWindow)
    {
    super(puddleWindow);

    parameters       = new Parameter[] {max, radius, minRadius, gradient, time, rainThresh, ripple};
    visualParameters = new Parameter[] {max, time, rainThresh, gradient, radius, minRadius, ripple};
    }
  }