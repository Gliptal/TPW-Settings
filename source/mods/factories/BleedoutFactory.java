package mods.factories;

import gui.*;
import gui.components.*;
import mods.*;


public class BleedoutFactory extends ModFactory
  {
  private TextFieldParameter inc = new TextFieldParameter(ModParameters.BLEEDOUT[1]);
  private TextFieldParameter cThresh = new TextFieldParameter(ModParameters.BLEEDOUT[2]);
  private TextFieldParameter pThresh = new TextFieldParameter(ModParameters.BLEEDOUT[3]);
  private TextFieldParameter iThresh = new TextFieldParameter(ModParameters.BLEEDOUT[4]);
  private CheckBoxParameter heartbeat = new CheckBoxParameter(ModParameters.BLEEDOUT[5]);

  public BleedoutFactory(ModWindow bleedoutWindow)
    {
    super(bleedoutWindow);

    parameters = new Parameter[] {inc, cThresh, pThresh, iThresh, heartbeat};
    visualParameters = new Parameter[] {inc, cThresh, pThresh, iThresh, heartbeat};
    }
  }