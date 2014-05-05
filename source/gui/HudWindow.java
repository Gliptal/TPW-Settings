package gui;

import exec.userinterface.*;
import gui.listeners.*;
import java.awt.*;
import javax.swing.*;


public class HudWindow extends ModWindow
  {
  private JPanel sectionsPanel;
  private JPanel generalPanel;
  private JPanel colorPanel;
  private JPanel positioningPanel;
  private JPanel otherPanel;
  private JPanel txtPanel;

  private JButton generalButton;
  private JButton colorButton;
  private JButton positioningButton;
  private JButton otherButton;
  private JButton txtButton;

  public HudWindow(String title)
    {
    super(title);
    overrideSize(Windows.HUD_WINDOW_WIDTH, Windows.HUD_WINDOW_HEIGHT);
    overrideParametersPanelLayout(Layouts.HUD_PARAMETERS());

    createAndAddPanels();
    createAndAddButtons();

    setSectionButtonsActions();
    }

  public void fillModWindowWithPlaceholders()
    {
    Spacing.fillGridWithPlaceholders(generalPanel);
    Spacing.fillGridWithPlaceholders(colorPanel);
    Spacing.fillGridWithPlaceholders(positioningPanel);
    Spacing.fillGridWithPlaceholders(otherPanel);
    Spacing.fillGridWithPlaceholders(txtPanel);
    }

  public void addParameterToSection(JPanel parameter, String section)
    {
    switch (section)
      {
      case Text.HUD_SECTION_GENERAL:
        generalPanel.add(parameter);
        break;
      case Text.HUD_SECTION_COLOR:
        colorPanel.add(parameter);
        break;
      case Text.HUD_SECTION_POSITIONING:
        positioningPanel.add(parameter);
        break;
      case Text.HUD_SECTION_OTHER:
        otherPanel.add(parameter);
        break;
      case Text.HUD_SECTION_TXT:
        txtPanel.add(parameter);
        break;
      }
    }

  private void createAndAddPanels()
    {
    sectionsPanel = new JPanel(Layouts.HUD_SECTIONS());

    generalPanel = new JPanel(Layouts.HUD_SECTION_GENERAL());
    colorPanel = new JPanel(Layouts.HUD_SECTION_COLOR());
    positioningPanel = new JPanel(Layouts.HUD_SECTION_POSITIONING());
    otherPanel = new JPanel(Layouts.HUD_SECTION_OTHER());
    txtPanel = new JPanel(Layouts.HUD_SECTION_TXT());

    parametersPanel.add(sectionsPanel, BorderLayout.NORTH);
    }

  private void createAndAddButtons()
    {
    generalButton = new JButton(Text.HUD_SECTION_GENERAL);
    colorButton = new JButton(Text.HUD_SECTION_COLOR);
    positioningButton = new JButton(Text.HUD_SECTION_POSITIONING);
    otherButton = new JButton(Text.HUD_SECTION_OTHER);
    txtButton = new JButton(Text.HUD_SECTION_TXT);

    sectionsPanel.add(generalButton);
    sectionsPanel.add(colorButton);
    sectionsPanel.add(positioningButton);
    sectionsPanel.add(otherButton);
    sectionsPanel.add(txtButton);
    }

  private void setSectionButtonsActions()
    {
    generalButton.addActionListener(new OpenHudSection(generalPanel, parametersPanel, sectionsPanel));
    colorButton.addActionListener(new OpenHudSection(colorPanel, parametersPanel, sectionsPanel));
    positioningButton.addActionListener(new OpenHudSection(positioningPanel, parametersPanel, sectionsPanel));
    otherButton.addActionListener(new OpenHudSection(otherPanel, parametersPanel, sectionsPanel));
    txtButton.addActionListener(new OpenHudSection(txtPanel, parametersPanel, sectionsPanel));
    }
  }