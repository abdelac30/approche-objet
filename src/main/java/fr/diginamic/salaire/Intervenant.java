package fr.diginamic.salaire;

public abstract class Intervenant {
	
	String nom;
	String prenom;
	
	public Intervenant(String nom, String prenom) {
		this.nom = nom;
		this.prenom = prenom;
	}
	
	public abstract double getSalaire();
	public void afficherDonnees() {
		System.out.println("Nom: "+ nom+ "\nPrenom: "+prenom +"\nStatut: "+this.getClass().getSimpleName()+"\n Salaire: "+this.getSalaire());
	};

}
