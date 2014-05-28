package exec.laf;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;


public class Spacing
  {
  private static final int MULTIPLIER = 12;
  private static final String STRING_MULTIPLIER = "        ";

  public static final int BASIC = 2*MULTIPLIER;
  public static final int FRAME_OUTER = 2*MULTIPLIER;
  public static final int FRAME_INNER = 4*MULTIPLIER;
  public static final int COMBINATIONS = 1*MULTIPLIER;
  public static final int BUTTONS = 2*MULTIPLIER;
  public static final int PARAMETERS_X = 5*MULTIPLIER;
  public static final int PARAMETERS_Y = 2*MULTIPLIER;
  public static final int ICON = MULTIPLIER/6;
  public static final String BUTTON_LABEL_WIDTH = STRING_MULTIPLIER;
  public static final String CHOOSER_LABEL_WIDTH = STRING_MULTIPLIER+STRING_MULTIPLIER;

  public static Border summonFrameBorder()
    {
    return new EmptyBorder(FRAME_OUTER, FRAME_OUTER, FRAME_OUTER, FRAME_OUTER);
    }

  public static JPanel summonPlaceholder()
    {
    return new JPanel();
    }

  public static void addPlaceholdersToEmptySlots(JPanel panel)
    {
    GridLayout gridLayout = (GridLayout)(panel.getLayout());

    int rows = gridLayout.getRows();
    int columns = gridLayout.getColumns();
    int components = panel.getComponentCount();

    for (int i = 0; i < rows*columns - components; i += 1)
      panel.add(summonPlaceholder());
    }
  }