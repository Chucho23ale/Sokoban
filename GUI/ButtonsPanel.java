package gui;

import javax.swing.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class ButtonsPanel extends JFrame implements ActionListener {

    private JButton save;
    private JButton load;
    private Window window;


    public ButtonsPanel(Window w) {//creates the panel, the buttons and the timer 
        this.window = w;

        setBounds(450, 10, 130, 500);
        setBorder(BorderFactory.createLineBorder(Color.black));
        setLayout(new FlowLayout());
        setBackground(new Color(250,250,250));

        save = new JButton("Save");
        load = new JButton("Load");


        save.setBackground(new java.awt.Color(255, 255, 255));
        save.setFont(new Font("Tahoma", 0, 12));
        save.addActionListener(this);

        load.setBackground(new java.awt.Color(255, 255, 255));
        load.setFont(new Font("Tahoma", 0, 12));
        load.addActionListener(this);


        add(check);
        add(save);
        add(load);
        add(timeLabel);


    }



    public void actionPerformed(ActionEvent e) {//behaviour of the buttons
        if (e.getSource()==save){
          window.save();
        }
        else if(e.getSource()==load){
          window.load();
        }
    }

}

}
