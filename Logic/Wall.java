package logic;
import gui.*;

public class Wall extends Element {

	public Wall(int x, int y) {
		super();
		this.posx=x;
		this.posy=y;

		getContentPane().add(new ImagePanel("/resources/Wall.png"));//sets the background image
	}
}
