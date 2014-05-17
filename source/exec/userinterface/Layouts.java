package exec.userinterface;

import java.awt.*;

import static exec.userinterface.Spacing.*;


public class Layouts
  {
  public static final String JAVA_CLASSPATH = "java.awt.";

  public static LayoutManager LABELED_BORDER()
    {
    return new BorderLayout(COMBINATIONS, COMBINATIONS);
    }

  public static LayoutManager LABELED_GRID()
    {
    return new GridLayout(1, 2, COMBINATIONS, COMBINATIONS);
    }

  public static LayoutManager COMMON()
    {
    return new BorderLayout(WINDOW_INNER, WINDOW_INNER);
    }

  public static LayoutManager COMMON_COMMITS()
    {
    return new GridLayout(1, 3, BUTTONS, BUTTONS);
    }

  public static LayoutManager MAIN_PRESETS()
    {
    return new GridLayout(1, 4, BUTTONS, BUTTONS);
    }

  public static LayoutManager MAIN_MODS()
    {
    return new GridLayout(4, 4, BUTTONS, BUTTONS);
    }

  public static LayoutManager MOD()
    {
    return new GridLayout(1, 3, PARAMETERS_X, PARAMETERS_Y);
    }

  public static LayoutManager MOD_PARAMETERS()
    {
    return new GridLayout(5, 2, PARAMETERS_X, PARAMETERS_Y);
    }

  public static LayoutManager HUD()
    {
    return new BorderLayout(WINDOW_INNER, WINDOW_INNER);
    }

  public static LayoutManager HUD_SECTIONS()
    {
    return new GridLayout(1, 5, BUTTONS, BUTTONS);
    }

  public static LayoutManager HUD_SECTION_GENERAL()
    {
    return new GridLayout(5, 2, PARAMETERS_X, PARAMETERS_Y);
    }

  public static LayoutManager HUD_SECTION_COLOR()
    {
    return new GridLayout(5, 2, PARAMETERS_X, PARAMETERS_Y);
    }

  public static LayoutManager HUD_SECTION_GRAPHICS()
    {
    return new GridLayout(4, 4, PARAMETERS_X, PARAMETERS_Y);
    }

  public static LayoutManager HUD_SECTION_TXT()
    {
    return new GridLayout(5, 2, PARAMETERS_X, PARAMETERS_Y);
    }

  public static LayoutManager CHOOSER()
    {
    return new BorderLayout(WINDOW_INNER, WINDOW_INNER);
    }

  public static LayoutManager CHOOSER_SLIDERS()
    {
    return new GridLayout(3, 1, PARAMETERS_X, PARAMETERS_Y);
    }
  }