package traitementFichier.service;

import traitementFichier.Product;
import traitementFichier.Stock;

public class SearchBrandAndCategory {
	
public static void Search(String brand, String category, Stock stock) {
		
		for(Product product: stock.getProducts()) {
			if (product.getBrand().getName().equals(brand) && product.getCategory().getLibelle().equals(category) && product.getNutritionalGrade().equals("a")) {
				System.out.println(product);
			}
		}

	}



}
