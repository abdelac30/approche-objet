package traitementFichier;

public class Allergene {
	private String libelle;

	public Allergene(String libelle) {
		this.libelle = libelle;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	@Override
	public String toString() {
		return "[Allergene =" + libelle + "]";
	}
	

}
