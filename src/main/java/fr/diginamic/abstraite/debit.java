package fr.diginamic.abstraite;

public class debit extends Opération {

	public debit(String dateOpération, int montantOpération) {
		super(dateOpération, montantOpération);
		// TODO Auto-generated constructor stub
	}
	
	public String getType() {return "Débit";};

}
