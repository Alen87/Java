package edunova.zadatak2;

public class Racunalo extends Uredaj{
	
	
	private String vrstaPrikljucka;

	public Racunalo(String proizvodac, String vrstaPrikljucka) {
		super(proizvodac);
		this.vrstaPrikljucka = vrstaPrikljucka;
	}

	public Racunalo(String proizvodac) {
		super(proizvodac);
	} 
	
	 
	 
	

	public String getVrstaPrikljucka() {
		return vrstaPrikljucka;
	}

	public void setVrstaPrikljucka(String vrstaPrikljucka) {
		this.vrstaPrikljucka = vrstaPrikljucka;
	}
	
	
	

}
