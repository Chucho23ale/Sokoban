package gui;

import java.awt.*;
import javax.swing.*;


class ImagePanel extends JPanel {

  private Image img;
  public ImagePanel(String img) {//constructor when the location of a file is provided
    this(new ImageIcon(img).getImage());
  }
  public ImagePanel(Image img) {//constructor to be used in the first cnstructor ince the file of the image is obtained
    this.img = img;
    Dimension size = new Dimension(img.getWidth(null), img.getHeight(null));
    setPreferredSize(size);
    setMinimumSize(size);
    setMaximumSize(size);
    setSize(size);
    setLayout(null);
  }
  @Override
  public void paintComponent(Graphics g) {
    g.drawImage(img, 0, 10, null);
  }
}