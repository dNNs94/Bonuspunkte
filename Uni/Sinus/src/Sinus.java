import javax.swing.*;
/*
 * Math.sqrt() Gibt die korrekt gerundete positive Quadratwurzel vom Typ double aus.
 * Math.pow() Gibt einen korrekt berechneten Exponentialwert aus
 * Math.max() Gibt die größere aus zwei Gleitpunktzahlen vom Typ double aus. 
 *  */



public class Sinus {
	

	

	public static void main(String[] args){
		
		JOptionPane.showMessageDialog(null,"Sinus: " + Math.sin(2316*26));
		JOptionPane.showMessageDialog(null,"Wurzel: " + ( Math.sqrt( ( Math.pow( 35.78, 3 ) - ( Math.pow( 234, 2 ) ) ) ) ) );
		JOptionPane.showMessageDialog(null,"E-Funktion: " + ( Math.pow ( Math.E , Math.PI ) + Math.pow( Math.E, - ( Math.PI ) ) ) );
		
	}
	
}
