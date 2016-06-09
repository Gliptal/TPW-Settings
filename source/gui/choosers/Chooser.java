package gui.choosers;

import java.awt.*;
import javax.swing.*;

import exec.*;
import exec.theme.*;
import gui.*;
import gui.components.*;
import gui.listeners.fileio.*;
import gui.listeners.windows.*;


public abstract class Chooser extends FlatFrame
  {
  protected JPanel mainPanel;

  protected JTextField resultField;
  protected CursoredButton commitButton;

  protected TextFieldParameter destinationField;

  public Chooser(int width, int height, String title, TextFieldParameter destinationField)
    {
    super(width, height, title);
    this.destinationField = destinationField;

    setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

    forgePanels();
    forgeResultField();
    forgeCommitButton();

    tailorPanels();
    tailorResultField();

    setCommitActions();
    }

  private void forgePanels()
    {
    mainPanel = new JPanel(Layouts.CHOOSER());

    add(mainPanel);
    }

  private void forgeResultField()
    {
    resultField = new JTextField(destinationField.getValue());

    mainPanel.add(resultField, BorderLayout.NORTH);
    }

  private void forgeCommitButton()
    {
    commitButton = new CursoredButton(Text.COMMIT_POSITIVE);

    mainPanel.add(commitButton, BorderLayout.SOUTH);
    }

  private void tailorPanels()
    {
    mainPanel.setBorder(Layouts.summonFrameBorder());
    }

  private void tailorResultField()
    {
    resultField.setHorizontalAlignment(JTextField.CENTER);
    }

  private void setCommitActions()
    {
    commitButton.addActionListener(new CopyValue(resultField, destinationField));
    commitButton.addActionListener(new DisposeWindow(this));
    }
  }