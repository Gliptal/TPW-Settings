package exec;

import gui.*;
import javax.swing.*;



public class Main
  {
  public static TPWWindow modListWindow;


  private Main()
    {
    customizeUI();

    modListWindow = new ModListWindow();
    modListWindow.setVisible(true);
    }

  private void customizeUI()
    {
    UIManager.put("Button.background", Ui.BUTTON_BACKGROUND);
    UIManager.put("Button.select", Ui.BUTTON_SELECT);
    UIManager.put("ComboBox.background", Ui.COMBOBOX_BACKGROUND);
    UIManager.put("ComboBox.selectionBackground", Ui.COMBOBOX_SELECTION_BACKGROUND);
    UIManager.put("ComboBox.disabledBackground", Ui.COMBOBOX_DISABLED_BACKGROUND);
    UIManager.put("ComboBox.disabledForeground", Ui.COMBOBOX_DISABLED_FOREGROUND);
    }

  public static void main(String[] args)
    {
    Main exec = new Main();
    }
  };