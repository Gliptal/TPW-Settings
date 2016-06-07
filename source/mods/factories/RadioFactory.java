package mods.factories;

import gui.*;
import gui.components.*;
import mods.*;


public class RadioFactory extends ModFactory
  {
  private TextFieldParameter time = new TextFieldParameter(ModParameters.RADIO[1]);

  public RadioFactory(ModWindow radioFactory)
    {
    super(radioFactory);

    parameters       = new Parameter[] {time};
    visualParameters = new Parameter[] {time};
    }
  }