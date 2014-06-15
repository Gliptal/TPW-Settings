package gui.choosers;

import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

import exec.laf.*;
import gui.components.*;


public class ColorChooser extends Chooser
  {
  private class UpdateChooser implements ChangeListener
    {
    private int red;
    private int green;
    private int blue;

    public void stateChanged(ChangeEvent event)
      {
      red = redSlider.getValue();
      green = greenSlider.getValue();
      blue = blueSlider.getValue();

      updateColorPanel();
      updateResultField();
      }

    private void updateColorPanel()
      {
      Color setColor = new Color(red, green, blue);

      colorLabel.setBackground(setColor);
      }

    private void updateResultField()
      {
      double redRelative = 1f/255f * red;
      double greenRelative = 1f/255f * green;
      double blueRelative = 1f/255f * blue;

      String redFormatted = String.format("%.2f", redRelative);
      String greenFormatted = String.format("%.2f", greenRelative);
      String blueFormatted = String.format("%.2f", blueRelative);

      resultField.setText(Files.ARRAY_OPEN+redFormatted+Files.ARRAY_SEPARATOR+greenFormatted+Files.ARRAY_SEPARATOR+blueFormatted+Files.ARRAY_CLOSE);
      }
    }

  private JPanel slidersPanel;

  private JSlider redSlider;
  private JSlider greenSlider;
  private JSlider blueSlider;
  private JLabel colorLabel;

  public ColorChooser(int width, int height, String title, TextFieldParameter destinationField)
    {
    super(width, height, title, destinationField);

    forgePanels();

    forgeColorSliders();
    forgeColorLabel();

    tailorColorSliders();

    setSlidersActions();
    }

  private void forgePanels()
    {
    slidersPanel = new JPanel(Layouts.FRAME_CHOOSER_SLIDERS());

    mainPanel.setBorder(Spacing.summonFrameBorder());

    mainPanel.add(slidersPanel, BorderLayout.CENTER);
    }

  private void forgeColorLabel()
    {
    colorLabel = new JLabel(Spacing.CHOOSER_LABEL_WIDTH);

    colorLabel.setOpaque(true);
    colorLabel.setBackground(new Color(redSlider.getValue(), greenSlider.getValue(), blueSlider.getValue()));

    mainPanel.add(colorLabel, BorderLayout.WEST);
    }

  private void forgeColorSliders()
    {
    Color setColor = summonSetColor();

    redSlider = new JSlider(Colors.MINIMUM_VALUE, Colors.MAXIMUM_VALUE, setColor.getRed());
    greenSlider = new JSlider(Colors.MINIMUM_VALUE, Colors.MAXIMUM_VALUE,  setColor.getGreen());
    blueSlider = new JSlider(Colors.MINIMUM_VALUE, Colors.MAXIMUM_VALUE,  setColor.getBlue());

    slidersPanel.add(redSlider);
    slidersPanel.add(greenSlider);
    slidersPanel.add(blueSlider);
    }

  private void tailorColorSliders()
    {
    redSlider.setBackground(Colors.SLIDER_RED);
    greenSlider.setBackground(Colors.SLIDER_GREEN);
    blueSlider.setBackground(Colors.SLIDER_BLUE);

    redSlider.setMajorTickSpacing(Colors.SLIDER_MAJOR_TICK_SPACING);
    greenSlider.setMajorTickSpacing(Colors.SLIDER_MAJOR_TICK_SPACING);
    blueSlider.setMajorTickSpacing(Colors.SLIDER_MAJOR_TICK_SPACING);

    redSlider.setMinorTickSpacing(Colors.SLIDER_MINOR_TICK_SPACING);
    greenSlider.setMinorTickSpacing(Colors.SLIDER_MINOR_TICK_SPACING);
    blueSlider.setMinorTickSpacing(Colors.SLIDER_MINOR_TICK_SPACING);

    redSlider.setPaintTicks(true);
    greenSlider.setPaintTicks(true);
    blueSlider.setPaintTicks(true);
    }

  private void setSlidersActions()
    {
    redSlider.addChangeListener(new UpdateChooser());
    greenSlider.addChangeListener(new UpdateChooser());
    blueSlider.addChangeListener(new UpdateChooser());
    }

  private Color summonSetColor()
    {
    int red;
    int green;
    int blue;

    String line = resultField.getText();
    int startBracketIndex = line.indexOf(Files.ARRAY_OPEN);
    int firstColonIndex = line.indexOf(Files.ARRAY_SEPARATOR);
    int secondColonIndex = line.lastIndexOf(Files.ARRAY_SEPARATOR);
    int endBracketIndex = line.lastIndexOf(Files.ARRAY_CLOSE);

    if (inputIsCorrect(startBracketIndex, firstColonIndex, secondColonIndex, endBracketIndex))
      {
      String redParsed = line.substring(startBracketIndex+1, firstColonIndex);
      String greenParsed = line.substring(firstColonIndex+1, secondColonIndex);
      String blueParsed = line.substring(secondColonIndex+1, endBracketIndex);

      red = (int)(Double.parseDouble(redParsed)*255);
      green = (int)(Double.parseDouble(greenParsed)*255);
      blue = (int)(Double.parseDouble(blueParsed)*255);
      }
    else
      {
      red = Colors.DEFAULT_VALUE;
      green = Colors.DEFAULT_VALUE;
      blue = Colors.DEFAULT_VALUE;
      }

    return new Color(red, green, blue);
    }

  private boolean inputIsCorrect(int startBracketIndex, int firstColonIndex, int secondColonIndex, int endBracketIndex)
    {
    return startBracketIndex != -1 && firstColonIndex != -1 && secondColonIndex != -1 && endBracketIndex != -1;
    }
  }