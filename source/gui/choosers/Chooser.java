package gui.choosers;

import java.awt.*;
import javax.swing.*;

import exec.laf.*;
import gui.components.*;
import gui.listeners.fileio.*;
import gui.listeners.windows.*;


public abstract class Chooser extends JFrame
  {
  protected JPanel mainPanel;

  protected JTextField resultField;
  protected JButton commitButton;

  protected TextFieldParameter destinationField;

  public Chooser(int width, int height, String title, TextFieldParameter destinationField)
    {
    setSize(width, height);
    setTitle(title);
    this.destinationField = destinationField;

    setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

    forgeMainPanel();

    forgeResultField();
    forgeCommitButton();

    setCommitAction();
    }

  private void forgeMainPanel()
    {
    mainPanel = new JPanel(Layouts.FRAME_CHOOSER());

    mainPanel.setBorder(Spacing.summonFrameBorder());

    add(mainPanel);
    }

  private void forgeResultField()
    {
    resultField = new JTextField(destinationField.getValue());

    resultField.setHorizontalAlignment(JTextField.CENTER);

    mainPanel.add(resultField, BorderLayout.NORTH);
    }

  private void forgeCommitButton()
    {
    commitButton = new JButton(Text.BUTTON_POSITIVE_COMMIT);

    mainPanel.add(commitButton, BorderLayout.SOUTH);
    }

  private void setCommitAction()
    {
    commitButton.addActionListener(new CopyValue(resultField, destinationField));
    commitButton.addActionListener(new DisposeWindow(this));
    }
  }