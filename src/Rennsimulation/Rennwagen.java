package Rennsimulation;

public class Rennwagen extends Teammitglieder {

	private int anzahlWagen;
	private Pilot p;
	private int nummer;
	private boolean isDefekt;
	private Verwaltung<Rennwagen> list;
	
	public Rennwagen(Pilot p, int nummer, boolean isDefekt){
		this.p = p;
		this.nummer = nummer;
		this.isDefekt = isDefekt;
		list.addListCar(nummer, this);
		
	}
	
	public void setAnzahl(int anzahlWagen){
		this.anzahlWagen = anzahlWagen;
	}
	
	public void setDefekt(boolean isDefekt){
		this.isDefekt = isDefekt;
	}
	
	public void setWagennummer(int wagennummer){
		this.nummer = wagennummer;
	}
	
	public void setPilot(Pilot wagenPilot){
		this.p = p;
	}
	
	public int getAnzahl(){
		return anzahlWagen;
	}
	
	public boolean isDefekt(){
		return isDefekt;
	}
	
	public int getWagennummer(){
		return nummer;
	}
	
	public Pilot getPilot(){
		return p;
	}
}
