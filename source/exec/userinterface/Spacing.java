package exec.userinterface;

import java.awt.*;
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

  public static JPanel createPlaceholder()
    {
    return new JPanel();
    }

  public static void fillGridWithPlaceholders(JPanel panel)
    {
    GridLayout gridLayout = (GridLayout)panel.getLayout();

    int rows = gridLayout.getRows();
    int columns = gridLayout.getColumns();
    int components = panel.getComponentCount();

    for (int i = 0; i < rows*columns - components; i += 1)
      panel.add(new JPanel());
    }
  }