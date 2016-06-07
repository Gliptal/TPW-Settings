package mods.factories;

import java.awt.event.*;

import gui.*;
import gui.components.*;
import mods.*;


public class SoapFactory extends ModFactory
  {
  private ComboBoxParameter ambientVolume = new ComboBoxParameter(ModParameters.SOAP[1], ModParameters.SOAP_VOLUME);
  private ComboBoxParameter musicVolume   = new ComboBoxParameter(ModParameters.SOAP[2], ModParameters.SOAP_VOLUME);
  private ComboBoxParameter azanVolume    = new ComboBoxParameter(ModParameters.SOAP[3], ModParameters.SOAP_VOLUME);
  private ComboBoxParameter housefxVolume = new ComboBoxParameter(ModParameters.SOAP[4], ModParameters.SOAP_VOLUME);
  private ComboBoxParameter screamVolume  = new ComboBoxParameter(ModParameters.SOAP[5], ModParameters.SOAP_VOLUME);
  private ComboBoxParameter userMusic     = new ComboBoxParameter(ModParameters.SOAP[6], ModParameters.SOAP_VOLUME);
  private ComboBoxParameter userSounds    = new ComboBoxParameter(ModParameters.SOAP[7], ModParameters.SOAP_VOLUME);
  private ComboBoxParameter region        = new ComboBoxParameter(ModParameters.SOAP[8], ModParameters.SOAP_REGION);

  public SoapFactory(ModWindow soapWindow)
    {
    super(soapWindow);

    parameters       = new Parameter[] {ambientVolume, musicVolume, azanVolume, housefxVolume, screamVolume, userMusic, userSounds, region};
    visualParameters = new Parameter[] {region, ambientVolume, musicVolume, azanVolume, housefxVolume, screamVolume, userSounds, userMusic};
    }
  }