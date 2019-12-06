package logic;
import gui.*;

public class Empty extends Element{

	public Empty(int x, int y) {
		super();
		this.posx=x;
		this.posy=y;

		getContentPane().add(new ImagePanel("/resources/Empty.png"));//sets the background image
	}
}
