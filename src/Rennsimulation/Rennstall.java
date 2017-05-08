package Rennsimulation;

import java.util.ArrayList;

public class Rennstall {
	
	private int anzahlTeammitglieder;
	private Teammitglieder t;
	private int anzahlRennwagen;
	private Rennwagen r;
	private String sponsor;
	private String name;
	
	public Rennstall(){
		
	}
	
	public Rennstall(int anzahlTeammitglieder, Teammitglieder t, int anzahlRennwagen, Rennwagen r, String sponsor, String name){
		this.anzahlTeammitglieder = anzahlTeammitglieder;
		this.t = t;
		this.anzahlRennwagen = anzahlRennwagen;
		this.r = r;
		this.sponsor = sponsor;
		this.name = name;
	}
	
	public void setTeammitglieder(Teammitglieder t){
		if(anzahlTeammitglieder < 5){
			this.t = t;
		}
	}

	public void setRennwagen(Rennwagen r){
		if(anzahlRennwagen < 3){
			this.r = r;
		}
	}
	
	public void setSponsor( String sponsor ){
		this.sponsor = sponsor;
	}
	
	public void setName( String name ){
		this.name = name;
	}
	
	public Teammitglieder getTeam(){
		return t;
	}
	
	public Rennwagen getRennwagen(){
		return r;
	}
	
	public String getSponsor(){
		return sponsor;
	}
	
	public String getName(){
		return name;
	}
	
	
	
}
