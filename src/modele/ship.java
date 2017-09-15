package modele;

import java.util.ArrayList;
import java.util.Random;

public class ship {
	protected int size;
	protected boolean destroyed;
	protected ArrayList<Coord> occupiedPosition;
	protected int PosX;
	protected int PosY;
	protected int dirX;
	protected int dirY;
	
	public ship() {
		destroyed = false;
		
		
		/*Random random_int = new Random(); 
		PosX = random_int.nextInt(10);
		
		
		random_int = new Random(); 
		PosY = random_int.nextInt(10);
		
		random_int = new Random(); 
		if(random_int.nextInt(1) == 1) {
			 dirX = 1;
		}
		else {
			dirX = -1;
		}
		
		random_int = new Random(); 
		if(random_int.nextInt(1) == 1) {
			dirY = 1;
		}
		else {
			dirY = -1;
		}*/
		}
	
		public ArrayList<Coord> getOccupiedPosition() {
			return occupiedPosition;
		}
	
		public void kill() {
			if (destroyed == false && occupiedPosition.isEmpty()) {
				destroyed = true;
			}
		}
		
		public boolean toucher(Coord aCoord) {
			if (occupiedPosition.contains(aCoord)) {
				occupiedPosition.remove(aCoord);
				return true;
			}
			else {
				return false;
			}
		}
	
}
