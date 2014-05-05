package gui.listeners;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class OpenHudSection implements ActionListener
  {
  private JPanel parameters;
  private JPanel parametersPanel;
  private JPanel sectionsPanel;

  public OpenHudSection(JPanel parameters, JPanel parametersPanel, JPanel sectionsPanel)
    {
    this.parameters = parameters;
    this.parametersPanel = parametersPanel;
    this.sectionsPanel = sectionsPanel;
    }

  public void actionPerformed(ActionEvent event)
    {
    parametersPanel.removeAll();
    parametersPanel.add(sectionsPanel, BorderLayout.NORTH);
    parametersPanel.add(parameters, BorderLayout.CENTER);

    parametersPanel.revalidate();
    parametersPanel.repaint();
    }
  }