package edunova.zadatak05;

public class Knjiga {

	private int brojStranica;
	private Autor autor[];
	
	
	
	
	public Knjiga() {
		super();
	}




	public Knjiga(int brojStranica, Autor[] autor) {
		super();
		this.brojStranica = brojStranica;
		this.autor = autor;
	}




	public int getBrojStranica() {
		return brojStranica;
	}




	public void setBrojStranica(int brojStranica) {
		this.brojStranica = brojStranica;
	}




	public Autor[] getAutor() {
		return autor;
	}




	public void setAutor(Autor[] autor) {
		this.autor = autor;
	}
	
	
	
	
	
	
	
	
	
}
