package Rennsimulation;

public class Saison {

	private int anzahlRennen = 9;
	private Rennen rennen;
	
	public void setRennzahl(int anzahlRennen){
		this.anzahlRennen = anzahlRennen;
	}
	
	public void setRennen(Rennen rennen){
		this.rennen = rennen;
	}
	
	public int getRennzahl(){
		return anzahlRennen;
	}
	
	public Rennen getRennen(){
		return rennen;
	}
	
}
