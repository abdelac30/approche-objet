package fr.diginamic.abstraite;

public class TestOpération {

	public static void main(String[] args) {
		Opération[] tableauOpération= {new Crédit("11/03/2022", 11), new Crédit("30/05/2022", 11), new Crédit("26/08/2022", 2220), new debit("11/06/2023", 114)};
		int montant=0;
		for (int i = 0; i < tableauOpération.length; i++) {
			System.out.println("date: "+tableauOpération[i].dateOpération +", montant: "+ tableauOpération[i].montantOpération +", type d'opération: " + tableauOpération[i].getType());
		if(tableauOpération[i].getType() =="Crédit") {
			montant += tableauOpération[i].montantOpération;
		}
		else {montant -= tableauOpération[i].montantOpération;}
		}
		System.out.println("montant total: "+montant);
	}

}
