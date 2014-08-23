package mods.factories;

import gui.*;
import gui.components.*;
import mods.*;


public class AnimationsFactory extends ModFactory
  {
  private TextFieldParameter unarmedWalkspeed = new TextFieldParameter(ModParameters.ANIMATIONS[1]);
  private TextFieldParameter rifledownWalkspeed = new TextFieldParameter(ModParameters.ANIMATIONS[2]);
  private TextFieldParameter rifleupWalkspeed = new TextFieldParameter(ModParameters.ANIMATIONS[3]);
  private TextFieldParameter rollLeft = new TextFieldParameter(ModParameters.ANIMATIONS[4]);
  private TextFieldParameter rollRight = new TextFieldParameter(ModParameters.ANIMATIONS[5]);

  public AnimationsFactory(ModWindow animations)
    {
    super(animations);

    parameters = new Parameter[] {unarmedWalkspeed, rifledownWalkspeed, rifleupWalkspeed, rollLeft, rollRight};
    visualParameters = new Parameter[] {rollLeft, rollRight, unarmedWalkspeed, rifledownWalkspeed, rifleupWalkspeed};
    }
  }