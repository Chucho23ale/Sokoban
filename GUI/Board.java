package gui;

import java.awt.GridLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.*;
import logic.*;

public class Board extends JPanel {

    public Grid(){

        setBounds(0, 10, 450, 460);
        setLayout(new GridLayout(9, 9, 5, 5));
        setOpaque(true);
    
    }

    public void draw(Element[][] elements) {
  
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                elements[i][j].setOpaque(true);
                elements[i][j].setVisible(true);
                add(elements[i][j]);
  
            }
        }
        this.setVisible(true);
    }


    
}
