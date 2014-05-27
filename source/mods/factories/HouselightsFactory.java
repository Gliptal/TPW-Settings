package mods.factories;

import gui.*;
import gui.components.*;
import mods.*;


public class HouselightsFactory extends ModFactory
  {
  private TextFieldParameter delay = new TextFieldParameter(ModParameters.HOUSELIGHTS[1]);

  public HouselightsFactory(ModWindow houselightsWindow)
    {
    super(houselightsWindow);

    parameters = new Parameter[] {delay};
    visualParameters = new Parameter[] {delay};
    }
  }