package gui;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import exec.*;
import exec.laf.*;
import gui.components.*;


public class IconChooser extends Chooser
  {
  private class UpdateChooser extends MouseAdapter
    {
    private String id;

    private UpdateChooser(int id)
      {
      this.id = String.valueOf(id);
      }

    public void mouseClicked(MouseEvent event)
      {
      updateIconValues();
      writeIconValues();
      }

    private void updateIconValues()
      {
      for (int i = 0; i < ICON_TYPES; i += 1)
        {
        if (checkBoxes[i].getCheckBox().isSelected())
          iconIds[i] = id;
        }
      }

    private void writeIconValues()
      {
      resultField.setText(Files.ARRAY_OPEN);

      for (int i = 0; i < ICON_TYPES; i += 1)
        {
        appendToResultField(iconIds[i]);

        if (i != ICON_TYPES-1)
          appendToResultField(Files.ARRAY_SEPARATOR);
        }

      appendToResultField(Files.ARRAY_CLOSE);
      }

    private void appendToResultField(String text)
      {
      String existingText = resultField.getText();

      resultField.setText(existingText+text);
      }
    }

  public static final int ICON_TYPES = 10;
  private static final int ICON_VARIATIONS = 34;

  private JPanel iconsPanel;
  private JPanel checkBoxesPanel;

  private JLabel[] iconTiles;
  private LabeledCheckBox[] checkBoxes;

  private String[] iconIds;

  public IconChooser(int width, int height, String title, TextFieldParameter destinationField)
    {
    super(width, height, title, destinationField);

    forgePanels();

    forgeIconTiles();
    forgeCheckBoxes();

    tailorIconTiles();

    setIconActions();

    loadIconValues();
    }

  private void forgePanels()
    {
    iconsPanel = new JPanel(Layouts.FRAME_CHOOSER_ICONS());
    checkBoxesPanel = new JPanel(Layouts.FRAME_CHOOSER_CHECKBOXES());

    mainPanel.add(iconsPanel, BorderLayout.CENTER);
    mainPanel.add(checkBoxesPanel, BorderLayout.EAST);
    }

  private void forgeIconTiles()
    {
    iconTiles = new JLabel[ICON_VARIATIONS];

    for (int i = 0; i < ICON_VARIATIONS; i += 1)
      {
      iconTiles[i] = new JLabel();

      iconsPanel.add(iconTiles[i]);
      }
    }

  private void forgeCheckBoxes()
    {
    checkBoxes = new LabeledCheckBox[ICON_TYPES];

    for (int i = 0; i < ICON_TYPES; i += 1)
      {
      checkBoxes[i] = new LabeledCheckBox(Text.FRAME_ICON_CHOOSER_TYPES[i]);

      checkBoxesPanel.add(checkBoxes[i]);
      }
    }

  private void tailorIconTiles()
    {
    for (int i = 0; i < ICON_VARIATIONS; i += 1)
      {
      iconTiles[i].setOpaque(true);
      iconTiles[i].setBackground(Colors.ICON_BACKGROUND);
      iconTiles[i].setHorizontalAlignment(JLabel.CENTER);
      iconTiles[i].setIcon(summonImageIcon(i));
      }
    }

  private void setIconActions()
    {
    for (int i = 0; i < ICON_VARIATIONS; i += 1)
      iconTiles[i].addMouseListener(new UpdateChooser(i));
    }

  private void loadIconValues()
    {
    iconIds = new String[ICON_TYPES];

    String line = resultField.getText();
    int[] markersIndexes = new int[ICON_TYPES+1];

    markersIndexes[0] = line.indexOf(Files.ARRAY_OPEN);
    for (int i = 1; i < markersIndexes.length-1; i += 1)
      markersIndexes[i] = Utils.ordinalIndexOf(line, Files.ARRAY_SEPARATOR, i);
    markersIndexes[markersIndexes.length-1] = line.lastIndexOf(Files.ARRAY_CLOSE);

    if (inputIsCorrect(markersIndexes))
      {
      for (int i = 0; i < ICON_TYPES; i += 1)
        iconIds[i] = line.substring(markersIndexes[i]+1, markersIndexes[i+1]);
      }
    else
      {
      for (int i = 0; i < ICON_TYPES; i += 1)
        iconIds[i] = Text.FRAME_ICON_CHOOSER_DEFAULT_TYPE;
      }
    }

  private ImageIcon summonImageIcon(int iconId)
    {
    String iconName = String.valueOf(iconId)+Files.ICON_EXTENSION;

    return new ImageIcon(getClass().getResource(Files.ICON_URL+iconName));
    }

  private boolean inputIsCorrect(int[] markersIndexes)
    {
    for (int i = 0; i < markersIndexes.length; i += 1)
      {
      if (markersIndexes[i] == -1)
        return false;
      }

    return true;
    }
  }