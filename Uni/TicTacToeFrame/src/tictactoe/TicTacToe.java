package tictactoe;


//Importe
import java.awt.Graphics;				//Zum Zeichnen des Spielfelds
import java.awt.Toolkit;				//Um auf Bilder im Verzeichnis zuzugreifen
import java.awt.event.MouseEvent;		//Zur Klickabfrage der Maus
import java.awt.event.MouseListener;	//Zur Positionsabfrage der Maus
import javax.swing.JFrame;				//Um ein Fenster darstellen zu können
import javax.swing.JOptionPane;

public class TicTacToe extends JFrame implements MouseListener { 		//TicTacToe erbt von JFrame und implementiert MouseListener für Klickabfrage

	private int[][] feld = new int[3][3];
	private int player = 1;
//	private int belegt = 0;
	
	public TicTacToe(String titel) {
		super(titel);					//Titel überschreiben
		this.addMouseListener(this);	//MouseListener im aktuellen Frame implementieren
	}
	
	public void paint(Graphics gr) {
		super.paintComponents(gr);				//Paintcomponents überschreiben
		
		//"Spielfeld" erzeugen
		
		for (int x = 1; x <= 2; x++) {			//zwei Striche horizontal
			gr.drawLine(x*250, 0, x*250, 750);
		}
		
		for (int y = 1; y <= 2; y++){			//zwei Striche vertikal
			gr.drawLine(0, y*250, 750, y*250);
		}
		
		//Symbole abfragen und ins Spielfeld zeichnen
		for (int x = 0; x < feld.length; x++ ) {
			for (int y = 0; y < feld.length; y++ ) {
				//if ( field[x][y] == 0){		//PROBIEREN BELEGTE FELDER ZU MARKIEREN
					if( feld[x][y] == 1 ) {																					//Wenn Spieler eins den Zug macht Kreuz malen
						gr.drawImage(Toolkit.getDefaultToolkit().getImage("TTT Images/TTTKreuz.png"), x*250, y*250, this);	//Kreuz aus Bilddatei zeichnen getImage("PFAD", POSITION X, POSITION Y, WELCHER FRAME?)
						//belegt++;
					}
					else if( feld[x][y] == 2 ) {																				//Wenn Spieler zwei den Zug macht Kreis malen
						gr.drawImage(Toolkit.getDefaultToolkit().getImage("TTT Images/TTTKreis.png"), x*250, y*250, this);	//Kreis aus Bilddatei zeichnen getImage("PFAD", POSITION X, POSITION Y, WELCHER FRAME?)
						//belegt++;
					}
				}					
			}
		}
	//}
	
	public void checkWin() {
		
		for (int x = 0; x < feld.length; x++ ) {
			for (int y = 0; y < feld.length; y++ ) {
				if ( feld[x][y] != 0 ) {
					if ( feld[0][y] == feld[1][y] && feld[0][y] == feld[2][y] ){ 			//Wenn horizontal gleich
						win(feld[0][y]);
					
					}
					if ( feld[x][0] == feld[x][1] && feld[x][0] == feld[x][2] ){ 			//Wenn vertikal gleich
						win(feld[x][0]);
					
					}
					if ( feld[1][1] != 0 ) { 
						if ( feld[0][0] == feld[1][1] && feld[0][0] == feld[2][2] ) { 		//Wenn diagonal gleich
							win(feld[0][0]);
					
						}
						if ( feld[2][0] == feld[1][1] && feld[2][0] == feld[0][2] ) { 		//Wenn diagonal gleich
							win(feld[2][0]);
					
						}
						//else unentschieden();
					}
				}
			}
		}
	}
	
	public void win(int player) {
		JOptionPane.showMessageDialog(this, "Spieler " + player + " hat gewonnen!");
		System.exit(0);
	}
	
/*	public void unentschieden() {
		if ( belegt == 9 ) {
		JOptionPane.showMessageDialog(this, "Unentschieden, keine Züge mehr möglich!");
		System.exit(0);
		}
	}
	
	
	
	public int getBelegung(){
		return belegt;
	}*/
	
	public static void main(String[] args) {
		// TODO Automatisch generierter Methodenstub
		TicTacToe main = new TicTacToe("Tic Tac Toe!"); 		//Neues Fenster mit Titel "Tic Tac Toe!"
		main.setSize(750, 750);									//Fenstergröße 750*750 Pixel ( da jedes feld 250 Pixel groß)
		main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	//Programm schließen, wenn Fenster geschlossen wird
		main.setUndecorated(true);								//Titelleiste verbergen
		main.setVisible(true);									//Fenster sichtbar machen
		

	}

	
	//Abstrakte Methoden von MouseListener
	
	@Override
	public void mouseClicked(MouseEvent e) {			//Wenn ein Click durchgeführt wird
		// TODO Automatisch generierter Methodenstub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {			//Wenn Maus Spielbereich betritt
		// TODO Automatisch generierter Methodenstub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {				//Wenn Maus Spielbereich verlässt
		// TODO Automatisch generierter Methodenstub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {			//Wenn Maustaste gedrückt wird
		// TODO Automatisch generierter Methodenstub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {			//Wenn Maustaste losgelassen wird
		// TODO Automatisch generierter Methodenstub
		
		int x = e.getX()/250;	//Abfragen in welchem Kästchen sich die Maus befindet (x-Achse)
		int y = e.getY()/250;	//Abfragen in welchem Kästchen sich die Maus befindet (y-Achse)
		
		
		if(player == 1) {		//Abfragen welcher Spieler den Zug tätigt
			feld[x][y] = 1;
			player = 2;
		}
		else if(player == 2) {	//Abfragen welcher Spieler den Zug tätigt
			feld[x][y] = 2;
			player = 1;
		}
		repaint();				//Spielfeld mit Zeichen aktualisieren
		checkWin();				//Prüfe ob Spiel vorbei
	}

}
