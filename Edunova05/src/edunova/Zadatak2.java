package edunova;

import javax.swing.JOptionPane;

//Program od korisnika unosi
// cjele brojeve dok korisnik
// ne unese broj -1
// program ispisuje sumu svih unesenih
// brojeva
// koristeæi while

public class Zadatak2 {
	public static void main(String[] args) {

		int n=0;

		int suma = 0;

		while (n != -1) {
			
			
           n=Integer.parseInt(JOptionPane.showInputDialog("Unesi  broj"));
		   suma += n;

		}

		System.out.println(suma+1);

	}
}
