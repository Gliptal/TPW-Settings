package mods;

import exec.userinterface.*;


public class ToolTips
  {
  public static final String[] MODS = {"Ambient aircrafts flybys.",
                                       "Ambient animal life.",
                                       "Realistic bleeding system",
                                       "Ambient civilian water traffic.",
                                       "Ambient civilian ground traffic.",
                                       "Ambient civilians.",
                                       "Bullet-centric suppression system.",
                                       "Realistic falling system.",
                                       "Comprehensive climate system.",
                                       "Ambient house lighting.",
                                       "Realistic tactical goggles display.",
                                       "AI CQB line of sight enhancements.",
                                       "Ambient parked cars.",
                                       "Ambient radio chatter and music.",
                                       "Rain droplet effect.",
                                       "Streetlights for ArmA 2 maps."};

  public static final String[] AIR = {Spacing.ACTIVE_PLACEHOLDER,
                                      "Delay before flybys start.",
                                      "Maximum time between flybys.",
                                      "Maximum number of aircrafts at a given time."};

  public static final String[] ANIMALS = {Spacing.ACTIVE_PLACEHOLDER,
                                          "Delay before animals start spawning.",
                                          "Maximum number of animals near player.",
                                          "Distance beyond which animals will be removed.",
                                          "Minimum distance from player to spawn animals.",
                                          "Maximum time between dog and cat noises."};

  public static final String[] BLEEDOUT = {Spacing.ACTIVE_PLACEHOLDER,
                                           "Unit damage will be increased by this value every 10 sec.",
                                           "Damage beyond which a unit will be forced into crouch.",
                                           "Damage beyond which a unit will be forced into prone.",
                                           "Damage beyond which a unit will writhe around incapacitated (1: dead)."};

  public static final String[] BOATS = {Spacing.ACTIVE_PLACEHOLDER,
                                        "Delay before boats start spawning.",
                                        "Radius around the player to scan for water to spawn boats.",
                                        "How many waypoints to assign to each boat.",
                                        "Maximum number of boats to spawn around the player."};

  public static final String[] CARS = {Spacing.ACTIVE_PLACEHOLDER,
                                       "Delay before traffic starts spawning.",
                                       "How many waypoints to assign to each car.",
                                       "Maximum number of traffic to spawn around the player.",
                                       "Radius around the player to scan for roads to spawn traffic",
                                       "Whether traffic are not spawned during combat."};

  public static final String[] CIVS = {Spacing.ACTIVE_PLACEHOLDER,
                                       "Delay before civilians start spawning.",
                                       "Radius around the player to scan for houses to spawn civilians.",
                                       "How many waypoints to assign to each civilian.",
                                       "How many houses per civilian.",
                                       "Maximum number of civilian casualties that can be inflicted by your squad.",
                                       "Maximum number of total civilian casualties.",
                                       "What to do if the casualty threshold is exceeded.",
                                       "Maximum number of civilians to spawn regardless of DENSITY.",
                                       "Civilians interaction radius: civilians closer than this to each other will stop and talk (0: no interaction).",
                                       "Whether civilians are not spawned during combat."};

  public static final String[] EBS = {Spacing.ACTIVE_PLACEHOLDER,
                                      "Unit is suppressed if this many bullets pass close to it in 5 secs.",
                                      "Delay before EBS function starts.",
                                      "Debugging will colour the unit uniform (green: ally | yellow: <5 bullets | red: >5 bullets).",
                                      "Units must be closer than this to the player for EBS to work.",
                                      "Whether suppression effects are applied to the player.",
                                      "Whether suppression effects are applied to the AI.",
                                      "Whether AI will seek cover when suppressed."};

  public static final String[] FALL = {Spacing.ACTIVE_PLACEHOLDER,
                                       "Sensitivity of units to falls (50: unit half as likely to fall over from a given height).",
                                       "Units must be closer than this to the player for realistic reactions to falls.",
                                       "Delay until FALL function starts.",
                                       "Whether to use ragdoll animations when a unit is hit.",
                                       "Maximum time a unit will remain incapacitated after being hit."};

  public static final String[] FOG = {Spacing.ACTIVE_PLACEHOLDER,
                                      "Units must be closer than this to the player to show foggy breath.",
                                      "Delay before FOG function starts.",
                                      "Whether foggy breath is enabled.",
                                      "Whether ground fog is enabled.",
                                      "Whether rain fog is enabled.",
                                      "Whether heat haze is enabled.",
                                      "Whether snow is enabled."};

  public static final String[] HOUSELIGHTS = {Spacing.ACTIVE_PLACEHOLDER,
                                              "Delay before houselights function starts,"};

  public static final String[] LOS = {Spacing.ACTIVE_PLACEHOLDER,
                                      "Debugging will spawn blue balls above units with line of sight to a visible enemy.",
                                      "Maximum distance LOS function will work at.",
                                      "Enemies are considered visible no matter what if at less than this distance.",
                                      "Delay before LOS function starts."};

  public static final String[] PARK = {Spacing.ACTIVE_PLACEHOLDER,
                                       "Percentage of houses with parked cars outside.",
                                       "Cars are created within this distance and completely removed past it.",
                                       "Cars are shown closer than this and hidden further than this.",
                                       "Cars closer than this have simulation enabled.",
                                       "Maximum number of cars to spawn regardless (not irregardless) of PERC."};

  public static final String[] RADIO = {Spacing.ACTIVE_PLACEHOLDER,
                                        "Whether radios are on in houses.",
                                        "Wheteher radios are on in vehicles.",
                                        "Maximum time between radio messages."};

  public static final String[] RAIN_FX = {Spacing.ACTIVE_PLACEHOLDER};

  public static final String[] STREETLIGHTS = {Spacing.ACTIVE_PLACEHOLDER,
                                               "Lights brightness factor: 3-15 should be ideal for most maps.",
                                               "Radius around the player to scan for streetlights.",
                                               "Lights colour.",
                                               "Whether moths are spawned around lights."};
  }