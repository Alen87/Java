package edunova;

import javax.swing.JOptionPane;

//program osigurava unos niza
// znakova (String) koji ima
// minimalno 3 znaka
// ako nema tri znaka ispisuje korisniku
// poruku: Minimalno 3 znaka

public class Zadatak06 {
	public static void main(String[] args) {

		String s;

		while (true) {

			s = JOptionPane.showInputDialog("unos");

			if (s.length() < 3) {
				System.out.println("Unos minimalno 3 znaka");
				continue;
			}
			break;
		}
           System.out.println(s);
	}

}
