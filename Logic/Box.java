package logic;
import gui.*;

public class Box extends Element {
	
	
	public Box(int x, int y) {
		super();
		this.posx=x;
		this.posy=y;

		getContentPane().add(new ImagePanel("/resources/Box.png"));//sets the background image
	}
}
