package gui;

import exec.*;
import exec.userinterface.*;
import gui.listeners.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;
import mods.*;
import mods.factories.*;


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

      resultField.setText(Text.ARRAY_OPEN+redFormatted+Text.ARRAY_SEPARATOR+greenFormatted+Text.ARRAY_SEPARATOR+blueFormatted+Text.ARRAY_CLOSE);
      }
    }

  private JPanel mainPanel;
  private JPanel resultPanel;
  private JPanel copyButtonsPanel;
  private JPanel slidersPanel;

  private JTextField resultField;

  private JLabel colorLabel;

  private JSlider redSlider;
  private JSlider greenSlider;
  private JSlider blueSlider;

  private JButton baseColorButton;
  private JButton secondaryColorButton;
  private JButton enemyColorButton;

  public ColorWindow(int width, int height, String title)
    {
    setSize(width, height);
    setTitle(title);

    createAndAddPanels();

    createAndAddCopyButtons();
    createAndAddResultField();
    createAndAddColorLabel();
    createAndAddColorSliders();

    setColorButtonsActions();
    setSlidersActions();
    }

  public void setFrameBelow(JFrame frame)
    {
    int xCoordinate = (int)frame.getLocation().getX();
    int yCoordinate = (int)frame.getLocation().getY() + frame.getHeight();

    setLocation(xCoordinate, yCoordinate);
    }

  private void createAndAddPanels()
    {
    createAndAddMainPanel();
    createAndAddResultPanel();
    createAndAddCopyButtonsPanel();
    createAndAddSlidersPanel();
    }

  private void createAndAddCopyButtons()
    {
    baseColorButton = new JButton(Text.BUTTON_CHOOSER_COPY_BASE);
    secondaryColorButton = new JButton(Text.BUTTON_CHOOSER_COPY_SECONDARY);
    enemyColorButton = new JButton(Text.BUTTON_CHOOSER_COPY_ENEMY);

    copyButtonsPanel.add(baseColorButton);
    copyButtonsPanel.add(secondaryColorButton);
    copyButtonsPanel.add(enemyColorButton);
    }

  private void createAndAddResultField()
    {
    resultField = new JTextField(Text.COLOR_DEFAULT_STRING);

    resultField.setHorizontalAlignment(JTextField.CENTER);

    resultPanel.add(resultField);
    }

  private void createAndAddColorLabel()
    {
    colorLabel = new JLabel(Spacing.CHOOSER_LABEL_WIDTH);

    colorLabel.setOpaque(true);
    colorLabel.setBackground(new Color(Colors.DEFAULT_VALUE, Colors.DEFAULT_VALUE, Colors.DEFAULT_VALUE));

    mainPanel.add(colorLabel, BorderLayout.WEST);
    }

  private void createAndAddColorSliders()
    {
    redSlider = new JSlider(Colors.MINIMUM_VALUE, Colors.MAXIMUM_VALUE, Colors.DEFAULT_VALUE);
    greenSlider = new JSlider(Colors.MINIMUM_VALUE, Colors.MAXIMUM_VALUE, Colors.DEFAULT_VALUE);
    blueSlider = new JSlider(Colors.MINIMUM_VALUE, Colors.MAXIMUM_VALUE, Colors.DEFAULT_VALUE);

    redSlider.setBackground(Color.RED.darker());
    greenSlider.setBackground(Color.GREEN.darker());
    blueSlider.setBackground(Color.BLUE.darker());

    slidersPanel.add(redSlider);
    slidersPanel.add(greenSlider);
    slidersPanel.add(blueSlider);
    }

  private void setColorButtonsActions()
    {
    baseColorButton.addActionListener(new CopyToParameter(resultField, ((HudFactory)(Main.modFactories[CommonMod.HUD_ID])).getColourParameter()));
    secondaryColorButton.addActionListener(new CopyToParameter(resultField, ((HudFactory)(Main.modFactories[CommonMod.HUD_ID])).getSquadColourParameter()));
    enemyColorButton.addActionListener(new CopyToParameter(resultField, ((HudFactory)(Main.modFactories[CommonMod.HUD_ID])).getEnemyColourParameter()));
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

  private void createAndAddResultPanel()
    {
    resultPanel = new JPanel(Layouts.CHOOSER_RESULT());

    mainPanel.add(resultPanel, BorderLayout.NORTH);
    }

  private void createAndAddCopyButtonsPanel()
    {
    copyButtonsPanel = new JPanel(Layouts.CHOOSER_COPY_BUTTONS());

    resultPanel.add(copyButtonsPanel);
    }

  private void createAndAddSlidersPanel()
    {
    slidersPanel = new JPanel(Layouts.CHOOSER_SLIDERS());

    mainPanel.add(slidersPanel, BorderLayout.CENTER);
    }
  }