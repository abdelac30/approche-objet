package traitementFichier;

public class Additive {
	private String libelle;
	

	public Additive(String libelle) {
		this.libelle = libelle;
	}

	@Override
	public String toString() {
		return "[Additive =" + libelle+"]";
	}


	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	
}
