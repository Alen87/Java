package edunova;

import javax.swing.JOptionPane;

//Program uèitava dva broja
	// ispisuje zbroj dvaju uèitanih brojeva
	// Kreirati metode:
	// ucitaj
	// izracunaj
	// ispisi
	

public class Zadatak03 {
	public static void main(String[] args) {
	
		ispisi(izracunaj(ucitaj("Prvi"),ucitaj("Drugi")));
		
		
		
	}

	
	static int ucitaj(String poruka) {
		
		return Integer.parseInt(JOptionPane.showInputDialog(poruka));
	}
	
	
	static int izracunaj(int a,int b) {
		
		return a+b;
	}
	
	
	static void ispisi(int b) {
		System.out.println(b);
	}
	
	
	
	
	
}
