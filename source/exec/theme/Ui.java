package exec.theme;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;


public abstract class Ui
  {
  private static final Color  TRANSPARENT = new Color(0, 0, 0, 0);
  public static final  Color  TITLEBAR    = new Color(40, 40, 40);
  private static final Color  BASE        = new Color(45, 45, 45);
  private static final Color  DARK        = new Color(25, 25, 25);
  private static final Color  LIGHT       = new Color(65, 65, 65);
  private static final Color  FONT        = new Color(240, 240, 240);
  private static final Border FLAT        = new EmptyBorder(6, 6, 6, 6);
  private static final Border NONE        = new EmptyBorder(0, 0, 0, 0);

  public static void switchToWindowsLaF()
    {
    try
      {
      UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
      }
    catch (UnsupportedLookAndFeelException | ClassNotFoundException | InstantiationException | IllegalAccessException except) {}
    }

  public static void switchToEditedLaF()
    {
    try
      {
      UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
      }
    catch (UnsupportedLookAndFeelException | ClassNotFoundException | InstantiationException | IllegalAccessException except) {}
    }

  public static void setTheme()
    {
    themizeToolTip();
    themizePanel();
    themizeButton();
    themizeComboBox();
    themizeCheckBox();
    themizeLabel();
    themizeTextField();
    themizeSlider();
    }

  private static void themizeToolTip()
    {
    UIManager.put("ToolTip.background", DARK);
    UIManager.put("ToolTip.foreground", FONT);
    UIManager.put("ToolTip.border",     NONE);

    ToolTipManager.sharedInstance().setInitialDelay(700);
    ToolTipManager.sharedInstance().setDismissDelay(30000);
    }

  private static void themizePanel()
    {
    UIManager.put("Panel.background", BASE);
    }

  private static void themizeButton()
    {
    UIManager.put("Button.background", LIGHT);
    UIManager.put("Button.foreground", FONT);
    UIManager.put("Button.border",     FLAT);
    UIManager.put("Button.focus",      TRANSPARENT);
    UIManager.put("Button.select",     DARK);
    }

  private static void themizeComboBox()
    {
    UIManager.put("ComboBox.background",          LIGHT);
    UIManager.put("ComboBox.foreground",          FONT);
    UIManager.put("ComboBox.selectionBackground", DARK);
    UIManager.put("ComboBox.selectionForeground", FONT);
    }

  private static void themizeCheckBox()
    {
    UIManager.put("CheckBox.background", BASE);
    UIManager.put("CheckBox.foreground", FONT);
    }

  private static void themizeLabel()
    {
    UIManager.put("Label.foreground", FONT);
    }

  private static void themizeTextField()
    {
    UIManager.put("TextField.background",          DARK);
    UIManager.put("TextField.foreground",          FONT);
    UIManager.put("TextField.caretForeground",     FONT);
    UIManager.put("TextField.border",              NONE);
    UIManager.put("TextField.selectionBackground", LIGHT);
    UIManager.put("TextField.selectionForeground", FONT);
    UIManager.put("TextField.inactiveForeground",  LIGHT);
    }

  private static void themizeSlider()
    {
    UIManager.put("Slider.background", BASE);
    }
  }