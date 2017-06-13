import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.event.*;



public class Menu extends JFrame {


		
	// Komponenten erstellen
	private JButton close;
	private JButton settings;
	private JButton startGame;
	private JButton saveName;
	private JButton changeColor;
	private JButton example;
	private JButton wasNoch;
	private JTextField player;
	private JLabel name;
	
	private CloseListener closeListener;
	
	
	private void initializeComps() {
		//Komponenten initialisieren
		this.close = new JButton("Close");
		this.settings = new JButton("Settings");
		this.startGame = new JButton("Start Game");
		this.saveName = new JButton("Save Name");
		this.changeColor = new JButton("Change Color");
		this.example = new JButton("Example");
		this.wasNoch = new JButton("Was Noch?!");
		
		this.player = new JTextField("Player");
		player.setEditable(true);
		
		this.name = new JLabel("Name: ");
	
		
		this.closeListener = new CloseListener();
		
	}
	
	public void sortComps() {
		//Komponenten per GridBagLayout im Frame anordnen
		this.getContentPane().setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		c.fill = GridBagConstraints.BOTH;
		c.insets = new Insets(4, 4, 4, 4);
		
		
		add(this.name, c);
		add(this.player, c);
		add(this.saveName, c);
		c.gridy = 1;
		c.gridx = 1;
		add(this.startGame, c);
		c.gridy = 2;
		add(this.settings, c);
		c.gridy = 3;
		add(this.example, c);
		c.gridy = 5;
		add(this.wasNoch, c);
		c.gridy = 6;
		add(this.close, c);
		
	}
	
	/*public void refreshResult(){
	
		HIER FARBWÄHLER FÜR SPIELERFARBE IMPLEMENTIEREN
		
	}*/
	
	public Menu(String title){
		//Konstruktor
		super(title);
		initializeComps();										//Komponenten initialisieren
		sortComps();											//Komponenten nach Layoutvorgabe sortieren
		registerListener();										//Listener zuweisen
		this.setVisible(true);									//Sichtbar machen
		this.setSize(300, 300);									//Fenstergröße festlegen
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	//Programm schließen, wenn Fenster geschlossen wird
		this.setResizable(false); 								//Fenstergröße nicht veränderbar


		
	}
	
	private class CloseListener implements ActionListener{
		//ActionListener für Klick auf "Close"-Button
	    @Override
	    public void actionPerformed(ActionEvent e) {
	        //Frame schließen
	        System.exit(0);
	    }
	}
	
	public void registerListener(){
		//Listener dem jeweiligen Button zuweisen
		this.close.addActionListener(this.closeListener);

	}
	
	public static void main(String[] args){
		Menu main = new Menu("Main Menu"); 						//Neues Fenster mit Titel "Main Menu"
	
	}
	
	
}
