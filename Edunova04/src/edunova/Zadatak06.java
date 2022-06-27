package edunova;

//Za dani jednodimenzinalni niz
// cjelih brojeva program ispisuje 
// najveæi

public class Zadatak06 {
	public static void main(String[] args) {

		int[] niz = { 5, 5, 8, 6, -6, 8, -1, 0, 9, 0 };

		int max = Integer.MIN_VALUE;
		for (int a : niz) {
			if (a > max) {
				max = a;
			}

		}

		System.out.println(max);
	}
}
