package mods.factories;

import gui.*;
import gui.components.*;
import mods.*;


public class AirFactory extends ModFactory
  {
  private TextFieldParameter delay = new TextFieldParameter(ModParameters.AIR[1]);
  private TextFieldParameter time = new TextFieldParameter(ModParameters.AIR[2]);
  private TextFieldParameter max = new TextFieldParameter(ModParameters.AIR[3]);
  private TextFieldParameter heights = new TextFieldParameter(ModParameters.AIR[4]);
  private CheckBoxParameter civExclude = new CheckBoxParameter(ModParameters.AIR[5]);

  public AirFactory(ModWindow airWindow)
    {
    super(airWindow);

    parameters = new Parameter[] {delay, time, max, heights, civExclude};
    visualParameters = new Parameter[] {delay, max, time, heights, civExclude};
    }
  }