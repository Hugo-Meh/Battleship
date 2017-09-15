package Vue;

import javax.swing.*;

import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;

import modele.Coord;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class GrilleUI extends JPanel implements ActionListener {

	// ATTRIBUTS
	private static final int ROWS = 10;    
	private static final int COLS = 10;
	
	private ArrayList<Case> Cases;
	
	public GrilleUI(String titre){
		// frame
		super();
		setLayout(new GridLayout(ROWS,COLS));
		setBorder(new EmptyBorder(20, 20, 20, 20));
		Cases = new ArrayList<Case>();
		//setBackground(new Color(0,255,255));
		
	
		for (int r = 1 ; r<= ROWS; r++) {
			 
			  for (int c = 1; c <= COLS; c++) {
				  Case uneCase = new Case(new Coord(c,r));
				  if (titre == "adversaire") {
					  uneCase.addActionListener(this);  // on ecoute la Case
					  
				  }
				  else {
					  uneCase.setEnabled(false);
				  }
				 
				  Cases.add(uneCase); // Ajout de la case a la grille
				  add(uneCase);
				  /*// identifiant boutton en fonctions de ligne et colonne
				  
				  // On cree un nouveau boutton
				  JButton boutton = new JButton();
				  boutton.setPreferredSize(new Dimension(30,30));
				  boutton.setMaximumSize(new Dimension(30,30));
				  boutton.setSize(new Dimension(30,30));
				  Border blackline = BorderFactory.createLineBorder(Color.black,1);*/
				 
				  
				 
				
				  
				  }
			  
		 }
	
		
		//setBorder(blackline);
	

	}

	// METHODE ACTION PERFORMED
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		// la case sur lequel on a appuye
		Case laCase = (Case) e.getSource();
		laCase.morph("touche");
		System.out.println("Case appuye: " + laCase.toString());
	}
	
}
	
