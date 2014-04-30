package mods;


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

  public static final int NUMBER_OF_MODS = MOD_NAMES.length;

  public static final int AIR_ID = getModId("AIR");
  public static final int ANIMALS_ID = getModId("ANIMALS");
  public static final int BLEEDOUT_ID = getModId("BLEEDOUT");
  public static final int BOATS_ID = getModId("BOATS");
  public static final int CARS_ID = getModId("CARS");
  public static final int CIVS_ID = getModId("CIVS");
  public static final int EBS_ID = getModId("EBS");
  public static final int FALL_ID = getModId("FALL");
  public static final int FOG_ID = getModId("FOG");
  public static final int HOUSELIGHTS_ID = getModId("HOUSELIGHTS");
  public static final int HUD_ID = getModId("HUD");
  public static final int LOS_ID = getModId("LOS");
  public static final int PARK_ID = getModId("PARK");
  public static final int RADIO_ID = getModId("RADIO");
  public static final int RAIN_FX_ID = getModId("RAIN_FX");
  public static final int STREETLIGHTS_ID = getModId("STREETLIGHTS");

  private static int getModId(String modName)
    {
    for (int i = 0; i < NUMBER_OF_MODS; i += 1)
      {
      if (MOD_NAMES[i].equals(modName))
        return i;
      }

    return -1;
    }
  }