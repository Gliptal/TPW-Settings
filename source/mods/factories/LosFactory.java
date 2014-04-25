package mods.factories;

import gui.*;
import gui.combinations.*;
import mods.*;


public class LosFactory extends ModFactory
  {
  private LabeledCheckBox debug = new LabeledCheckBox(ModParameters.LOS[1]);
  private LabeledTextField maxDist = new LabeledTextField(ModParameters.LOS[2]);
  private LabeledTextField minDist = new LabeledTextField(ModParameters.LOS[3]);
  private LabeledTextField delay = new LabeledTextField(ModParameters.LOS[4]);

  public LosFactory(ModWindow losWindow)
    {
    super(losWindow);

    parameters = new LabeledComponent[] {debug, maxDist, minDist, delay};
    }

  protected void addToolTips()
    {
    for (int i = 0; i < parameters.length; i += 1)
      parameters[i].setToolTip(ToolTips.LOS[i]);
    }
  }