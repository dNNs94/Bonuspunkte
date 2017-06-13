package Hörsaal;

public class Hoersaal {
	
	public int platz;								// öffentliche Variablen erstellen
	public String name;								// öffentliche Variablen erstellen

	public static int Sitzplatz(int platz){								// Methode zur Abfrage der Anzahl an Sitzplätzen
		System.out.println("Hörsaal hat" + platz + " Sitzplätze.");		// Textausgabe der Anzahl
		return platz;													// Rückgabe der Anzahl
	}
	
	public static String Name (String name){							// Mehtode zur Abfrage des Namens des Hörsaals
		System.out.println("Hörsaal heißt: " + name);					// Textausgabe des Namens
		return name;													// Rückgabe des Namens
		
	}
	
	public static String Beides (String name, int platz){				// Methode zur Abfrage des Namens und der Anzahl an Sitzplätzen
		System.out.println("Hörsaal heißt " + name + " und hat " + platz + " Sitzplätze.");	// Textausgabe Anzahl und Name
		return name + platz;											// Rückgabe des Namens und der Anzahl
	}
	
	public static void main(String[] args) {							// Main Methode
		Hoersaal.Name("H5");											// Erstelle Instanz von Hörsaal namens H5
		Hoersaal.Name("H2");											// Erstelle Instanz von  Hörsaal namens H2
		Hoersaal.Beides("H5", 65);										// Erstelle Instanz von  Hörsaal namens H5 mit 65 Sitzplätzen

	}

}
