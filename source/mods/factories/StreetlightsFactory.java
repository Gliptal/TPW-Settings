package mods.factories;

import gui.*;
import gui.combinations.*;
import mods.*;


public class StreetlightsFactory extends ModFactory
  {
  private LabeledTextField factor = new LabeledTextField(ModParameters.STREETLIGHTS[1]);
  private LabeledTextField range = new LabeledTextField(ModParameters.STREETLIGHTS[2]);
  private LabeledComboBox colour = new LabeledComboBox(ModParameters.STREETLIGHTS[3], ModParameters.STREETLIGHTS_COLOUR);
  private LabeledCheckBox moths = new LabeledCheckBox(ModParameters.STREETLIGHTS[4]);

  public StreetlightsFactory(ModWindow streetlightsWindow)
    {
    super(streetlightsWindow);

    parameters = new LabeledComponent[] {factor, range, colour, moths};
    }

  protected void addToolTips()
    {
    for (int i = 0; i < parameters.length; i += 1)
      parameters[i].setToolTip(ToolTips.STREETLIGHTS[i]);
    }
  }