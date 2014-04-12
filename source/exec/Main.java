package exec;

import exec.mods.*;
import gui.*;
import gui.factories.*;
import javax.swing.*;


public class Main
  {
  public static MainWindow mainWindow;
  public static ModWindow[] modWindows;

  private Main()
    {
    setOwnLookAndFeel();

    createAndShowMainWindow();
    createModWindows();
    }

  private void setOwnLookAndFeel()
    {
     try
      {
      UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
      }
    catch (UnsupportedLookAndFeelException | ClassNotFoundException | InstantiationException | IllegalAccessException except) {}
    }

  private void createAndShowMainWindow()
    {
    mainWindow = new MainWindow();
    mainWindow.setVisible(true);
    }

  private void createModWindows()
    {
    modWindows = new ModWindow[CommonMod.NUMBER_OF_MODS];

    for (int i = 0; i < CommonMod.NUMBER_OF_MODS; i += 1)
      modWindows[i] = new ModWindow(CommonMod.MOD_NAMES[i]);

    createAndAddParameters();
    }

  private void createAndAddParameters()
    {
    AirFactory.fillWindowWithParameters(modWindows[CommonMod.AIR_WINDOW_ID]);
    AnimalsFactory.fillWindowWithParameters(modWindows[CommonMod.ANIMALS_WINDOW_ID]);
    }

  public static void main(String[] args)
    {
    Main exec = new Main();
    }
  };