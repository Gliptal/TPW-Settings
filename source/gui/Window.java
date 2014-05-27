package gui;

import java.awt.*;
import javax.swing.*;

import exec.laf.*;
import gui.listeners.fileio.*;


public abstract class Window extends JFrame
  {
  protected JPanel mainPanel;
  private JPanel commitPanel;

  private JButton commitNegativeButton;
  private JButton commitPositiveButton;

  protected Window(int width, int height, String title)
    {
    setSize(width, height);
    setTitle(title);

    forgePanels();

    forgeCommitButtons();

    setCommitButtonsActions();
    }

  protected void overrideSize(int width, int height)
    {
    setSize(width, height);
    }

  private void forgePanels()
    {
    mainPanel = new JPanel(Layouts.FRAME_COMMON());
    commitPanel = new JPanel(Layouts.FRAME_COMMON_COMMITS());

    mainPanel.setBorder(Spacing.summonFrameBorder());

    add(mainPanel);
    mainPanel.add(commitPanel, BorderLayout.SOUTH);
    }

  private void forgeCommitButtons()
    {
    commitNegativeButton = new JButton(Text.BUTTON_NEGATIVE_COMMIT);
    commitPositiveButton = new JButton(Text.BUTTON_POSITIVE_COMMIT);

    commitPanel.add(Spacing.summonPlaceholder());
    commitPanel.add(commitNegativeButton);
    commitPanel.add(commitPositiveButton);
    }

  private void setCommitButtonsActions()
    {
    commitNegativeButton.addActionListener(new RevertValues());
    commitPositiveButton.addActionListener(new WriteValuesToFile(Files.CONFIG));
    }
  }