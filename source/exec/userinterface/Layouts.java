package exec.userinterface;

import java.awt.*;

import static exec.userinterface.Spacing.*;


public class Layouts
  {
  private static final int SINGLE_ROW = 1;
  private static final int TWO_SLOTS = 2;
  private static final int THREE_SLOTS = 3;
  private static final int FOUR_SLOTS = 4;

  private static final int SIXTEEN_GRID = 4;

  public static LayoutManager MAIN()
    {
    return new BorderLayout(Spacing.WINDOW_INNER, Spacing.WINDOW_INNER);
    }

  public static LayoutManager COMMITS()
    {
    return new GridLayout(SINGLE_ROW, THREE_SLOTS, Spacing.GRID_BUTTONS, Spacing.GRID_BUTTONS);
    }

  public static LayoutManager PRESETS()
    {
    return new GridLayout(SINGLE_ROW, FOUR_SLOTS, Spacing.GRID_BUTTONS, Spacing.GRID_BUTTONS);
    }

  public static LayoutManager MODS_GRID()
    {
    return new GridLayout(SIXTEEN_GRID, SIXTEEN_GRID, Spacing.GRID_BUTTONS, Spacing.GRID_BUTTONS);
    }

  public static LayoutManager MOD_GENERAL()
    {
    return new GridLayout(SINGLE_ROW, THREE_SLOTS, Spacing.GRID_PARAMETERS_X, Spacing.GRID_PARAMETERS_Y);
    }

  public static LayoutManager MOD_PARAMETERS()
    {
    return new GridLayout(PARAMETERS_ROWS, PARAMETERS_COLUMNS, GRID_PARAMETERS_X, GRID_PARAMETERS_Y);
    }

  public static LayoutManager HUD_PARAMETERS()
    {
    return new GridLayout(HUD_PARAMETERS_ROWS, HUD_PARAMETERS_COLUMNS, GRID_PARAMETERS_X, GRID_PARAMETERS_Y);
    }

  public static LayoutManager LABELED_BORDER()
    {
    return new BorderLayout(COMBINATIONS, COMBINATIONS);
    }

  public static final LayoutManager LABELED_GRID()
    {
    return new GridLayout(SINGLE_ROW, TWO_SLOTS, COMBINATIONS, COMBINATIONS);
    }
  }