package mods.factories;

import exec.userinterface.*;
import gui.*;
import gui.combinations.*;
import mods.*;
import mods.parameters.*;


public class RainFxFactory
  {
  public static void addParametersToWindow(ModWindow radioWindow)
    {
    radioWindow.setIfModIsActive(RadioParameters.PARAMETERS[0]);

    Spacing.addPlaceholdersToModWindow(radioWindow, RadioParameters.PARAMETERS);
    }
  }