package exec;

import gui.*;
import gui.combinations.*;
import javax.swing.*;
import mods.*;
import mods.factories.*;


public class Main
  {
  public static MainWindow mainWindow;
  public static ModWindow[] modWindows;

  public static void main(String[] args)
    {
    Main exec = new Main();
    }

  private Main()
    {
    setSystemLookAndFeel();

    createAndShowMainWindow();
    createModWindows();
    setUpSubscriptions();
    }

  private void setSystemLookAndFeel()
    {
    try
      {
      UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
      }
    catch (UnsupportedLookAndFeelException | ClassNotFoundException | InstantiationException | IllegalAccessException except)
      {
      }
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

  private void setUpSubscriptions()
    {
    for (int i = 0; i < CommonMod.NUMBER_OF_MODS; i += 1)
      connectModButtonToCheckBox(mainWindow.getModButton(i), modWindows[i].getCheckBox());
    }

  private void createAndAddParameters()
    {
    AirFactory.addParametersToWindow(modWindows[CommonMod.AIR_WINDOW_ID]);
    AnimalsFactory.addParametersToWindow(modWindows[CommonMod.ANIMALS_WINDOW_ID]);
    BleedoutFactory.addParametersToWindow(modWindows[CommonMod.BLEEDOUT_WINDOW_ID]);
    BoatsFactory.addParametersToWindow(modWindows[CommonMod.BOATS_WINDOW_ID]);
    CarsFactory.addParametersToWindow(modWindows[CommonMod.CARS_WINDOW_ID]);
    CivsFactory.addParametersToWindow(modWindows[CommonMod.CIVS_WINDOW_ID]);
    EbsFactory.addParametersToWindow(modWindows[CommonMod.EBS_WINDOW_ID]);
    FallFactory.addParametersToWindow(modWindows[CommonMod.FALL_WINDOW_ID]);
    FogFactory.addParametersToWindow(modWindows[CommonMod.FOG_WINDOW_ID]);
    HouselightsFactory.addParametersToWindow(modWindows[CommonMod.HOUSELIGHTS_WINDOW_ID]);
    LosFactory.addParametersToWindow(modWindows[CommonMod.LOS_WINDOW_ID]);
    ParkFactory.addParametersToWindow(modWindows[CommonMod.PARK_WINDOW_ID]);
    RadioFactory.addParametersToWindow(modWindows[CommonMod.RADIO_WINDOW_ID]);
    RainFxFactory.addParametersToWindow(modWindows[CommonMod.RAINFX_WINDOW_ID]);
    StreetlightsFactory.addParametersToWindow(modWindows[CommonMod.STREETLIGHTS_WINDOW_ID]);
    }

  private void connectModButtonToCheckBox(LabeledButton button, LabeledCheckBox checkBox)
    {
    button.connectToCheckBox(checkBox);
    }
  };