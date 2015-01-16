package exec;

import java.io.*;

import exec.theme.*;
import fileio.*;
import gui.*;
import gui.components.*;
import mods.factories.*;
import static mods.Mods.*;


public class Main
  {
  public static MainWindow   mainWindow;
  public static HintsWindow  hintsWindow;
  public static ModWindow[]  modWindows;
  public static ModFactory[] modFactories;

  private Main()
    {
    setupLogger();
    Ui.setTheme();
    createGUI();
    loadValues();

    mainWindow.setVisible(true);
    }

  public static void main(String[] args)
    {
    new Main();
    }

  private void setupLogger()
    {
    try
      {
      FileOutputStream log = new FileOutputStream(Files.LOG);
      System.setErr(new PrintStream(log));
      }
    catch (FileNotFoundException exception) {}
    }

  private void createGUI()
    {
    createHintsWindow();
    createModWindows();
    createModFactories();
    addParameters();
    createMainWindow();
    setSemaphores();
    }

  private void loadValues()
    {
    loadValuesFromConfig();
    saveRevertFile();
    loadPresets();
    }

  private void createHintsWindow()
    {
    hintsWindow = new HintsWindow();
    hintsWindow.setLocationRelativeTo(null);
    }

  private void createModWindows()
    {
    modWindows = new ModWindow[NUMBER_OF_MODS];

    for (int i = 0; i < NUMBER_OF_MODS; i += 1)
      {
      if (i == HUD_ID)
        modWindows[i] = new HudWindow(MOD_NAMES[i]);
      else
        modWindows[i] = new ModWindow(MOD_NAMES[i]);
      if (i == ANIMATIONS_ID)
        modWindows[i].setUntogglableMod();

      modWindows[i].setLocationRelativeTo(null);
      }
    }

  private void createModFactories()
    {
    modFactories = new ModFactory[NUMBER_OF_MODS];

    modFactories[0]  = new AirFactory(modWindows[0]);
    modFactories[1]  = new AnimalsFactory(modWindows[1]);
    modFactories[2]  = new BleedoutFactory(modWindows[2]);
    modFactories[3]  = new BoatsFactory(modWindows[3]);
    modFactories[4]  = new CarsFactory(modWindows[4]);
    modFactories[5]  = new CivsFactory(modWindows[5]);
    modFactories[6]  = new EbsFactory(modWindows[6]);
    modFactories[7]  = new FallFactory(modWindows[7]);
    modFactories[8]  = new FogFactory(modWindows[8]);
    modFactories[9]  = new HouselightsFactory(modWindows[9]);
    modFactories[10] = new HudFactory(modWindows[10]);
    modFactories[11] = new LosFactory(modWindows[11]);
    modFactories[12] = new ParkFactory(modWindows[12]);
    modFactories[13] = new RadioFactory(modWindows[13]);
    modFactories[14] = new RainFxFactory(modWindows[14]);
    modFactories[15] = new SkirmishFactory(modWindows[15]);
    modFactories[16] = new StreetlightsFactory(modWindows[16]);
    modFactories[17] = new AnimationsFactory(modWindows[17]);
    }

  private void addParameters()
    {
    for (int i = 0; i < NUMBER_OF_MODS; i += 1)
      {
      modFactories[i].addParameters();
      modFactories[i].addToolTips(i);
      }
    }

  private void createMainWindow()
    {
    mainWindow = new MainWindow();
    mainWindow.setLocationRelativeTo(null);
    }

  private void setSemaphores()
    {
    for (int i = 0; i < NUMBER_OF_MODS && i != ANIMATIONS_ID; i += 1)
      {
      CheckBoxParameter checkBox = modWindows[i].getIsActiveLabeledCheckBox();
      LabeledButton     button   = mainWindow.getModButton(i);

      checkBox.linkToButton(button);
      button.linkToCheckBox(checkBox);
      }
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

  }