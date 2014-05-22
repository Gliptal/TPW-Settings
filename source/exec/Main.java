package exec;

import exec.userinterface.*;
import fileio.*;
import gui.*;
import gui.combinations.*;
import javax.swing.*;
import mods.factories.*;

import static mods.CommonMod.*;


public class Main
  {
  public static MainWindow mainWindow;
  public static ModWindow[] modWindows;
  public static ModFactory[] modFactories;

  private Main()
    {
    setSystemLookAndFeel();

    createModWindows();
    createModFactories();
    addParametersToModWindows();
    createAndShowMainWindow();

    loadValuesFromConfig();
    saveRevertFile();
    loadPresets();

    setSemaphores();
    }

  public static void main(String[] args)
    {
    new Main();
    }

  private void setSystemLookAndFeel()
    {
    try
      {
      UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
      }
    catch (UnsupportedLookAndFeelException | ClassNotFoundException | InstantiationException | IllegalAccessException except) {}

    ToolTipManager.sharedInstance().setInitialDelay(ExtendedLaF.TOOLTIP_DELAY);
    ToolTipManager.sharedInstance().setDismissDelay(ExtendedLaF.TOOLTIP_DISMISS);
    }

  private void createModWindows()
    {
    modWindows = new ModWindow[NUMBER_OF_MODS];

    for (int i = 0; i < NUMBER_OF_MODS; i += 1)
      {
      modWindows[i] = new ModWindow(MOD_NAMES[i]);
      if (i == HUD_ID)
        modWindows[i] = new HudWindow(MOD_NAMES[i]);

      modWindows[i].setLocationRelativeTo(null);
      }
    }

  private void createModFactories()
    {
    modFactories = new ModFactory[NUMBER_OF_MODS];

    modFactories[AIR_ID] = new AirFactory(modWindows[AIR_ID]);
    modFactories[ANIMALS_ID] = new AnimalsFactory(modWindows[ANIMALS_ID]);
    modFactories[BLEEDOUT_ID] = new BleedoutFactory(modWindows[BLEEDOUT_ID]);
    modFactories[BOATS_ID] = new BoatsFactory(modWindows[BOATS_ID]);
    modFactories[CARS_ID] = new CarsFactory(modWindows[CARS_ID]);
    modFactories[CIVS_ID] = new CivsFactory(modWindows[CIVS_ID]);
    modFactories[EBS_ID] = new EbsFactory(modWindows[EBS_ID]);
    modFactories[FALL_ID] = new FallFactory(modWindows[FALL_ID]);
    modFactories[FOG_ID] = new FogFactory(modWindows[FOG_ID]);
    modFactories[HOUSELIGHTS_ID] = new HouselightsFactory(modWindows[HOUSELIGHTS_ID]);
    modFactories[HUD_ID] = new HudFactory(modWindows[HUD_ID]);
    modFactories[LOS_ID] = new LosFactory(modWindows[LOS_ID]);
    modFactories[PARK_ID] = new ParkFactory(modWindows[PARK_ID]);
    modFactories[RADIO_ID] = new RadioFactory(modWindows[RADIO_ID]);
    modFactories[RAIN_FX_ID] = new RainFxFactory(modWindows[RAIN_FX_ID]);
    modFactories[STREETLIGHTS_ID] = new StreetlightsFactory(modWindows[STREETLIGHTS_ID]);
    }

  private void addParametersToModWindows()
    {
    for (int i = 0; i < NUMBER_OF_MODS; i += 1)
      modFactories[i].addParametersAndTooltips();
    }

  private void createAndShowMainWindow()
    {
    mainWindow = new MainWindow();
    mainWindow.setLocationRelativeTo(null);
    mainWindow.setVisible(true);
    }

  private void loadValuesFromConfig()
    {
    FileBuffer.readWholeFile(Files.CONFIG);
    }

  private void saveRevertFile()
    {
    FileBuffer.writeWholeFile(Files.REVERT);
    }

  private void loadPresets()
    {
    mainWindow.addPresetsToComboBox();
    }

  private void setSemaphores()
    {
    for (int i = 0; i < NUMBER_OF_MODS; i += 1)
      {
      LabeledCheckBox checkBox = modWindows[i].getIsActiveLabeledCheckBox();
      LabeledButton button = mainWindow.getModButton(i);

      checkBox.linkToButton(button);
      button.linkToCheckBox(checkBox);
      }
    }
  };