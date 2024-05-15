package fr.diginamic.banques.entities;

public class CompteTaux extends Compte {
	int tauxDeRemunération;

	public CompteTaux(int numeroCompte, double soldeCompte, int tauxDeRemunération) {
		super(numeroCompte, soldeCompte);
		this.tauxDeRemunération = tauxDeRemunération;
	}

	@Override
	public String toString() {
		return "CompteTaux [tauxDeRemunération=" + tauxDeRemunération + super.toString();
	}
	
	

}
