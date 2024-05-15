package fr.diginamic.entities;

public class Theatre {
	private String name;
	private int maxCapacity;
	private int totalInscription=0;
	private double totalRecette=0;
	
	
	
	public Theatre(String name, int maxCapacity) {
		this.name = name;
		this.maxCapacity = maxCapacity;
	}



	public String inscrire (int nbr, double price) {
		if(nbr+totalInscription>maxCapacity) {
			return "Nombre de place insuffisante";
		}
		totalInscription+= nbr;
		totalRecette+= nbr*price;
		return "Inscription effectuée";
	}



	public String getName() {
		return name;
	}



	public int getMaxCapacity() {
		return maxCapacity;
	}



	public int getTotalInscription() {
		return totalInscription;
	}



	public double getTotalRecette() {
		return totalRecette;
	}

}
