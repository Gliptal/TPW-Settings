package mods.factories;

import gui.*;
import gui.combinations.*;
import mods.*;


public class AnimalsFactory extends ModFactory
  {
  private LabeledTextField delay = new LabeledTextField(ModParameters.ANIMALS[1]);
  private LabeledTextField max = new LabeledTextField(ModParameters.ANIMALS[2]);
  private LabeledTextField maxRadius = new LabeledTextField(ModParameters.ANIMALS[3]);
  private LabeledTextField minRadius = new LabeledTextField(ModParameters.ANIMALS[4]);
  private LabeledTextField noiseTime = new LabeledTextField(ModParameters.ANIMALS[5]);

  public AnimalsFactory(ModWindow animalsWindow)
    {
    super(animalsWindow);

    parameters = new LabeledComponent[] {delay, max, maxRadius, minRadius, noiseTime};
    visualParameters = new LabeledComponent[] {delay, max, minRadius, maxRadius, noiseTime};
    }

  protected void addToolTips()
    {
    for (int i = 0; i < parameters.length; i += 1)
      parameters[i].setToolTip(ToolTips.ANIMALS[i]);
    }
  }