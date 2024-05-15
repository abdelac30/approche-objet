package fr.diginamic.essais;
import fr.diginamic.entities.Cercle;

public class TestCercle {

	public static void main(String[] args) {
	Cercle c1= new Cercle(2);
	Cercle c2= new Cercle(4);
	
	System.out.println(c1.getSurface());
	System.out.println(c1.getPerimetre());
	System.out.println(c2.getSurface());
	System.out.println(c2.getPerimetre());
	}

}
