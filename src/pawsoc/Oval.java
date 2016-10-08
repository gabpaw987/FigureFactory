package pawsoc;

import java.awt.*;

/**
 * Es wird von Figur geerbt
 * und ein Oval gezeichnet
 * 
 * @author Josef Sochovsky
 * @version 1.0
 * 
 */
public class Oval extends Figur {
	//laenge und Breite sind fuer ein Oval essenziel
	private int l;
	private int b;
	/**
	 * Konstruktor bekommt alle notwendige Daten und fuehrt den Super-Konstruktor aus
	 */
	public Oval(int x, int y, Color c,int l, int b){
		super(x,y,c);
		this.l=l;
		this.b=b;
	}
	/**
	 * Fuehrt den Super-Konstruktor mit x, y und c aus und setzt Laenge und Breite aus Standard-Werte
	 */
	public Oval(int x, int y, Color c){
		super(x,y,c);
		this.l=40;
		this.b=60;
	}
	/**
	 * Konstruktor setzt laenge und breite auf gewolltes und fuehrt den Super-Defaultkonstruktor
	 */
	public Oval(int l, int b){
		super();
		this.l=l;
		this.b=b;
	}
	/**
	 * Default Konstruktor setzt laenge und breite auf 40 und 60 und fuehrt den Super-Defaultkonstruktor
	 */
	public Oval(){
		super();
		this.l=40;
		this.b=60;
	}
	/**
	 * fuegt ein Oval hinzu
	 * @param bekommt ein Graphics Objekt und fuegt das gewollte hinzu
	 */
	public void draw(Graphics root){
		//setzt die Farbe auf die gewollte Farbe
		root.setColor(farbe);
		//Zeichnet das Oval im uebergebenen Graphics
		root.drawOval(x,y,l,b);
	}
	public int getL() {
		return l;
	}
	public void setL(int l) {
		this.l = l;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
}
