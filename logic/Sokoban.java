package logic;

import gui.*;
import java.util.ArrayList;


public class Sokoban {
	
	public static final int ROWS = 5;
    public static final int COLUMNS = 5;
	private Window window;;
	private Actor actor;
	private Wall  wall;
	private Box   box;
	private FinalPosition  finalpos;
	private Empty  empty;
	private Object object = new Object(); 
	private FileReader reader= new FileReader(); 
	private ArrayList<Integer> a = new ArrayList<Integer>();
	private ArrayList<Element> elements = new ArrayList<Element>();
	private int[][] mat = new int[ROWS][COLUMNS];
	private int pos; 
	private int aux; 
	public Element[][] e = new Element[ROWS][COLUMNS];
	
	
	public Sokoban ()  {
		window = new Window(this);
		 loadgame(); 
		 createobjects(); 
		 window.draw(e);
	}
	
	public void loadgame() {
		a = reader.read();
		 pos=0; 
		 for (int i=0; i<ROWS; i++){
			 for (int j=0; j<COLUMNS;j++) {
				 mat[i][j]= a.get(pos);
				 pos++; 
				 //System.out.println(mat[i][j]); //Si los lee!
			 }	 
		 }
	}
	
	public void createobjects(){
		for (int i=0; i<ROWS; i++){
			 for (int j=0; j<COLUMNS;j++) {
				 aux = mat[i][j]; 
				 switch (aux) {
				 case 1:
					 Actor currentactor = new Actor(i, j);
					 elements.add(currentactor);
					 this.actor= currentactor;
					 e[i][j] = currentactor;
					 break; 
				 case 2:
				 	Box currentbox = new Box (i,j);
				 	elements.add(currentbox);
					this.box= currentbox;
					e[i][j] = currentbox;	  
				 	break; 
				 case 3:
					Wall currentwall = new Wall(i,j);
					elements.add(currentwall);
					this.wall= currentwall;
					e[i][j] = currentwall;
					break; 
				 case 4:
				 	FinalPosition currentfinal  = new FinalPosition(i,j);
				 	elements.add(currentfinal);
					 this.finalpos= currentfinal;
					 e[i][j] = currentfinal;
					break; 
				 case 5:
				 	Empty currentempty = new Empty(i,j);
					 elements.add(currentempty);
					 e[i][j] = currentempty;
					break; 
					
				 }
				 			
			 }	 
		 }
	}
	
}