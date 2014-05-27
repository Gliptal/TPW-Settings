package mods.factories;

import gui.*;
import gui.components.*;
import mods.*;


public class AnimalsFactory extends ModFactory
  {
  private TextFieldParameter delay = new TextFieldParameter(ModParameters.ANIMALS[1]);
  private TextFieldParameter max = new TextFieldParameter(ModParameters.ANIMALS[2]);
  private TextFieldParameter maxRadius = new TextFieldParameter(ModParameters.ANIMALS[3]);
  private TextFieldParameter minRadius = new TextFieldParameter(ModParameters.ANIMALS[4]);
  private TextFieldParameter noiseTime = new TextFieldParameter(ModParameters.ANIMALS[5]);

  public AnimalsFactory(ModWindow animalsWindow)
    {
    super(animalsWindow);

    parameters = new Parameter[] {delay, max, maxRadius, minRadius, noiseTime};
    visualParameters = new Parameter[] {delay, max, minRadius, maxRadius, noiseTime};
    }
  }