package modele;

public class Coord implements ICoord {
	private int compX;
	private int compY;
	
	public Coord(int X, int Y){
		this.compX = X;
		this.compY = Y;
	}
	@Override
	public int getCompX() {
		return compX;
	}
	@Override
	public int getCompY() {
		return compY;
	}

	@Override
	public int getCompXMod(Coord aCoord) {
		return 0;
	}

	@Override
	public int getCompYMod(Coord aCoord) {
		return 0;
	}
}
