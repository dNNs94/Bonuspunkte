//import java.util.*;

import javax.swing.JOptionPane;

//import java.awt.*;


public class Quersumme {

	public static void main(String[] args)
	{
		int zahl, rzahl,  quersumme;				// Variablen definieren
		quersumme = 0;								// Quersumme implementieren
		zahl = Integer.parseInt(JOptionPane.showInputDialog("Bitte geben Sie die Zahl ein dessen Quersumme berechnet werden soll:") );	// Eingabefeld aufrufen und eingegebenen Wert in Variable "Zahl" schreiben
		rzahl = zahl;								// zweite Variable gleich "Zahl" einführen um den Eingabewert vom Rechenwert zu unterscheiden, damit man die eingegebene Zahl auch ausgeben kann
		while (0 != rzahl) {						// Solange rzahl nicht null ist
			// addiere die letzte ziffer der uebergebenen zahl zur summe
			quersumme = quersumme + (rzahl % 10);
			// entferne die letzte ziffer der uebergebenen zahl
			rzahl = rzahl / 10;
		}
		JOptionPane.showMessageDialog(null, "Die Quersumme von " + zahl + " ist " + quersumme); // Rufe ein Ausgabefenster mit der eingegebenen Zahl und dessen Quersumme auf
	}
}

/*public class Quersumme {

	public static void main(String[] args)
	{
		int x, zahl,  quersumme;				// Variablen definieren
		quersumme = 0;							// Quersumme implementieren
		x = 1234;								// x deklarieren
		zahl = x;								// Zahl zur ausgabe speichern
		while (x != 0) {						// Solange rzahl nicht null ist
			quersumme = quersumme + (x % 10);	// addiere die letzte ziffer der uebergebenen zahl zur summe
			x = x / 10;							// entferne die letzte ziffer der uebergebenen zahl
		}
		System.out.println("Die Quersumme von " + zahl + " ist " + quersumme); // Ausgabe Quersumme
	}
}*/