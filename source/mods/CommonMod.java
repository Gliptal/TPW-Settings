package mods;

import exec.userinterface.*;
import java.awt.*;
import mods.parameters.*;


public class CommonMod
  {
  public static final String[] MOD_NAMES = {"AIR",
                                            "ANIMALS",
                                            "BLEEDOUT",
                                            "BOATS",
                                            "CARS",
                                            "CIVS",
                                            "EBS",
                                            "FALL",
                                            "FOG",
                                            "HOUSELIGHTS",
                                            "HUD",
                                            "LOS",
                                            "PARK",
                                            "RADIO",
                                            "RAIN_FX",
                                            "STREETLIGHTS"};
  public static String[] MOD_STATUSES = {AirParameters.PARAMETERS[0],
                                         AnimalsParameters.PARAMETERS[0],
                                         BleedoutParameters.PARAMETERS[0],
                                         BoatsParameters.PARAMETERS[0],
                                         CarsParameters.PARAMETERS[0],
                                         CivsParameters.PARAMETERS[0],
                                         EbsParameters.PARAMETERS[0],
                                         FallParameters.PARAMETERS[0],
                                         FogParameters.PARAMETERS[0],
                                         HouselightsParameters.PARAMETERS[0],
                                         "0",
                                         LosParameters.PARAMETERS[0],
                                         ParkParameters.PARAMETERS[0],
                                         RadioParameters.PARAMETERS[0],
                                         RainFxParameters.PARAMETERS[0],
                                         StreetlightsParameters.PARAMETERS[0]};
  public static final int NUMBER_OF_MODS = MOD_NAMES.length;

  public static int AIR_WINDOW_ID = lookForModWindowId("AIR");
  public static int ANIMALS_WINDOW_ID = lookForModWindowId("ANIMALS");
  public static int BLEEDOUT_WINDOW_ID = lookForModWindowId("BLEEDOUT");
  public static int BOATS_WINDOW_ID = lookForModWindowId("BOATS");
  public static int CARS_WINDOW_ID = lookForModWindowId("CARS");
  public static int CIVS_WINDOW_ID = lookForModWindowId("CIVS");
  public static int EBS_WINDOW_ID = lookForModWindowId("EBS");
  public static int FALL_WINDOW_ID = lookForModWindowId("FALL");
  public static int FOG_WINDOW_ID = lookForModWindowId("FOG");
  public static int HOUSELIGHTS_WINDOW_ID = lookForModWindowId("HOUSELIGHTS");
  public static int LOS_WINDOW_ID = lookForModWindowId("LOS");
  public static int PARK_WINDOW_ID = lookForModWindowId("PARK");
  public static int RADIO_WINDOW_ID = lookForModWindowId("RADIO");
  public static int RAINFX_WINDOW_ID = lookForModWindowId("RAIN_FX");
  public static int STREETLIGHTS_WINDOW_ID = lookForModWindowId("STREETLIGHTS");

  public static final int MAXIMUM_PARAMETERS = Spacing.PARAMETERS_ROWS*Spacing.PARAMETERS_COLUMNS;
  public static final String PARAMETERS_ACTIVE = "ACTIVE";
  public static final Color ACTIVE_COLOR = Color.GREEN;
  public static final Color INACTIVE_COLOR = Color.RED;

  private static int lookForModWindowId(String modName)
    {
    for (int i = 0; i < MOD_NAMES.length; i += 1)
      {
      if (MOD_NAMES[i] == modName)
        return i;
      }

    return -1;
    }
  }