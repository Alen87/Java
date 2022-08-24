package edunova;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.Grupa;
import model.Polaznik;
import model.Predavac;
import model.Smjer;
import util.Pomocno;



public class Start {
	
	private List<Smjer>smjerovi;
	private List<Polaznik>polaznici;
	private List<Predavac>predavaci;
	private List<Grupa> grupe;

	public Start() {
		smjerovi = new ArrayList();
		polaznici = new ArrayList();
		predavaci = new ArrayList();
		grupe = new ArrayList();
		inicijalniPodaci();
		Pomocno.ulaz = 
				new Scanner(System.in);
		System.out.println("***** Edunova konzolna aplikacija V1 *****");
		izbornik();
		Pomocno.ulaz.close();
	}
	public void inicijalniPodaci() {
		Smjer s = new Smjer();
		s.setSifra(1);
		s.setNaziv("Java");
		smjerovi.add(s);
		s=new Smjer();
		s.setSifra(2);
		s.setNaziv("PHP");
		smjerovi.add(s);
		
		
		polaznici.add(new Polaznik(1,"Ana","Zimska","","",""));
		polaznici.add(new Polaznik(2,"Marko","Tot","","",""));
		polaznici.add(new Polaznik(3,"Marija","Sven","","",""));
		
		
		Predavac p = new Predavac();
		p.setSifra(1);
		p.setIme("Karlo");
		p.setPrezime("Cec");
		predavaci.add(p);
		
		
		
	}
	
	private void pokreniProgram() {
		switch (Pomocno.ucitajInt(
				"Odaberi program", 1, 5)) {
		case 1: 
			smjerovi();
			break;
		case 2: 
			grupe();
			break;
		case 3: 
			polaznici();
			break;
		case 4: 
			predavaci();
			break;
		case 5:
			System.out.println("Doviðenja");
		}
	}
	
	private void predavaci() {
		System.out.println("domaca zadaca");
		//za sada
		izbornik();
	}
	
	private void polaznici() {
		System.out.println("domaca zadaca");
		//za sada
		izbornik();
	}

	private void grupe() {
		System.out.println("Program grupe");
		//za sada
		izbornik();
	}

	private void smjerovi() {
		System.out.println("Doðe izbornik za smjerove");
		//za sada
		izbornik();
	}

	private void izbornik() {
		
		System.out.println("");
		System.out.println("Glavni izbornik");
		System.out.println("1. Smjerovi");
		System.out.println("2. Grupe");
		System.out.println("3. Polaznici");
		System.out.println("4. Predavaèi");
		System.out.println("5. Izlaz");
		System.out.println("");
		pokreniProgram(); 
		
	}

	public static void main(String[] args) {
		new Start();
	}
	
}