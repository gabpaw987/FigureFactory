package pawsoc;

import java.awt.Color;
import java.awt.Graphics;
/**
 * Diese abstrakte Klasse implementiert bereits alle Konstruktoren auﬂer die Methode Draw <br>
 * diese Methode wird in jeder vererbten Klasse selber implementiert
 *  
 * @author Josef Sochovsky
 * @version 1.0
 */
public abstract class Figur {
	//Attribute: x- und y- Koordinate der Figur
	int x;
	int y;
	//Attribut: Farbe der Figur
	Color farbe;
	
	/**
	 * Default-Konstruktor der x und y mit 0 und die Farbe mit Schwarz als Standardwerte definiert.
	 */
	public Figur(){
		x=0;
		y=0;
		farbe = Color.BLACK;
	}
	/**
	 * Konstruktor, der die Farbe Schwarz als Standard-Wert uebernimmt und x und y der Parameter uebernimmt.
	 * 
	 * @param x x-Koordinate
	 * @param y y-Koordinate
	 */
	public Figur(int x, int y){
		this.x=x;
		this.y=y;
		farbe = Color.BLACK;
	}
	/**
	 * Konstruktor, der die x- und die y-Koordinate auf 0 als Standardwert setzt.
	 * 
	 * @param c Farbe
	 */
	public Figur(Color c){
		this.x=0;
		this.y=0;
		farbe = c;
	}
	/**
	 * Konstruktor, welcher die uebergebenen Variablen in die Attribute speichert.
	 * 
	 * @param x x-Koordinate
	 * @param y y-Koordinate
	 * @param c Farbe
	 */
	public Figur(int x, int y, Color c){
		this.x=x;
		this.y=y;
		farbe = c;
	}
	/**
	 * getter-Methode fuer die x-Koordinate
	 * @return x-Koordinate
	 */
	public int getX() {
		return x;
	}
	/**
	 * setter-Methode fuer die x-Koordinate
	 * @param x x-Koordinate
	 */
	public void setX(int x) {
		this.x = x;
	}
	/**
	 * getter-Methode fuer die y-Koordinate
	 * @return y-Koordinate
	 */
	public int getY() {
		return y;
	}
	/**
	 * setter-Methode fuer die y-Koordinate
	 * @param y y-Koordinate
	 */
	public void setY(int y) {
		this.y = y;
	}
	/**
	 * getter-Methode fuer die Farbe
	 * @return Farbe
	 */
	public Color getFarbe() {
		return farbe;
	}
	/**
	 * setter-Methode fuer die Farbe
	 * @param farbe Farbe
	 */
	public void setFarbe(Color farbe) {
		this.farbe = farbe;
	}
	/**
	 * Abstrakte draw-Methode, die in den Unterklassen implementiert werden muss.
	 * @param g
	 */
	public abstract void draw(Graphics g);
	
	/**
	 * toString-Methode, welche alle in Figur gespeicherten Einstellungen als String zusammengefasst zurueckgibt.
	 */
	@Override
	public String toString() {
		return "Figur [x-Koordinate=" + x + ", y-Koordinate=" + y + ", Farbe=" + farbe + "]";
	}	
}