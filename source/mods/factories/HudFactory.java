package mods.factories;

import gui.*;
import gui.combinations.*;
import mods.*;


public class HudFactory extends ModFactory
  {
  private LabeledTextField range = new LabeledTextField(ModParameters.HUD[1]);
  private LabeledTextField colour = new LabeledTextField(ModParameters.HUD[2]);
  private LabeledTextField enemyColour = new LabeledTextField(ModParameters.HUD[3]);
  private LabeledTextField squadColour = new LabeledTextField(ModParameters.HUD[4]);
  private LabeledTextField alpha = new LabeledTextField(ModParameters.HUD[5]);
  private LabeledTextField asl = new LabeledTextField(ModParameters.HUD[6]);
  private LabeledTextField azt = new LabeledTextField(ModParameters.HUD[7]);
  private LabeledTextField grd = new LabeledTextField(ModParameters.HUD[8]);
  private LabeledTextField lmt = new LabeledTextField(ModParameters.HUD[9]);
  private LabeledTextField tmp = new LabeledTextField(ModParameters.HUD[10]);
  private LabeledTextField hlt = new LabeledTextField(ModParameters.HUD[11]);
  private LabeledTextField rng = new LabeledTextField(ModParameters.HUD[12]);
  private LabeledTextField vel = new LabeledTextField(ModParameters.HUD[13]);
  private LabeledTextField prx = new LabeledTextField(ModParameters.HUD[14]);
  private LabeledTextField unit = new LabeledTextField(ModParameters.HUD[15]);
  private LabeledTextField offset = new LabeledTextField(ModParameters.HUD[16]);
  private LabeledTextField scale = new LabeledTextField(ModParameters.HUD[17]);
  private LabeledTextField textscale = new LabeledTextField(ModParameters.HUD[18]);
  private LabeledTextField degradation = new LabeledTextField(ModParameters.HUD[19]);
  private LabeledTextField thirdPerson = new LabeledTextField(ModParameters.HUD[20]);
  private LabeledTextField addTac = new LabeledTextField(ModParameters.HUD[21]);
  private LabeledTextField aslTxt = new LabeledTextField(ModParameters.HUD[22]);
  private LabeledTextField aztTxt = new LabeledTextField(ModParameters.HUD[23]);
  private LabeledTextField grdTxt = new LabeledTextField(ModParameters.HUD[24]);
  private LabeledTextField lmtTxt = new LabeledTextField(ModParameters.HUD[25]);
  private LabeledTextField tmpTxt = new LabeledTextField(ModParameters.HUD[26]);
  private LabeledTextField hltTxt = new LabeledTextField(ModParameters.HUD[27]);
  private LabeledTextField rngTxt = new LabeledTextField(ModParameters.HUD[28]);
  private LabeledTextField velTxt = new LabeledTextField(ModParameters.HUD[29]);
  private LabeledTextField airvelTxt = new LabeledTextField(ModParameters.HUD[30]);
  private LabeledTextField prxTxt = new LabeledTextField(ModParameters.HUD[31]);

  public HudFactory(ModWindow hudWindow)
    {
    super(hudWindow);

    parameters = new LabeledComponent[] {range, colour, enemyColour, squadColour, alpha, asl, azt, grd, lmt, tmp, hlt, rng, vel, prx, unit, offset, scale, textscale, degradation, thirdPerson, addTac, aslTxt, aztTxt, grdTxt, lmtTxt, tmpTxt, hltTxt, rngTxt, velTxt, airvelTxt, prxTxt};
    }

  protected void addToolTips()
    {
    for (int i = 0; i < parameters.length; i += 1)
      parameters[i].setToolTip(ToolTips.HUD[i]);
    }
  }