package entities2;
import entities.AdressePostale;

public class Personne {
	public AdressePostale adressePostale;
	public String nom;
	public String prénom;

	public Personne(String newNom, String newPrenom) {
		nom=newNom;
		prénom=newPrenom;

	}
	
	public Personne(String newNom, String newPrenom, AdressePostale newAdressePostale) {
        nom = newNom;
        prénom = newPrenom;
        adressePostale = newAdressePostale;
    }
	
	public void AfficherNomEtPrenom() {
       System.out.println(nom.toUpperCase()+" "+prénom);
    }

	public void setNom(String nom) {
		this.nom = nom;
	}

	public void setPrénom(String prénom) {
		this.prénom = prénom;
	}

	public AdressePostale getAdressePostale() {
		return adressePostale;
	}

	public void setAdressePostale(AdressePostale adressePostale) {
		this.adressePostale = adressePostale;
	}

	public String getNom() {
		return nom;
	}

	public String getPrénom() {
		return prénom;
	} 
	
}
