package traitementFichier;

public class Category {
	private String libelle;

	public Category(String libelle) {
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
		return "[Category =" + libelle + "]";
	}
	
}
