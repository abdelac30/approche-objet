package fichier;



public class Ville implements Comparable<Ville> {
	String nom;
	String CodeDepartement;
	String nomRegion;
	String Population;
	
	
	public Ville(String nom, String codeDepartement, String nomRegion, String population) {
		this.nom = nom;
		CodeDepartement = codeDepartement;
		this.nomRegion = nomRegion;
		Population = population;
	}
	public int compareTo(Ville o) {
		if(Integer.parseInt(this.Population.replaceAll("[^\\d]", "")) >Integer.parseInt(o.Population.replaceAll("[^\\d]", ""))) {
			return -1;
		}
		else if(Integer.parseInt(this.Population.replaceAll("[^\\d]", "")) <Integer.parseInt(o.Population.replaceAll("[^\\d]", ""))) {
			return 1;
		}
		return 0 ;
	}
	
	
	

	
	

}
