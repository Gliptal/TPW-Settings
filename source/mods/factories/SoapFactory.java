package mods.factories;

import java.awt.event.*;

import gui.*;
import gui.components.*;
import mods.*;


public class SoapFactory extends ModFactory
  {
  private TextFieldParameter volume     = new TextFieldParameter(ModParameters.SOAP[1]);
  private TextFieldParameter userMusic  = new TextFieldParameter(ModParameters.SOAP[2]);
  private TextFieldParameter userSounds = new TextFieldParameter(ModParameters.SOAP[3]);

  public SoapFactory(ModWindow soapWindow)
    {
    super(soapWindow);

    parameters       = new Parameter[] {volume, userMusic, userSounds};
    visualParameters = new Parameter[] {userSounds, userMusic, volume};
    }
  }