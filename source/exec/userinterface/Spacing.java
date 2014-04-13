package exec.userinterface;

import gui.*;
import javax.swing.*;
import mods.*;


public class Spacing
  {
  public static final int WINDOW_OUTER = 24;
  public static final int WINDOW_INNER = 36;
  public static final int GRID = 24;
  public static final int COMBINATIONS = 12;

  public static final String BUTTON_LABEL_WIDTH = "      ";
  public static final int TEXT_FIELD_WIDTH = 12;

  public static JPanel createPlaceholder()
    {
    return new JPanel();
    }

  public static void addPlaceholdersToModWindow(ModWindow modWindow, String[] parameters)
    {
    for (int i = 0; i < CommonMod.MAXIMUM_PARAMETERS-parameters.length; i += 1)
      modWindow.addPlaceHolder();
    }
  }