package ship;

import java.util.ArrayList;
import java.util.Random;

import modele.Coord;

public class patroler extends ship {
	patroler(){
		super();
		size = 1;
		occupiedPosition = new ArrayList<Coord>(size);
		
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
