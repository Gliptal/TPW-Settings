package exec;

import javax.swing.*;

import exec.laf.*;
import fileio.*;
import gui.*;
import gui.components.*;
import mods.factories.*;
import static mods.CommonMod.*;


public class Main
  {
  public static MainWindow mainWindow;
  public static ModWindow[] modWindows;
  public static ModFactory[] modFactories;

  private Main()
    {
    setLookAndFeel();
    createGuiElements();
    manageValues();
    setLinks();

    showMainWindow();
    }

  public static void main(String[] args)
    {
    new Main();
    }

  private void setLookAndFeel()
    {
    try
      {
      UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
      }
    catch (UnsupportedLookAndFeelException | ClassNotFoundException | InstantiationException | IllegalAccessException except) {}

    ToolTipManager.sharedInstance().setInitialDelay(Tooltips.TOOLTIP_DELAY);
    ToolTipManager.sharedInstance().setDismissDelay(Tooltips.TOOLTIP_DISMISS);
    }

  private void createGuiElements()
    {
    createModWindows();
    createModFactories();
    addParametersToModWindows();
    createMainWindow();
    }

  private void manageValues()
    {
    loadValuesFromConfig();
    saveRevertFile();
    loadPresets();
    }

  private void setLinks()
    {
    setSemaphores();
    }

  private void showMainWindow()
    {
    mainWindow.setVisible(true);
    }

  private void createModWindows()
    {
    modWindows = new ModWindow[NUMBER_OF_MODS];

    for (int i = 0; i < NUMBER_OF_MODS; i += 1)
      {
      modWindows[i] = new ModWindow(MOD_NAMES[i]);
      if (i == HUD_ID)
        modWindows[i] = new HudWindow(MOD_NAMES[i]);
      if (i == SKIRMISH_ID)
        modWindows[i].overrideParametersPanelLayout(Layouts.FRAME_SKIRMISH_PARAMETERS());
      if (i == ANIMATIONS_ID)
        modWindows[i].setUntogglableMod();

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
    modFactories[SKIRMISH_ID] = new SkirmishFactory(modWindows[SKIRMISH_ID]);
    modFactories[STREETLIGHTS_ID] = new StreetlightsFactory(modWindows[STREETLIGHTS_ID]);
    modFactories[ANIMATIONS_ID] = new AnimationsFactory(modWindows[ANIMATIONS_ID]);
    }

  private void addParametersToModWindows()
    {
    for (int i = 0; i < NUMBER_OF_MODS; i += 1)
      modFactories[i].addParametersAndTooltips(i);
    }

  private void createMainWindow()
    {
    mainWindow = new MainWindow();
    mainWindow.setLocationRelativeTo(null);
    }

  private void loadValuesFromConfig()
    {
    FileParser.readFile(Files.CONFIG);
    }

  private void saveRevertFile()
    {
    FileParser.writeFile(Files.REVERT);
    }

  private void loadPresets()
    {
    mainWindow.addPresetsToComboBox();
    }

  private void setSemaphores()
    {
    for (int i = 0; i < NUMBER_OF_MODS && i != ANIMATIONS_ID; i += 1)
      {
      CheckBoxParameter checkBox = modWindows[i].getIsActiveLabeledCheckBox();
      LabeledButton button = mainWindow.getModButton(i);

      checkBox.linkToButton(button);
      button.linkToCheckBox(checkBox);
      }
    }
  }