package edunova.zadatak1;

public class Toplokrvni extends Fauna {
	
	
	private double temperatura;

	
	
	
	
	public Toplokrvni(String naziv) {
		super(naziv);
	}





	public Toplokrvni(String naziv, double temperatura) {
		super(naziv);
		this.temperatura = temperatura;
	}





	public double getTemperatura() {
		return temperatura;
	}





	public void setTemperatura(double temperatura) {
		this.temperatura = temperatura;
	}
	
	
	
	
	
	
	

}
