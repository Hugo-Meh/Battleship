package Vue;

import javax.swing.*;
import javax.swing.border.Border;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GrilleUI extends JPanel implements ActionListener {

	// ATTRIBUTS
	private static final int ROWS = 10;      // number of cells
	private static final int COLS = 10;
	
	//private CaseUI[][] cell =  new CaseUI[10][10];
	JButton[][] grid=  new JButton[10][10];
	
	public GrilleUI(String titre){
		// frame
		super();
		setLayout(new GridLayout(ROWS,COLS));
		//setBackground(new Color(0,255,255));
		
	
		for (int r = 0; r< ROWS; r++) {
			 
			  for (int c= 0; c < COLS; c++) {
			
				  // identifiant boutton en fonctions de ligne et colonne
				  String id_Boutton = r + "-" + c;
				  
				  // On cree un nouveau boutton
				  JButton boutton = new JButton();
				  boutton.setPreferredSize(new Dimension(40, 40));
				  boutton.setMaximumSize(new Dimension(40, 40));
				  boutton.setSize(new Dimension(40, 40));
				  grid[r][c] = boutton;
				  grid[r][c].setName(id_Boutton); // set name du bttn
				  
				  grid[r][c].addActionListener(this); // on écoute le boutton
				  add(grid[r][c]); // Ajout du boutton au grid
				  
				  }
			  
		 }
	
		Border blackline = BorderFactory.createLineBorder(Color.black,5);
		setBorder(blackline);
	

	}

	// METHODE ACTION PERFORMED
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		// le boutton sur lequel on a appuyé
		JButton leBoutton = (JButton) e.getSource();
		System.out.println("Boutton appuyé: " + leBoutton.getName());
	}
	
}
	
