package pawsoc;

import java.awt.Color;

/***
 * Nun kann man wie in den Folien eine Klasse erben lassen die den Teil der
 * Figuren die sie benutzen darf implementiert <br>
 * 
 * 
 * @author Josef Sochovsky
 * @version 1.0
 */
public class FigurenErsteller extends AbstrakterErsteller {
	/**
	 * @see In unserem Beispiel konnte der Benutzer nur die Default laengen und
	 *      breiten benutzen und nicht genauer einstellen deswegen werden<br>
	 *      auch nie die Konkreten Konstruktoren aufgerufen
	 */
	/*
	 * In unserem Beispiel konnte der Benutzer nur die Default laengen und
	 * breiten benutzen und nicht genauer einstellen deswegen werden<br> auch
	 * nie die Konkreten Konstruktoren aufgerufen
	 */
	public Figur erzeugeFiguren(String type, int[] werte, Color c) {
		// ueberpruefung nach Dreieck
		if (type.equalsIgnoreCase("Dreieck"))
			return new Dreieck(werte[0], werte[1], c);
		// ueberpruefung nach Kreis
		else if (type.equalsIgnoreCase("Kreis"))
			return new Kreis(werte[0], werte[1], c);
		// ueberpruefung nach Oval
		else if (type.equalsIgnoreCase("Oval"))
			return new Oval(werte[0], werte[1], c);
		// ueberpruefung nach Polygon
		else if (type.equalsIgnoreCase("Polygon"))
			return new Poly(werte[0], werte[1], c);
		// ueberpruefung nach Rechteck
		else if (type.equalsIgnoreCase("Rechteck"))
			return new Rechteck(werte[0], werte[1], c);
		// falls ein nicht erwarteter Typ kommt kann nicht zurueckgegeben werden
		return null;

	}

}
