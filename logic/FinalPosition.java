package logic;
import gui.*;

public class FinalPosition extends Element {
	
	public FinalPosition(int x, int y) {
		super();
		this.posx=x;
		this.posy=y;

		getContentPane().add(new ImagePanel("/resources/FinalPosition.png"));//sets the background image
	}

}
