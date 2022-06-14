package edunova;

import javax.swing.JOptionPane;

public class Zadatak01 {
	public static void main(String[] args) {

		// Za dva unesena cijela broja
		// program ispisuje Osijek
		// ako je zbroj veći od 10
		// inače ispisuje Edunova

		int prviBroj = Integer.parseInt(JOptionPane.showInputDialog("Unesi prvi  broj"));
		int drugiBroj = Integer.parseInt(JOptionPane.showInputDialog("Unesi  drugi broj"));

		int zbroj=prviBroj + drugiBroj;
		
		
		if(zbroj > 10) {
			System.out.println("Osijek");
		}else {
			System.out.println("Edunova");
		}
		
		
		
	}

}
