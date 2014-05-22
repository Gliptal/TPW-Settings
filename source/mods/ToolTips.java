package mods;


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

  public static final String[] AIR = {"Delay before flybys start.",
                                      "Maximum time between flybys.",
                                      "Maximum number of aircrafts at a given time."};

  public static final String[] ANIMALS = {"Delay before animals start spawning.",
                                          "Maximum number of animals near player.",
                                          "Distance beyond which animals will be removed.",
                                          "Minimum distance from player to spawn animals.",
                                          "Maximum time between dog and cat noises."};

  public static final String[] BLEEDOUT = {"Unit damage will be increased by this value every 10 sec.",
                                           "Damage beyond which a unit will be forced into crouch.",
                                           "Damage beyond which a unit will be forced into prone.",
                                           "Damage beyond which a unit will writhe around incapacitated (1: dead)."};

  public static final String[] BOATS = {"Delay before boats start spawning.",
                                        "Radius around the player to scan for water to spawn boats.",
                                        "How many waypoints to assign to each boat.",
                                        "Maximum number of boats to spawn around the player."};

  public static final String[] CARS = {"Delay before traffic starts spawning.",
                                       "How many waypoints to assign to each car.",
                                       "Maximum number of traffic to spawn around the player.",
                                       "Radius around the player to scan for roads to spawn traffic",
                                       "Whether traffic are not spawned during combat."};

  public static final String[] CIVS = {"Delay before civilians start spawning.",
                                       "Radius around the player to scan for houses to spawn civilians.",
                                       "How many waypoints to assign to each civilian.",
                                       "How many houses per civilian.",
                                       "Maximum number of civilian casualties that can be inflicted by your squad.",
                                       "Maximum number of total civilian casualties.",
                                       "What to do if the casualty threshold is exceeded.",
                                       "Maximum number of civilians to spawn regardless of DENSITY.",
                                       "Civilians interaction radius: civilians closer than this to each other will stop and talk (0: no interaction).",
                                       "Whether civilians are not spawned during combat."};

  public static final String[] EBS = {"Unit is suppressed if this many bullets pass close to it in 5 secs.",
                                      "Delay before EBS function starts.",
                                      "Debugging will colour the unit uniform (green: ally | yellow: <5 bullets | red: >5 bullets).",
                                      "Units must be closer than this to the player for EBS to work.",
                                      "Whether suppression effects are applied to the player.",
                                      "Whether suppression effects are applied to the AI.",
                                      "Whether AI will seek cover when suppressed."};

  public static final String[] FALL = {"Sensitivity of units to falls (50: unit half as likely to fall over from a given height).",
                                       "Units must be closer than this to the player for realistic reactions to falls.",
                                       "Delay until FALL function starts.",
                                       "Whether to use ragdoll animations when a unit is hit.",
                                       "Maximum time a unit will remain incapacitated after being hit."};

  public static final String[] FOG = {"Units must be closer than this to the player to show foggy breath.",
                                      "Delay before FOG function starts.",
                                      "Whether foggy breath is enabled.",
                                      "Whether ground fog is enabled.",
                                      "Whether rain fog is enabled.",
                                      "Whether heat haze is enabled.",
                                      "Whether snow is enabled."};

  public static final String[] HOUSELIGHTS = {"Delay before houselights function starts,"};

  public static final String[] HUD = {"Effective range of goggles to scan for foot units. [minimum, maximum]",
                                      "Detection range multiplication factor for vehicles relative to foot units.",
                                      "HUD color.",
                                      "Friendly icons color.",
                                      "Civilian icons color.",
                                      "Enemy icons color.",
                                      "Squad and marker icons color.",
                                      "Initial transparency of HUD. (0: invisible | 1: opaque)",
                                      "Height above sea level. [active, X position, Y position, text size]",
                                      "Direction of player's gaze. [active, X position, Y position, text size]",
                                      "GPS grid coordinates. [active, X position, Y position, text size]",
                                      "Local mean time. [active, X position, Y position, text size]",
                                      "Temperature (from TPW FOG). [active, X position, Y position, text size]",
                                      "Health. [active, X position, Y position, text size]",
                                      "Range to the centre of the player's gaze. [active, X position, Y position, text size]",
                                      "Speed of the player, or the player's vehicle. [active, X position, Y position, text size]",
                                      "Numbers of nearby units. [active, X position, Y position, text size]",
                                      "Units and markers displayed. [active, icon max size, icon min size, text size]",
                                      "HUD offset (-0.5 to 0.5). [X offset, Y offset]",
                                      "HUD scale.",
                                      "HUD text scale.",
                                      "Whether HUD performance is reduced with distance.",
                                      "Whether HUD is visible in third person.",
                                      "Whether tactical glasses are automatically added to the player's inventory if he hasn't got them already.",
                                      "HUD icon types, use the provided image as a reference. [unit, hidden unit, vehicle, hidden vehicle, enemy unit, hidden enemy unit, enemy vehicle, hidden enemy vehicle, marker, predictor]",
                                      "Only edit these if you know what you're doing with structured text.",
                                      "Only edit these if you know what you're doing with structured text.",
                                      "Only edit these if you know what you're doing with structured text.",
                                      "Only edit these if you know what you're doing with structured text.",
                                      "Only edit these if you know what you're doing with structured text.",
                                      "Only edit these if you know what you're doing with structured text.",
                                      "Only edit these if you know what you're doing with structured text.",
                                      "Only edit these if you know what you're doing with structured text.",
                                      "Only edit these if you know what you're doing with structured text.",
                                      "Only edit these if you know what you're doing with structured text."};

  public static final String[] LOS = {"Debugging will spawn blue balls above units with line of sight to a visible enemy.",
                                      "Maximum distance LOS function will work at.",
                                      "Enemies are considered visible no matter what if at less than this distance.",
                                      "Delay before LOS function starts."};

  public static final String[] PARK = {"Percentage of houses with parked cars outside.",
                                       "Cars are created within this distance and completely removed past it.",
                                       "Cars are shown closer than this and hidden further than this.",
                                       "Cars closer than this have simulation enabled.",
                                       "Maximum number of cars to spawn regardless (not irregardless) of PERC."};

  public static final String[] RADIO = {"Whether radios are on in houses.",
                                        "Wheteher radios are on in vehicles.",
                                        "Maximum time between radio messages."};

  public static final String[] RAIN_FX = {};

  public static final String[] STREETLIGHTS = {"Lights brightness factor: 3-15 should be ideal for most maps.",
                                               "Radius around the player to scan for streetlights.",
                                               "Lights colour.",
                                               "Whether moths are spawned around lights."};
  }