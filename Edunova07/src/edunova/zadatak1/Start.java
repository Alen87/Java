package edunova.zadatak1;

public class Start {
	public static void main(String[] args) {
		
		Smjer smjer = new Smjer();
		smjer.setCijena(13.99);
		
		System.out.println(smjer.getCijena());
		
		smjer.setNaziv("Smjer.smjer");
		System.out.println(smjer.getCijena() + " " + smjer.getNaziv());
		
		
		Predavac predavac=new Predavac();
		predavac.setIme("Pero");
		predavac.setPrezime("Peric");
		
		System.out.println("Predavac" + "  " + predavac.getIme() +" "+ "predaje" + " "+smjer.getNaziv());
		
		
		Grupa grupa = new Grupa();
		grupa.setPredavac(predavac);
		grupa.setSmjer(smjer);
		
		System.out.println(grupa.getPredavac().getIme() + "  " + grupa.getPredavac().getPrezime() + " " + grupa.getSmjer().getNaziv() + " " + grupa.getSmjer().getCijena() );
		
		
		
		
	}
	

}
