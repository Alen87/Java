package edunova.zadatak1;

public class Sisavac extends Toplokrvni{
	
	private int danaTrudnoce;
	
	
	
	
	

	public Sisavac(String naziv, double temperatura) {
		super(naziv, temperatura);
	}






	public Sisavac(String naziv, double temperatura, int danaTrudnoce) {
		super(naziv, temperatura);
		this.danaTrudnoce = danaTrudnoce;
	}






	public int getDanaTrudnoce() {
		return danaTrudnoce;
	}






	public void setDanaTrudnoce(int danaTrudnoce) {
		this.danaTrudnoce = danaTrudnoce;
	}
	
	
	
	
	
	
	
	
	
	

}
