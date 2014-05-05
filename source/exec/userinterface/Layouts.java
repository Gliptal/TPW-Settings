package exec.userinterface;

import java.awt.*;

import static exec.userinterface.Spacing.*;


public class Layouts
  {
  public static final String JAVA_CLASSPATH = "java.awt.";

  private static final int ONE_ROW = 1;
  private static final int FOUR_ROWS = 4;
  private static final int FIVE_ROWS = 5;

  private static final int TWO_SLOTS = 2;
  private static final int THREE_SLOTS = 3;
  private static final int FOUR_SLOTS = 4;
  private static final int FIVE_SLOTS = 5;

  public static LayoutManager MAIN()
    {
    return new BorderLayout(WINDOW_INNER, WINDOW_INNER);
    }

  public static LayoutManager COMMITS()
    {
    return new GridLayout(ONE_ROW, THREE_SLOTS, GRID_BUTTONS, GRID_BUTTONS);
    }

  public static LayoutManager PRESETS()
    {
    return new GridLayout(ONE_ROW, FOUR_SLOTS, GRID_BUTTONS, GRID_BUTTONS);
    }

  public static LayoutManager MODS_GRID()
    {
    return new GridLayout(FOUR_ROWS, FOUR_SLOTS, GRID_BUTTONS, GRID_BUTTONS);
    }

  public static LayoutManager MOD_GENERAL()
    {
    return new GridLayout(ONE_ROW, THREE_SLOTS, GRID_PARAMETERS_X, GRID_PARAMETERS_Y);
    }

  public static LayoutManager MOD_PARAMETERS()
    {
    return new GridLayout(FIVE_ROWS, TWO_SLOTS, GRID_PARAMETERS_X, GRID_PARAMETERS_Y);
    }

  public static LayoutManager HUD_PARAMETERS()
    {
    return new BorderLayout(WINDOW_INNER, WINDOW_INNER);
    }

  public static LayoutManager HUD_SECTIONS()
    {
    return new GridLayout(ONE_ROW, FIVE_SLOTS, GRID_BUTTONS, GRID_BUTTONS);
    }

  public static LayoutManager HUD_SECTION_GENERAL()
    {
    return new GridLayout(FIVE_ROWS, TWO_SLOTS, GRID_PARAMETERS_X, GRID_PARAMETERS_Y);
    }

  public static LayoutManager HUD_SECTION_COLOR()
    {
    return new GridLayout(FIVE_ROWS, TWO_SLOTS, GRID_PARAMETERS_X, GRID_PARAMETERS_Y);
    }

  public static LayoutManager HUD_SECTION_POSITIONING()
    {
    return new GridLayout(FOUR_ROWS, FOUR_SLOTS, GRID_PARAMETERS_X, GRID_PARAMETERS_Y);
    }

  public static LayoutManager HUD_SECTION_OTHER()
    {
    return new GridLayout(FIVE_ROWS, TWO_SLOTS, GRID_PARAMETERS_X, GRID_PARAMETERS_Y);
    }

  public static LayoutManager HUD_SECTION_TXT()
    {
    return new GridLayout(FIVE_ROWS, TWO_SLOTS, GRID_PARAMETERS_X, GRID_PARAMETERS_Y);
    }

  public static LayoutManager LABELED_BORDER()
    {
    return new BorderLayout(COMBINATIONS, COMBINATIONS);
    }

  public static final LayoutManager LABELED_GRID()
    {
    return new GridLayout(ONE_ROW, TWO_SLOTS, COMBINATIONS, COMBINATIONS);
    }
  }