package edunova;

import javax.swing.JOptionPane;

public class Zadatak06 {
	public static void main(String[] args) {
		
		
		// Program unosi 2 broja
		// Ako su oba broja parni
		// ispisuje njihov zbroj
		// inače ispisuje njihovu razliku

		
		
		
		
		

		int i = Integer.parseInt(JOptionPane.showInputDialog("Unesi broj"));
		int j = Integer.parseInt(JOptionPane.showInputDialog("Unesi broj"));

		int zbroj = i + j;
		int razlika = i-j;
		
		if(i%2==0 && j%2==0) {
			System.out.println(zbroj);
		}else {
			System.out.println(razlika);
		}
		
		
		System.out.println((i%2==0 && j%2==0)?zbroj:razlika);
		
		

	}
}
