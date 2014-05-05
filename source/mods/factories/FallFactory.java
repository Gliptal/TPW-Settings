package mods.factories;

import gui.*;
import gui.combinations.*;
import mods.*;


public class FallFactory extends ModFactory
  {
  private LabeledTextField sensitivity = new LabeledTextField(ModParameters.FALL[1]);
  private LabeledTextField threshold = new LabeledTextField(ModParameters.FALL[2]);
  private LabeledTextField delay = new LabeledTextField(ModParameters.FALL[3]);
  private LabeledCheckBox ragdoll = new LabeledCheckBox(ModParameters.FALL[4]);
  private LabeledTextField fallTimeSup = new LabeledTextField(ModParameters.FALL[5]);

  public FallFactory(ModWindow fallWindow)
    {
    super(fallWindow);

    parameters = new LabeledComponent[] {sensitivity, threshold, delay, ragdoll, fallTimeSup};
    visualParameters = new LabeledComponent[] {delay, threshold, sensitivity, fallTimeSup, ragdoll};
    }

  protected void addToolTips()
    {
    for (int i = 0; i < parameters.length; i += 1)
      parameters[i].setToolTip(ToolTips.FALL[i]);
    }
  }