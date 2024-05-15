package fr.diginamic.essais;

import fr.diginamic.salaire.Pigiste;
import fr.diginamic.salaire.Salarie;

public class TestIntervenant {
	
	public static void main(String[] args) {
		Salarie s= new Salarie("John", "Doe", 2500);
		Pigiste p= new Pigiste("Jane", "Doe", 12, 150);
		
		System.out.println(s.getSalaire());
		System.out.println(p.getSalaire());
		s.afficherDonnees();
		p.afficherDonnees();
	}

}
