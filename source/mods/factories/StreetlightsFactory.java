package mods.factories;

import gui.*;
import gui.components.*;
import mods.*;


public class StreetlightsFactory extends ModFactory
  {
  private TextFieldParameter factor = new TextFieldParameter(ModParameters.STREETLIGHTS[1]);
  private TextFieldParameter range  = new TextFieldParameter(ModParameters.STREETLIGHTS[2]);
  private ComboBoxParameter  colour = new ComboBoxParameter (ModParameters.STREETLIGHTS[3], ModParameters.STREETLIGHTS_COLOR);
  private CheckBoxParameter  moths  = new CheckBoxParameter (ModParameters.STREETLIGHTS[4]);

  public StreetlightsFactory(ModWindow streetlightsWindow)
    {
    super(streetlightsWindow);

    parameters       = new Parameter[] {factor, range, colour, moths};
    visualParameters = new Parameter[] {range, factor, colour, moths};
    }
  }