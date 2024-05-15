package fr.diginamic.jdr;

public class Personnage {
	String nom;
	int force;
	int vie;
	int score;
	
	public Personnage() {
		this.force=(int)(12+ Math.random()*6);
		this.vie=(int)(20+ Math.random()*30);
		this.score=0;
	}

	@Override
	public String toString() {
		return "Personnage: "+ nom + "\nforce: " + force + "\nvie: " + vie + "\nscore=" + score ;
	}
	
	public int attaque() {
		return force+1+ (int)( Math.random()*9);
	};
	

}
