package tri;

public class Ville implements Comparable<Ville> {
	public String nom;
	public int nbHabitant;
	public Ville(String nom, int nbHabitant) {
		this.nom = nom;
		this.nbHabitant = nbHabitant;
	}
	@Override
	public String toString() {
		return "Ville [nom=" + nom + ", nbHabitant=" + nbHabitant + "]";
	}


//	@Override
//	public int compareTo(Ville o) {
//		return (this.nom.compareTo(o.nom)) ;
//	}
	// Tri par nom
	
	@Override
	public int compareTo(Ville o) {
		if(this.nbHabitant>o.nbHabitant) {
			return 1;
		}
		else if(this.nbHabitant<o.nbHabitant) {
			return -1;
		}
		return 0 ;
	}

}
