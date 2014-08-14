package exec.laf;

import java.awt.*;

import static exec.laf.Spacing.*;
import gui.choosers.*;


public class Layouts
  {
  public static LayoutManager FRAME_COMMON()
    {
    return new BorderLayout(FRAME_INNER, FRAME_INNER);
    }

  public static LayoutManager FRAME_COMMON_COMMITS()
    {
    return new GridLayout(1, 3, BUTTONS, BUTTONS);
    }

  public static LayoutManager LABELED_BUTTON()
    {
    return new BorderLayout(COMBINATIONS, COMBINATIONS);
    }

  public static LayoutManager LABELED_CHECKBOX()
    {
    return new GridLayout(1, 1);
    }

  public static LayoutManager LABELED_TEXTFIELD()
    {
    return new GridLayout(1, 2, COMBINATIONS, COMBINATIONS);
    }

  public static LayoutManager PARAMETER()
    {
    return new GridLayout(1, 2, COMBINATIONS, COMBINATIONS);
    }

  public static LayoutManager FRAME_MAIN_PRESETS()
    {
    return new GridLayout(1, 4, BUTTONS, BUTTONS);
    }

  public static LayoutManager FRAME_MAIN_MODS()
    {
    return new GridLayout(5, 4, BUTTONS, BUTTONS);
    }

  public static LayoutManager FRAME_MOD_GENERAL()
    {
    return new GridLayout(1, 3, FRAME_INNER, BASIC);
    }

  public static LayoutManager FRAME_MOD_PARAMETERS()
    {
    return new GridLayout(5, 2, PARAMETERS_X, PARAMETERS_Y);
    }

  public static LayoutManager FRAME_SKIRMISH_PARAMETERS()
    {
    return new GridLayout(7, 2, PARAMETERS_X, PARAMETERS_Y);
    }

  public static LayoutManager FRAME_HUD_INNER()
    {
    return new BorderLayout(BASIC, BASIC);
    }

  public static LayoutManager FRAME_HUD_SECTIONS()
    {
    return new GridLayout(1, 4, BUTTONS, BUTTONS);
    }

  public static LayoutManager FRAME_HUD_SECTION_GENERAL()
    {
    return new GridLayout(5, 2, PARAMETERS_X, PARAMETERS_Y);
    }

  public static LayoutManager FRAME_HUD_SECTION_COLOR()
    {
    return new GridLayout(5, 2, PARAMETERS_X, PARAMETERS_Y);
    }

  public static LayoutManager FRAME_HUD_SECTION_GRAPHICS()
    {
    return new GridLayout(5, 3, PARAMETERS_X, PARAMETERS_Y);
    }

  public static LayoutManager FRAME_HUD_SECTION_TXT()
    {
    return new GridLayout(5, 2, PARAMETERS_X, PARAMETERS_Y);
    }

  public static LayoutManager FRAME_CHOOSER()
    {
    return new BorderLayout(BASIC, BASIC);
    }

  public static LayoutManager FRAME_CHOOSER_SLIDERS()
    {
    return new GridLayout(3, 1, BASIC, BASIC);
    }

  public static LayoutManager FRAME_CHOOSER_CHECKBOXES()
    {
    return new GridLayout(IconChooser.ICON_TYPES, 1, BASIC, BASIC);
    }

  public static LayoutManager FRAME_CHOOSER_ICONS()
    {
    return new GridLayout(6, 6, ICON, ICON);
    }
  }