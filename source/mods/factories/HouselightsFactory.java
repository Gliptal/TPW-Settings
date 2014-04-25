package mods.factories;

import gui.*;
import gui.combinations.*;
import mods.*;


public class HouselightsFactory extends ModFactory
  {
  private LabeledTextField delay = new LabeledTextField(ModParameters.HOUSELIGHTS[1]);

  public HouselightsFactory(ModWindow houselightsWindow)
    {
    super(houselightsWindow);

    parameters = new LabeledComponent[] {delay};
    }

  protected void addToolTips()
    {
    for (int i = 0; i < parameters.length; i += 1)
      parameters[i].setToolTip(ToolTips.HOUSELIGHTS[i]);
    }
  }