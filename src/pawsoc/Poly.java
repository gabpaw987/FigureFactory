package pawsoc;

import java.awt.*;

/**
 * Es wird von Figur geerbt
 * und ein Standart Polygon gezeichnet gezeichnet
 * 
 * @author Josef Sochovsky
 * @version 1.0
 * 
 */
public class Poly extends Figur {
	/**
	 * Default Konstruktor und fuehrt den Super-Defaultkonstruktor
	 */
	public Poly(){
		super();
	}
	/**
	 * Fuehrt den Super-Konstruktor mit den Werten x, y und c aus
	 */
	public Poly(int x, int y, Color c){
		super(x,y,c);
	}
	/**
	 * fuegt ein Poly hinzu
	 * @param bekommt ein Graphics Objekt und fuegt das gewollte hinzu
	 */
	public void draw(Graphics root){
		//setzt die Farbe auf die gewollte Farbe
		root.setColor(farbe);
		//erstellt ein neues Polygon fuer das Poly
		Polygon p1= new Polygon();
		p1.addPoint(x,y);
		p1.addPoint(x+20,y);
		p1.addPoint(x+20,y+20);
		p1.addPoint(x+10,y+30);
		p1.addPoint(x+10,y+20);
		p1.addPoint(x,y);
		//Zeichnet das Poly im uebergebenen Graphics
		root.drawPolygon(p1);
	}
}
