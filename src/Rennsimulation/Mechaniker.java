package Rennsimulation;

public class Mechaniker extends Teammitglieder {
	
	private String spezialgebiet;
	private int reparaturen;
	private int gehalt;
	private int nummer;
	private Verwaltung<Mechaniker> list;
	
	public Mechaniker(){
		
	}
	
	public Mechaniker(String name, String vorname, String nationalität, String spezialgebiet, int nummer){
		this.name = name;
		this.vorname = vorname;
		this.nationalität = nationalität;
		this.spezialgebiet = spezialgebiet;
		this.nummer = nummer;
		list.addListMechanic(nummer, this);
		
	}
	
	public Mechaniker(String name, String vorname, String nationalität, String spezialgebiet, int nummer, int reparaturen, int gehalt){
		this.name = name;
		this.vorname = vorname;
		this.nationalität = nationalität;
		this.spezialgebiet = spezialgebiet;
		this.nummer = nummer;
		list.addListMechanic(nummer, this);
		this.reparaturen = reparaturen;
		this.gehalt = gehalt;
	}
	
	public void setSpezialgebiet( String spezialgebiet ){
		this.spezialgebiet = spezialgebiet;
	}
	
	public void setReparaturen( int reparaturen ){
		this.reparaturen = reparaturen;
	}
	
	public void setGehalt ( int gehalt ){
		this.gehalt = gehalt;
	}
	
	public String getSpezialgebiet( ){
		return spezialgebiet;
	}
	
	public int getReparaturen(){
		return reparaturen;
	}
	
	public int getGehalt(){
		return gehalt;
	}
	
	public int berechneGehalt(int gehalt){
		gehalt = 25000 + reparaturen*20000;		
		return gehalt;
	}
	
	
}
