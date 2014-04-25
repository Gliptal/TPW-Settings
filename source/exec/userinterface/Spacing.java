package exec.userinterface;

import gui.*;
import javax.swing.*;
import mods.*;


public class Spacing
  {
  private static final int BASE_SPACING = 12;

  public static final int WINDOW_OUTER = 2*BASE_SPACING;
  public static final int WINDOW_INNER = 4*BASE_SPACING;
  public static final int GRID_BUTTONS = 2*BASE_SPACING;
  public static final int COMBINATIONS = 1*BASE_SPACING;
  public static final int GRID_PARAMETERS_X = 5*BASE_SPACING;
  public static final int GRID_PARAMETERS_Y = 2*BASE_SPACING;

  public static final int PARAMETERS_ROWS = 6;
  public static final int PARAMETERS_COLUMNS = 5;
  public static final String ACTIVE_PLACEHOLDER = "";

  public static final String BUTTON_LABEL_WIDTH = "        ";

  public static JPanel createPlaceholder()
    {
    return new JPanel();
    }

  public static void addPlaceholdersToModWindow(ModWindow modWindow, Object[] parameters)
    {
    for (int i = 0; i < PARAMETERS_ROWS*PARAMETERS_COLUMNS-parameters.length-1; i += 1)
      modWindow.addPlaceHolder();
    }
  }