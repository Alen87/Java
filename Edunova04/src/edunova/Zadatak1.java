package edunova;

import javax.swing.JOptionPane;

//Deklarirajte niz od 4 cijela broja,
	// u niz uèitajte vrijednosti od korisnika
	// ispišite sumu svih upisanih vrijednosti



public class Zadatak1 {
public static void main(String[] args) {
	
	
	int[]niz= {Integer.parseInt(JOptionPane.showInputDialog("Unesi prvi broj")),
	           Integer.parseInt(JOptionPane.showInputDialog("Unesi drugi broj")),	
	           Integer.parseInt(JOptionPane.showInputDialog("Unesi treci broj")),
	           Integer.parseInt(JOptionPane.showInputDialog("Unesi cetvrti broj"))};
	
	
	int sum=0;
	
	sum=niz[0]+niz[1]+niz[2]+niz[3];
	System.out.println(sum);
	
	
	
	
}
}
