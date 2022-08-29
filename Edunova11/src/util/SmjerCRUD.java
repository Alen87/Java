package util;

import java.util.List;

import model.Smjer;

public class SmjerCRUD {

	public static Smjer unosNovog() {

		Smjer s = new Smjer();
		s.setSifra(Pomocno.ucitajInt("Unesite sifru smjera(pozitivan broj)", true));
		s.setNaziv(Pomocno.ucitajString("Unesi naziv smjera"));
		s.setTrajanje(Pomocno.ucitajInt("Unesi vrijeme trajanja (mjeseci)"));
		s.setCijena(Pomocno.ucitajBigDecimal("Unos cijene"));
		s.setUpisnina(Pomocno.ucitajBigDecimal("Unos upisnine"));
		// cretificiran
		// ostalo DZ
		return s;

	}

	public static void ispis(List<Smjer> smjerovi) {
		int rb = 1;

		System.out.println("");
		System.out.println("Smjerovi u aplikaciji");
		for (Smjer s : smjerovi) {
			System.out.println(rb++ + ". " + s.getNaziv());
		}
		System.out.println("-------------------");
	}

	public static void promjena(Smjer s) {

		s.setSifra(Pomocno.ucitajInt("sifra (" + s.getSifra() + ")", true));
		s.setNaziv(Pomocno.ucitajString("naziv (" + s.getNaziv() + ")"));

		// ostalo DZ

	}

}
