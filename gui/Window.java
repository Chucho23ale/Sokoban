package gui;

import java.io.*;
import java.awt.*;
import java.util.ArrayList;

import javax.swing.*;
import logic.*;

import javax.swing.JFrame;

public class Window extends JFrame {
	private Sokoban sokoban;
    private ButtonsPanel buttons;
    public Board board;


    public Window(Sokoban sokoban) {

        this.sokoban = sokoban;
        buttons = new ButtonsPanel(this);
        board = new Board();



        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("My Sokoban");
        setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
        setMinimumSize(new Dimension(600, 550));
        setBackground(new Color(255,255,255));
        setLayout(null);
        setVisible(true);

        add(buttons);//ads the buttons panel
        add(board);//ads the grid panel


    }

    public void draw(Element[][] e){
        board.draw(e);
    }

    public void save(){

    }

    public void load(){

    }
    


}
	

