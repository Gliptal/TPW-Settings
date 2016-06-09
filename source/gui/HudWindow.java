package gui;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import exec.*;
import exec.theme.*;
import gui.components.*;


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

  private CursoredButton generalButton;
  private CursoredButton colorButton;
  private CursoredButton graphicsButton;
  private CursoredButton txtButton;

  public HudWindow(String title)
    {
    super(title);

    setSize(Frames.HUD_WIDTH, Frames.HUD_HEIGHT);
    overrideParametersPanelLayout(Layouts.HUD_TABBED());

    forgePanels();
    forgeButtons();

    setSectionButtonsActions();
    }

  public void addParameterToSection(JPanel parameter, String section)
    {
    switch (section)
      {
      case Text.HUD_TAB_GENERAL:
        generalPanel.add(parameter);
        break;
      case Text.HUD_TAB_COLORS:
        colorPanel.add(parameter);
        break;
      case Text.HUD_TAB_GRAPHICS:
        graphicsPanel.add(parameter);
        break;
      case Text.HUD_TAB_TXT:
        txtPanel.add(parameter);
        break;
      }
    }

  public void fillWithPlaceholders()
    {
    Layouts.fillWithPlaceholders(generalPanel);
    Layouts.fillWithPlaceholders(colorPanel);
    Layouts.fillWithPlaceholders(graphicsPanel);
    Layouts.fillWithPlaceholders(txtPanel);
    }

  private void forgePanels()
    {
    sectionsPanel = new JPanel(Layouts.HUD_TABS());
    generalPanel  = new JPanel(Layouts.PARAMETERS_GRID());
    colorPanel    = new JPanel(Layouts.PARAMETERS_GRID());
    graphicsPanel = new JPanel(Layouts.PARAMETERS_GRID());
    txtPanel      = new JPanel(Layouts.PARAMETERS_GRID());

    parametersPanel.add(sectionsPanel, BorderLayout.NORTH);
    }

  private void forgeButtons()
    {
    generalButton  = new CursoredButton(Text.HUD_TAB_GENERAL);
    colorButton    = new CursoredButton(Text.HUD_TAB_COLORS);
    graphicsButton = new CursoredButton(Text.HUD_TAB_GRAPHICS);
    txtButton      = new CursoredButton(Text.HUD_TAB_TXT);

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