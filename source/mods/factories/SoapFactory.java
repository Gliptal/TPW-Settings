package mods.factories;

import java.awt.event.*;

import gui.*;
import gui.components.*;
import mods.*;


public class SoapFactory extends ModFactory
  {
  private TextFieldParameter volume     = new TextFieldParameter(ModParameters.SOAP[1]);
  private CheckBoxParameter  userSounds = new CheckBoxParameter (ModParameters.SOAP[2]);

  public SoapFactory(ModWindow soapWindow)
    {
    super(soapWindow);

    parameters       = new Parameter[] {volume, userSounds};
    visualParameters = new Parameter[] {userSounds, volume};
    }
  }