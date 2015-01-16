package gui;

import java.awt.*;
import java.awt.event.*;
import java.net.*;
import javax.swing.*;

import exec.*;
import exec.theme.*;
import gui.listeners.windows.*;


public abstract class FlatFrame extends JFrame
  {
  private int posX;
  private int posY;

  private JPanel decorationPanel;
  private JPanel iconPanel;
  private JPanel buttonsPanel;

  private JButton hintsButton;
  private JButton iconifyButton;
  private JButton exitButton;

  protected FlatFrame(int width, int height, String title)
    {
    setSize(width, height);
    setUndecorated(true);
    setLayout(new BorderLayout());

    forgePanels();
    forgeButtons();

    tailorPanels();
    tailorButtons();

    setTitle(title);
    setIcon(Frames.ICON);
    setDraggable();

    setButtonsActions();
    }

  public void removeHintsButton()
    {
    buttonsPanel.remove(hintsButton);
    }

  public void setTitle(String title)
    {
    JLabel titleLabel = new JLabel();

    titleLabel.setText(title);
    titleLabel.setBorder(Layouts.summonTitleBorder());

    decorationPanel.add(titleLabel, BorderLayout.CENTER);
    }

  private void setIcon(String iconUrl)
    {
    URL   url   = ClassLoader.getSystemResource(iconUrl);
    Image image = Toolkit.getDefaultToolkit().createImage(url);
    setIconImage(image);
    }

  private void setDraggable()
    {
    decorationPanel.addMouseListener(
      new MouseAdapter()
        {
        public void mousePressed(MouseEvent event)
          {
          posX = event.getX();
          posY = event.getY();
          }
      });

    decorationPanel.addMouseMotionListener(
      new MouseAdapter()
        {
        public void mouseDragged(MouseEvent event)
          {
          setLocation(getLocation().x + event.getX() - posX, getLocation().y + event.getY() - posY);
          }
        });
    }

  private void forgePanels()
    {
    decorationPanel = new JPanel(new BorderLayout());
    iconPanel       = new JPanel();
    buttonsPanel    = new JPanel(new GridLayout(1, 3));

    add(decorationPanel, BorderLayout.NORTH);
    decorationPanel.add(iconPanel, BorderLayout.WEST);
    decorationPanel.add(buttonsPanel, BorderLayout.EAST);
    }

  private void forgeButtons()
    {
    hintsButton   = new JButton();
    iconifyButton = new JButton();
    exitButton    = new JButton();

    buttonsPanel.add(hintsButton);
    buttonsPanel.add(iconifyButton);
    buttonsPanel.add(exitButton);
    }

  private void tailorPanels()
    {
    decorationPanel.setBackground(Ui.TITLEBAR);
    iconPanel.setBackground(Ui.TITLEBAR);

    URL   url   = ClassLoader.getSystemResource(Frames.ICON_SMALL);
    Image image = Toolkit.getDefaultToolkit().createImage(url);
    iconPanel.add(new JLabel(new ImageIcon(image)));
    }

  private void tailorButtons()
    {
    hintsButton.setBackground(Colors.BUTTON_HINTS);
    hintsButton.setText("    ?    ");

    iconifyButton.setBackground(Colors.BUTTON_ICONIFY);
    iconifyButton.setText("    V    ");

    exitButton.setBackground(Colors.BUTTON_EXIT);
    exitButton.setText("    X    ");
    }

  private void setButtonsActions()
    {
    hintsButton.addActionListener(new ToggleWindow(Main.hintsWindow, true));
    iconifyButton.addActionListener(new IconifyWindow(this));
    exitButton.addActionListener(new ExitWindow(this));
    }
  }