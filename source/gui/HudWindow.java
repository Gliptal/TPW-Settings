package gui;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import exec.laf.*;


public class HudWindow extends ModWindow
  {
  private class OpenHudSection implements ActionListener
    {
    private JPanel selectedSection;

    private OpenHudSection(JPanel selectedSection)
      {
      this.selectedSection = selectedSection;
      }

    public void actionPerformed(ActionEvent event)
      {
      parametersPanel.removeAll();
      parametersPanel.add(sectionsPanel, BorderLayout.NORTH);
      parametersPanel.add(selectedSection, BorderLayout.CENTER);

      parametersPanel.revalidate();
      parametersPanel.repaint();
      }
    }

  private JPanel sectionsPanel;
  private JPanel generalPanel;
  private JPanel colorPanel;
  private JPanel graphicsPanel;
  private JPanel txtPanel;

  private JButton generalButton;
  private JButton colorButton;
  private JButton graphicsButton;
  private JButton txtButton;

  public HudWindow(String title)
    {
    super(title);

    overrideSize(Frames.HUD_WIDTH, Frames.HUD_HEIGHT);
    overrideParametersPanelLayout(Layouts.FRAME_HUD_INNER());

    forgePanels();

    forgeButtons();

    setSectionButtonsActions();
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
        graphicsPanel.add(parameter);
        break;
      case Text.FRAME_HUD_SECTION_TXT:
        txtPanel.add(parameter);
        break;
      }
    }

  public void fillWithPlaceholders()
    {
    Spacing.addPlaceholdersToEmptySlots(generalPanel);
    Spacing.addPlaceholdersToEmptySlots(colorPanel);
    Spacing.addPlaceholdersToEmptySlots(graphicsPanel);
    Spacing.addPlaceholdersToEmptySlots(txtPanel);
    }

  private void forgePanels()
    {
    sectionsPanel = new JPanel(Layouts.FRAME_HUD_SECTIONS());
    generalPanel = new JPanel(Layouts.FRAME_HUD_SECTION_GENERAL());
    colorPanel = new JPanel(Layouts.FRAME_HUD_SECTION_COLOR());
    graphicsPanel = new JPanel(Layouts.FRAME_HUD_SECTION_GRAPHICS());
    txtPanel = new JPanel(Layouts.FRAME_HUD_SECTION_TXT());

    parametersPanel.add(sectionsPanel, BorderLayout.NORTH);
    }

  private void forgeButtons()
    {
    generalButton = new JButton(Text.FRAME_HUD_SECTION_GENERAL);
    colorButton = new JButton(Text.FRAME_HUD_SECTION_COLORS);
    graphicsButton = new JButton(Text.FRAME_HUD_SECTION_GRAPHICS);
    txtButton = new JButton(Text.FRAME_HUD_SECTION_TXT);

    sectionsPanel.add(generalButton);
    sectionsPanel.add(colorButton);
    sectionsPanel.add(graphicsButton);
    sectionsPanel.add(txtButton);
    }

  private void setSectionButtonsActions()
    {
    generalButton.addActionListener(new OpenHudSection(generalPanel));
    colorButton.addActionListener(new OpenHudSection(colorPanel));
    graphicsButton.addActionListener(new OpenHudSection(graphicsPanel));
    txtButton.addActionListener(new OpenHudSection(txtPanel));
    }
  }