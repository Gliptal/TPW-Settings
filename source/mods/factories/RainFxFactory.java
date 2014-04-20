package mods.factories;

import exec.userinterface.*;
import gui.*;
import mods.parameters.*;


public class RainFxFactory
  {
  public static void createAndAddParametersToModWindow(ModWindow rainFxWindow)
    {
    rainFxWindow.setIfModIsActive(RainFxParameters.PARAMETERS[0]);

    Spacing.addPlaceholdersToModWindow(rainFxWindow, RainFxParameters.PARAMETERS);
    }

  public static void linkComponentsToArray(ModWindow rainFxWindow)
    {
    rainFxWindow.getIsActiveCheckBox().linkToArray(RainFxParameters.PARAMETERS, 0);
    }
  }