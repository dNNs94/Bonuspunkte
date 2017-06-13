import javax.swing.JOptionPane;


public class Berechnungen {

	public static void main( String[] args){					// FEHLER AUSGABETYP FEHLT ( HIER VOID )
		
		JOptionPane.showMessageDialog(null, "pi/2 = " + (Math.PI/2));		// FEHLER showMessageDialog muss für die Komponente "Frame" einen Wert gegeben haben (hier "null")
		System.out.println("Umsatz: 100 Euro");
		
	}
	
	
}
