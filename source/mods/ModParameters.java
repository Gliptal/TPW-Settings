package mods;

import exec.userinterface.*;


public class ModParameters
  {
  public static final int MAXIMUM_PARAMETERS = Spacing.PARAMETERS_ROWS*Spacing.PARAMETERS_COLUMNS;
  public static final String ACTIVE_PLACEHOLDER = "";

  public static final String[] AIR = {ACTIVE_PLACEHOLDER,
                                      "DELAY",
                                      "TIME",
                                      "MAX"};

  public static final String[] ANIMALS = {ACTIVE_PLACEHOLDER,
                                          "DELAY",
                                          "MAX",
                                          "MAX RADIUS",
                                          "MIN RADIUS",
                                          "NOISE TIME"};

  public static final String[] BLEEDOUT = {ACTIVE_PLACEHOLDER,
                                           "INCREASE",
                                           "C THRESH",
                                           "P THRESH",
                                           "I THRESH"};

  public static final String[] BOATS = {ACTIVE_PLACEHOLDER,
                                        "DELAY",
                                        "RADIUS",
                                        "WAYPOINTS",
                                        "NUM"};

  public static final String[] CARS = {ACTIVE_PLACEHOLDER,
                                       "DELAY",
                                       "WAYPOINTS",
                                       "NUM",
                                       "RADIUS",
                                       "NO COMBAT SPAWN"};

  public static final String[] CIVS = {ACTIVE_PLACEHOLDER,
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

  public static final String[] EBS = {ACTIVE_PLACEHOLDER,
                                      "THRESH",
                                      "DELAY",
                                      "DEBUG",
                                      "RADIUS",
                                      "PLAYER SUP",
                                      "AI SUP",
                                      "FIND COVER"};

  public static final String[] FALL = {ACTIVE_PLACEHOLDER,
                                       "SENSITIVITY",
                                       "THRESHOLD",
                                       "DELAY",
                                       "RAGDOLL",
                                       "FALLTIME"};

  public static final String[] FOG = {ACTIVE_PLACEHOLDER,
                                      "RADIUS",
                                      "DELAY",
                                      "BREATH",
                                      "GROUND FOG",
                                      "RAIN FOG",
                                      "HEAT HAZE",
                                      "CAN SNOW"};

  public static final String[] HOUSELIGHTS = {ACTIVE_PLACEHOLDER,
                                              "DELAY"};

  public static final String[] HUD = {ACTIVE_PLACEHOLDER,
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
                                      "PRX[]",
                                      "UNIT[]",
                                      "OFFSET[]",
                                      "SCALE",
                                      "TEXTSCALE",
                                      "DEGRADATION",
                                      "THIRD PERSON",
                                      "ADD TAC",
                                      "ASL TXT",
                                      "AZT TXT",
                                      "GRD TXT",
                                      "LMT TXT",
                                      "TMP TXT",
                                      "HLT TXT",
                                      "RNG TXT",
                                      "VEL TXT",
                                      "AIRVEL TXT",
                                      "PRX TXT"};

  public static final String[] LOS = {ACTIVE_PLACEHOLDER,
                                      "DEBUG",
                                      "MAX DIST",
                                      "MIN DIST",
                                      "DELAY"};

  public static final String[] PARK = {ACTIVE_PLACEHOLDER,
                                       "PERC",
                                       "CREATE DIST",
                                       "HIDE DIST",
                                       "SIM DIST",
                                       "MAX"};

  public static final String[] RADIO = {ACTIVE_PLACEHOLDER,
                                       "HOUSE",
                                       "CAR",
                                       "TIME"};

  public static final String[] RAIN_FX = {ACTIVE_PLACEHOLDER};

  public static final String[] STREETLIGHTS = {ACTIVE_PLACEHOLDER,
                                               "FACTOR",
                                               "RANGE",
                                               "COLOUR",
                                               "MOTHS"};

  public static final String[] STREETLIGHTS_COLOUR = {"WHITE INCANDESCENT",
                                                      "YELLOW SODIUM",
                                                      "BLUE FLUORESCENT"};
  }