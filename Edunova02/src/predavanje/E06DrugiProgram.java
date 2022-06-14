package predavanje;

import javax.swing.JOptionPane;

public class E06DrugiProgram {

	public static void main(String[] args) {
		// Za upisana  dva  cijela broja
		// program  ispisuje njihov zbroj
		
		int prviBroj=Integer.parseInt(
				JOptionPane.showInputDialog("Unesi prvi broj")
				);
		
		int drugiBroj=Integer.parseInt(
				JOptionPane.showInputDialog("Unesi drugi broj")
				);
		
		//algoritam
		int rezultat=prviBroj + drugiBroj;
		
		//izlaz
		System.out.println(rezultat);
		

	}

}
