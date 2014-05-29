package fileio;


public class FileTemplate
  {
  protected static final String[] HEADER = {"//",
                                            "// File created with TPW Settings. All comments are missing.",
                                            "//",
                                            "// It is not advisable to manually edit this file (unless instructed so), since it may break parsing.",
                                            "//",
                                            "//><",
                                            "tpw_hint_active = 1;"};

  protected static final String[] AIR = {"tpw_air_active = ",
                                         "tpw_air_delay = ",
                                         "tpw_air_time = ",
                                         "tpw_air_max = ",
                                         "tpw_air_heights[] = ",
                                         "tpw_air_exclude = "};

  protected static final String[] ANIMALS = {"tpw_animal_active = ",
                                             "tpw_animal_delay = ",
                                             "tpw_animal_max = ",
                                             "tpw_animal_maxradius = ",
                                             "tpw_animal_minradius = ",
                                             "tpw_animal_noisetime = "};

  protected static final String[] BLEEDOUT = {"tpw_bleedout_active = ",
                                              "tpw_bleedout_inc = ",
                                              "tpw_bleedout_cthresh = ",
                                              "tpw_bleedout_pthresh = ",
                                              "tpw_bleedout_ithresh = "};

  protected static final String[] BOATS = {"tpw_boat_active = ",
                                           "tpw_boat_delay = ",
                                           "tpw_boat_radius = ",
                                           "tpw_boat_waypoints = ",
                                           "tpw_boat_num = "};

  protected static final String[] CARS = {"tpw_car_active = ",
                                          "tpw_car_delay = ",
                                          "tpw_car_waypoints = ",
                                          "tpw_car_num = ",
                                          "tpw_car_radius = ",
                                          "tpw_car_nocombatspawn = "};

  protected static final String[] CIVS = {"tpw_civ_active = ",
                                          "tpw_civ_delay = ",
                                          "tpw_civ_radius = ",
                                          "tpw_civ_waypoints = ",
                                          "tpw_civ_density = ",
                                          "tpw_civ_maxsquadcas = ",
                                          "tpw_civ_maxallcas = ",
                                          "tpw_civ_casdisplay = ",
                                          "tpw_civ_maxciv = ",
                                          "tpw_civ_interact = ",
                                          "tpw_civ_nocombatspawn = "};

  protected static final String[] EBS = {"tpw_ebs_active = ",
                                         "tpw_ebs_thresh = ",
                                         "tpw_ebs_delay = ",
                                         "tpw_ebs_debug = ",
                                         "tpw_ebs_radius = ",
                                         "tpw_ebs_playersup = ",
                                         "tpw_ebs_aisup = ",
                                         "tpw_ebs_findcover = "};

  protected static final String[] FALL = {"tpw_fall_active = ",
                                          "tpw_fall_sensitivity = ",
                                          "tpw_fall_threshold = ",
                                          "tpw_fall_delay = ",
                                          "tpw_fall_ragdoll = ",
                                          "tpw_fall_falltime = ",
                                          "tpw_fall_player = "};

  protected static final String[] FOG = {"tpw_fog_active = ",
                                         "tpw_fog_radius = ",
                                         "tpw_fog_delay = ",
                                         "tpw_fog_breath = ",
                                         "tpw_fog_groundfog = ",
                                         "tpw_fog_rainfog = ",
                                         "tpw_fog_heathaze = ",
                                         "tpw_fog_cansnow = "};

  protected static final String[] HOUSELIGHTS = {"tpw_houselights_active = ",
                                                 "tpw_houselights_delay = "};

  protected static final String[] HUD = {"tpw_hud_active = ",
                                         "tpw_hud_range[] = ",
                                         "tpw_hud_vehiclefactor = ",
                                         "tpw_hud_colour[] = ",
                                         "tpw_hud_friendlycolour[] = ",
                                         "tpw_hud_civcolour[] = ",
                                         "tpw_hud_enemycolour[] = ",
                                         "tpw_hud_squadcolour[] = ",
                                         "tpw_hud_alpha = ",
                                         "tpw_hud_asl[] = ",
                                         "tpw_hud_azt[] = ",
                                         "tpw_hud_grd[] = ",
                                         "tpw_hud_lmt[] = ",
                                         "tpw_hud_tmp[] = ",
                                         "tpw_hud_hlt[] = ",
                                         "tpw_hud_rng[] = ",
                                         "tpw_hud_vel[] = ",
                                         "tpw_hud_prx[] = ",
                                         "tpw_hud_unit[] = ",
                                         "tpw_hud_offset[] = ",
                                         "tpw_hud_scale = ",
                                         "tpw_hud_textscale = ",
                                         "tpw_hud_degradation = ",
                                         "tpw_hud_thirdperson = ",
                                         "tpw_hud_addtac = ",
                                         "tpw_hud_audible = ",
                                         "tpw_hud_icons[] = ",
                                         "tpw_hud_asl_txt = ",
                                         "tpw_hud_azt_txt = ",
                                         "tpw_hud_grd_txt = ",
                                         "tpw_hud_lmt_txt = ",
                                         "tpw_hud_tmp_txt = ",
                                         "tpw_hud_hlt_txt = ",
                                         "tpw_hud_rng_txt = ",
                                         "tpw_hud_vel_txt = ",
                                         "tpw_hud_airvel_txt = ",
                                         "tpw_hud_prx_txt = "};

  protected static final String[] LOS = {"tpw_los_active = ",
                                         "tpw_los_debug = ",
                                         "tpw_los_maxdist = ",
                                         "tpw_los_mindist = ",
                                         "tpw_los_delay = "};

  protected static final String[] PARK = {"tpw_park_active = ",
                                          "tpw_park_perc = ",
                                          "tpw_park_createdist = ",
                                          "tpw_park_hidedist = ",
                                          "tpw_park_simdist = ",
                                          "tpw_park_max = "};

  protected static final String[] RADIO = {"tpw_radio_active = ",
                                           "tpw_radio_house = ",
                                           "tpw_radio_car = ",
                                           "tpw_radio_time = "};

  protected static final String[] RAIN_FX = {"tpw_rain_active = "};

  protected static final String[] SKIRMISH = {"tpw_skirmish_active = ",
                                              "tpw_skirmish_enemysquad_max = ",
                                              "tpw_skirmish_enemyvehicles_max = ",
                                              "tpw_skirmish_friendlysquad_max = ",
                                              "tpw_skirmish_friendlyvehicles_max = ",
                                              "tpw_skirmish_minspawnradius = ",
                                              "tpw_skirmish_maxspawnradius = ",
                                              "tpw_skirmish_support = ",
                                              "tpw_skirmish_friendlytype = ",
                                              "tpw_skirmish_enemytype = "};

  protected static final String[] STREETLIGHTS = {"tpw_streetlights_active = ",
                                                  "tpw_streetlights_factor = ",
                                                  "tpw_streetlights_range = ",
                                                  "tpw_streetlights_colour = ",
                                                  "tpw_streetlights_moths = "};

  protected static final String[][] MOD_SECTIONS = {AIR,
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
                                                    STREETLIGHTS};
  }