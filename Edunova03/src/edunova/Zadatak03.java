package edunova;

import javax.swing.JOptionPane;

public class Zadatak03 {
	public static void main(String[] args) {
		
		// Za unesena dva cjela broj
		// program ispisuje najveći
		
		
		int prviBroj=Integer.parseInt(JOptionPane.showInputDialog("Unesi prvi broj"));
		int drugiBroj=Integer.parseInt(JOptionPane.showInputDialog("Unesi drugi broj"));
		
		if(prviBroj>drugiBroj) {
			System.out.println(prviBroj);
		}else {
			System.out.println(drugiBroj);
		}
		
		
		
		
		
	}

}
