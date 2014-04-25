package mods.factories;

import gui.*;
import gui.combinations.*;
import mods.*;


public class EbsFactory extends ModFactory
  {
  private LabeledTextField thresh = new LabeledTextField(ModParameters.EBS[1]);
  private LabeledTextField delay = new LabeledTextField(ModParameters.EBS[2]);
  private LabeledCheckBox debug = new LabeledCheckBox(ModParameters.EBS[3]);
  private LabeledTextField radius = new LabeledTextField(ModParameters.EBS[4]);
  private LabeledCheckBox playerSup = new LabeledCheckBox(ModParameters.EBS[5]);
  private LabeledCheckBox aiSup = new LabeledCheckBox(ModParameters.EBS[6]);
  private LabeledCheckBox findCover = new LabeledCheckBox(ModParameters.EBS[7]);

  public EbsFactory(ModWindow ebsWindow)
    {
    super(ebsWindow);

    parameters = new LabeledComponent[] {thresh, delay, debug, radius, playerSup, aiSup, findCover};
    }

  protected void addToolTips()
    {
    for (int i = 0; i < parameters.length; i += 1)
      parameters[i].setToolTip(ToolTips.EBS[i]);
    }
  }