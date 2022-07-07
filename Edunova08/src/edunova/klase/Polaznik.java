package edunova.klase;

public class Polaznik extends Osoba{
	
	private String brojUgovora;
	
	
	public Polaznik() {
		super();
		
	}
	

	public Polaznik(String ime, String prezime,String brojUgovora) {
		super(ime, prezime);
		this.brojUgovora=brojUgovora;
	}
	
	
	
	

	public String getBrojUgovora() {
		return brojUgovora;
	}

	public void setBrojUgovora(String brojUgovora) {
		this.brojUgovora = brojUgovora;
	}


	@Override
	public String toString() {
		return super.toString() + "  " + brojUgovora;
	}
	
	
	
	

}
