package gui;

import exec.userinterface.*;
import gui.listeners.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;


public class CommonWindow extends JFrame
  {
  protected JPanel mainPanel;
  private JPanel commitPanel;

  private JButton commitPositiveButton;
  private JButton commitNegativeButton;

  protected CommonWindow(int width, int height, String title)
    {
    setSize(width, height);
    setTitle(title);

    createAndAddPanels();
    createAndAddCommitButtons();

    setCommitButtonsActions();
    }

  public void overrideSize(int width, int height)
    {
    setSize(width, height);
    }

  private void createAndAddPanels()
    {
    mainPanel = new JPanel(Layouts.MAIN());
    commitPanel = new JPanel(Layouts.COMMITS());

    mainPanel.setBorder(new EmptyBorder(Spacing.WINDOW_OUTER, Spacing.WINDOW_OUTER, Spacing.WINDOW_OUTER, Spacing.WINDOW_OUTER));

    add(mainPanel);
    mainPanel.add(commitPanel, BorderLayout.SOUTH);
    }

  private void createAndAddCommitButtons()
    {
    commitPositiveButton = new JButton(Text.BUTTON_NEGATIVE_COMMIT);
    commitNegativeButton = new JButton(Text.BUTTON_POSITIVE_COMMIT);

    commitPanel.add(Spacing.createPlaceholder());
    commitPanel.add(commitPositiveButton);
    commitPanel.add(commitNegativeButton);
    }

  private void setCommitButtonsActions()
    {
    commitPositiveButton.addActionListener(new RevertValues());
    commitNegativeButton.addActionListener(new WriteValuestToFile(Files.CONFIG));
    }
  }