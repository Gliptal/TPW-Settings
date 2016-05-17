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
  private ComboBoxParameter region      = new ComboBoxParameter(ModParameters.SOAP[4], ModParameters.SOAP_REGION);

  public SoapFactory(ModWindow soapWindow)
    {
    super(soapWindow);

    parameters       = new Parameter[] {volume, userMusic, userSounds, region};
    visualParameters = new Parameter[] {volume, region, userSounds, userMusic};
    }
  }