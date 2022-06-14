package edunova;

import javax.swing.JOptionPane;

public class Zadatak02 {
	public static void main(String[] args) {

		// Za upisani cjeli broj
		// program ispisuje da li je
		// parni broj ili ne

		int broj = Integer.parseInt(JOptionPane.showInputDialog("Unesi  broj"));

		if (broj % 2 == 0) {
			System.out.println("Broj je paran");
		}else {
			System.out.println("Broj je  neparan");
		}

	}

}
