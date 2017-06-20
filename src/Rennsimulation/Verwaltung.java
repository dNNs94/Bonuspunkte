package Rennsimulation;

import java.util.ArrayList;
import java.util.List;

public class Verwaltung<v extends Teammitglieder> {
	
	public Verwaltung(){
		
	}
	List<Pilot> pilotenListe = new ArrayList<>();
	List<Mechaniker> mechanikerListe = new ArrayList<>();
	List<Rennwagen> wagenListe = new ArrayList<>();
	private Pilot p;
	private Mechaniker m;
	private Rennwagen r;
	private int n;
	
	public void addListPilot(int n, Pilot p){
		pilotenListe.add(this.n = n, p);
	}
	
	public void addListMechanic(int n, Mechaniker m){
		mechanikerListe.add(this.n = n, m);
	}
	
	public void addListCar(int n, Rennwagen r){
		wagenListe.add(this.n = n, r);
	}
	

}
