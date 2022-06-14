package predavanje;

import javax.swing.JOptionPane;

public class Z03 {

	public static void main(String[] args) {
	     int prviBroj=Integer.parseInt(
	    		 JOptionPane.showInputDialog("Unesi prvi broj")
	    		 );
	     
	     int drugiBroj=Integer.parseInt(
	    		 JOptionPane.showInputDialog("Unesi drugi broj")
	    		 );
	     
	     double rezultat=(double)prviBroj / drugiBroj;
	     System.out.println(rezultat);
	    		 

	}

}
