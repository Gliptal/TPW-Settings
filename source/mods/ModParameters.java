package mods;


public class ModParameters
  {
  public static final String ACTIVE_PLACEHOLDER = "";

  public static final String UNIT_SEPARATOR = "   - ";
  public static final String SECONDS = "s";
  public static final String METERS = "m";
  public static final String PERCENTAGE = "%";
  public static final String VEHICLES = "veh";
  public static final String NPC = "npc";
  public static final String PRC_10SEC = "%/10sec";
  public static final String HOUSE_NPC = "house/npc";
  public static final String BUL_5SEC = "bul/5sec";
  public static final String PRC_HOUSE = "%/house";

  public static final String[] AIR = {ACTIVE_PLACEHOLDER,
                                      "ACTIVATION DELAY"+UNIT_SEPARATOR+SECONDS,
                                      "FLYBYS WAIT"+UNIT_SEPARATOR+SECONDS,
                                      "MAXIMUM AIRCRAFTS"+UNIT_SEPARATOR+VEHICLES,
                                      "POSSIBLE HEIGHTS"+UNIT_SEPARATOR+METERS,
                                      "EXCLUSIONS"};

  public static final String[] AIR_EXCLUDE = {"NO EXCLUSIONS",
                                              "CIVILIAN",
                                              "MILITARY"};

  public static final String[] ANIMALS = {ACTIVE_PLACEHOLDER,
                                          "ACTIVATION DELAY"+UNIT_SEPARATOR+SECONDS,
                                          "MAXIMUM ANIMALS"+UNIT_SEPARATOR+NPC,
                                          "MAXIMUM DISTANCE"+UNIT_SEPARATOR+METERS,
                                          "MINIMUM DISTANCE"+UNIT_SEPARATOR+METERS,
                                          "NOISE TIME"+UNIT_SEPARATOR+SECONDS};

  public static final String[] BLEEDOUT = {ACTIVE_PLACEHOLDER,
                                           "DAMAGE INCREASE"+UNIT_SEPARATOR+PRC_10SEC,
                                           "CROUCH THRESHOLD"+UNIT_SEPARATOR+PERCENTAGE,
                                           "PRONE THRESHOLD"+UNIT_SEPARATOR+PERCENTAGE,
                                           "WOUNDED THRESHOLD"+UNIT_SEPARATOR+PERCENTAGE,
                                           "HEARTBEAT SCREENSHAKE"};

  public static final String[] BOATS = {ACTIVE_PLACEHOLDER,
                                        "ACTIVATION DELAY"+UNIT_SEPARATOR+SECONDS,
                                        "SPAWN RADIUS"+UNIT_SEPARATOR+METERS,
                                        "WAYPOINTS",
                                        "MAXIMUM BOATS"+UNIT_SEPARATOR+VEHICLES};

  public static final String[] CARS = {ACTIVE_PLACEHOLDER,
                                       "ACTIVATION DELAY"+UNIT_SEPARATOR+SECONDS,
                                       "WAYPOINTS",
                                       "MAXIMUM CARS"+UNIT_SEPARATOR+VEHICLES,
                                       "SPAWN RADIUS"+UNIT_SEPARATOR+METERS,
                                       "NO COMBAT SPAWN"};

  public static final String[] CIVS = {ACTIVE_PLACEHOLDER,
                                       "ACTIVATION DELAY"+UNIT_SEPARATOR+SECONDS,
                                       "SPAWN RADIUS"+UNIT_SEPARATOR+METERS,
                                       "WAYPOINTS",
                                       "DENSITY"+UNIT_SEPARATOR+HOUSE_NPC,
                                       "SQUAD COLLATERAL"+UNIT_SEPARATOR+NPC,
                                       "ALL COLLATERAL"+UNIT_SEPARATOR+NPC,
                                       "COLLATERAL EVENT",
                                       "MAXIMUM CIVILIANS"+UNIT_SEPARATOR+NPC,
                                       "INTERACT RADIUS"+UNIT_SEPARATOR+METERS,
                                       "NO COMBAT SPAWN"};

  public static final String[] CIVS_CAS_DISPLAY = {"NOTHING",
                                                   "MESSAGE",
                                                   "END MISSION"};

  public static final String[] EBS = {ACTIVE_PLACEHOLDER,
                                      "BULLET THRESHOLD"+UNIT_SEPARATOR+BUL_5SEC,
                                      "ACTIVATION DELAY"+UNIT_SEPARATOR+SECONDS,
                                      "DEBUG MODE",
                                      "ACTIVE RADIUS"+UNIT_SEPARATOR+METERS,
                                      "PLAYER SUPPRESSION",
                                      "AI SUPPRESSION",
                                      "COVER ALGORITHMS",
                                      "DETECTION TYPE"};

  public static final String[] EBS_SUPTYPE = {"BULLET CENTRIC",
                                              "ENTITY CENTRIC"};

  public static final String[] FALL = {ACTIVE_PLACEHOLDER,
                                       "SENSITIVITY"+UNIT_SEPARATOR+PERCENTAGE,
                                       "ACTIVE RADIUS"+UNIT_SEPARATOR+METERS,
                                       "ACTIVATION DELAY"+UNIT_SEPARATOR+SECONDS,
                                       "RAGDOLL",
                                       "INCAPACITATED TIME"+UNIT_SEPARATOR+SECONDS,
                                       "PLAYER FALL",
                                       "BULLET REACTION"};

  public static final String[] FOG = {ACTIVE_PLACEHOLDER,
                                      "ACTIVE RADIUS"+UNIT_SEPARATOR+METERS,
                                      "ACTIVATION DELAY"+UNIT_SEPARATOR+SECONDS,
                                      "BREATH FOG",
                                      "GROUND FOG",
                                      "RAIN FOG",
                                      "HEAT HAZE",
                                      "POSSIBLE SNOW"};

  public static final String[] HOUSELIGHTS = {ACTIVE_PLACEHOLDER,
                                              "ACTIVATION DELAY"+UNIT_SEPARATOR+SECONDS};

  public static final String[] HUD = {ACTIVE_PLACEHOLDER,
                                      "RANGE",
                                      "VEHICLE RANGE FACTOR",
                                      "HUD COLOR",
                                      "FRIENDLIES COLOR",
                                      "CIVILIANS COLOR",
                                      "ENEMIES COLOR",
                                      "SQUAD COLOR",
                                      "ALPHA CHANNEL",
                                      "ASL",
                                      "AZT",
                                      "GRD",
                                      "LMT",
                                      "TMP",
                                      "HLT",
                                      "RNG",
                                      "VEL",
                                      "PRX",
                                      "MARKERS",
                                      "OFFSET",
                                      "SCALE",
                                      "TEXT SCALE",
                                      "DEGRADATION",
                                      "THIRD PERSON",
                                      "ADD TACTICAL GLASSES",
                                      "AUDIBLE WARNING",
                                      "ICON TYPES",
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
                                      "MAXIMUM DISTANCE"+UNIT_SEPARATOR+METERS,
                                      "MINIMUM DISTANCE"+UNIT_SEPARATOR+METERS,
                                      "ACTIVATION DELAY"+UNIT_SEPARATOR+SECONDS};

  public static final String[] PARK = {ACTIVE_PLACEHOLDER,
                                       "DENSITY"+UNIT_SEPARATOR+PRC_HOUSE,
                                       "SPAWN DISTANCE"+UNIT_SEPARATOR+METERS,
                                       "HIDE DISTANCE"+UNIT_SEPARATOR+METERS,
                                       "SIMULATION DISTANCE"+UNIT_SEPARATOR+METERS,
                                       "MAXIMUM PARKED CARS"+UNIT_SEPARATOR+VEHICLES};

  public static final String[] RADIO = {ACTIVE_PLACEHOLDER,
                                        "HOUSES",
                                        "CARS",
                                        "MESSAGES WAIT"+UNIT_SEPARATOR+SECONDS};

  public static final String[] RAIN_FX = {ACTIVE_PLACEHOLDER};

  public static final String[] SKIRMISH = {ACTIVE_PLACEHOLDER,
                                           "MAXIMUM ENEMY SQUADS"+UNIT_SEPARATOR+NPC,
                                           "MAXIMUM ENEMY VEHICLES"+UNIT_SEPARATOR+VEHICLES,
                                           "MAXIMUM FRIENDLY SQUADS"+UNIT_SEPARATOR+NPC,
                                           "MAXIMUM FRIENDLY VEHICLES"+UNIT_SEPARATOR+VEHICLES,
                                           "MINIMUM DISTANCE"+UNIT_SEPARATOR+METERS,
                                           "MAXIMUM DISTANCE"+UNIT_SEPARATOR+METERS,
                                           "NATO SUPPORT",
                                           "FRIENDLY FACTION",
                                           "ENEMY FACTION",
                                           "SPAWN DELAY"+UNIT_SEPARATOR+SECONDS,
                                           "FRIENDLY UNIT STRING",
                                           "FRIENDLY VEHICLE STRING",
                                           "ENEMY UNIT STRING",
                                           "ENEMY VEHICLE STRING"};

  public static final String[] SKIRMISH_FRIENDLY = {"CUSTOM",
                                                    "NATO",
                                                    "FIA",
                                                    "AAF"};

  public static final String[] SKIRMISH_ENEMY = {"CUSTOM",
                                                 "CAF AGGRESSORS",
                                                 "CSAT",
                                                 "AAF",
                                                 "CMP ARID",
                                                 "CMP SEMIARID",
                                                 "CMP URBAN",
                                                 "ISIS",
                                                 "ISIS 2035"};

  public static final String[] STREETLIGHTS = {ACTIVE_PLACEHOLDER,
                                               "FACTOR",
                                               "RANGE"+UNIT_SEPARATOR+METERS,
                                               "COLOUR",
                                               "MOTHS"};

  public static final String[] STREETLIGHTS_COLOUR = {"WHITE INCANDESCENT",
                                                      "YELLOW SODIUM",
                                                      "BLUE FLUORESCENT"};

  public static final String[] ANIMATIONS = {ACTIVE_PLACEHOLDER,
                                             "ARMED RUN SPEED",
                                             "TACTICAL RUN SPEED",
                                             "TACTICAL JOG SPEED",
                                             "UNARMED SPEED",
                                             "AT EASE SPEED",
                                             "AIMING SPEED",
                                             "ROLL LEFT",
                                             "ROLL RIGHT"};
  }