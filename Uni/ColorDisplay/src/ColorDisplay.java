import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;


public class ColorDisplay extends JFrame {
	
	//Komponenten ezeugen
	private static final long serialVersionUID = -2107440947831361823L;
	private JLabel labelRed;
	private JLabel labelGreen;
	private JLabel labelBlue;	
	// private JLabel labelTransparency;
	
	private JSlider sliderRed;
	private JSlider sliderGreen;
	private JSlider sliderBlue;
	// private JSlider sliderTransparency;
	
	private JTextField textColor;
	private ColorListener colorListener;
	
	private Color background;
	
	private void initializeComponents() {
		
		// Komponenten initialisieren
		this.labelRed = new JLabel("Rot");
		this.labelGreen = new JLabel("Grün");
		this.labelBlue = new JLabel("Blau");
	//	this.labelTransparency = new JLabel("Transparenz");
		
		this.sliderRed = this.makeSlider(0, 255);
		this.sliderGreen = this.makeSlider(0, 255);
		this.sliderBlue = this.makeSlider(0, 255);
	//	this.sliderTransparency = this.makeSlider(0, 255);
		
		
		this.textColor = new JTextField();
		textColor.setEditable(false);
		textColor.setBackground(background);
		this.colorListener = new ColorListener();
		

		
	}
	
	public void refreshResult() {
		
		// Werte der Schieber als Zahlenwert für Farbe übernehmen
		int red = this.sliderRed.getValue();
		int green = this.sliderGreen.getValue();
		int blue = this.sliderBlue.getValue();
	//	int transparency = this.sliderTransparency.getValue();
		// Labelfarbe aktualisieren
		this.background = new Color(red, green, blue);
		textColor.setBackground(background);
	}
	
	public void registerListener(){
		
		// Listener zuweisen
		this.sliderRed.addChangeListener(this.colorListener);
		this.sliderGreen.addChangeListener(this.colorListener);
		this.sliderBlue.addChangeListener(this.colorListener);
	//	this.sliderTransparency.addChangeListener(this.colorListener);
	}
	
	public void sortComponents() {
		
		// Komponenten nach GridbagLayout anordnen
		this.getContentPane().setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		c.fill = GridBagConstraints.HORIZONTAL;
		c.insets = new Insets(1, 1, 1, 1);
		
		// Komponenten hinzufügen und Positionen bestimmen
		add(labelRed, c);
		add(sliderRed, c);
		c.gridy = 2;
		add(labelGreen, c);
		add(sliderGreen, c);
		c.gridy = 4;
		add(labelBlue, c);
		add(sliderBlue, c);
		c.gridy = 6;
	//	add(labelTransparency, c);
	//	add(sliderTransparency, c);
	//	c.gridy = 9;
		c.gridx = 1;
		add(textColor, c);
		

	}
	
	public ColorDisplay(String title){
		
		// Konstrukor des Frames
		super(title);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(350, 340);
		this.initializeComponents();
		this.sortComponents();
		this.registerListener();
		this.refreshResult();
		this.setVisible(true);
		
		
	}	

	
	private class ColorListener implements ChangeListener {
		
		// Listener für Slider-Werte
		@Override
		public void stateChanged(ChangeEvent e) {
			refreshResult();
		}
	}
	
	private JSlider makeSlider(int min, int max){
		
		// Methode zum erstellen von Slidern nach vorgegebenem Schema
		JSlider slider = new JSlider(min, max);
		slider.setPaintLabels(true);
		slider.setPaintTicks(true);
		slider.setMinorTickSpacing(10);
		slider.setMajorTickSpacing(50);
		slider.setValue(0);
		return slider;		
	}
	
	public static void main(String[] args){
		
		new ColorDisplay("Farbmischer");
	}
	
}
