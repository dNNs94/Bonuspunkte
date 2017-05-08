package Rennsimulation;

public class Rennwagen {

	private int anzahlWagen;
	private Pilot wagenPilot;
	private int wagennummer;
	private boolean isDefekt;	
	
	
	public void setAnzahl(int anzahlWagen){
		this.anzahlWagen = anzahlWagen;
	}
	
	public void setDefekt(boolean isDefekt){
		this.isDefekt = isDefekt;
	}
	
	public void setWagennummer(int wagennummer){
		this.wagennummer = wagennummer;
	}
	
	public void setPilot(Pilot wagenPilot){
		this.wagenPilot = wagenPilot;
	}
	
	public int getAnzahl(){
		return anzahlWagen;
	}
	
	public boolean isDefekt(){
		return isDefekt;
	}
	
	public int getWagennummer(){
		return wagennummer;
	}
	
	public Pilot getPilot(){
		return wagenPilot;
	}
}
