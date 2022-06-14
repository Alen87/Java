package edunova;

import javax.swing.JOptionPane;

public class Zadatak04 {
	public static void main(String[] args) {
		int prviBroj=Integer.parseInt(JOptionPane.showInputDialog("Unesi broj"));
		int drugiBroj=Integer.parseInt(JOptionPane.showInputDialog("Unesi broj"));
		int treciBroj=Integer.parseInt(JOptionPane.showInputDialog("Unsi broj"));
		
		
		if(prviBroj>drugiBroj && prviBroj >treciBroj) {
			System.out.println(prviBroj);
		}else if(drugiBroj > treciBroj) {
			System.out.println(drugiBroj);
		}else {
			System.out.println(treciBroj);
		}
		
		
		
		System.out.println((prviBroj>drugiBroj && prviBroj >treciBroj)? prviBroj: (drugiBroj>treciBroj)?drugiBroj:treciBroj);
		
		
	}

}
