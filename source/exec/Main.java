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
  public static ModFactory[] modFactories;

  public static void main(String[] args)
    {
    new Main();
    }

  private Main()
    {
    setSystemLookAndFeel();

    createModWindows();
    createModFactories();
    fillModWindowsWithParameters();
    createAndShowMainWindow();

    setParametersFromConfig();
    setRevertFile();

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

  private void createModWindows()
    {
    modWindows = new ModWindow[CommonMod.NUMBER_OF_MODS];

    for (int i = 0; i < CommonMod.NUMBER_OF_MODS; i += 1)
      {
      modWindows[i] = new ModWindow(CommonMod.MOD_NAMES[i]);
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

  private void fillModWindowsWithParameters()
    {
    for (int i = 0; i < CommonMod.NUMBER_OF_MODS; i += 1)
      modFactories[i].fillModWindow();
    }

  private void createAndShowMainWindow()
    {
    mainWindow = new MainWindow();
    mainWindow.setVisible(true);
    mainWindow.setLocationRelativeTo(null);
    }

  private void setListeners()
    {
    linkCheckBoxesToButtons();
    }

  private void setParametersFromConfig()
    {
    ActionBuffer.readWholeFile(ActionBuffer.CONFIG_FILE_NAME);
    }

  private void setRevertFile()
    {
    ActionBuffer.writeWholeFile(ActionBuffer.REVERT_FILE_NAME);
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