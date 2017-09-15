import Controlleur.*;
import Vue.*;
public class principale {
	public static void main(String [] args) {
		IControleur myControleur = new Controleur();
		BoardUI myBoard = new BoardUI(myControleur);
	}
}
