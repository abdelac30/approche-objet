package fr.diginamic.abstraite;

public abstract class Opération {
	
	public String dateOpération;
	public int montantOpération;
	
	public Opération(String dateOpération, int montantOpération) {
		this.dateOpération = dateOpération;
		this.montantOpération = montantOpération;
	}
	public abstract String getType();

}
