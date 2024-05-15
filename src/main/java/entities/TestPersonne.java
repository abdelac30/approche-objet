package entities;
import entities2.Personne;

public class TestPersonne {

	public static void main(String[] args) {
		AdressePostale a1 = new AdressePostale(12, "avenue pasteur", "Angers", 49000);
		Personne p1 = new Personne("Dupont", "Pierre", a1);
		
		
		AdressePostale a2 = new AdressePostale(23, "rue henri picherit", "Nantes", 44000);
		p1.setAdressePostale(a2);
		Personne p2 = new Personne("Dupond", "Jacque", a2);

		

	}

}
