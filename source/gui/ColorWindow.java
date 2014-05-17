package gui;

import exec.userinterface.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;


public class ColorWindow extends JFrame
  {
  private class SliderResult implements ChangeListener
    {
    private static final String ARRAY_OPEN = "{";
    private static final String ARRAY_CLOSE = "}";
    private static final String ARRAY_SEPARATOR = ",";

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

      colorPanel.setBackground(newColor);
      }

    private void updateResultField(int red, int green, int blue)
      {
      double redRelative = (double)1/(double)255 * red;
      double greenRelative = (double)1/(double)255 * green;
      double blueRelative = (double)1/(double)255 * blue;

      String redFormatted = String.format("%.2f", redRelative);
      String greenFormatted = String.format("%.2f", greenRelative);
      String blueFormatted = String.format("%.2f", blueRelative);

      resultField.setText(ARRAY_OPEN+redFormatted+ARRAY_SEPARATOR+greenFormatted+ARRAY_SEPARATOR+blueFormatted+ARRAY_CLOSE);
      }
    }

  private JPanel mainPanel;
  private JPanel colorPanel;
  private JPanel slidersPanel;

  private JTextField resultField;

  private JSlider redSlider;
  private JSlider greenSlider;
  private JSlider blueSlider;

  public ColorWindow(int width, int height, String title)
    {
    setSize(width, height);
    setTitle(title);

    createAndAddPanels();

    createAndAddResultField();
    createAndAddColorSliders();

    setSlidersActions();
    }

  public void setFrameLeftOf(JFrame frame)
    {
    int xCoordinate = (int)frame.getLocation().getX() + frame.getWidth();
    int yCoordinate = (int)frame.getLocation().getY();

    setLocation(xCoordinate, yCoordinate);
    }

  private void createAndAddPanels()
    {
    createAndAddMainPanel();
    createAndAddColorPanel();
    createAndAddSlidersPanel();
    }

  private void createAndAddResultField()
    {
    resultField = new JTextField(Text.COLOR_DEFAULT_STRING);

    resultField.setHorizontalAlignment(JTextField.CENTER);

    mainPanel.add(resultField, BorderLayout.NORTH);
    }

  private void createAndAddColorSliders()
    {
    redSlider = new JSlider(Colors.MINIMUM_VALUE, Colors.MAXIMUM_VALUE, Colors.DEFAULT_VALUE);
    greenSlider = new JSlider(Colors.MINIMUM_VALUE, Colors.MAXIMUM_VALUE, Colors.DEFAULT_VALUE);
    blueSlider = new JSlider(Colors.MINIMUM_VALUE, Colors.MAXIMUM_VALUE, Colors.DEFAULT_VALUE);

    redSlider.setBackground(Color.RED);
    greenSlider.setBackground(Color.GREEN);
    blueSlider.setBackground(Color.BLUE);

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

  private void createAndAddMainPanel()
    {
    mainPanel = new JPanel(Layouts.CHOOSER());

    mainPanel.setBorder(Spacing.createFrameBorder());

    add(mainPanel);
    }

  private void createAndAddColorPanel()
    {
    colorPanel = new JPanel();

    colorPanel.setBackground(new Color(Colors.DEFAULT_VALUE, Colors.DEFAULT_VALUE, Colors.DEFAULT_VALUE));

    mainPanel.add(colorPanel, BorderLayout.CENTER);
    }

  private void createAndAddSlidersPanel()
    {
    slidersPanel = new JPanel(Layouts.CHOOSER_SLIDERS());

    mainPanel.add(slidersPanel, BorderLayout.SOUTH);
    }
  }