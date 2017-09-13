package Vue;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class BoardUI extends JFrame {
	 
	private JFrame frame;
	private JPanel headBoard;
	private JPanel gridContainer;	
	private GrilleUI grid;
	private GrilleUI agrid;
	
	public BoardUI(){
		super("Battleship");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(800, 600);
		setLayout(new GridLayout(3,1));
		setResizable(false);
		
		// instancie le paneau de 
		headBoard = new JPanel(); 
		//headBoard.add();
		headBoard.setSize(800,100);
		headBoard.setForeground(new Color(0,0,255));
		gridContainer = new JPanel();
		gridContainer.setLayout(new GridLayout(1,2));
		gridContainer.setSize(800,400);
		grid = new GrilleUI("grid"); 
		agrid = new GrilleUI("agrid");
		
		gridContainer.add(grid);
		gridContainer.add(agrid);
		
		
		add(gridContainer);
		
		gridContainer.setVisible(true);
		setVisible(true);
	}
}
	