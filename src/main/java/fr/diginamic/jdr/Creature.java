package fr.diginamic.jdr;

public abstract class Creature {
	int force;
	int vie;
	int score;
	
	public int attaque() {
		return force+1+ (int)( Math.random()*10);
	};

}
