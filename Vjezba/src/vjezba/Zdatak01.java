package vjezba;

import javax.swing.JOptionPane;

//  Napisati program za odredjivanje y po formuli:
// ako je a>=0, tada je y=1, inaèe je y=-1.


public class Zdatak01 {
	public static void main(String[] args) {
		
		int a=Integer.parseInt(JOptionPane.showInputDialog("Unesi broj"));
		int y;
		
		
		if(a>=0) {
			y=1;
		}else {
			y=-1;
		}
	
		System.out.println("y=" + y);
		
		
	}

}
