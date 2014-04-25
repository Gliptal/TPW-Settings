package mods.factories;

import gui.*;
import gui.combinations.*;
import mods.*;


public class BleedoutFactory extends ModFactory
  {
  private LabeledTextField inc = new LabeledTextField(ModParameters.BLEEDOUT[1]);
  private LabeledTextField cThresh = new LabeledTextField(ModParameters.BLEEDOUT[2]);
  private LabeledTextField pThresh = new LabeledTextField(ModParameters.BLEEDOUT[3]);
  private LabeledTextField iThresh = new LabeledTextField(ModParameters.BLEEDOUT[4]);

  public BleedoutFactory(ModWindow bleedoutWindow)
    {
    super(bleedoutWindow);

    parameters = new LabeledComponent[] {inc, cThresh, pThresh, iThresh};
    }

  protected void addToolTips()
    {
    for (int i = 0; i < parameters.length; i += 1)
      parameters[i].setToolTip(ToolTips.BLEEDOUT[i]);
    }
  }