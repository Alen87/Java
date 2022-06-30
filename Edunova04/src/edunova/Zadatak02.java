package edunova;

//Za primljeni cijeli broj
// metoda naziva isPrime
// vraæa true ako je prim (prosti)
// ili false ako nije

public class Zadatak02 {
	public static void main(String[] args) {
		
		int broj=3;
		System.out.println(isPrime(broj));
		

	}

	static boolean isPrime(int broj) {
		
		for(int i=2;i<broj;i++) {
			if(broj%i==0) {
				return false;
				
			}
			
		}
		
		return true;
	}
	
	
	
	
}
