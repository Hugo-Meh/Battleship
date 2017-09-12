package ship;

import java.util.Random;

public class ship {
	private int size;
	private boolean destroyed;
	private int PosX;
	private int PosY;
	private int dirX;
	private int dirY;
	
	public ship() {
		destroyed = false;
		
		Random random_int = new Random(); 
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
		}
	}
}
