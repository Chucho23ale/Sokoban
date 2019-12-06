package logic;

import java.awt.*;
import javax.swing.*;
import gui.*;

public class Actor extends Element{
	
	public Actor(int x, int y) {
		super();
		this.posx=x;
		this.posy=y;
		
	
		getContentPane().add(new ImagePanel("/resources/Actor.png"));//sets the background image
	}

}
