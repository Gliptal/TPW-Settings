package mods.factories;

import gui.*;
import gui.combinations.*;
import mods.*;


public class FogFactory extends ModFactory
  {
  private LabeledTextField radius = new LabeledTextField(ModParameters.FOG[1]);
  private LabeledTextField delay = new LabeledTextField(ModParameters.FOG[2]);
  private LabeledCheckBox breath = new LabeledCheckBox(ModParameters.FOG[3]);
  private LabeledCheckBox groundFog = new LabeledCheckBox(ModParameters.FOG[4]);
  private LabeledCheckBox rainFog = new LabeledCheckBox(ModParameters.FOG[5]);
  private LabeledCheckBox heatHaze = new LabeledCheckBox(ModParameters.FOG[6]);
  private LabeledCheckBox canSnow = new LabeledCheckBox(ModParameters.FOG[7]);

  public FogFactory(ModWindow fogWindow)
    {
    super(fogWindow);

    parameters = new LabeledComponent[] {radius, delay, breath, groundFog, rainFog, heatHaze, canSnow};
    }

  protected void addToolTips()
    {
    for (int i = 0; i < parameters.length; i += 1)
      parameters[i].setToolTip(ToolTips.FOG[i]);
    }
  }