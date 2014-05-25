package gui;

import exec.laf.Text;
import exec.laf.Spacing;
import exec.laf.Layouts;
import exec.laf.Frames;
import gui.listeners.*;
import java.awt.*;
import javax.swing.*;


public class HudWindow extends ModWindow
  {
  private JPanel sectionsPanel;
  private JPanel generalPanel;
  private JPanel colorPanel;
  private JPanel positioningPanel;
  private JPanel txtPanel;

  private JButton generalButton;
  private JButton colorButton;
  private JButton positioningButton;
  private JButton otherButton;
  private JButton txtButton;

  public HudWindow(String title)
    {
    super(title);
    overrideSize(Frames.HUD_WIDTH, Frames.HUD_HEIGHT);
    overrideParametersPanelLayout(Layouts.FRAME_HUD_INNER());

    createAndAddPanels();
    createAndAddButtons();

    setSectionButtonsActions();
    }

  public void fillModWindowWithPlaceholders()
    {
    Spacing.addPlaceholdersToEmptySlots(generalPanel);
    Spacing.addPlaceholdersToEmptySlots(colorPanel);
    Spacing.addPlaceholdersToEmptySlots(positioningPanel);
    Spacing.addPlaceholdersToEmptySlots(txtPanel);
    }

  public void addParameterToSection(JPanel parameter, String section)
    {
    switch (section)
      {
      case Text.FRAME_HUD_SECTION_GENERAL:
        generalPanel.add(parameter);
        break;
      case Text.FRAME_HUD_SECTION_COLORS:
        colorPanel.add(parameter);
        break;
      case Text.FRAME_HUD_SECTION_GRAPHICS:
        positioningPanel.add(parameter);
        break;
      case Text.FRAME_HUD_SECTION_TXT:
        txtPanel.add(parameter);
        break;
      }
    }

  private void createAndAddPanels()
    {
    sectionsPanel = new JPanel(Layouts.FRAME_HUD_SECTIONS());

    generalPanel = new JPanel(Layouts.FRAME_HUD_SECTION_GENERAL());
    colorPanel = new JPanel(Layouts.FRAME_HUD_SECTION_COLOR());
    positioningPanel = new JPanel(Layouts.FRAME_HUD_SECTION_GRAPHICS());
    txtPanel = new JPanel(Layouts.FRAME_HUD_SECTION_TXT());

    parametersPanel.add(sectionsPanel, BorderLayout.NORTH);
    }

  private void createAndAddButtons()
    {
    generalButton = new JButton(Text.FRAME_HUD_SECTION_GENERAL);
    colorButton = new JButton(Text.FRAME_HUD_SECTION_COLORS);
    positioningButton = new JButton(Text.FRAME_HUD_SECTION_GRAPHICS);
    txtButton = new JButton(Text.FRAME_HUD_SECTION_TXT);

    sectionsPanel.add(generalButton);
    sectionsPanel.add(colorButton);
    sectionsPanel.add(positioningButton);
    sectionsPanel.add(txtButton);
    }

  private void setSectionButtonsActions()
    {
    generalButton.addActionListener(new OpenHudSection(generalPanel, parametersPanel, sectionsPanel));
    colorButton.addActionListener(new OpenHudSection(colorPanel, parametersPanel, sectionsPanel));
    positioningButton.addActionListener(new OpenHudSection(positioningPanel, parametersPanel, sectionsPanel));
    txtButton.addActionListener(new OpenHudSection(txtPanel, parametersPanel, sectionsPanel));
    }
  }