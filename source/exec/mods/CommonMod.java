package exec.mods;

import java.awt.*;


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
  public static boolean[] MOD_STATUSES = {ParametersAir.IS_ACTIVE,
                                          ParametersAnimals.IS_ACTIVE,
                                          ParametersBleedout.IS_ACTIVE,
                                          ParametersBoats.IS_ACTIVE,
                                          true,
                                          true,
                                          true,
                                          true,
                                          true,
                                          true,
                                          true,
                                          false,
                                          true,
                                          true,
                                          true,
                                          true};
  public static final int NUMBER_OF_MODS = MOD_NAMES.length;

  public static int AIR_WINDOW_ID = lookForWindowId("AIR");
  public static int ANIMALS_WINDOW_ID = lookForWindowId("ANIMALS");
  public static int BLEEDOUT_WINDOW_ID = lookForWindowId("BLEEDOUT");
  public static int BOATS_WINDOW_ID = lookForWindowId("BOATS");

  public static final String PARAMETERS_ACTIVE = "ACTIVE";
  public static final Color ACTIVE_COLOR = Color.GREEN;
  public static final Color INACTIVE_COLOR = Color.RED;
  public static final int MAXIMUM_PARAMETERS = 16;

  private static int lookForWindowId(String modName)
    {
    for (int i = 0; i < MOD_NAMES.length; i += 1)
      {
      if (MOD_NAMES[i] == modName)
        return i;
      }

    return -1;
    }
  }