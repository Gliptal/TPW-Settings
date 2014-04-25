package mods.factories;

import gui.*;
import gui.combinations.*;
import mods.*;


public class RadioFactory extends ModFactory
  {
  private LabeledCheckBox house = new LabeledCheckBox(ModParameters.RADIO[1]);
  private LabeledCheckBox car = new LabeledCheckBox(ModParameters.RADIO[2]);
  private LabeledTextField time = new LabeledTextField(ModParameters.RADIO[3]);

  public RadioFactory(ModWindow radioFactory)
    {
    super(radioFactory);

    parameters = new LabeledComponent[] {house, car, time};
    }

  protected void addToolTips()
    {
    for (int i = 0; i < parameters.length; i += 1)
      parameters[i].setToolTip(ToolTips.RADIO[i]);
    }
  }