package exec.theme;


public abstract class Spacings
  {
  private static final int    CORE        = 12;
  private static final String CORE_STRING = "        ";

  public static final int    BASIC         = 2*CORE;
  public static final int    TITLE         = 16*CORE;
  public static final int    FRAME_OUTER   = 2*CORE;
  public static final int    FRAME_INNER   = 4*CORE;
  public static final int    COMBINATION   = 1*CORE;
  public static final int    BUTTON        = 2*CORE;
  public static final int    PARAMETER_X   = 5*CORE;
  public static final int    PARAMETER_Y   = 2*CORE;
  public static final int    ICON          = CORE/6;
  public static final String SEMAPHORE     = CORE_STRING;
  public static final String PREVIEW_COLOR = CORE_STRING+CORE_STRING;
  }