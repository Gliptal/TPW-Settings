package mods.factories;

import gui.*;
import gui.components.*;
import mods.*;


public class RadioFactory extends ModFactory
  {
  private TextFieldParameter house = new TextFieldParameter(ModParameters.RADIO[1]);
  private CheckBoxParameter  car   = new CheckBoxParameter (ModParameters.RADIO[2]);
  private TextFieldParameter time  = new TextFieldParameter(ModParameters.RADIO[3]);

  public RadioFactory(ModWindow radioFactory)
    {
    super(radioFactory);

    parameters       = new Parameter[] {house, car, time};
    visualParameters = new Parameter[] {time, house, car};
    }
  }