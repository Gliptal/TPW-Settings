package exec.theme;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

import mods.*;
import static exec.theme.Spacings.*;


public abstract class Layouts
  {
  public static LayoutManager WINDOW()
    {
    return new BorderLayout(FRAME_INNER, FRAME_INNER);
    }

  public static LayoutManager COMMITS()
    {
    return new GridLayout(1, 3, BUTTON, BUTTON);
    }

  public static LayoutManager LABELED_BUTTON()
    {
    return new BorderLayout(COMBINATION, COMBINATION);
    }

  public static LayoutManager LABELED_CHECKBOX()
    {
    return new GridLayout(1, 1);
    }

  public static LayoutManager LABELED_TEXTFIELD()
    {
    return new GridLayout(1, 2, COMBINATION, COMBINATION);
    }

  public static LayoutManager PARAMETER()
    {
    return new GridLayout(1, 2, COMBINATION, COMBINATION);
    }

  public static LayoutManager PRESETS()
    {
    return new GridLayout(1, 4, BUTTON, BUTTON);
    }

  public static LayoutManager MODS_GRID()
    {
    return new GridLayout(5, 4, BUTTON, BUTTON);
    }

  public static LayoutManager MOD_GENERAL()
    {
    return new GridLayout(1, 3, BUTTON, BUTTON);
    }

  public static LayoutManager PARAMETERS_GRID()
    {
    return new GridLayout(7, 2, PARAMETER_X, PARAMETER_Y);
    }

  public static LayoutManager HUD_TABBED()
    {
    return new BorderLayout(BASIC, BASIC);
    }

  public static LayoutManager HUD_TABS()
    {
    return new GridLayout(1, 4, BUTTON, BUTTON);
    }

  public static LayoutManager CHOOSER()
    {
    return new BorderLayout(FRAME_OUTER, FRAME_OUTER);
    }

  public static LayoutManager CHOOSER_SLIDERS()
    {
    return new GridLayout(3, 1, BASIC, BASIC);
    }

  public static LayoutManager CHOOSER_CHECKBOXES()
    {
    return new GridLayout(Mods.ICON_TYPES, 1, BASIC, BASIC);
    }

  public static LayoutManager CHOOSER_ICONS()
    {
    return new GridLayout(6, 6, ICON, ICON);
    }

  public static Border summonFrameBorder()
    {
    return new EmptyBorder(FRAME_OUTER, FRAME_OUTER, FRAME_OUTER, FRAME_OUTER);
    }

  public static Border summonTitleBorder()
    {
    return new EmptyBorder(0, TITLE, 0, 0);
    }

  public static Border summonHintsBorder()
    {
    return new EmptyBorder(0, 48, FRAME_OUTER, 48);
    }

  public static JPanel summonPlaceholder()
    {
    return new JPanel();
    }

  public static void fillWithPlaceholders(JPanel panel)
    {
    GridLayout gridLayout = (GridLayout)(panel.getLayout());
    int rows    = gridLayout.getRows();
    int columns = gridLayout.getColumns();
    int filled  = panel.getComponentCount();

    for (int i = 0; i < rows*columns - filled; i += 1)
      panel.add(summonPlaceholder());
    }
  }