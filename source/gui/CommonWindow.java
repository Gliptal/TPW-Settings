package gui;

import exec.userinterface.*;
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
    }

  private void createAndAddPanels()
    {
    mainPanel = new JPanel(new BorderLayout(Spacing.WINDOW_SECTIONS, Spacing.WINDOW_SECTIONS));
    commitPanel = new JPanel(new GridLayout(1, 3, Spacing.GRID_LAYOUT, Spacing.GRID_LAYOUT));

    mainPanel.setBorder(new EmptyBorder(Spacing.WINDOW, Spacing.WINDOW, Spacing.WINDOW, Spacing.WINDOW));

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
  }