package Vue;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Controlleur.IControleur;

public class BoardUI extends JFrame {

	private JPanel headBoard;
	private JPanel gridContainer;	
	private JPanel ButtonContainer;
	private GrilleUI grid;
	private GrilleUI agrid;
	private int totalHeight =600;
	private int totalwidth = 950;
	public BoardUI(IControleur myControleur){
		
		super("Battleship");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(totalwidth,totalHeight);
		setLayout(new GridBagLayout());
		setLayout(new FlowLayout());
		setResizable(false);
		
		// instancie le paneau de 
		headBoard = new JPanel(); 
		//headBoard.add();
		//headBoard.setSize(600,100);
		JLabel timer = new JLabel();
		timer.setText("Time remaining XXXXX");
		headBoard.add(timer);
		add(headBoard);
		headBoard.setVisible(true);
		
		gridContainer = new JPanel();
		gridContainer.setLayout(new GridLayout(1,2));
		gridContainer.setSize(600,600);
		grid = new GrilleUI("Joueur",myControleur); 
		agrid = new GrilleUI("adversaire",myControleur);
		
		// ajout des Grilles
		gridContainer.add(grid);
		gridContainer.add(agrid);
		
		// ajout du container au Board
		add(gridContainer);
		gridContainer.setVisible(true);
		
		ButtonContainer = new JPanel();
		//ButtonContainer.setSize(600,100);
		ButtonContainer.setLayout(new FlowLayout());
		
		//Boutton Reset 
		JButton reset = new JButton();
		//reset.setSize(200, 200);
		reset.setText("Reset");
		
		//Boutton Save 
		JButton Save = new JButton();
		//Save.setSize(200, 200);
		Save.setText("Save");
		
		//Boutton Surrender
		JButton Surrender = new JButton();
		//.setSize(200, 200);
		Surrender.setText("Surrender");
		
		// ajout des boutton
		ButtonContainer.add (reset);
		ButtonContainer.add (Save);
		ButtonContainer.add (Surrender);
		
		// ajout du container au Board
		add(ButtonContainer);
		ButtonContainer.setVisible(true);
		setVisible(true);
	}
}
	