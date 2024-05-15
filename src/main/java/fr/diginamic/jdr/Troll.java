package fr.diginamic.jdr;

public class Troll extends Creature {

	public Troll() {
		this.force=(int)(10+ Math.random()*5);
		this.vie=(int)(20+ Math.random()*10);
		this.score=5;
	}

}
