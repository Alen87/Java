package predavanje;

import javax.swing.JOptionPane;

public class E04PrimitivniTipoviPodataka {

	public static void main(String[] args) {
		// Prije koristenja JOptionPane
		// u module info treba dodati
		// requires java.desktop;
		
		String unosOdKorisnika = JOptionPane.showInputDialog("Unesi broj");
		
		int b = Integer.parseInt(unosOdKorisnika);
		
		System.out.println(b);
		
		
		
	}

}
