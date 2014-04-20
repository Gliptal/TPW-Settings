package exec;

import fileio.*;
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

    loadParametersFromConfigFile();

    createModWindows();
    createAndShowMainWindow();

    setListeners();
    }

  private void setSystemLookAndFeel()
    {
    try
      {
      UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
      }
    catch (UnsupportedLookAndFeelException | ClassNotFoundException | InstantiationException | IllegalAccessException except) {}
    }

  private void loadParametersFromConfigFile()
    {
    ActionBuffer.readWholeFile(ActionBuffer.CONFIG_FILE_NAME);
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

    fillModWindowsWithParameters();
    }

  private void setListeners()
    {
    linkCheckBoxesToButtons();
    linkGuiToFile();
    }

  private void fillModWindowsWithParameters()
    {
    AirFactory.createAndAddParametersToModWindow(modWindows[CommonMod.AIR_WINDOW_ID]);
    AnimalsFactory.createAndAddParametersToModWindow(modWindows[CommonMod.ANIMALS_WINDOW_ID]);
    BleedoutFactory.createAndAddParametersToModWindow(modWindows[CommonMod.BLEEDOUT_WINDOW_ID]);
    BoatsFactory.createAndAddParametersToModWindow(modWindows[CommonMod.BOATS_WINDOW_ID]);
    CarsFactory.createAndAddParametersToModWindow(modWindows[CommonMod.CARS_WINDOW_ID]);
    CivsFactory.createAndAddParametersToModWindow(modWindows[CommonMod.CIVS_WINDOW_ID]);
    EbsFactory.createAndAddParametersToModWindow(modWindows[CommonMod.EBS_WINDOW_ID]);
    FallFactory.createAndAddParametersToModWindow(modWindows[CommonMod.FALL_WINDOW_ID]);
    FogFactory.createAndAddParametersToModWindow(modWindows[CommonMod.FOG_WINDOW_ID]);
    HouselightsFactory.createAndAddParametersToModWindow(modWindows[CommonMod.HOUSELIGHTS_WINDOW_ID]);
    LosFactory.createAndAddParametersToModWindow(modWindows[CommonMod.LOS_WINDOW_ID]);
    ParkFactory.createAndAddParametersToModWindow(modWindows[CommonMod.PARK_WINDOW_ID]);
    RadioFactory.createAndAddParametersToModWindow(modWindows[CommonMod.RADIO_WINDOW_ID]);
    RainFxFactory.createAndAddParametersToModWindow(modWindows[CommonMod.RAINFX_WINDOW_ID]);
    StreetlightsFactory.createAndAddParametersToModWindow(modWindows[CommonMod.STREETLIGHTS_WINDOW_ID]);
    }

  private void linkCheckBoxesToButtons()
    {
    for (int i = 0; i < CommonMod.NUMBER_OF_MODS; i += 1)
      {
      LabeledCheckBox checkBox = modWindows[i].getIsActiveCheckBox();
      LabeledButton button = mainWindow.getModButton(i);

      checkBox.linkToButton(button);
      }
    }

  private void linkGuiToFile()
    {
    AirFactory.linkComponentsToArray(modWindows[CommonMod.AIR_WINDOW_ID]);
    AnimalsFactory.linkComponentsToArray(modWindows[CommonMod.ANIMALS_WINDOW_ID]);
    BleedoutFactory.linkComponentsToArray(modWindows[CommonMod.BLEEDOUT_WINDOW_ID]);
    BoatsFactory.linkComponentsToArray(modWindows[CommonMod.BOATS_WINDOW_ID]);
    CarsFactory.linkComponentsToArray(modWindows[CommonMod.CARS_WINDOW_ID]);
    CivsFactory.linkComponentsToArray(modWindows[CommonMod.CIVS_WINDOW_ID]);
    EbsFactory.linkComponentsToArray(modWindows[CommonMod.EBS_WINDOW_ID]);
    FallFactory.linkComponentsToArray(modWindows[CommonMod.FALL_WINDOW_ID]);
    FogFactory.linkComponentsToArray(modWindows[CommonMod.FOG_WINDOW_ID]);
    HouselightsFactory.linkComponentsToArray(modWindows[CommonMod.HOUSELIGHTS_WINDOW_ID]);
    LosFactory.linkComponentsToArray(modWindows[CommonMod.LOS_WINDOW_ID]);
    ParkFactory.linkComponentsToArray(modWindows[CommonMod.PARK_WINDOW_ID]);
    RadioFactory.linkComponentsToArray(modWindows[CommonMod.RADIO_WINDOW_ID]);
    RainFxFactory.linkComponentsToArray(modWindows[CommonMod.RAINFX_WINDOW_ID]);
    StreetlightsFactory.linkComponentsToArray(modWindows[CommonMod.STREETLIGHTS_WINDOW_ID]);
    }
  };