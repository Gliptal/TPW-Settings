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
        resultField.setText(resultField.getText()+iconIds[i]);

        if (i != ICON_TYPES-1)
          resultField.setText(resultField.getText()+Files.ARRAY_SEPARATOR);
        }

      resultField.setText(resultField.getText()+Files.ARRAY_CLOSE);
      }
    }

  private ImageIcon[] ICON_IMAGES = {new ImageIcon(getClass().getResource(Files.ICON_URL+"0.png")),
                                     new ImageIcon(getClass().getResource(Files.ICON_URL+"1.png")),
                                     new ImageIcon(getClass().getResource(Files.ICON_URL+"2.png")),
                                     new ImageIcon(getClass().getResource(Files.ICON_URL+"3.png")),
                                     new ImageIcon(getClass().getResource(Files.ICON_URL+"4.png")),
                                     new ImageIcon(getClass().getResource(Files.ICON_URL+"5.png")),
                                     new ImageIcon(getClass().getResource(Files.ICON_URL+"6.png")),
                                     new ImageIcon(getClass().getResource(Files.ICON_URL+"7.png")),
                                     new ImageIcon(getClass().getResource(Files.ICON_URL+"8.png")),
                                     new ImageIcon(getClass().getResource(Files.ICON_URL+"9.png")),
                                     new ImageIcon(getClass().getResource(Files.ICON_URL+"10.png")),
                                     new ImageIcon(getClass().getResource(Files.ICON_URL+"11.png")),
                                     new ImageIcon(getClass().getResource(Files.ICON_URL+"12.png")),
                                     new ImageIcon(getClass().getResource(Files.ICON_URL+"13.png")),
                                     new ImageIcon(getClass().getResource(Files.ICON_URL+"14.png")),
                                     new ImageIcon(getClass().getResource(Files.ICON_URL+"15.png")),
                                     new ImageIcon(getClass().getResource(Files.ICON_URL+"16.png")),
                                     new ImageIcon(getClass().getResource(Files.ICON_URL+"17.png")),
                                     new ImageIcon(getClass().getResource(Files.ICON_URL+"18.png")),
                                     new ImageIcon(getClass().getResource(Files.ICON_URL+"19.png")),
                                     new ImageIcon(getClass().getResource(Files.ICON_URL+"20.png")),
                                     new ImageIcon(getClass().getResource(Files.ICON_URL+"21.png")),
                                     new ImageIcon(getClass().getResource(Files.ICON_URL+"22.png")),
                                     new ImageIcon(getClass().getResource(Files.ICON_URL+"23.png")),
                                     new ImageIcon(getClass().getResource(Files.ICON_URL+"24.png")),
                                     new ImageIcon(getClass().getResource(Files.ICON_URL+"25.png")),
                                     new ImageIcon(getClass().getResource(Files.ICON_URL+"26.png")),
                                     new ImageIcon(getClass().getResource(Files.ICON_URL+"27.png")),
                                     new ImageIcon(getClass().getResource(Files.ICON_URL+"28.png")),
                                     new ImageIcon(getClass().getResource(Files.ICON_URL+"29.png")),
                                     new ImageIcon(getClass().getResource(Files.ICON_URL+"30.png")),
                                     new ImageIcon(getClass().getResource(Files.ICON_URL+"31.png")),
                                     new ImageIcon(getClass().getResource(Files.ICON_URL+"32.png")),
                                     new ImageIcon(getClass().getResource(Files.ICON_URL+"33.png"))};

  private int ICON_NUMBER = ICON_IMAGES.length;
  public static final int ICON_TYPES = 10;

  private JPanel iconsPanel;
  private JPanel checkBoxesPanel;

  private JLabel[] iconImages;
  private LabeledCheckBox[] checkBoxes;

  private String[] iconIds;

  public IconChooser(int width, int height, String title, TextFieldParameter destinationField)
    {
    super(width, height, title, destinationField);

    forgePanels();

    forgeIcons();
    forgeCheckBoxes();

    tailorIcons();

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

  private void forgeIcons()
    {
    iconImages = new JLabel[ICON_NUMBER];

    for (int i = 0; i < ICON_NUMBER; i += 1)
      {
      iconImages[i] = new JLabel(ICON_IMAGES[i]);

      iconsPanel.add(iconImages[i]);
      }
    }

  private void forgeCheckBoxes()
    {
    checkBoxes = new LabeledCheckBox[ICON_TYPES];

    for (int i = 0; i < ICON_TYPES; i += 1)
      {
      checkBoxes[i] = new LabeledCheckBox(Text.FRAME_ICON_CHOOSER_ICONS[i]);

      checkBoxesPanel.add(checkBoxes[i]);
      }
    }

  private void tailorIcons()
    {
    for (int i = 0; i < ICON_NUMBER; i += 1)
      {
      iconImages[i].setOpaque(true);
      iconImages[i].setBackground(Colors.ICON_BACKGROUND);
      }
    }

  private void setIconActions()
    {
    for (int i = 0; i < ICON_NUMBER; i += 1)
      iconImages[i].addMouseListener(new UpdateChooser(i));
    }

  private void loadIconValues()
    {
    iconIds = new String[ICON_TYPES];
    int[] markersIndexes = new int[ICON_TYPES+1];
    for (int i = 0; i < markersIndexes.length; i += 1)
      markersIndexes[i] = -1;

    String line = resultField.getText();

    markersIndexes[0] = line.indexOf(Files.ARRAY_OPEN);
    for (int i = 1; i < markersIndexes.length-1; i += 1)
      markersIndexes[i] = Utils.ordinalIndexOf(line, Files.ARRAY_SEPARATOR, i);
    markersIndexes[markersIndexes.length-1] = line.lastIndexOf(Files.ARRAY_CLOSE);

    if (lineIsIcons(markersIndexes))
      {
      for (int i = 0; i < ICON_TYPES; i += 1)
        iconIds[i] = line.substring(markersIndexes[i]+1, markersIndexes[i+1]);
      }
    else
      {
      for (int i = 0; i < ICON_TYPES; i += 1)
        iconIds[i] = "0";
      }
    }

  private boolean lineIsIcons(int[] markersIndexes)
    {
    for (int i = 0; i < markersIndexes.length; i += 1)
      {
      if (markersIndexes[i] == -1)
        return false;
      }

    return true;
    }
  }