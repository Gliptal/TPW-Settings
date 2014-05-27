package mods.factories;

import gui.*;
import gui.components.*;
import mods.*;


public class EbsFactory extends ModFactory
  {
  private TextFieldParameter thresh = new TextFieldParameter(ModParameters.EBS[1]);
  private TextFieldParameter delay = new TextFieldParameter(ModParameters.EBS[2]);
  private CheckBoxParameter debug = new CheckBoxParameter(ModParameters.EBS[3]);
  private TextFieldParameter radius = new TextFieldParameter(ModParameters.EBS[4]);
  private CheckBoxParameter playerSup = new CheckBoxParameter(ModParameters.EBS[5]);
  private CheckBoxParameter aiSup = new CheckBoxParameter(ModParameters.EBS[6]);
  private CheckBoxParameter findCover = new CheckBoxParameter(ModParameters.EBS[7]);

  public EbsFactory(ModWindow ebsWindow)
    {
    super(ebsWindow);

    parameters = new Parameter[] {thresh, delay, debug, radius, playerSup, aiSup, findCover};
    visualParameters = new Parameter[] {debug, delay, thresh, radius, playerSup, aiSup, findCover};
    }
  }