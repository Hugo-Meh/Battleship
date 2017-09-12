package Vue;

import java.awt.Color;
import java.awt.Component;

import javax.swing.BorderFactory;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

public class CaseUI extends Component implements ICaseUI{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int X;
	private int Y;
	
	GrilleUI unGrille;
	
	// Constructeur
	  public CaseUI(){};

	    public CaseUI(int x, int y, GrilleUI unGrille) {
	        this.X = x;
	        this.Y = y;
	     //   this.getParent() = GrilleUI ;
	    //this.setBorder(new LineBorderbackground, y, autoFocusTransferOnDisposal);    
	       
		//Border blackline = BorderFactory.createLineBorder(Color.black,1);
			
	    }
	

	// Methodes
	@Override
	public int getX() {
		return X;
	}

	public void setX(int x) {
		this.X = x;
	}

	@Override
	public int getY() {
		return Y;
	}

	public void setY(int y) {
		this.Y = y;
	}
	/*
	@Override
	public void setBorder( LineBorder x) {
		// TODO Auto-generated method stub

	}		
	
	@Override
	public void setBorder() {
		// TODO Auto-generated method stub
		
	} */

}
