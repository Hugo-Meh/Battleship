package Vue;

import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Board_vue extends JFrame {
	
	private JFrame frame;
	private JPanel headBoard;
	private JPanel boardContainer;	
	private JPanel board;
	private JPanel aDBoard;
	
	public Board_vue(){
		super("Battleship");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(500, 500);
		setLayout(new GridLayout(2,1));
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		Board_vue myBoard = new Board_vue();
	}
}
