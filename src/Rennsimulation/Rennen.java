package Rennsimulation;

public class Rennen {

	private int runden;
	private String strecke;
	
	public Rennen(){
		
	}
	
	public Rennen(String strecke, int runden){
		this.strecke = strecke;
		this.runden = runden;
	}
	
	public void setRunden(int runden){
		this.runden = runden;
	}
	
	public void setStrecke(String strecke){
		this.strecke = strecke;
	}
	
	public int getRunden(){
		return runden;
	}
	
	
	public String getStrecke(){
		return strecke;
	}
	
}
