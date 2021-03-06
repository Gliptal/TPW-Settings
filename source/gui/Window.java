package gui;

import java.awt.*;
import javax.swing.*;

import exec.*;
import exec.theme.*;
import gui.components.*;
import gui.listeners.fileio.*;


public abstract class Window extends FlatFrame
  {
  protected JPanel mainPanel;
  private   JPanel commitPanel;

  private CursoredButton negativeButton;
  private CursoredButton positiveButton;

  protected Window(int width, int height, String title)
    {
    super(width, height, title);

    forgePanels();
    forgeButtons();

    tailorPanels();

    setButtonsActions();
    }

  private void forgePanels()
    {
    mainPanel   = new JPanel(Layouts.WINDOW());
    commitPanel = new JPanel(Layouts.COMMITS());

    add(mainPanel, BorderLayout.CENTER);
    mainPanel.add(commitPanel, BorderLayout.SOUTH);
    }

  private void forgeButtons()
    {
    negativeButton = new CursoredButton(Text.COMMIT_NEGATIVE);
    positiveButton = new CursoredButton(Text.COMMIT_POSITIVE);

    commitPanel.add(Layouts.summonPlaceholder());
    commitPanel.add(negativeButton);
    commitPanel.add(positiveButton);
    }

  private void tailorPanels()
    {
    mainPanel.setBorder(Layouts.summonFrameBorder());
    }

  private void setButtonsActions()
    {
    negativeButton.addActionListener(new RevertValues());
    positiveButton.addActionListener(new WriteValuesToFile(Files.CONFIG));
    }
  }