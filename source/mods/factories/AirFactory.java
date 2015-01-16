package mods.factories;

import gui.*;
import gui.components.*;
import mods.*;


public class AirFactory extends ModFactory
  {
  private TextFieldParameter delay   = new TextFieldParameter(ModParameters.AIR[1]);
  private TextFieldParameter time    = new TextFieldParameter(ModParameters.AIR[2]);
  private TextFieldParameter max     = new TextFieldParameter(ModParameters.AIR[3]);
  private TextFieldParameter heights = new TextFieldParameter(ModParameters.AIR[4]);
  private ComboBoxParameter  exclude = new ComboBoxParameter (ModParameters.AIR[5], ModParameters.AIR_EXCLUDE);

  public AirFactory(ModWindow airWindow)
    {
    super(airWindow);

    parameters       = new Parameter[] {delay, time, max, heights, exclude};
    visualParameters = new Parameter[] {delay, max, time, heights, exclude};
    }
  }