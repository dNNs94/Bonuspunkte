package Rennsimulation;

public abstract class Teammitglieder {

	public String name;
	public String vorname;
	public String nationalität;
	
	public void setName( String name ){
		this.name = name;
	}
	
	public void setVorname( String Vorname ){
		this.vorname = vorname;
	}
	
	public void setNationalität( String nationalität ){
		this.nationalität = nationalität;
	}
	
	public String getName(){
		return name;
	}
	
	public String getVorname(){
		return vorname;
	}
	
	public String getNationalität(){
		return nationalität;
	}
	
}
