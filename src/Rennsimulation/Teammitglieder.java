package Rennsimulation;

public abstract class Teammitglieder {

	public String name;
	public String vorname;
	public String nationalit�t;
	
	public void setName( String name ){
		this.name = name;
	}
	
	public void setVorname( String Vorname ){
		this.vorname = vorname;
	}
	
	public void setNationalit�t( String nationalit�t ){
		this.nationalit�t = nationalit�t;
	}
	
	public String getName(){
		return name;
	}
	
	public String getVorname(){
		return vorname;
	}
	
	public String getNationalit�t(){
		return nationalit�t;
	}
	
}
