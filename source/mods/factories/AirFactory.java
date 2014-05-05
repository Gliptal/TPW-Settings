package mods.factories;

import gui.*;
import gui.combinations.*;
import mods.*;


public class AirFactory extends ModFactory
  {
  private LabeledTextField delay = new LabeledTextField(ModParameters.AIR[1]);
  private LabeledTextField time = new LabeledTextField(ModParameters.AIR[2]);
  private LabeledTextField max = new LabeledTextField(ModParameters.AIR[3]);

  public AirFactory(ModWindow airWindow)
    {
    super(airWindow);

    parameters = new LabeledComponent[] {delay, time, max};
    visualParameters = new LabeledComponent[] {delay, max, time};
    }

  protected void addToolTips()
    {
    for (int i = 0; i < parameters.length; i += 1)
      parameters[i].setToolTip(ToolTips.AIR[i]);
    }
  }