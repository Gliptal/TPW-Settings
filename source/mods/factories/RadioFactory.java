package mods.factories;

import gui.*;
import gui.components.*;
import mods.*;


public class RadioFactory extends ModFactory
  {
  private TextFieldParameter time = new TextFieldParameter(ModParameters.RADIO[1]);
  private CheckBoxParameter  car  = new CheckBoxParameter(ModParameters.RADIO[2]);
  private CheckBoxParameter  foot = new CheckBoxParameter(ModParameters.RADIO[3]);

  public RadioFactory(ModWindow radioFactory)
    {
    super(radioFactory);

    parameters       = new Parameter[] {time, car, foot};
    visualParameters = new Parameter[] {car, foot, time};
    }
  }