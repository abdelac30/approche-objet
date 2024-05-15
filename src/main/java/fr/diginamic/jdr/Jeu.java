package fr.diginamic.jdr;

import java.util.Scanner;

public class Jeu {
	
	public static void main(String[] args) {
		int choice=0;
		String nomPersonnage="John";
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ceci est un jeux de role, vous allez avoir un personnage avec des statistiques aléatoires et \n"
				+ "vous pouvez gagner des points de score en combattant et tuant des créatures.");
		System.out.println("Comment se nomme votre personnage?");
		Personnage joueur= new Personnage();
		joueur.nom = scanner.nextLine();
		System.out.println(joueur.toString());
		
		while (choice !=4) {
			System.out.println("1. Créer un nouveau personnage (votre score repart de zéro)\n"
					+ "2. Combattre un monstre\n"
					+ "3. Afficher le score\n"
					+ "4. Quitter le jeu\n"
					+ "Que choissisez vous?");
			choice = scanner.nextInt();
			scanner.nextLine();
			if(choice==1) {System.out.println("Comment se nomme votre personnage?");
			joueur= new Personnage();
			joueur.nom = scanner.nextLine();
			System.out.println(joueur.toString());}
			
			if(choice ==2 && joueur.vie>0) {
				int choixCreature= (int) (Math.random() * 100);
				Creature monstre;
				if(choixCreature<33) {
					monstre= new Gobelin();
					System.out.println("Vous rencontrez un gobelin");
				}
				else if(choixCreature>66) {
					monstre= new Loup();
					System.out.println("Vous rencontrez un loup");
				}
				else {monstre= new Troll();
				System.out.println("Vous rencontrez un troll");}
				
				while(monstre.vie>0 && joueur.vie>0 ) {
					int degat=monstre.attaque()-joueur.attaque();
					if(degat>0) {
						joueur.vie-= degat;
						System.out.println("Vous avez perdu: "+degat+"point de vie ,il vous reste"+joueur.vie+"point de vie");
					}else if(degat<0) {
						monstre.vie+=degat;
						System.out.println("Le monstre a perdu: "+(-degat)+"point de vie ,il lui reste"+monstre.vie+"point de vie");
					}
					else {System.out.println("Egalité, personne ne perd de vie");}
				}
				if (monstre.vie<0) {
					System.out.println("Vous avez vaincu, vous gagnez "+monstre.score+"point(s) de score");
					joueur.score+=monstre.score;
				} else {System.out.println("Vous êtes mort, score final: "+joueur.score);
				System.out.println("Vous devez refaire un personnage pour continuer");}
				
				
			}
			
			if(choice ==3) {
				System.out.println("Votre score est de "+joueur.score+"point(s)");
			}
		}
		System.out.println("Fin du jeu, merci d'avoir joué");

	}

}
