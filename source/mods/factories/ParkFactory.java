package mods.factories;

import gui.*;
import gui.combinations.*;
import mods.*;


public class ParkFactory extends ModFactory
  {
  private LabeledTextField perc = new LabeledTextField(ModParameters.PARK[1]);
  private LabeledTextField createDist = new LabeledTextField(ModParameters.PARK[2]);
  private LabeledTextField hideDist = new LabeledTextField(ModParameters.PARK[3]);
  private LabeledTextField simDist = new LabeledTextField(ModParameters.PARK[4]);
  private LabeledTextField max = new LabeledTextField(ModParameters.PARK[5]);

  public ParkFactory(ModWindow parkWindow)
    {
    super(parkWindow);

    parameters = new LabeledComponent[] {perc, createDist, hideDist, simDist, max};
    visualParameters = new LabeledComponent[] {max, perc, createDist, hideDist, simDist};
    }

  protected void addToolTips()
    {
    for (int i = 0; i < parameters.length; i += 1)
      parameters[i].setToolTip(ToolTips.PARK[i]);
    }
  }