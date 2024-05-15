package fr.diginamic.abstraite;

public class Crédit extends Opération {

	public Crédit(String dateOpération, int montantOpération) {
		super(dateOpération, montantOpération);
	}
	
	public String getType() {return "Crédit";};

}
