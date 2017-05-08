package Rennsimulation;

public class Pilot extends Teammitglieder {
	
	private static int nummer;
	private int siege;
	private int gehalt;
	
	public Pilot(){
		
	}
	
	public Pilot(String name, String vorname, String nationalit�t, int nummer){
		this.name = name;
		this.vorname = vorname;
		this.nationalit�t = nationalit�t;
		this.nummer = nummer;
		Verwaltung.addList(this);
	}
	
	public Pilot(String name, String vorname, String nationalit�t, int nummer, int siege, int gehalt){
		this.name = name;
		this.vorname = vorname;
		this.nationalit�t = nationalit�t;
		this.nummer = nummer;
		this.siege = siege;
		this.gehalt = gehalt;
	}
	
	
	public void setNummer( int nummer){
		this.nummer = nummer;
	}
	
	public void setSiege( int siege ){
		this.siege = siege;
	}
	
	public static int getNummer(){
		return nummer;
	}
	
	public int getSiege(){
		return siege;
	}
	
	public int berechneGehalt(int gehalt){
		gehalt = 100000 + siege*50000;		
		return gehalt;
	}

}
