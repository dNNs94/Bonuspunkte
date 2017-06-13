package H�rsaal;

public class Hoersaal {
	
	public int platz;								// �ffentliche Variablen erstellen
	public String name;								// �ffentliche Variablen erstellen

	public static int Sitzplatz(int platz){								// Methode zur Abfrage der Anzahl an Sitzpl�tzen
		System.out.println("H�rsaal hat" + platz + " Sitzpl�tze.");		// Textausgabe der Anzahl
		return platz;													// R�ckgabe der Anzahl
	}
	
	public static String Name (String name){							// Mehtode zur Abfrage des Namens des H�rsaals
		System.out.println("H�rsaal hei�t: " + name);					// Textausgabe des Namens
		return name;													// R�ckgabe des Namens
		
	}
	
	public static String Beides (String name, int platz){				// Methode zur Abfrage des Namens und der Anzahl an Sitzpl�tzen
		System.out.println("H�rsaal hei�t " + name + " und hat " + platz + " Sitzpl�tze.");	// Textausgabe Anzahl und Name
		return name + platz;											// R�ckgabe des Namens und der Anzahl
	}
	
	public static void main(String[] args) {							// Main Methode
		Hoersaal.Name("H5");											// Erstelle Instanz von H�rsaal namens H5
		Hoersaal.Name("H2");											// Erstelle Instanz von  H�rsaal namens H2
		Hoersaal.Beides("H5", 65);										// Erstelle Instanz von  H�rsaal namens H5 mit 65 Sitzpl�tzen

	}

}
