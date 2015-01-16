package mods.factories;

import exec.Text;
import gui.*;
import gui.components.*;
import gui.listeners.windows.*;
import mods.*;


public class HudFactory extends ModFactory
  {
  private TextFieldParameter range          = new TextFieldParameter(ModParameters.HUD[1]);
  private TextFieldParameter vehicleFactor  = new TextFieldParameter(ModParameters.HUD[2]);
  private TextFieldParameter color          = new TextFieldParameter(ModParameters.HUD[3]);
  private TextFieldParameter friendlyColour = new TextFieldParameter(ModParameters.HUD[4]);
  private TextFieldParameter civColour      = new TextFieldParameter(ModParameters.HUD[5]);
  private TextFieldParameter enemyColour    = new TextFieldParameter(ModParameters.HUD[6]);
  private TextFieldParameter squadColour    = new TextFieldParameter(ModParameters.HUD[7]);
  private TextFieldParameter alpha          = new TextFieldParameter(ModParameters.HUD[8]);
  private TextFieldParameter asl            = new TextFieldParameter(ModParameters.HUD[9]);
  private TextFieldParameter azt            = new TextFieldParameter(ModParameters.HUD[10]);
  private TextFieldParameter grd            = new TextFieldParameter(ModParameters.HUD[11]);
  private TextFieldParameter lmt            = new TextFieldParameter(ModParameters.HUD[12]);
  private TextFieldParameter tmp            = new TextFieldParameter(ModParameters.HUD[13]);
  private TextFieldParameter hlt            = new TextFieldParameter(ModParameters.HUD[14]);
  private TextFieldParameter rng            = new TextFieldParameter(ModParameters.HUD[15]);
  private TextFieldParameter vel            = new TextFieldParameter(ModParameters.HUD[16]);
  private TextFieldParameter prx            = new TextFieldParameter(ModParameters.HUD[17]);
  private TextFieldParameter unit           = new TextFieldParameter(ModParameters.HUD[18]);
  private TextFieldParameter offset         = new TextFieldParameter(ModParameters.HUD[19]);
  private TextFieldParameter scale          = new TextFieldParameter(ModParameters.HUD[20]);
  private TextFieldParameter textscale      = new TextFieldParameter(ModParameters.HUD[21]);
  private CheckBoxParameter  degradation    = new CheckBoxParameter (ModParameters.HUD[22]);
  private CheckBoxParameter  thirdPerson    = new CheckBoxParameter (ModParameters.HUD[23]);
  private CheckBoxParameter  addTac         = new CheckBoxParameter (ModParameters.HUD[24]);
  private CheckBoxParameter  audible        = new CheckBoxParameter (ModParameters.HUD[25]);
  private TextFieldParameter icons          = new TextFieldParameter(ModParameters.HUD[26]);
  private TextFieldParameter aslTxt         = new TextFieldParameter(ModParameters.HUD[27]);
  private TextFieldParameter aztTxt         = new TextFieldParameter(ModParameters.HUD[28]);
  private TextFieldParameter grdTxt         = new TextFieldParameter(ModParameters.HUD[29]);
  private TextFieldParameter lmtTxt         = new TextFieldParameter(ModParameters.HUD[30]);
  private TextFieldParameter tmpTxt         = new TextFieldParameter(ModParameters.HUD[31]);
  private TextFieldParameter hltTxt         = new TextFieldParameter(ModParameters.HUD[32]);
  private TextFieldParameter rngTxt         = new TextFieldParameter(ModParameters.HUD[33]);
  private TextFieldParameter velTxt         = new TextFieldParameter(ModParameters.HUD[34]);
  private TextFieldParameter airvelTxt      = new TextFieldParameter(ModParameters.HUD[35]);
  private TextFieldParameter prxTxt         = new TextFieldParameter(ModParameters.HUD[36]);

  public HudFactory(ModWindow hudWindow)
    {
    super(hudWindow);

    parameters       = new Parameter[] {range, vehicleFactor, color, friendlyColour, civColour, enemyColour, squadColour, alpha, asl, azt, grd, lmt, tmp, hlt, rng, vel, prx, unit, offset, scale, textscale, degradation, thirdPerson, addTac, audible, icons, aslTxt, aztTxt, grdTxt, lmtTxt, tmpTxt, hltTxt, rngTxt, velTxt, airvelTxt, prxTxt};
    visualParameters = new Parameter[] {range, vehicleFactor, degradation, thirdPerson, audible, addTac, color, squadColour, friendlyColour, enemyColour, civColour, alpha, icons, asl, azt, grd, lmt, tmp, hlt, rng, vel, prx, unit, offset, scale, textscale, aslTxt, aztTxt, grdTxt, lmtTxt, tmpTxt, hltTxt, rngTxt, velTxt, airvelTxt, prxTxt};

    setChoosers();
    }

  private void setChoosers()
    {
    color.addMouseListener(new OpenColorChooser(color));
    friendlyColour.addMouseListener(new OpenColorChooser(friendlyColour));
    civColour.addMouseListener(new OpenColorChooser(civColour));
    enemyColour.addMouseListener(new OpenColorChooser(enemyColour));
    squadColour.addMouseListener(new OpenColorChooser(squadColour));
    icons.addMouseListener(new OpenIconChooser(icons));
    }

  public void addParameters()
    {
    for (int i = 0; i < 6; i += 1)
      ((HudWindow)modWindow).addParameterToSection(visualParameters[i], Text.HUD_TAB_GENERAL);
    for (int i = 6; i < 12; i += 1)
      ((HudWindow)modWindow).addParameterToSection(visualParameters[i], Text.HUD_TAB_COLORS);
    for (int i = 12; i < 26; i += 1)
      ((HudWindow)modWindow).addParameterToSection(visualParameters[i], Text.HUD_TAB_GRAPHICS);
    for (int i = 26; i < visualParameters.length; i += 1)
      ((HudWindow)modWindow).addParameterToSection(visualParameters[i], Text.HUD_TAB_TXT);

    modWindow.fillWithPlaceholders();
    }
  }