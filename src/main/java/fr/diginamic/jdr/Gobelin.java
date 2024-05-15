package fr.diginamic.jdr;

public class Gobelin extends Creature {
	
	public Gobelin() {
		this.force=(int)(5+ Math.random()*5);
		this.vie=(int)(10+ Math.random()*5);
		this.score=3;
	}
	

}
