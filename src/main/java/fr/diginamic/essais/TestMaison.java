package fr.diginamic.essais;

import fr.diginamic.maison.Maison;
import fr.diginamic.maison.Salon;
import fr.diginamic.maison.Cuisine;
import fr.diginamic.maison.Chambre;
import fr.diginamic.maison.SalleDeBain;
import fr.diginamic.maison.Wc;

public class TestMaison {
	
	public static void main(String[] args) {
		Maison s= new Maison();
		Salon s1= new Salon(20, 0);
		Wc w1= new Wc(4, 0);
		Wc w2= new Wc(4, 1);
		Chambre c1= new Chambre(10, 1);
		Chambre c2= new Chambre(16, 0);
		Cuisine cu1= new Cuisine(20, 0);
		SalleDeBain sb1= new SalleDeBain(10, 1);
		SalleDeBain sb2= new SalleDeBain(15, 0);
		SalleDeBain sb3= new SalleDeBain(-5, 0);
		SalleDeBain sb4= new SalleDeBain(5, -1);
		s.ajouterPiece(s1);
		s.ajouterPiece(sb1);
		s.ajouterPiece(sb2);
		s.ajouterPiece(w1);
		s.ajouterPiece(w2);
		s.ajouterPiece(c1);
		s.ajouterPiece(c2);
		s.ajouterPiece(cu1);
		s.ajouterPiece(null);
		s.ajouterPiece(sb3);
		s.ajouterPiece(sb4);
		System.out.println(s.getSuperficie());
		System.out.println(s.getSuperficieByEtage(1));
		System.out.println(s.getSuperficieByEtage(1));
		System.out.println(c1.getClass().getSimpleName());
		System.out.println(s.nombrePiecesPourType("Chambre"));
		System.out.println(s.superficieTotalePourType("Chambre"));
	}

}
