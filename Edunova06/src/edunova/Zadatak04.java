package edunova;
//Za dva u�itana broja ispi�i manji

public class Zadatak04 {
public static void main(String[] args) {
	
	int a=Pomocno.ucitajInt("Ucitaj prvi", true);
	int b=Pomocno.ucitajInt("Drugi");
	
	
	System.out.println(a>=b ?  b :a);
	
	
	
	
}
}
