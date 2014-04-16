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
    radioWindow.setIfModIsActive(RadioParameters.IS_ACTIVE);
    houseParameter = new LabeledCheckBox(RadioParameters.PARAMETER_NAMES[0], RadioParameters.PARAMETERS[0]);
    carParameter = new LabeledCheckBox(RadioParameters.PARAMETER_NAMES[1], RadioParameters.PARAMETERS[1]);
    timeParameter = new LabeledField(RadioParameters.PARAMETER_NAMES[2], RadioParameters.PARAMETERS[2]);

    houseParameter.setToolTip(ToolTips.RADIO[0]);
    carParameter.setToolTip(ToolTips.RADIO[1]);
    timeParameter.setToolTip(ToolTips.RADIO[2]);

    radioWindow.addParameter(houseParameter);
    radioWindow.addParameter(carParameter);
    radioWindow.addParameter(timeParameter);
    Spacing.addPlaceholdersToModWindow(radioWindow, RadioParameters.PARAMETERS);
    }
  }