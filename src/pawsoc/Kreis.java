package pawsoc;

import java.awt.*;

/**
 * Es wird von Figur geerbt
 * und ein Kreis gezeichnet
 * 
 * @author Josef Sochovsky
 * @version 1.0
 * 
 */
public class Kreis extends Figur {
	//radius fuer einen Kreis essenziel
	private int r;
	/**
	 * Konstruktor bekommt alle notwendige Daten und fuehrt den Super-Konstruktor aus
	 */
	public Kreis(int x, int y, Color c,int r){
		super(x,y,c);
		this.r=r;
	}
	/**
	 * Konstruktor fuehrt den Super-Konstruktor aus und setzt einen default-Radius
	 */
	public Kreis(int x, int y, Color c){
		super(x,y,c);
		this.r=50;
	}
	/**
	 * Konstruktor setzt radius auf gewolltes und fuehrt den Super-Defaultkonstruktor
	 */
	public Kreis(int r){
		super();
		this.r=r;
	}
	/**
	 * Default Konstruktor setzt den Radius auf 50 und fuehrt den Super-Defaultkonstruktor
	 */
	public Kreis(){
		super();
		this.r=50;
	}
	/**
	 * fuegt ein Rechteck hinzu
	 * @param bekommt ein Graphics Objekt und fuegt das gewollte hinzu
	 */
	public void draw(Graphics root){
		//setzt die Farbe auf die gewollte Farbe
		root.setColor(farbe);
		//Zeichnet das Rechteck im uebergebenen Graphics
		root.drawOval(x,y,r,r);
	}
}
