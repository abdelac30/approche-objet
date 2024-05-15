package traitementFichier.service;

import traitementFichier.Product;
import traitementFichier.Stock;

public class SearchCategory {

	public static void Search(String category, Stock stock) {
		
		for(Product product: stock.getProducts()) {
			if (product.getCategory().getLibelle().equals(category) && product.getNutritionalGrade().equals("a")) {
				System.out.println(product);
			}
		}

	}

}
