package pawsoc;

import java.awt.BorderLayout;
import javax.swing.JFrame;

/**
 * Ein Frame, welches die eigentliche Applikation beinhaltet
 *  
 * @author Gabriel Pawlowsky
 * @version 13-10-2010
 *
 */
@SuppressWarnings("serial")
public class MyFrame extends JFrame {

	private MyPanel myPanel;		// Panel erweitert JPanel
	
	
	/**
	 * Konstruktur
	 * 
	 */
	public MyFrame() {
		// festlegung der ueberschrift im Frame 
		setTitle("Figuren zeichen");
		// Standardoperation fuer das Schlieﬂen des Frames festlegen
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// Panels werden erzeugt
		myPanel=new MyPanel();
		// Die erstellten Panels werden im ContentPane des Frames platziert
		this.getContentPane().add(BorderLayout.CENTER,myPanel);
		//Setze Startgroesse des Frames
		this.setSize(400,300);
		// Nach dem Aufbau, wird der Frame nun auch sichtbar
		this.setVisible(true);
	}

}
