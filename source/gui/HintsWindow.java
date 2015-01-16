package gui;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

import exec.*;
import exec.theme.*;


public class HintsWindow extends FlatFrame
  {
  private JPanel mainPanel;
  private JLabel hintLabel;

  private JButton nextButton;

  private int currentHint;

  public HintsWindow()
    {
    super(Frames.HINTS_WIDTH, Frames.HINTS_HEIGHT, Text.HINTS);
    removeHintsButton();

    forgePanels();
    forgeLabels();
    forgeButtons();

    tailorPanels();

    setButtonsActions();

    showRandomHint();
    }

  private void forgePanels()
    {
    mainPanel = new JPanel(new BorderLayout());

    add(mainPanel);
    }

  private void forgeLabels()
    {
    hintLabel = new JLabel();

    mainPanel.add(hintLabel, BorderLayout.CENTER);
    }

  private void forgeButtons()
    {
    nextButton = new JButton(Text.HINT_NEXT);

    mainPanel.add(nextButton, BorderLayout.SOUTH);
    }

  private void tailorPanels()
    {
    mainPanel.setBorder(Layouts.summonHintsBorder());
    }

  private void setButtonsActions()
    {
    nextButton.addActionListener(
      new ActionListener()
        {
        public void actionPerformed(ActionEvent event)
          {
          showRandomHint();
          }
        }
      );
    }

  private void showRandomHint()
    {
    int hint;

    do
      hint = new Random().nextInt(Text.HINTS_TEXT.length);
    while (hint == currentHint);

    currentHint = hint;
    hintLabel.setText("<html><p width=\"404\">"+Text.HINTS_TEXT[hint]+"</html>");
    }
  }