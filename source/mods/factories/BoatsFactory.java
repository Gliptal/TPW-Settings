package mods.factories;

import gui.*;
import gui.components.*;
import mods.*;


public class BoatsFactory extends ModFactory
  {
  private TextFieldParameter delay = new TextFieldParameter(ModParameters.BOATS[1]);
  private TextFieldParameter radius = new TextFieldParameter(ModParameters.BOATS[2]);
  private TextFieldParameter waypoints = new TextFieldParameter(ModParameters.BOATS[3]);
  private TextFieldParameter num = new TextFieldParameter(ModParameters.BOATS[4]);

  public BoatsFactory(ModWindow boatsWindow)
    {
    super(boatsWindow);

    parameters = new Parameter[] {delay, radius, waypoints, num};
    visualParameters = new Parameter[] {delay, num, radius, waypoints};
    }
  }