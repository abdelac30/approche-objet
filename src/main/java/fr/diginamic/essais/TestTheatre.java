package fr.diginamic.essais;

import fr.diginamic.entities.Theatre;

public class TestTheatre {

	public static void main(String[] args) {
		Theatre t= new Theatre("theatre de la place", 1000);
		System.out.println(t.inscrire(15, 20));
		System.out.println(t.inscrire(150, 40));
		System.out.println(t.inscrire(400, 10));
		System.out.println(t.inscrire(4000, 10));
		System.out.println(t.getTotalInscription());
		System.out.println(t.getTotalRecette());

	}

}
