package gui;

import exec.laf.Files;
import exec.laf.Text;
import exec.laf.Spacing;
import exec.laf.Layouts;
import exec.laf.Colors;
import gui.combinations.*;
import gui.listeners.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;


public class ColorWindow extends JFrame
  {
  private class SliderResult implements ChangeListener
    {
    public void stateChanged(ChangeEvent event)
      {
      int red = redSlider.getValue();
      int green = greenSlider.getValue();
      int blue = blueSlider.getValue();

      updateColorPanel(red, green, blue);
      updateResultField(red, green, blue);
      }

    private void updateColorPanel(int red, int green, int blue)
      {
      Color newColor = new Color(red, green, blue);

      colorLabel.setBackground(newColor);
      }

    private void updateResultField(int red, int green, int blue)
      {
      double redRelative = (double)1/(double)255 * red;
      double greenRelative = (double)1/(double)255 * green;
      double blueRelative = (double)1/(double)255 * blue;

      String redFormatted = String.format("%.2f", redRelative);
      String greenFormatted = String.format("%.2f", greenRelative);
      String blueFormatted = String.format("%.2f", blueRelative);

      resultField.setText(Files.ARRAY_OPEN+redFormatted+Files.ARRAY_SEPARATOR+greenFormatted+Files.ARRAY_SEPARATOR+blueFormatted+Files.ARRAY_CLOSE);
      }
    }

  private JPanel mainPanel;
  private JPanel slidersPanel;

  private JTextField resultField;

  private JLabel colorLabel;

  private JSlider redSlider;
  private JSlider greenSlider;
  private JSlider blueSlider;

  private JButton commitPositiveButton;

  private LabeledTextField destinationField;

  public ColorWindow(int width, int height, String title, LabeledTextField destinationField)
    {
    setSize(width, height);
    setTitle(title);
    this.destinationField = destinationField;

    setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

    createAndAddPanels();

    createAndAddColorSliders();
    createAndAddColorLabel();
    createAndAddResultField();
    createAndAddCommitPositiveButton();

    setSlidersActions();
    setCommitPositiveAction();
    }

  private void createAndAddPanels()
    {
    createAndAddMainPanel();
    createAndAddSlidersPanel();
    }

  private void createAndAddCommitPositiveButton()
    {
    commitPositiveButton = new JButton(Text.BUTTON_POSITIVE_COMMIT);

    mainPanel.add(commitPositiveButton, BorderLayout.SOUTH);
    }

  private void createAndAddResultField()
    {
    resultField = new JTextField(destinationField.getValue());

    resultField.setHorizontalAlignment(JTextField.CENTER);

    mainPanel.add(resultField, BorderLayout.NORTH);
    }

  private void createAndAddColorLabel()
    {
    colorLabel = new JLabel(Spacing.CHOOSER_LABEL_WIDTH);

    colorLabel.setOpaque(true);
    colorLabel.setBackground(new Color(redSlider.getValue(), greenSlider.getValue(), blueSlider.getValue()));

    mainPanel.add(colorLabel, BorderLayout.WEST);
    }

  private void createAndAddColorSliders()
    {
    int redLoaded;
    int greenLoaded;
    int blueLoaded;

    String line = destinationField.getValue();
    int startBracketIndex = line.indexOf(Files.ARRAY_OPEN);
    int firstColonIndex = line.indexOf(Files.ARRAY_SEPARATOR);
    int secondColonIndex = line.lastIndexOf(Files.ARRAY_SEPARATOR);
    int endBracketIndex = line.lastIndexOf(Files.ARRAY_CLOSE);

    if (startBracketIndex != -1 && firstColonIndex != -1 && secondColonIndex != -1 && endBracketIndex != -1)
      {
      redLoaded = (int)(Double.parseDouble(line.substring(startBracketIndex+1, firstColonIndex))*255);
      greenLoaded = (int)(Double.parseDouble(line.substring(firstColonIndex+1, secondColonIndex))*255);
      blueLoaded = (int)(Double.parseDouble(line.substring(secondColonIndex+1, endBracketIndex))*255);
      }
    else
      {
      redLoaded = Colors.DEFAULT_VALUE;
      greenLoaded = Colors.DEFAULT_VALUE;
      blueLoaded = Colors.DEFAULT_VALUE;
      }

    redSlider = new JSlider(Colors.MINIMUM_VALUE, Colors.MAXIMUM_VALUE, redLoaded);
    greenSlider = new JSlider(Colors.MINIMUM_VALUE, Colors.MAXIMUM_VALUE, greenLoaded);
    blueSlider = new JSlider(Colors.MINIMUM_VALUE, Colors.MAXIMUM_VALUE, blueLoaded);

    redSlider.setBackground(Color.RED.darker());
    greenSlider.setBackground(Color.GREEN.darker());
    blueSlider.setBackground(Color.BLUE.darker());

    redSlider.setPaintTicks(true);
    greenSlider.setPaintTicks(true);
    blueSlider.setPaintTicks(true);

    slidersPanel.add(redSlider);
    slidersPanel.add(greenSlider);
    slidersPanel.add(blueSlider);
    }

  private void setSlidersActions()
    {
    redSlider.addChangeListener(new SliderResult());
    greenSlider.addChangeListener(new SliderResult());
    blueSlider.addChangeListener(new SliderResult());
    }

  private void setCommitPositiveAction()
    {
    commitPositiveButton.addActionListener(new CopyToParameter(resultField, destinationField));
    commitPositiveButton.addActionListener(new DisposeWindow(this));
    }

  private void createAndAddMainPanel()
    {
    mainPanel = new JPanel(Layouts.FRAME_CHOOSER());

    mainPanel.setBorder(Spacing.summonFrameBorder());

    add(mainPanel);
    }

  private void createAndAddSlidersPanel()
    {
    slidersPanel = new JPanel(Layouts.FRAME_CHOOSER_SLIDERS());

    mainPanel.add(slidersPanel, BorderLayout.CENTER);
    }
  }