package pawsoc;

import java.awt.*;

/**
 * Es wird von Figur geerbt
 * und ein Dreieck gezeichnet
 * 
 * @author Josef Sochovsky
 * @version 1.0
 * 
 */
public class Dreieck extends Figur {
	//laenge und Breite sind fuer ein Dreieck essenziel
	private int l;
	private int b;
	/**
	 * Konstruktor bekommt alle notwendige Daten und fuehrt den Super-Konstruktor aus
	 */
	public Dreieck(int x, int y, Color c,int l, int b){
		super(x,y,c);
		this.l=l;
		this.b=b;
	}
	/**
	 * Default Konstruktor setzt Laenge und Breite auf 40 und fuehrt den Super-konstruktor mit den bekommenen x, y und c Werten
	 * aus
	 */
	public Dreieck(int x, int y, Color c){
		super(x,y,c);
		this.l=40;
		this.b=40;
	}
	/**
	 * Konstruktor setzt laenge und breite auf gewolltes und fuehrt den Super-Defaultkonstruktor
	 */
	public Dreieck(int l, int b){
		super();
		this.l=l;
		this.b=b;
	}
	/**
	 * Default Konstruktor setzt laenge und breite auf 40 und fuehrt den Super-Defaultkonstruktor
	 */
	public Dreieck(){
		super();
		this.l=40;
		this.b=40;
	}
	/**
	 * fuegt ein Dreieck hinzu
	 * @param bekommt ein Graphics Objekt und fuegt das gewollte hinzu
	 */
	public void draw(Graphics root){
		//setzt die Farbe auf die gewollte Farbe
		root.setColor(farbe);
		//erstellt ein neues Polygon fuer das Dreieck
		Polygon p1= new Polygon();
		p1.addPoint(x,y);
		p1.addPoint(x+l,y);
		p1.addPoint(x,y+b);
		//Zeichnet das Dreieck im uebergebenen Graphics
		root.drawPolygon(p1);
	}
}
