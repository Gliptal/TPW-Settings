package mods.factories;

import gui.*;
import gui.components.*;
import mods.*;


public class AnimationsFactory extends ModFactory
  {
  private TextFieldParameter runRifle = new TextFieldParameter(ModParameters.ANIMATIONS[1]);
  private TextFieldParameter tacticalRifleup = new TextFieldParameter(ModParameters.ANIMATIONS[2]);
  private TextFieldParameter tacticalJog = new TextFieldParameter(ModParameters.ANIMATIONS[3]);
  private TextFieldParameter unarmedWalkspeed = new TextFieldParameter(ModParameters.ANIMATIONS[4]);
  private TextFieldParameter rifledownWalkspeed = new TextFieldParameter(ModParameters.ANIMATIONS[5]);
  private TextFieldParameter rifleupWalkspeed = new TextFieldParameter(ModParameters.ANIMATIONS[6]);
  private TextFieldParameter rollLeft = new TextFieldParameter(ModParameters.ANIMATIONS[7]);
  private TextFieldParameter rollRight = new TextFieldParameter(ModParameters.ANIMATIONS[8]);

  public AnimationsFactory(ModWindow animations)
    {
    super(animations);

    parameters = new Parameter[] {runRifle, tacticalRifleup, tacticalJog, unarmedWalkspeed, rifledownWalkspeed, rifleupWalkspeed, rollLeft, rollRight};
    visualParameters = new Parameter[] {rollLeft, rollRight, unarmedWalkspeed, rifledownWalkspeed, rifleupWalkspeed, runRifle, tacticalRifleup, tacticalJog};
    }
  }