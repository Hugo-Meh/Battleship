package modele;

import java.util.ArrayList;

public class Board implements IBoard {
	private int sizeX = 10;
	private int sizeY = 10;
	private ArrayList<Coord> emptyCoord;
	private patroler monPatroler;
	public Board() {
		emptyCoord = new ArrayList<Coord> (sizeX*sizeY - 10);
		
		//if(patroler.occupiedPosition)
		
	}

	/*@Override
	public boolean add_occupied(Coord aCoord) {
		if(!isOccupied(aCoord)) {
			occupiedPos.add(aCoord);
			return true;
		}
		return false;
	}

	@Override
	public boolean isOccupied(Coord aCoord) {
		if(occupiedPos.contains(aCoord)){
				return true;
			}
		return false;
	}*/
	
	public boolean isOutOfBound(Coord aCoord) {
		if (aCoord.getCompX() < 0 || aCoord.getCompX() >9) {
			return true;
		}
		
		if (aCoord.getCompY() < 0 || aCoord.getCompY() >9) {
			return true;
		}
		return false;
	}
	
	
}
