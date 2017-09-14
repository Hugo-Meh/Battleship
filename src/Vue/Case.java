package Vue;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Insets;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.border.Border;

import modele.Coord;
@SuppressWarnings("serial")
public class Case extends JButton {
	public static int size = 60; 
	private Coord coord;
	
	public Case(Coord coord) {
		super();
		this.coord = coord;
		setPreferredSize(new Dimension(size,size));
		setMaximumSize(new Dimension(size,size));
		setSize(new Dimension(size,size));
		//Border blackline = BorderFactory.createLineBorder(Color.black,1);
	}
	
	@Override
	public String toString() {
		return Integer.toString((coord.getCompX()))+"-"+Integer.toString((coord.getCompY()));	
	}
	
	public Coord getCoord() {
		return coord;
	}

	
	
}
