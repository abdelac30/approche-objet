package fr.diginamic.essais;

import fr.diginamic.operations.CalculMoyenne;


public class TestMoyenne {

	public static void main(String[] args) {
		 CalculMoyenne c1= new CalculMoyenne();
		 CalculMoyenne c2= new CalculMoyenne();
		 c1.ajout(679);
		 c1.ajout(35557);
		 c1.ajout(12.5);
		 c1.ajout(18);
		 System.out.println(c1.calcul());
		 c2.ajout(9);
		 c2.ajout(20);
		 c2.ajout(12.5);
		 c2.ajout(18);
		 System.out.println(c2.calcul());
		 
	}
	

}
