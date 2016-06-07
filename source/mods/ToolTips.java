package mods;


public abstract class ToolTips
  {
  private static final String OPEN  = "<html><p width=\"400\">";
  private static final String CLOSE = "</html>";

  public static final String[] MODS =          {"Ambient aircraft flybys.",
                                                "Ambient animal life.",
                                                "Simulates basic bleeding effects.",
                                                "Ambient civilian boats.",
                                                "Ambient civilian traffic.",
                                                "Ambient civilian pedestrians.",
                                                "Bullet-centric suppression effects.",
                                                "Falling and bullet impacts behaviour for chatters.",
                                                "Haze, fog and snow weather effects.",
                                                "Ambient house lighting.",
                                                "Comprehensive tactical HUD.",
                                                "CQB line of sight enhancements for the AI (deprecated).",
                                                "Ambient parked cars.",
                                                "Ambient radio chatter and music.",
                                                "Rain droplet effects.",
                                                "Ambient skirmishes generation.",
                                                "Sonic ambience program.",
                                                "Working streetlights.",
                                                "Speed of some charachter animations."};

  private static final String[] AIR =          {OPEN+"Time delay before the module starts."+CLOSE,
                                                OPEN+"Maximum time delay between subsequent flybys."+CLOSE,
                                                OPEN+"Maximum number of spawned aircrafts present at any given time."+CLOSE,
                                                OPEN+"Aircrafats will fly at one of these randomly chosen altitudes."+CLOSE,
                                                OPEN+"Aircraft types to be excluded from flybys."+CLOSE};

  private static final String[] ANIMALS =      {OPEN+"Time delay before the module starts."+CLOSE,
                                                OPEN+"Maximum number of spawned animals present at any given time."+CLOSE,
                                                OPEN+"Spawned animals beyond this distance from the player are removed."+CLOSE,
                                                OPEN+"Animals spawn beyond this distance from the player."+CLOSE,
                                                OPEN+"Maximum time delay between subsequent animal noises."+CLOSE};

  private static final String[] BLEEDOUT =     {OPEN+"The unit's damage value is increased by this amount every 10 sec."+CLOSE,
                                                OPEN+"Units damaged beyond this value are forced into a crouch stance (1: dead)."+CLOSE,
                                                OPEN+"Units damaged beyond this value are forced into a prone stance (1: dead)."+CLOSE,
                                                OPEN+"Units damaged beyond this value writhe around incapacitated (1: dead)."+CLOSE,
                                                OPEN+"The player's heartbeat is simulated with a slight screen shake."+CLOSE,
                                                OPEN+"AI units will automatically try to stop their own bleeding if equipped with First Aid Kits."+CLOSE};

  private static final String[] BOATS =        {OPEN+"Time delay before the module starts."+CLOSE,
                                                OPEN+"Boats are spawned if water is detected within this distance from the player."+CLOSE,
                                                OPEN+"Number of waypoints assigned to each spawned boat."+CLOSE,
                                                OPEN+"Maximum number of spawned boats present at any given time."+CLOSE};

  private static final String[] CARS =         {OPEN+"Time delay before the module starts."+CLOSE,
                                                OPEN+"Number of waypoints assigned to each spawned car."+CLOSE,
                                                OPEN+"Maximum number of spawned cars present at any given time."+CLOSE,
                                                OPEN+"Cars are spawned if roads are detected within this distance from the player."+CLOSE,
                                                OPEN+"Whether traffic is spawned during combat."+CLOSE};

  private static final String[] CIVS =         {OPEN+"Time delay before the module starts."+CLOSE,
                                                OPEN+"Civilians are spawned if houses are detected within this distance from the player."+CLOSE,
                                                OPEN+"Number of waypoints assigned to each spawned civilian."+CLOSE,
                                                OPEN+"Number of houses for each spawned civilian."+CLOSE,
                                                OPEN+"Civilian casualties inflicted by your squad threshold."+CLOSE,
                                                OPEN+"Total civilian casualties threshold."+CLOSE,
                                                OPEN+"Event thrown in case the casualty threshold is exceeded."+CLOSE,
                                                OPEN+"Maximum number of civilians to spawn regardless of DENSITY."+CLOSE,
                                                OPEN+"Civilians closer than this distance to each other move closer and interact (0: no interaction)."+CLOSE,
                                                OPEN+"Whether civilians are spawned during combat."+CLOSE};

  private static final String[] EBS =          {OPEN+"The fired upon unit is suppressed if at least this amount of bullets fly close to it in a 5 second interval."+CLOSE,
                                                OPEN+"Time delay before the module starts."+CLOSE,
                                                OPEN+"Colors the unit's uniform based on the amount of suppression received (green: ally | yellow: <5 bullets | red: >5 bullets)."+CLOSE,
                                                OPEN+"Suppression is not applied to units beyond this distance from the player."+CLOSE,
                                                OPEN+"Whether suppression effects are applied to the player."+CLOSE,
                                                OPEN+"Whether suppression effects are applied to the AI."+CLOSE,
                                                OPEN+"Whether AI will actively seek cover when suppressed."+CLOSE,
                                                OPEN+"Method used to detect suppression (reccomended: bullet-centric)."+CLOSE};

  private static final String[] FALL =         {OPEN+"Sensitivity of units to falls (100: default sensitivity)."+CLOSE,
                                                OPEN+"Effects are not applied to units beyond this distance from the player."+CLOSE,
                                                OPEN+"Time delay before the module starts."+CLOSE,
                                                OPEN+"Whether ragdoll animations are used when a unit is hit by a bullet."+CLOSE,
                                                OPEN+"Maximum time interval a unit will remain incapacitated after being hit by a bullet."+CLOSE,
                                                OPEN+"Whether the player can fall becaise of bullet hits or large height drops."+CLOSE,
                                                OPEN+"Whether units react to bullets that hit them."+CLOSE};

  private static final String[] FOG =          {OPEN+"Breath effects are not applied to units beyond this distance from the player."+CLOSE,
                                                OPEN+"Time delay before the module starts."+CLOSE,
                                                OPEN+"Whether the foggy breath effect is enabled."+CLOSE,
                                                OPEN+"Whether the ground fog effect is enabled."+CLOSE,
                                                OPEN+"Whether the rain fog effect is enabled."+CLOSE,
                                                OPEN+"Whether the heat haze effect is enabled."+CLOSE,
                                                OPEN+"Whether the snow effect is enabled."+CLOSE};

  private static final String[] HOUSELIGHTS =  {OPEN+"Time delay before the module starts."+CLOSE};

  private static final String[] HUD =          {OPEN+"Range at which foot units are detected by the goggles. [minimum, maximum]"+CLOSE,
                                                OPEN+"Range at which vehicles are detected by the goggles is RANGE multiplied by this factor."+CLOSE,
                                                OPEN+"HUD's general elements color. Click on the field to open the color chooser."+CLOSE,
                                                OPEN+"Friendly icons color. Click on the field to open the color chooser."+CLOSE,
                                                OPEN+"Civilian icons color. Click on the field to open the color chooser."+CLOSE,
                                                OPEN+"Enemy icons color. Click on the field to open the color chooser."+CLOSE,
                                                OPEN+"Squad and marker icons color. Click on the field to open the color chooser."+CLOSE,
                                                OPEN+"Default HUD transparency. (0: invisible | 1: opaque)"+CLOSE,
                                                OPEN+"Player's height above sea level. [active, X position, Y position, text size]"+CLOSE,
                                                OPEN+"Player's gaze azimuth direction. [active, X position, Y position, text size]"+CLOSE,
                                                OPEN+"Player's GPS grid coordinates. [active, X position, Y position, text size]"+CLOSE,
                                                OPEN+"Local mean time. [active, X position, Y position, text size]"+CLOSE,
                                                OPEN+"Ambient temperature (from TPW FOG). [active, X position, Y position, text size]"+CLOSE,
                                                OPEN+"Player's health. [active, X position, Y position, text size]"+CLOSE,
                                                OPEN+"Range to the centre of the player's gaze. [active, X position, Y position, text size]"+CLOSE,
                                                OPEN+"Speed of the player, or of the player's vehicle. [active, X position, Y position, text size]"+CLOSE,
                                                OPEN+"Numbers of nearby units. [active, X position, Y position, text size]"+CLOSE,
                                                OPEN+"HUD elements for units and markers. [active, icon max size, icon min size, text size]"+CLOSE,
                                                OPEN+"HUD offset (-0.5 to 0.5). [X offset, Y offset]"+CLOSE,
                                                OPEN+"HUD scaling: the higher the value, the larger the HUD appears."+CLOSE,
                                                OPEN+"HUD text scaling: the higher the value, the larger the HUD text appears."+CLOSE,
                                                OPEN+"Whether HUD effectiveness is reduced at distance."+CLOSE,
                                                OPEN+"Whether the HUD is visible in third person mode."+CLOSE,
                                                OPEN+"Whether tactical glasses are automatically added to the player's inventory if not already present."+CLOSE,
                                                OPEN+"Whether a warning tone is played whenever an enemy is detected."+CLOSE,
                                                OPEN+"HUD icon types. Click on the field to open the icon chooser. [unit, hidden unit, vehicle, hidden vehicle, enemy unit, hidden enemy unit, enemy vehicle, hidden enemy vehicle, marker, predictor]"+CLOSE,
                                                OPEN+"Only edit this if you know what you are doing with structured text."+CLOSE,
                                                OPEN+"Only edit this if you know what you are doing with structured text."+CLOSE,
                                                OPEN+"Only edit this if you know what you are doing with structured text."+CLOSE,
                                                OPEN+"Only edit this if you know what you are doing with structured text."+CLOSE,
                                                OPEN+"Only edit this if you know what you are doing with structured text."+CLOSE,
                                                OPEN+"Only edit this if you know what you are doing with structured text."+CLOSE,
                                                OPEN+"Only edit this if you know what you are doing with structured text."+CLOSE,
                                                OPEN+"Only edit this if you know what you are doing with structured text."+CLOSE,
                                                OPEN+"Only edit this if you know what you are doing with structured text."+CLOSE,
                                                OPEN+"Only edit this if you know what you are doing with structured text."+CLOSE,
                                                OPEN+"Classnames of additional goggles you want HUD to display on e.g. {\"goggles1\",\"goggles2\"}"+CLOSE,
                                                OPEN+"Classnames of additional headgear you want HUD to display on e.g. {\"goggles1\",\"goggles2\"}"+CLOSE};

  private static final String[] LOS =          {OPEN+"Spawns blue balls above units that have line of sight to a visible enemy."+CLOSE,
                                                OPEN+"Effects are not applied to units beyond this distance from the player."+CLOSE,
                                                OPEN+"Units within this distance to each other are always considered visible."+CLOSE,
                                                OPEN+"Time delay before the module starts."+CLOSE};

  private static final String[] PARK =         {OPEN+"Percentage of houses with at least a parked car outside."+CLOSE,
                                                OPEN+"Parked cars are spawned within this distance from the player and removed past it."+CLOSE,
                                                OPEN+"Parked cars beyond this distance from the player are hidden."+CLOSE,
                                                OPEN+"Parked cars within this distance from to the player are fully simulated."+CLOSE,
                                                OPEN+"Maximum number of cars to spawn regardless of DENSITY."+CLOSE};

  private static final String[] RADIO =        {OPEN+"Maximum time interval between two radio messages."+CLOSE};

  private static final String[] RAIN_FX =      {};

  private static final String[] SKIRMISH =     {OPEN+"Maximum number of enemy squads spawned around the player."+CLOSE,
                                                OPEN+"Maximum number of enemy vehicles spawned around the player."+CLOSE,
                                                OPEN+"Maximum number of friendly squads spawned around the player."+CLOSE,
                                                OPEN+"Maximum number of friendly vehicles spawned around the player."+CLOSE,
                                                OPEN+"Units spawn beyond this distance from the player."+CLOSE,
                                                OPEN+"Spawned units beyond this distance from the player are removed."+CLOSE,
                                                OPEN+"Whether NATO units can call for support during the ingagement."+CLOSE,
                                                OPEN+"Friendly faction."+CLOSE,
                                                OPEN+"Enemy faction."+CLOSE,
                                                OPEN+"Time interval between each spawn (whether enemy, friendly, unit, or vehicle)."+CLOSE,
                                                OPEN+"Custom string to set friendly units: only valid when CUSTOM is selected in the FRIENDLY FACTION dropdown."+CLOSE,
                                                OPEN+"Custom string to set friendly vehicles: only valid when CUSTOM is selected in the FRIENDLY FACTION dropdown."+CLOSE,
                                                OPEN+"Custom string to set enemy units: only valid when CUSTOM is selected in the ENEMY FACTION dropdown."+CLOSE,
                                                OPEN+"Custom string to set enemy vehicles: only valid when CUSTOM is selected in the ENEMY FACTION dropdown."+CLOSE};

  private static final String[] SOAP =         {OPEN+"Ambient sounds volume. (between 0 and 2)"+CLOSE,
                                                OPEN+"Music volume. (between 0 and 2)"+CLOSE,
                                                OPEN+"Azan volume. (between 0 and 2)"+CLOSE,
                                                OPEN+"Houses FX volume. (between 0 and 2)"+CLOSE,
                                                OPEN+"Screams volume. (between 0 and 2)"+CLOSE,
                                                OPEN+"Number of user supplied music files in: must be placed in @TPW_MODS\\music. (0: no user music)"+CLOSE,
                                                OPEN+"Number of user supplied sound files in: must be placed in @TPW_MODS\\sounds. (0: no user sounds)"+CLOSE,
                                                OPEN+"Geographical region of the sound assets."+CLOSE,};

  private static final String[] STREETLIGHTS = {OPEN+"Brightness factor for the streetlights: a value ranging from 3 to 15 is ideal for most maps."+CLOSE,
                                                OPEN+"Only streetlights within this distance from the player will be lit."+CLOSE,
                                                OPEN+"Streetlights color."+CLOSE,
                                                OPEN+"Whether moths are spawned around the streetlights."+CLOSE};

  public static final String[] ANIMATIONS =    {OPEN+"Running animation speed when armed (default = 0.685)."+CLOSE,
                                                OPEN+"Tactical running animation speed (default = 0.786)."+CLOSE,
                                                OPEN+"Tactical jogging animation speed (default = 1.55)."+CLOSE,
                                                OPEN+"Walking animation speed when unarmed (default = 0.3)."+CLOSE,
                                                OPEN+"Walking animation speed with a rested weapon (default = 0.35)."+CLOSE,
                                                OPEN+"Walking animation speed with a ready weapon (default = 0.85)."+CLOSE,
                                                OPEN+"Rolling left animation speed (default = 1.1)."+CLOSE,
                                                OPEN+"Rolling right animation speed (default = 1.2)."+CLOSE};

  public static final String[][] MOD_TOOLTIPS = {AIR,
                                                 ANIMALS,
                                                 BLEEDOUT,
                                                 BOATS,
                                                 CARS,
                                                 CIVS,
                                                 EBS,
                                                 FALL,
                                                 FOG,
                                                 HOUSELIGHTS,
                                                 HUD,
                                                 LOS,
                                                 PARK,
                                                 RADIO,
                                                 RAIN_FX,
                                                 SKIRMISH,
                                                 SOAP,
                                                 STREETLIGHTS,
                                                 ANIMATIONS};
  }