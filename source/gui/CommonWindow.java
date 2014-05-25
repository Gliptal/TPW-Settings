package gui;

import exec.laf.Text;
import exec.laf.Files;
import exec.laf.Spacing;
import exec.laf.Layouts;
import gui.listeners.*;
import java.awt.*;
import javax.swing.*;


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

    setCommitButtonsActions();
    }

  protected void overrideSize(int width, int height)
    {
    setSize(width, height);
    }

  private void createAndAddPanels()
    {
    mainPanel = new JPanel(Layouts.FRAME_COMMON());
    commitPanel = new JPanel(Layouts.FRAME_COMMON_COMMITS());

    mainPanel.setBorder(Spacing.summonFrameBorder());

    add(mainPanel);
    mainPanel.add(commitPanel, BorderLayout.SOUTH);
    }

  private void createAndAddCommitButtons()
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
    commitPositiveButton.addActionListener(new WriteValuestToFile(Files.CONFIG));
    }
  }