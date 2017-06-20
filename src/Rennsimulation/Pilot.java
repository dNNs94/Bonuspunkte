package Rennsimulation;

public class Pilot extends Teammitglieder {
	
	private int nummer;
	private int siege;
	private int gehalt;
	private Verwaltung<Pilot> list;
	
	public Pilot(){
		
	}
	
	public Pilot(String name, String vorname, String nationalität, int nummer){
		this.name = name;
		this.vorname = vorname;
		this.nationalität = nationalität;
		this.nummer = nummer;
		list.addListPilot(nummer, this);
	}
	
	public Pilot(String name, String vorname, String nationalität, int nummer, int siege, int gehalt){
		this.name = name;
		this.vorname = vorname;
		this.nationalität = nationalität;
		this.nummer = nummer;
		list.addListPilot(nummer, this);
		this.siege = siege;
		this.gehalt = gehalt;
	}
	
	
	public void setNummer( int nummer ){
		this.nummer = nummer;
	}
	
	public void setSiege( int siege ){
		this.siege = siege;
	}
	
	public int getNummer(){
		return nummer;
	}
	
	public int getSiege(){
		return siege;
	}
	
	public int berechneGehalt(){
		gehalt = 100000 + siege*50000;		
		return gehalt;
	}

}
