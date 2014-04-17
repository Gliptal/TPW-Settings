package mods.parameters;

import exec.userinterface.*;


public class CivsParameters
  {
  public static final String[] PARAMETER_NAMES = {Spacing.ACTIVE_PLACEHOLDER,
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

  public static String[] PARAMETERS = new String[PARAMETER_NAMES.length];
  public static String[] CAS_DISPLAY = {"NOTHING",
                                        "POP UP MESSAGE",
                                        "END MISSION"};
  }