package mods.factories;

import gui.*;
import gui.components.*;
import mods.*;


public class FogFactory extends ModFactory
  {
  private TextFieldParameter radius    = new TextFieldParameter(ModParameters.FOG[1]);
  private TextFieldParameter delay     = new TextFieldParameter(ModParameters.FOG[2]);
  private CheckBoxParameter  breath    = new CheckBoxParameter (ModParameters.FOG[3]);
  private CheckBoxParameter  groundFog = new CheckBoxParameter (ModParameters.FOG[4]);
  private CheckBoxParameter  rainFog   = new CheckBoxParameter (ModParameters.FOG[5]);
  private CheckBoxParameter  heatHaze  = new CheckBoxParameter (ModParameters.FOG[6]);
  private CheckBoxParameter  canSnow   = new CheckBoxParameter (ModParameters.FOG[7]);

  public FogFactory(ModWindow fogWindow)
    {
    super(fogWindow);

    parameters       = new Parameter[] {radius, delay, breath, groundFog, rainFog, heatHaze, canSnow};
    visualParameters = new Parameter[] {delay, radius, breath, groundFog, heatHaze, rainFog, canSnow};
    }
  }