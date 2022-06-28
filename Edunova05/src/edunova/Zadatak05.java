package edunova;

import javax.swing.JOptionPane;

//program prima dva cijela broja
// ispisuje sve prim brojeve izmeðu
// dva primljena broja

public class Zadatak05 {
	public static void main(String[] args) {

		int x = Integer.parseInt(JOptionPane.showInputDialog("Unesi  x"));
		int y = Integer.parseInt(JOptionPane.showInputDialog("Unesi  y"));

		int min = x < y ? x : y;
		int max = x > y ? x : y;
		
		boolean prim;
		for(int i=min;i<=max;i++) {
			
			prim=true;
			for(int j=2;j<i;j++) {
				if(i%j==0) {
					prim=false;
					break;
				}
			}
			
			if(prim) {
				System.out.println(i);
			}
			
			
		}
		
		
		

	}
}
