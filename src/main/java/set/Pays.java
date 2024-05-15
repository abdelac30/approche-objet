package set;

public class Pays {
	String nom;
	int nbHabitant;
	double pibParHabitant;
	
	public Pays(String nom, int nbHabitant, double pibParHabitant) {
		this.nom = nom;
		this.nbHabitant = nbHabitant;
		this.pibParHabitant = pibParHabitant;
	}

	@Override
	public String toString() {
		return "Pays [nom=" + nom + ", nbHabitant=" + nbHabitant + ", pibParHabitant=" + pibParHabitant + "]";
	}

	
	
}
