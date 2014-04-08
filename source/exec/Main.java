package exec;

import exec.mods.*;
import gui.*;
import javax.swing.*;


public class Main
  {
  public static CommonWindow modListWindow;

  public static ModWindow[] modWindows;

  private Main()
    {
    setOwnLookAndFeel();

    createAndShowMainWindow();
    createModWindows();
    }

  private void createAndShowMainWindow()
    {
    modListWindow = new ModListWindow();
    modListWindow.setVisible(true);
    }

  private void createModWindows()
    {
    modWindows = new ModWindow[CommonMod.NUMBER_OF_MODS];

    for (int i = 0; i < CommonMod.NUMBER_OF_MODS; i += 1)
      modWindows[i] = new ModWindow(CommonMod.MOD_NAMES[i]);
    }

  private void setOwnLookAndFeel()
    {
     try
      {
      UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
      }
    catch (UnsupportedLookAndFeelException | ClassNotFoundException | InstantiationException | IllegalAccessException e) {}
    }

  public static void main(String[] args)
    {
    Main exec = new Main();
    }
  };