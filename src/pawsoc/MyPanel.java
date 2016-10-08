package pawsoc;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JComboBox;

import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * JPanel, welches eine Liste von Optionen aus Textfelder, Buttons und <br>
 * Comboboxen enthaelt und ein Zeichenfeld in der Mitte hat, in dem die Figuren<br>
 * gezeichnet werden.<br>
 * diese Klasse wurde fuer die Factory im Konstruktor und im Actionlistener
 * veraendert<br>
 * 
 * @author Gabriel Pawlowsky, Josef Sochovsky
 * @version 2.0
 */

public class MyPanel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	// speichern der Factory
	private AbstrakterErsteller factory;

	// Attribute: Panels, ComboBox, Button, Textfelder, Farbe zum Anzeigen und
	// Speichern der Einstellungen.
	private JPanel upperPanel;
	private JPanel lowerPanel;

	private JComboBox fBox;

	private JButton drawButton;

	private JTextField xField;
	private JTextField yField;

	private JButton colorButton;
	private Color c;

	// Liste, in der die bereits erstellten Figuren gespeichert werden.
	private ArrayList<Figur> fList;

	/**
	 * Konstruktor er zeichnet das Grundgeruesst und erstellt fuer spaeter einen
	 * FigurenErsteller also eine Factory
	 */
	public MyPanel() {
		// damit man in spaeter beutzen kann erstellt man ein Objekt von
		// FigurenErsteller
		factory = new FigurenErsteller();
		// Setze das Layout des Haupt-Panels auf FlowLayout
		this.setLayout(new BorderLayout());

		// Initialisiere Liste und erzeuge ein ZeichenPanel, der die
		// Figurenliste uebergeben wird.
		fList = new ArrayList<Figur>();
		upperPanel = new DrawingPanel(fList);

		// Initialisiere unteres Panel zum Anzeigen und Speichern der
		// Zeichenoptionen
		lowerPanel = new JPanel();
		lowerPanel.setLayout(new FlowLayout());

		// String-Array welches die Namen der moeglichen Figuren beinhaltet und
		// der ComcoBox zum Anzeigen uebergeben wird.
		String[] figurenNamen = { "Rechteck", "Kreis", "Dreieck", "Polygon",
				"Oval" };
		fBox = new JComboBox(figurenNamen);

		lowerPanel.add(fBox);

		// Initialisieren der Components fuers Einstellen und Anzeigen von
		// Optionen und Vergabe von Standardwerten und Text-Namen
		xField = new JTextField("10", 3);
		yField = new JTextField("10", 3);

		lowerPanel.add(xField);
		lowerPanel.add(yField);

		colorButton = new JButton("Farbe");
		colorButton.addActionListener(new ColorActionListener());

		lowerPanel.add(colorButton);

		drawButton = new JButton("Zeichnen");
		drawButton.addActionListener(new MyActionListener());

		lowerPanel.add(drawButton);

		// Hinzufuegen der Panels zum Main-Panel und hinzufuegen eines
		// MouseListeners, zum Einstellen der Koordinaten durch Maus-Klick
		this.add(upperPanel, BorderLayout.CENTER);
		this.add(lowerPanel, BorderLayout.SOUTH);
		this.addMouseListener(new MyMouseListener());
	}

	/**
	 * Der ActionListener der den Buttons sagt was sie beim Druecken zu tun
	 * haben
	 */
	private class MyActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			/*
			 * If-Abfrage die bei einem Zeichnen-Button-Klick ueberprueft,
			 * welche Figur gerade in der ComboBox ausgewaehlt ist und diese
			 * Figur sofort mit den eingestellten Werten erzeugt, in eine Liste
			 * speichert und zeichnet
			 * 
			 * nach der aenderung fuer das Factory Pattern wird hier die Factory
			 * angesprochen und nicht naeher ueberprueft
			 */
			int[] array = { Integer.parseInt(xField.getText()),
					Integer.parseInt(yField.getText()) };
			Figur figur = factory.bestelleFiguren(fBox.getSelectedItem()
					.toString(), array, c);
			if (figur != null)
				fList.add(figur);
			upperPanel.repaint();
		}
	}

	/**
	 * Der ActionListener der dem Button zur Farbauswahl
	 */
	private class ColorActionListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			// Wenn der Farbauswahl-Button geklickt wird, ColorChooser oeffnen
			if (e.getSource() == colorButton) {
				c = JColorChooser.showDialog(null, "Waehle deine Farbe",
						Color.BLACK);
			}
		}
	}

	/**
	 * Der MouseListener der bei einem Klick in die Applikation die x- und
	 * y-Koordinaten auf die geklickten Koordinaten aendert.
	 */
	private class MyMouseListener implements MouseListener {
		public void mouseReleased(MouseEvent e) {
			// Setzen der Texte fuer x und y in den Textfeldern.
			xField.setText("" + e.getX());
			yField.setText("" + e.getY());
		}

		@Override
		public void mouseClicked(MouseEvent arg0) {
			// TODO Auto-generated method stub

		}

		@Override
		public void mouseEntered(MouseEvent arg0) {
			// TODO Auto-generated method stub

		}

		@Override
		public void mouseExited(MouseEvent arg0) {
			// TODO Auto-generated method stub

		}

		@Override
		public void mousePressed(MouseEvent arg0) {
			// TODO Auto-generated method stub

		}
	}
}
