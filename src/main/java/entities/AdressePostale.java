package entities;

public class AdressePostale {
	int numéroDeRue;
	String libélléDeRue;
	int codePostal;
	String ville;

	public AdressePostale (int newNumRue, String newLibellé, String newVille, int newCP) {
		numéroDeRue=newNumRue;
		libélléDeRue=newLibellé;
		codePostal=newCP;
		ville=newVille;
		


	}

}
