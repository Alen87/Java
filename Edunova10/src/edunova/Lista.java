package edunova;

import java.util.ArrayList;
import java.util.List;

import edunova.model.Predavac;

public class Lista {
	
	public Lista() {
	
		// sintaksa do jave 1.5
				// ne�emo ju kristiti
				/*
				List lista = new ArrayList();
				lista.add("Osijek");
				lista.add(new Predavac());
				*/
				
				// s lijeve strane znaka jednakosti
				// su�elje a s desne implementacijska klasa
		
		List <Predavac>lista = new ArrayList<>();
		Predavac p=new Predavac();
		p.setIme("Pero");
		lista.add(p);
		
		System.out.println(lista.get(0).getIme());
		
		
		
		
		
	}
	
	public static void main(String[] args) {
		
		new Lista();
		
		
		
	}
	
}
