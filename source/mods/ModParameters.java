package mods;


public abstract class ModParameters
  {
  private static final String ACTIVE_PLACEHOLDER = "";

  private static final String SEPARATOR = "     ";
  private static final String SECONDS        = "(s)";
  private static final String METERS         = "(m)";
  private static final String PERCENTAGE     = "(%)";
  private static final String VEHICLES       = "(veh)";
  private static final String NPC            = "(npc)";
  private static final String PRC_10SEC      = "(%/10sec)";
  private static final String HOUSE_NPC      = "(house/npc)";
  private static final String BUL_5SEC       = "(bul/5sec)";
  private static final String PRC_HOUSE      = "(%/house)";

  public static final String[] AIR =         {ACTIVE_PLACEHOLDER,
                                              "INITIAL DELAY"+SEPARATOR+SECONDS,
                                              "FLYBYS DELAY"+SEPARATOR+SECONDS,
                                              "MAXIMUM AIRCRAFTS"+SEPARATOR+VEHICLES,
                                              "FLYING ALTITUDES"+SEPARATOR+METERS,
                                              "EXCLUSIONS"};

  public static final String[] ANIMALS =     {ACTIVE_PLACEHOLDER,
                                              "INITIAL DELAY"+SEPARATOR+SECONDS,
                                              "MAXIMUM ANIMALS"+SEPARATOR+NPC,
                                              "MAXIMUM DISTANCE"+SEPARATOR+METERS,
                                              "MINIMUM DISTANCE"+SEPARATOR+METERS,
                                              "NOISE DELAY"+SEPARATOR+SECONDS};

  public static final String[] BLEEDOUT =    {ACTIVE_PLACEHOLDER,
                                              "DAMAGE INCREASE"+SEPARATOR+PRC_10SEC,
                                              "CROUCH THRESHOLD",
                                              "PRONE THRESHOLD",
                                              "WOUNDED THRESHOLD",
                                              "HEARTBEAT EFFECT",
                                              "SELF HEAL"};

  public static final String[] BOATS =       {ACTIVE_PLACEHOLDER,
                                              "INITIAL DELAY"+SEPARATOR+SECONDS,
                                              "SPAWN RADIUS"+SEPARATOR+METERS,
                                              "WAYPOINTS",
                                              "MAXIMUM BOATS"+SEPARATOR+VEHICLES};

  public static final String[] CARS =        {ACTIVE_PLACEHOLDER,
                                              "INITIAL DELAY"+SEPARATOR+SECONDS,
                                              "WAYPOINTS",
                                              "MAXIMUM CARS"+SEPARATOR+VEHICLES,
                                              "SPAWN RADIUS"+SEPARATOR+METERS,
                                              "NO COMBAT SPAWN"};

  public static final String[] CIVS =        {ACTIVE_PLACEHOLDER,
                                              "INITIAL DELAY"+SEPARATOR+SECONDS,
                                              "SPAWN RADIUS"+SEPARATOR+METERS,
                                              "WAYPOINTS",
                                              "DENSITY"+SEPARATOR+HOUSE_NPC,
                                              "SQUAD COLLATERAL"+SEPARATOR+NPC,
                                              "ALL COLLATERAL"+SEPARATOR+NPC,
                                              "COLLATERAL EVENT",
                                              "MAXIMUM CIVILIANS"+SEPARATOR+NPC,
                                              "INTERACT RADIUS"+SEPARATOR+METERS,
                                              "NO COMBAT SPAWN"};

  public static final String[] EBS =         {ACTIVE_PLACEHOLDER,
                                              "BULLET THRESHOLD"+SEPARATOR+BUL_5SEC,
                                              "INITIAL DELAY"+SEPARATOR+SECONDS,
                                              "DEBUG",
                                              "ACTIVE RADIUS"+SEPARATOR+METERS,
                                              "PLAYER SUPPRESSION",
                                              "AI SUPPRESSION",
                                              "COVER ALGORITHMS",
                                              "DETECTION TYPE"};

  public static final String[] FALL =         {ACTIVE_PLACEHOLDER,
                                               "SENSITIVITY"+SEPARATOR+PERCENTAGE,
                                               "ACTIVE RADIUS"+SEPARATOR+METERS,
                                               "INITIAL DELAY"+SEPARATOR+SECONDS,
                                               "RAGDOLL",
                                               "INCAPACITATED TIME"+SEPARATOR+SECONDS,
                                               "PLAYER FALL",
                                               "BULLET REACTION"};

  public static final String[] FOG =          {ACTIVE_PLACEHOLDER,
                                               "ACTIVE RADIUS"+SEPARATOR+METERS,
                                               "INITIAL DELAY"+SEPARATOR+SECONDS,
                                               "BREATH FOG",
                                               "GROUND FOG",
                                               "RAIN FOG",
                                               "HEAT HAZE",
                                               "SNOW"};

  public static final String[] HOUSELIGHTS =  {ACTIVE_PLACEHOLDER,
                                               "INITIAL DELAY"+SEPARATOR+SECONDS};

  public static final String[] HUD =          {ACTIVE_PLACEHOLDER,
                                               "RANGE",
                                               "VEHICLE RANGE FACTOR",
                                               "HUD",
                                               "FRIENDLIES",
                                               "CIVILIANS",
                                               "ENEMIES",
                                               "SQUAD",
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
                                               "WARNING TONE",
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

  public static final String[] LOS =          {ACTIVE_PLACEHOLDER,
                                               "DEBUG",
                                               "MAXIMUM DISTANCE"+SEPARATOR+METERS,
                                               "MINIMUM DISTANCE"+SEPARATOR+METERS,
                                               "INITIAL DELAY"+SEPARATOR+SECONDS};

  public static final String[] PARK =         {ACTIVE_PLACEHOLDER,
                                               "DENSITY"+SEPARATOR+PRC_HOUSE,
                                               "SPAWN DISTANCE"+SEPARATOR+METERS,
                                               "HIDE DISTANCE"+SEPARATOR+METERS,
                                               "SIMULATION DISTANCE"+SEPARATOR+METERS,
                                               "MAXIMUM PARKED CARS"+SEPARATOR+VEHICLES};

  public static final String[] RADIO =        {ACTIVE_PLACEHOLDER,
                                               "HOUSES",
                                               "CARS",
                                               "INTERVAL"+SEPARATOR+SECONDS};

  public static final String[] RAIN_FX =      {ACTIVE_PLACEHOLDER};

  public static final String[] SKIRMISH =     {ACTIVE_PLACEHOLDER,
                                               "ENEMY SQUADS"+SEPARATOR+NPC,
                                               "ENEMY VEHICLES"+SEPARATOR+VEHICLES,
                                               "FRIENDLY SQUADS"+SEPARATOR+NPC,
                                               "FRIENDLY VEHICLES"+SEPARATOR+VEHICLES,
                                               "MINIMUM DISTANCE"+SEPARATOR+METERS,
                                               "MAXIMUM DISTANCE"+SEPARATOR+METERS,
                                               "NATO SUPPORT",
                                               "FRIENDLY FACTION",
                                               "ENEMY FACTION",
                                               "SPAWN DELAY"+SEPARATOR+SECONDS,
                                               "FRIENDLY UNIT STRING",
                                               "FRIENDLY VEHICLE STRING",
                                               "ENEMY UNIT STRING",
                                               "ENEMY VEHICLE STRING"};

  public static final String[] STREETLIGHTS = {ACTIVE_PLACEHOLDER,
                                               "BRIGHTNESS",
                                               "RANGE"+SEPARATOR+METERS,
                                               "COLOR",
                                               "MOTHS"};

  public static final String[] ANIMATIONS =   {ACTIVE_PLACEHOLDER,
                                               "RUN",
                                               "TACTICAL RUN",
                                               "TACTICAL JOG",
                                               "WALK UNARMED",
                                               "WALK AT EASE",
                                               "WALK AIMING",
                                               "ROLL LEFT",
                                               "ROLL RIGHT"};

  public static final String[] AIR_EXCLUDE =        {"NO EXCLUSIONS",
                                                     "CIVILIAN",
                                                     "MILITARY"};

  public static final String[] CIVS_CAS_DISPLAY =   {"NOTHING",
                                                     "MESSAGE",
                                                     "END MISSION"};

  public static final String[] EBS_SUPTYPE =        {"BULLET CENTRIC",
                                                     "ENTITY CENTRIC"};

  public static final String[] SKIRMISH_FRIENDLY =  {"CUSTOM",
                                                     "NATO",
                                                     "FIA",
                                                     "AAF"};

  public static final String[] SKIRMISH_ENEMY =     {"CUSTOM",
                                                     "CAF AGGRESSORS",
                                                     "CSAT",
                                                     "AAF",
                                                     "CMP ARID",
                                                     "CMP SEMIARID",
                                                     "CMP URBAN",
                                                     "ISIS",
                                                     "ISIS 2035"};

  public static final String[] STREETLIGHTS_COLOR = {"WHITE INCANDESCENT",
                                                     "YELLOW SODIUM",
                                                     "BLUE FLUORESCENT"};
  }