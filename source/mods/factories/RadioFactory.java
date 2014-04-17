package mods.factories;

import exec.userinterface.*;
import gui.*;
import gui.combinations.*;
import mods.*;
import mods.parameters.*;


public class RadioFactory
  {
  public static LabeledCheckBox houseParameter;
  public static LabeledCheckBox carParameter;
  public static LabeledField timeParameter;

  public static void addParametersToWindow(ModWindow radioWindow)
    {
    radioWindow.setIfModIsActive(RadioParameters.PARAMETERS[0]);
    houseParameter = new LabeledCheckBox(RadioParameters.PARAMETER_NAMES[1], RadioParameters.PARAMETERS[1]);
    carParameter = new LabeledCheckBox(RadioParameters.PARAMETER_NAMES[2], RadioParameters.PARAMETERS[2]);
    timeParameter = new LabeledField(RadioParameters.PARAMETER_NAMES[3], RadioParameters.PARAMETERS[3]);

    houseParameter.setToolTip(ToolTips.RADIO[1]);
    carParameter.setToolTip(ToolTips.RADIO[2]);
    timeParameter.setToolTip(ToolTips.RADIO[3]);

    radioWindow.addParameter(houseParameter);
    radioWindow.addParameter(carParameter);
    radioWindow.addParameter(timeParameter);
    Spacing.addPlaceholdersToModWindow(radioWindow, RadioParameters.PARAMETERS);
    }
  }