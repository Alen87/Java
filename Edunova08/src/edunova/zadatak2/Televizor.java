package edunova.zadatak2;

public class Televizor extends Uredaj {
	
	private String vrstaDaljinskog;

	public Televizor(String proizvodac, String vrstaDaljinskog) {
		super(proizvodac);
		this.vrstaDaljinskog = vrstaDaljinskog;
	}

	public Televizor(String proizvodac) {
		super(proizvodac);
	}
	
	
	
	
	

	public String getVrstaDaljinskog() {
		return vrstaDaljinskog;
	}

	public void setVrstaDaljinskog(String vrstaDaljinskog) {
		this.vrstaDaljinskog = vrstaDaljinskog;
	}
	
	
	
	

}
