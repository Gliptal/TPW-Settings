package exec.userinterface;

import gui.*;
import javax.swing.*;


public class Spacing
  {
  private static final int BASE_SPACING = 12;

  public static final int WINDOW_OUTER = 2*BASE_SPACING;
  public static final int WINDOW_INNER = 4*BASE_SPACING;
  public static final int GRID_BUTTONS = 2*BASE_SPACING;
  public static final int COMBINATIONS = 1*BASE_SPACING;
  public static final int GRID_PARAMETERS_X = 5*BASE_SPACING;
  public static final int GRID_PARAMETERS_Y = 2*BASE_SPACING;
  public static final String BUTTON_LABEL_WIDTH = "        ";

  public static final int PARAMETERS_ROWS = 5;
  public static final int PARAMETERS_COLUMNS = 2;
  public static final int HUD_PARAMETERS_ROWS = 6;
  public static final int HUD_PARAMETERS_COLUMNS = 6;

  public static JPanel createPlaceholder()
    {
    return new JPanel();
    }

  public static void addPlaceholdersToModWindow(ModWindow modWindow, Object[] parameters)
    {
    int maxParameters = PARAMETERS_ROWS*PARAMETERS_COLUMNS - parameters.length - 1;

    if (maxParameters < 0)
      maxParameters = HUD_PARAMETERS_ROWS*HUD_PARAMETERS_COLUMNS - parameters.length - 1;

    for (int i = 0; i < maxParameters; i += 1)
      modWindow.addPlaceHolder();
    }
  }