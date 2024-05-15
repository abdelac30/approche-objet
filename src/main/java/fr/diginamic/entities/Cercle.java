package fr.diginamic.entities;

public class Cercle {
	public double rayon;

	public Cercle(double rayon) {
		this.rayon = rayon;
	}
	public double getPerimetre () {
		return 2 * Math.PI * rayon;
	}
	
	public double getSurface () {
		return Math.PI * rayon * rayon;
	}
}
