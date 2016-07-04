package mods.factories;

import gui.*;
import gui.components.*;
import mods.*;


public class CrowdFactory extends ModFactory
  {
  private TextFieldParameter max      = new TextFieldParameter(ModParameters.CROWD[1]);
  private TextFieldParameter density  = new TextFieldParameter(ModParameters.CROWD[2]);
  private TextFieldParameter radius   = new TextFieldParameter(ModParameters.CROWD[3]);
  private TextFieldParameter anim     = new TextFieldParameter(ModParameters.CROWD[4]);
  private TextFieldParameter move     = new TextFieldParameter(ModParameters.CROWD[5]);
  private TextFieldParameter scanTime = new TextFieldParameter(ModParameters.CROWD[6]);

  public CrowdFactory(ModWindow crowdWindow)
    {
    super(crowdWindow);

    parameters       = new Parameter[] {max, density, radius, anim, move, scanTime};
    visualParameters = new Parameter[] {max, density, radius, anim, move, scanTime};
    }
  }