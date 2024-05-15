package fr.diginamic.chaines;

import java.util.Arrays;

import fr.diginamic.entities.Salarie;

public class ManipulationChaine {

	public static void main(String[] args) {
		String chaine = "Durand;Marcel;2 523.5";
		
		char premierCaractere = chaine.charAt(0);
		String nom= chaine.substring(0, chaine.indexOf(';'));
		String[] tableau= chaine.split(";");
		System.out.println("Premier caractère: " + premierCaractere);
		System.out.println("Longueur: " +chaine.length());
		System.out.println("Longueur: " +chaine.indexOf(';'));
		System.out.println("Nom: " + nom);
		System.out.println("Nom: " + nom.toUpperCase());
		System.out.println("Nom: " + nom.toLowerCase());
		System.out.println(Arrays.toString(tableau));
		double salaire= Double.parseDouble(tableau[2].replace(" ", ""));
		
		Salarie s = new Salarie(tableau[0],tableau[1], salaire);

	}

}
