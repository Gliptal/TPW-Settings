package fileio;


public class FileTemplate
  {
  protected static String[] HEADER = {"//",
                                      "// File created with TPW Settings. All comments are missing.",
                                      "//",
                                      "// It is better not to modify this file manually, because it may break TPW Setting parsing.",
                                      "//",
                                      "",
                                      "tpw_hint_active = 1;"};

  protected static String[] AIR = {"tpw_air_active = ",
                                   "tpw_air_delay = ",
                                   "tpw_air_time = ",
                                   "tpw_air_max = "};

  protected static String[] ANIMALS = {"tpw_animal_active = ",
                                       "tpw_animal_delay = ",
                                       "tpw_animal_max = ",
                                       "tpw_animal_maxradius = ",
                                       "tpw_animal_minradius = ",
                                       "tpw_animal_noisetime = "};

  protected static String[] BLEEDOUT = {"tpw_bleedout_active = ",
                                        "tpw_bleedout_inc = ",
                                        "tpw_bleedout_cthresh = ",
                                        "tpw_bleedout_pthresh = ",
                                        "tpw_bleedout_ithresh = "};

  protected static String[] BOATS = {"tpw_boat_active = ",
                                        "tpw_boat_delay = ",
                                        "tpw_boat_radius = ",
                                        "tpw_boat_waypoints = ",
                                        "tpw_boat_num = "};

  protected static String[] CARS = {"tpw_car_active = ",
                                     "tpw_car_delay = ",
                                     "tpw_car_waypoints = ",
                                     "tpw_car_num = ",
                                     "tpw_car_radius = ",
                                     "tpw_car_nocombatspawn = "};

  protected static String[] CIVS = {"tpw_civ_active = ",
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

  protected static String[] EBS = {"tpw_ebs_active = ",
                                   "tpw_ebs_thresh = ",
                                   "tpw_ebs_delay = ",
                                   "tpw_ebs_debug = ",
                                   "tpw_ebs_radius = ",
                                   "tpw_ebs_playersup = ",
                                   "tpw_ebs_aisup = ",
                                   "tpw_ebs_findcover = "};

  protected static String[] FALL = {"tpw_fall_active = ",
                                    "tpw_fall_sensitivity = ",
                                    "tpw_fall_threshold = ",
                                    "tpw_fall_delay = ",
                                    "tpw_fall_ragdoll = ",
                                    "tpw_fall_falltime = "};

  protected static String[] FOG = {"tpw_fog_active = ",
                                   "tpw_fog_radius = ",
                                   "tpw_fog_delay = ",
                                   "tpw_fog_breath = ",
                                   "tpw_fog_groundfog = ",
                                   "tpw_fog_rainfog = ",
                                   "tpw_fog_heathaze = ",
                                   "tpw_fog_cansnow = "};

  protected static String[] HOUSELIGHTS = {"tpw_houselights_active = ",
                                           "tpw_houselights_delay = "};

  protected static String[] HUD = {"tpw_hud_active = 1;",
                                   "tpw_hud_range[] = {25,500};",
                                   "tpw_hud_colour[] = {1,1,1};",
                                   "tpw_hud_enemycolour[] = {1,0.5,0};",
                                   "tpw_hud_squadcolour[] = {0,1,1};",
                                   "tpw_hud_alpha = 0.6;",
                                   "tpw_hud_asl[] = {1,0.6,0.45,1};",
                                   "tpw_hud_azt[] = {1,0.5,0.45,1};",
                                   "tpw_hud_grd[] = {1,0.4,0.45,1};",
                                   "tpw_hud_lmt[] = {1,0.4,0.5,1};",
                                   "tpw_hud_tmp[] = {1,0.6,0.5,1};",
                                   "tpw_hud_hlt[] = {1,0.4,0.55,1};",
                                   "tpw_hud_rng[] = {1,0.5,0.55,1};",
                                   "tpw_hud_vel[] = {1,0.6,0.55,1};",
                                   "tpw_hud_unit[] = {1,2,0.5,0.75};",
                                   "tpw_hud_offset[] = {0.35,0.28};",
                                   "tpw_hud_scale = 0.8;",
                                   "tpw_hud_textscale = 1;"};

  protected static String[] LOS = {"tpw_los_active = ",
                                   "tpw_los_debug = ",
                                   "tpw_los_maxdist = ",
                                   "tpw_los_mindist = ",
                                   "tpw_los_delay = "};

  protected static String[] PARK = {"tpw_park_active = ",
                                    "tpw_park_perc = ",
                                    "tpw_park_createdist = ",
                                    "tpw_park_hidedist = ",
                                   "tpw_park_simdist = ",
                                    "tpw_park_max = "};

  protected static String[] RADIO = {"tpw_radio_active = ",
                                     "tpw_radio_house = ",
                                     "tpw_radio_car = ",
                                     "tpw_radio_time = "};

  protected static String[] RAIN_FX = {"tpw_rain_active = "};

  protected static String[] STREETLIGHTS = {"tpw_streetlights_active = ",
                                            "tpw_streetlights_factor = ",
                                            "tpw_streetlights_range = ",
                                            "tpw_streetlights_colour = ",
                                            "tpw_streetlights_moths = "};
  }