package exec;

import exec.userinterface.*;
import fileio.*;
import gui.*;
import gui.combinations.*;
import java.awt.*;
import javax.swing.*;
import mods.*;
import mods.factories.*;


public class Main
  {
  public static MainWindow mainWindow;
  public static ModWindow[] modWindows;
  public static ModFactory[] modFactories;

  public static boolean everythingLoaded = false;

  public static void main(String[] args)
    {
    new Main();
    }

  public static void updateSemaphores()
    {
    for (int i = 0; i < CommonMod.NUMBER_OF_MODS; i += 1)
      mainWindow.getModButton(i).setCorrespondingColor(modWindows[i].getIsActiveLabeledCheckBox().isActive());
    }

  private Main()
    {
    setSystemLookAndFeel();

    createModWindows();
    createModFactories();
    addParametersToModWindows();
    createAndShowMainWindow();

    loadValuesFromConfig();
    saveCurrentFile();
    loadPresetsFromDirectory();

    setSemaphores();

    everythingLoaded = true;
    }

  private void setSystemLookAndFeel()
    {
    try
      {
      UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
      }
    catch (UnsupportedLookAndFeelException | ClassNotFoundException | InstantiationException | IllegalAccessException except) {}
    }

  private void createModWindows()
    {
    modWindows = new ModWindow[CommonMod.NUMBER_OF_MODS];

    for (int i = 0; i < CommonMod.NUMBER_OF_MODS; i += 1)
      {
      modWindows[i] = new ModWindow(CommonMod.MOD_NAMES[i]);

      if (i == 10)
        {
        modWindows[i].overrideSize(Windows.HUD_WINDOW_WIDTH, Windows.HUD_WINDOW_HEIGHT);
        modWindows[i].overrideParametersPanelLayout(new GridLayout(Spacing.HUD_PARAMETERS_ROWS, Spacing.HUD_PARAMETERS_COLUMNS, Spacing.GRID_PARAMETERS_X, Spacing.GRID_PARAMETERS_Y));
        }

      modWindows[i].setLocationRelativeTo(null);
      }
    }

  private void createModFactories()
    {
    modFactories = new ModFactory[CommonMod.NUMBER_OF_MODS];

    modFactories[0] = new AirFactory(modWindows[0]);
    modFactories[1] = new AnimalsFactory(modWindows[1]);
    modFactories[2] = new BleedoutFactory(modWindows[2]);
    modFactories[3] = new BoatsFactory(modWindows[3]);
    modFactories[4] = new CarsFactory(modWindows[4]);
    modFactories[5] = new CivsFactory(modWindows[5]);
    modFactories[6] = new EbsFactory(modWindows[6]);
    modFactories[7] = new FallFactory(modWindows[7]);
    modFactories[8] = new FogFactory(modWindows[8]);
    modFactories[9] = new HouselightsFactory(modWindows[9]);
    modFactories[10] = new HudFactory(modWindows[10]);
    modFactories[11] = new LosFactory(modWindows[11]);
    modFactories[12] = new ParkFactory(modWindows[12]);
    modFactories[13] = new RadioFactory(modWindows[13]);
    modFactories[14] = new RainFxFactory(modWindows[14]);
    modFactories[15] = new StreetlightsFactory(modWindows[15]);
    }

  private void addParametersToModWindows()
    {
    for (int i = 0; i < CommonMod.NUMBER_OF_MODS; i += 1)
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
    ActionBuffer.readWholeFile(ActionBuffer.CONFIG_FILE_NAME);
    }

  private void saveCurrentFile()
    {
    ActionBuffer.writeWholeFile(ActionBuffer.REVERT_FILE_NAME);
    }

  private void loadPresetsFromDirectory()
    {
    mainWindow.savePresetsToComboBox();
    }

  private void setSemaphores()
    {
    linkCheckBoxesToButtons();
    }

  private void linkCheckBoxesToButtons()
    {
    for (int i = 0; i < CommonMod.NUMBER_OF_MODS; i += 1)
      {
      LabeledCheckBox checkBox = modWindows[i].getIsActiveLabeledCheckBox();
      LabeledButton button = mainWindow.getModButton(i);

      button.setCorrespondingColor(checkBox.isActive());
      checkBox.linkToButton(button);
      }
    }
  };