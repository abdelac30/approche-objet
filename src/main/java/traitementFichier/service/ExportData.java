package traitementFichier.service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import traitementFichier.Additive;
import traitementFichier.Allergene;
import traitementFichier.Brand;
import traitementFichier.Category;
import traitementFichier.Ingredient;
import traitementFichier.Product;
import traitementFichier.Stock;

public class ExportData {

	public static Stock getStockFromCSV() throws IOException {
		ArrayList<Product> products = new ArrayList<Product>();
		
		
		Path foodPath= Paths.get("C:/Data/Info/CDA/ToutLesCours/TPautoformationJ2/open-food-facts.csv");
		List<String> lines=Files.readAllLines(foodPath);
//		String[] test1 = lines.get(1).split("\\|");
//		String[] test3 = lines.get(3).split("\\|");
//		String[] test4 = lines.get(4).split("\\|");
//		String[] test5 = lines.get(5).split("\\|");
//		System.out.println("taille array:"+test1.length);
//		System.out.println("taille array:"+test3.length);
//		System.out.println("taille array:"+test4.length);
//		System.out.println("taille array:"+test5.length);
		

		for(int i =1; i<lines.size(); i++) {
			String[] tokens = lines.get(i).split("\\|");
			
			
			String[] ingredients = tokens[4].split(",");
			ArrayList<Ingredient> ingredientsList =new ArrayList<Ingredient>();
			for (int y=0; y<ingredients.length; y++) {
				ingredientsList.add(new Ingredient(ingredients[y]));
			}
			
			ArrayList<Allergene> allergenesList =new ArrayList<Allergene>();
			if(!(tokens[28].equals(""))) {
				String[] allergenes = tokens[28].split(",");
				for (int y=0; y<allergenes.length; y++) {
					allergenesList.add(new Allergene(allergenes[y]));
				}
			}
			
			ArrayList<Additive> additivesList =new ArrayList<Additive>();
			if(!(tokens[29].equals(""))) {
				String[] additives = tokens[29].split(",");
				for (int y=0; y<additives.length; y++) {
					additivesList.add(new Additive(additives[y]));
				}
			}
			
			
			products.add(new Product(new Category(tokens[0]),new Brand(tokens[1]),tokens[2],tokens[3], ingredientsList, allergenesList, additivesList));
			
		}
		Stock stock= new Stock(products);
		
//		System.out.println(stock);
		return stock;
	}

}
