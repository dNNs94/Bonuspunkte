package Rennsimulation;

public abstract class Teammitglieder {

	public String name;
	public String vorname;
	public String nationalitšt;
	
	public void setName( String name ){
		this.name = name;
	}
	
	public void setVorname( String Vorname ){
		this.vorname = vorname;
	}
	
	public void setNationalitšt( String nationalitšt ){
		this.nationalitšt = nationalitšt;
	}
	
	public String getName(){
		return name;
	}
	
	public String getVorname(){
		return vorname;
	}
	
	public String getNationalitšt(){
		return nationalitšt;
	}
	
}
