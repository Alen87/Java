package edunova;

import javax.swing.JOptionPane;

//Za unesena 2 broja program ispisuje
		// sumu svih izmedju njih

public class Zadatak01 {
	public static void main(String[] args) {
		
		int a=Integer.parseInt(JOptionPane.showInputDialog("Unesi  vrijednost a"));
		int b=Integer.parseInt(JOptionPane.showInputDialog("Unesi  vrijednost b"));
		
		
		int suma=0;
		
		for(int i=a>=b?b:a;i<=(b>a? b:a);i++) {
              suma+=i;			
		}
		
		
		
		System.out.println(suma);
		
	}

}
