package pawsoc;

import java.awt.Color;
/**
 *  Die Klasse kann von den konkreten Klassen abgeleitet werden, die auch instanziiert werden koennen.<br>
 *  
 * @author Josef Sochovsky
 * @version 1.0
 */
public abstract class AbstrakterErsteller {
    /**
     * In dieser Methode passiert alles was sowieso immer mit den Figuren passiert also <br>
     * in unserem Fall eigentlich nichts <br>
     *
     */
    public Figur bestelleFiguren(String type, int [] werte,Color c){
    	return erzeugeFiguren(type, werte,c);
    }
    /**
     * Muss von einer Methode ueberschrieben werden, die konkrete<br>
     * Fahrzeuge instanziiert. Dies ist das Herzstueck des Factory<br>
     * Method Pattern<br>
     *
     * @return Es wird die ausgewaehlte Figur vom Benutzer ausgewaehlt je nach dem was er uebergeben hat <br>
     * @param die Methode erhaelt einen Typ, also was fuer er haben will und eine Liste mit Werten die fuer den jeweiligen Typen<br>
     * wichtig ist
     */
    public abstract Figur erzeugeFiguren(String type, int [] werte,Color c);
}
