package pawsoc;

import java.awt.*;

/**
 * Es wird von Figur geerbt
 * und ein Rechteck gezeichnet
 * 
 * @author Josef Sochovsky
 * @version 1.0
 * 
 */
public class Rechteck extends Figur {
	//laenge und Breite sind fuer ein Rechteck essenziel
	private int l;
	private int b;
	/**
	 * Konstruktor bekommt alle notwendige Daten und fuehrt den Super-Konstruktor aus
	 */
	public Rechteck(int x, int y, Color c,int l, int b){
		super(x,y,c);
		this.l=l;
		this.b=b;
	}
	/**
	 * Default Konstruktor setzt Laenge und Breite auf 50 und 20 und fuehrt den Super-konstruktor mit den bekommenen x, y und
	 * c Werten aus
	 */
	public Rechteck(int x, int y, Color c){
		super(x,y,c);
		this.l=50;
		this.b=20;
	}
	/**
	 * Konstruktor setzt laenge und breite auf gewolltes und fuehrt den Super-Defaultkonstruktor
	 */
	public Rechteck(int l, int b){
		super();
		this.l=l;
		this.b=b;
	}
	/**
	 * Default Konstruktor setzt laenge und breite auf 50 und 20 und fuehrt den Super-Defaultkonstruktor
	 */
	public Rechteck(){
		super();
		this.l=50;
		this.b=20;
	}
	/**
	 * fuegt ein Rechteck hinzu
	 * @param bekommt ein Graphics Objekt und fuegt das gewollte hinzu
	 */
	public void draw(Graphics g){
		//setzt die Farbe auf die gewollte Farbe
		g.setColor(farbe);
		//Zeichnet das Rechteck im uebergebenen Graphics
		g.drawRect(x,y,l,b);
	}
}
