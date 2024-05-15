package traitementFichier.service;

import java.util.Scanner;

import traitementFichier.Stock;


public class MenuApplication {
	
	public static void menu(Stock stock){
		
		Scanner scanner = new Scanner(System.in);
		int choice = 0;
		while(choice!=6)
		{
		System.out.println("1.Rechercher les meilleurs produits pour une Marque donnée\n"
				+ "2.Rechercher les meilleurs produits pour une Catégorie donnée\n"
				+ "3.Rechercher les meilleurs produits par Marque et par Catégorie\n"
				+ "4.Afficher les allergènes les plus courants avec le nb de produits dans lesquels ils apparaissent.\n"
				+ "5.Afficher les additifs les plus courants avec le nb de produits dans lesquels ils apparaissent.\n"
				+ "6.Exit");
		choice = scanner.nextInt();
		String category="";
		String brand="";
		
		switch (choice) {
        case 1:
            System.out.println("Vous avez choisi de rechercher les meilleurs produits pour une marque donnée.");
            System.out.println("Quelle marque voulez vous recherchez?");
            brand=scanner.nextLine();
            SearchBrand.Search(brand, stock);
            
            break;
        case 2:
            System.out.println("Vous avez choisi de rechercher les meilleurs produits pour une catégorie donnée.");
            System.out.println("Quelle catégorie voulez vous recherchez?");
            category=scanner.nextLine();
            SearchCategory.Search(category, stock);
            break;
        case 3:
            System.out.println("Vous avez choisi de rechercher les meilleurs produits par marque et par catégorie.");
            System.out.println("Quelle catégorie voulez vous recherchez?");
            category=scanner.nextLine();
            System.out.println("Quelle marque voulez vous recherchez?");
            brand=scanner.nextLine();
            SearchBrandAndCategory.Search(brand, category, stock);
            break;
        case 4:
            System.out.println("Vous avez choisi d'afficher les allergènes les plus courants avec le nombre de produits dans lesquels ils apparaissent.");
            DisplayAllergene.Display(stock);
            break;
        case 5:
            System.out.println("Vous avez choisi d'afficher les additifs les plus courants avec le nombre de produits dans lesquels ils apparaissent.");
            DisplayAdditive.Display(stock);
            break;
        case 6:
            System.out.println("Au revoir !");
            break;
        default:
            System.out.println("Choix invalide. Veuillez choisir un numéro entre 1 et 6.");}
    }
		
	}

}
