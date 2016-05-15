package exec;


public abstract class Text
  {
  public static final String PROGRAM         = "TPW SETTINGS";
  public static final String COLOR_CHOOSER   = "COLOR CHOOSER";
  public static final String ICON_CHOOSER    = "ICON CHOOSER";
  public static final String HINTS           = "HINTS";
  public static final String PROGRAM_VERSION = "2.1.0";

  public static final String COMMIT_POSITIVE = "APPLY";
  public static final String COMMIT_NEGATIVE = "REVERT";
  public static final String PRESETS_DELETE  = "DELETE";
  public static final String PRESETS_SAVE    = "SAVE";
  public static final String MOD_STATE       = "ACTIVE";
  public static final String BACK            = "BACK";
  public static final String HINT_NEXT       = "NEXT HINT";

  public static final String HUD_TAB_GENERAL  = "GENERAL";
  public static final String HUD_TAB_COLORS   = "COLORS";
  public static final String HUD_TAB_GRAPHICS = "GRAPHICS";
  public static final String HUD_TAB_TXT      = "TXT";

  public static final String[] ICON_CHOOSER_TYPES = {"UNIT",
                                                     "HIDDEN UNIT",
                                                     "VEHICLE",
                                                     "HIDDEN VEHICLE",
                                                     "ENEMY UNIT",
                                                     "HIDDEN ENEMY UNIT",
                                                     "ENEMY VEHICLE",
                                                     "HIDDEN ENEMY VEHICLE",
                                                     "MARKER",
                                                     "PREDICTOR"};

  public static final String[] HINTS_TEXT = {"1/9 : Quickly activate and deactivate a module by clicking on the colored area to the left of the module's button.",
                                             "2/9 : Rename a preset by saving it again with the new name and deleting the old one.",
                                             "3/9 : Any changes made are not applied until the game is restarted.",
                                             "4/9 : Exaggerating with your settings will result in large FPS drops.",
                                             "5/9 : Effectively disable the ANIMATIONS module by moving animspeed.pbo from its folder, or by deleting it entirely.",
                                             "6/9 : Tooltips on mouse hover are available for all modules and parameters, containing description and suggested values.",
                                             "7/9 : AIR, BOATS, CARS, CIVS, and SKIRMISH modules are best left disabled whenever playing the campaign, to avoid conflicts with the AI.",
                                             "8/9 : EBS module is best left disabled whenever running other AI mods, to avoid conflicts.",
                                             "9/9 : LOS module is deprecated and is best left disabled."};
  }