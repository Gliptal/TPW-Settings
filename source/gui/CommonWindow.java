package gui;

import exec.userinterface.*;
import fileio.*;
import gui.listeners.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;


public class CommonWindow extends JFrame
  {
  protected JPanel mainPanel;
  private JPanel commitPanel;

  private JButton commitNegativeButton;
  private JButton commitPositiveButton;

  protected CommonWindow(int width, int height, String title)
    {
    setSize(width, height);
    setTitle(title);

    createAndAddPanels();
    createAndAddCommitButtons();

    setButtonListeners();
    }

  private void createAndAddPanels()
    {
    mainPanel = new JPanel(new BorderLayout(Spacing.WINDOW_INNER, Spacing.WINDOW_INNER));
    commitPanel = new JPanel(new GridLayout(1, 3, Spacing.GRID_BUTTONS, Spacing.GRID_BUTTONS));

    mainPanel.setBorder(new EmptyBorder(Spacing.WINDOW_OUTER, Spacing.WINDOW_OUTER, Spacing.WINDOW_OUTER, Spacing.WINDOW_OUTER));

    this.add(mainPanel);
    mainPanel.add(commitPanel, BorderLayout.SOUTH);
    }

  private void createAndAddCommitButtons()
    {
    commitNegativeButton = new JButton(Buttons.COMMIT_NEGATIVE);
    commitPositiveButton = new JButton(Buttons.COMMIT_POSITIVE);

    commitPanel.add(Spacing.createPlaceholder());
    commitPanel.add(commitNegativeButton);
    commitPanel.add(commitPositiveButton);
    }

  private void setButtonListeners()
    {
    setCommitButtonListeners();
    }

  private void setCommitButtonListeners()
    {
    commitNegativeButton.addActionListener(new WriteFromRevertFileListener(ActionBuffer.CONFIG_FILE_NAME));
    commitPositiveButton.addActionListener(new WriteFileListener(ActionBuffer.CONFIG_FILE_NAME));
    }
  }