package mods;

import exec.userinterface.*;


public class ModParameters
  {
  public static final int MAXIMUM_PARAMETERS = Spacing.PARAMETERS_ROWS*Spacing.PARAMETERS_COLUMNS;
  public static final String ACTIVE = "ACTIVE";

  public static final String[] AIR = {Spacing.ACTIVE_PLACEHOLDER,
                                      "DELAY",
                                      "TIME",
                                      "MAX"};

  public static final String[] ANIMALS = {Spacing.ACTIVE_PLACEHOLDER,
                                          "DELAY",
                                          "MAX",
                                          "MAX RADIUS",
                                          "MIN RADIUS",
                                          "NOISE TIME"};

  public static final String[] BLEEDOUT = {Spacing.ACTIVE_PLACEHOLDER,
                                           "INCREASE",
                                           "C THRESH",
                                           "P THRESH",
                                           "I THRESH"};

  public static final String[] BOATS = {Spacing.ACTIVE_PLACEHOLDER,
                                        "DELAY",
                                        "RADIUS",
                                        "WAYPOINTS",
                                        "NUM"};

  public static final String[] CARS = {Spacing.ACTIVE_PLACEHOLDER,
                                       "DELAY",
                                       "WAYPOINTS",
                                       "NUM",
                                       "RADIUS",
                                       "NO COMBAT SPAWN"};

  public static final String[] CIVS = {Spacing.ACTIVE_PLACEHOLDER,
                                       "DELAY",
                                       "RADIUS",
                                       "WAYPOINTS",
                                       "DENSITY",
                                       "MAX SQUAD CAS",
                                       "MAX ALL CAS",
                                       "CAS DISPLAY",
                                       "MAX CIV",
                                       "INTERACT",
                                       "NO COMBAT SPAWN"};

  public static final String[] CIVS_CAS_DISPLAY = {"NOTHING",
                                                   "POP UP MESSAGE",
                                                   "END MISSION"};

  public static final String[] EBS = {Spacing.ACTIVE_PLACEHOLDER,
                                      "THRESH",
                                      "DELAY",
                                      "DEBUG",
                                      "RADIUS",
                                      "PLAYER SUP",
                                      "AI SUP",
                                      "FIND COVER"};

  public static final String[] FALL = {Spacing.ACTIVE_PLACEHOLDER,
                                       "SENSITIVITY",
                                       "THRESHOLD",
                                       "DELAY",
                                       "RAGDOLL",
                                       "FALLTIME"};

  public static final String[] FOG = {Spacing.ACTIVE_PLACEHOLDER,
                                      "RADIUS",
                                      "DELAY",
                                      "BREATH",
                                      "GROUND FOG",
                                      "RAIN FOG",
                                      "HEAT HAZE",
                                      "CAN SNOW"};

  public static final String[] HOUSELIGHTS = {Spacing.ACTIVE_PLACEHOLDER,
                                              "DELAY"};

  public static final String[] HUD = {Spacing.ACTIVE_PLACEHOLDER,
                                      "RANGE[]",
                                      "COLOUR[]",
                                      "ENEMY COLOUR[]",
                                      "SQUAD COLOUR[]",
                                      "ALPHA",
                                      "ASL[]",
                                      "AZT[]",
                                      "GRD[]",
                                      "LMT[]",
                                      "TMP[]",
                                      "HLT[]",
                                      "RNG[]",
                                      "VEL[]",
                                      "UNIT[]",
                                      "OFFSET[]",
                                      "SCALE",
                                      "TEXTSCALE",
                                      "DEGRADATION",
                                      "ASL TXT",
                                      "AZT TXT",
                                      "GRD TXT",
                                      "LMT TXT",
                                      "TMP TXT",
                                      "HLT TXT",
                                      "RNG TXT",
                                      "VEL TXT",
                                      "AIRVEL TXT"};

  public static final String[] LOS = {Spacing.ACTIVE_PLACEHOLDER,
                                      "DEBUG",
                                      "MAX DIST",
                                      "MIN DIST",
                                      "DELAY"};

  public static final String[] PARK = {Spacing.ACTIVE_PLACEHOLDER,
                                       "PERC",
                                       "CREATE DIST",
                                       "HIDE DIST",
                                       "SIM DIST",
                                       "MAX"};

  public static final String[] RADIO = {Spacing.ACTIVE_PLACEHOLDER,
                                       "HOUSE",
                                       "CAR",
                                       "TIME"};

  public static final String[] RAIN_FX = {Spacing.ACTIVE_PLACEHOLDER};

  public static final String[] STREETLIGHTS = {Spacing.ACTIVE_PLACEHOLDER,
                                               "FACTOR",
                                               "RANGE",
                                               "COLOUR",
                                               "MOTHS"};

  public static String[] STREETLIGHTS_COLOUR = {"WHITE INCANDESCENT",
                                                "YELLOW SODIUM",
                                                "BLUE FLUORESCENT"};
  }