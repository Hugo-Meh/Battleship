package Vue;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GrilleUI extends JFrame implements ActionListener {

	// ATTRIBUTS
	private static final int ROWS = 10;      // number of cells
	private static final int COLS = 10;
	
	//private CaseUI[][] cell =  new CaseUI[10][10];
	JButton[][] grid=  new JButton[10][10];
	
	public GrilleUI(String titre){
		super(titre);
		this.setSize(800,800);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// frame
		JPanel frame = new JPanel();
		frame.setLayout(new GridLayout(ROWS,COLS));
		
		frame.setBackground(new Color(0,255,255));
		
	
		for (int r = 0; r< ROWS; r++) {
			 
			  for (int c= 0; c < COLS; c++) {
			
				  // identifiant boutton en fonctions de ligne et colonne
				  String id_Boutton = r + "-" + c;
				  
				  // On cree un nouveau boutton
				  JButton boutton = new JButton();
				  grid[r][c] = boutton;
				  grid[r][c].setName(id_Boutton); // set name du bttn
				  
				  grid[r][c].addActionListener(this); // on écoute le boutton
				  frame.add(grid[r][c]); // Ajout du boutton au grid
				  
				  }
			  
		 }
	
		// bordure
		Border blackline = BorderFactory.createLineBorder(Color.black,5);
		frame.setBorder(blackline);
		add(frame);

		//fenetre visible
		this.setVisible(true);
	}

	// METHODE ACTION PERFORMED
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		// le boutton sur lequel on a appuyé
		JButton leBoutton = (JButton) e.getSource();
		System.out.println("Boutton appuyé: " + leBoutton.getName());
	}
	
	
	}
	
