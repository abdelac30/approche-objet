package fr.diginamic.salaire;

public class Pigiste extends Intervenant {
	int nbrJoursTravaille;
	double montantJournalier;

	public Pigiste(String nom, String prenom, int nbrJoursTravaille, double montantJournalier) {
		super(nom, prenom);
		this.nbrJoursTravaille = nbrJoursTravaille;
		this.montantJournalier = montantJournalier;
	}

	@Override
	public double getSalaire() {
		return nbrJoursTravaille*montantJournalier;
	}
	

}
