package edunova;

import javax.swing.JOptionPane;

//za upisani cjeli broj
	// ispiši zbroj zvih znamenki
	
	// ulaz: 263736
	// izlaz: 27
	
	// ulaz: 26
	// izlaz: 8

public class Zadatak04 {
	public static void main(String[] args) {

		int n=Integer.parseInt(JOptionPane.showInputDialog("Unesi  broj"));
		
		
	    int suma=0;
	    
	    while(n>0) {
	    	suma+=n%10;
	    	n/=10;
	    	
	    	
	    }
		
		
		
	    System.out.println(suma);
		
		
		
		
	}
}
