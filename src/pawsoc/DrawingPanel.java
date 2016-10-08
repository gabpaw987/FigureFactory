package pawsoc;

import java.awt.Graphics;
import java.util.ArrayList;

import javax.swing.JPanel;

/**
 * JPanel, welches die alle Figuren die in seinem Attribut(Liste) liegen zeichnet.
 * 
 * @author Gabriel Pawlowsky
 * @version 13-10-2010
 */

public class DrawingPanel extends JPanel {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//Attribut: Liste, deren Figuren gezeichnet werden sollen.
	private ArrayList<Figur> fList;
	
	/**
	 * Kostruktor
	 * 
	 * @param fList Liste, die die zu zeichnenden Figuren beinhaltet.
	 */
    public DrawingPanel(ArrayList<Figur> fList){
    	this.fList = fList;
    }
    
    /**
     * paintComponent-Methode die von der Super-Methode erbt und zusaetzlich alle im Attribut(Liste) gespeicherten Figuren
     * zeichnet.
     */
    @Override public void paintComponent(Graphics g) {
         super.paintComponent(g);
         //Wenn in fList schon Figuren gespeichert sind...
         if(fList != null){
        	 //zeichne alle Figuren, die darin gespeichert sind.
        	 for(int i = 0; i < fList.size(); i++){
        		 fList.get(i).draw(g);
        	 }
         }
    }
}