package fr.diginamic.essais;

import fr.diginamic.formes.Cercle;
import fr.diginamic.formes.Rectangle;
import fr.diginamic.formes.Carré;

public class TestForme {

	public static void main(String[] args) {
		Cercle c= new Cercle(4);
		Rectangle r= new Rectangle(3, 5);
		Carré ca= new Carré(2);
		
		AffichageForme.afficher(c);
		AffichageForme.afficher(r);
		AffichageForme.afficher(ca);
		
		

	}

}
