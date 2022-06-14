package edunova;

import javax.swing.JOptionPane;

public class Zadatak05 {
	public static void main(String[] args) {
		// program unosi broj između 
		// 1 i 999
		// U slučaju da je izvan tog raspona
		// ispisati grešku i prekinuti program
		// Program ispisuje 1. znamenku upisanog broja
		
		// -5 greška
		// 1067 greška
		// 456 4
		// 6 6
		// 89 8
		
		
		int broj=Integer.parseInt(JOptionPane.showInputDialog("Unesi broj"));
		
		
		if(broj<1 || broj > 999 ) {
			System.out.println("Greska");
		}else if(broj > 0 && broj <10) {
			System.out.println(broj);
		}else if (broj >=10 && broj <=99) {
			System.out.println(broj/10);
		}else { 
			System.out.println(broj/100);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
