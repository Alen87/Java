package predavanje;

import javax.swing.JOptionPane;

public class Z02 {

	public static void main(String[] args) {
		
		int dvoznamenkastiBroj=Integer.parseInt(
				JOptionPane.showInputDialog("Unesi dvoznamenkasti broj")
				);
		
		
		System.out.println(dvoznamenkastiBroj%10);
		
		
	}

}
