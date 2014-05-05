package mods.factories;

import gui.*;
import gui.combinations.*;
import mods.*;


public class BoatsFactory extends ModFactory
  {
  private LabeledTextField delay = new LabeledTextField(ModParameters.BOATS[1]);
  private LabeledTextField radius = new LabeledTextField(ModParameters.BOATS[2]);
  private LabeledTextField waypoints = new LabeledTextField(ModParameters.BOATS[3]);
  private LabeledTextField num = new LabeledTextField(ModParameters.BOATS[4]);

  public BoatsFactory(ModWindow boatsWindow)
    {
    super(boatsWindow);

    parameters = new LabeledComponent[] {delay, radius, waypoints, num};
    visualParameters = new LabeledComponent[] {delay, num, radius, waypoints};
    }

  protected void addToolTips()
    {
    for (int i = 0; i < parameters.length; i += 1)
      parameters[i].setToolTip(ToolTips.BOATS[i]);
    }
  }