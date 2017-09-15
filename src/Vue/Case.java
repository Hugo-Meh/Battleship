package Vue;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Insets;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.border.Border;

import com.sun.prism.Image;

import modele.Coord;
@SuppressWarnings("serial")
public class Case extends JButton {
	public static int size = 40; 
	private Coord coord;
	public Case(Coord coord) {
		super();
		this.coord = coord;
		setBackground(new Color(59, 89, 182));
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
	
	public void morph(String type) {
		if (type == "vide") {
			setEnabled(false);			
			setBackground(new Color(0, 0, 60));
		}
		
		else {
			ImageIcon myImage = new ImageIcon("src\\Vue\\if_Close_Icon_1398919.png");
			System.out.println(myImage.getIconWidth());		
			setIcon(myImage);
			setEnabled(false);	
			setDisabledIcon(myImage);
		}
	}
	
	
}
