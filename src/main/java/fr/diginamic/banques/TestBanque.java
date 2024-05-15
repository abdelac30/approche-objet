package fr.diginamic.banques;
import fr.diginamic.banques.entities.Compte;
import fr.diginamic.banques.entities.CompteTaux;

public class TestBanque {

	public static void main(String[] args) {
		Compte compteTest[]= {new Compte(4262571, 11.00), new CompteTaux(4262571, 11.00, 2)};
		
		for (int i=0; i<compteTest.length; i++)
		{System.out.println(compteTest[i]);}
		

	}

}
