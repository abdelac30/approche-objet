package fr.diginamic.jdr;

public class Loup extends Creature {
	public Loup() {
		this.force=(int)(3+ Math.random()*5);
		this.vie=(int)(5+ Math.random()*5);
		this.score=1;
	}

}
