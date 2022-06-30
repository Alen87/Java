package edunova;

import java.util.Arrays;

import javax.swing.JOptionPane;

//Metoda prima niz cjelih brojeva
// metoda vraæa najmanji elelent niza
// metoda se zove najmanji

public class Zadatak01 {
	public static void main(String[] args) {
	    int[]najmanjiNiz=new int[5];
	    for(int i=0;i<najmanjiNiz.length;i++) {
		  najmanjiNiz[i]=Integer.parseInt(JOptionPane.showInputDialog("Unesi broj"));
	    }
		System.out.println(najmanji(najmanjiNiz));
		

	}

	static int najmanji(int[] niz) {

		int min = Integer.MAX_VALUE;
		for (int a : niz) {
			if (a < min) {
				min = a;
			}
		}

		return min;
	}

}
