package mods.factories;

import gui.*;
import gui.components.*;
import mods.*;


public class ParkFactory extends ModFactory
  {
  private TextFieldParameter perc = new TextFieldParameter(ModParameters.PARK[1]);
  private TextFieldParameter createDist = new TextFieldParameter(ModParameters.PARK[2]);
  private TextFieldParameter hideDist = new TextFieldParameter(ModParameters.PARK[3]);
  private TextFieldParameter simDist = new TextFieldParameter(ModParameters.PARK[4]);
  private TextFieldParameter max = new TextFieldParameter(ModParameters.PARK[5]);

  public ParkFactory(ModWindow parkWindow)
    {
    super(parkWindow);

    parameters = new Parameter[] {perc, createDist, hideDist, simDist, max};
    visualParameters = new Parameter[] {max, perc, createDist, hideDist, simDist};
    }
  }