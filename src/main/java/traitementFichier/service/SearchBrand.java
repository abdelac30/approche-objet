package traitementFichier.service;

import traitementFichier.Product;
import traitementFichier.Stock;

public class SearchBrand {
	
public static void Search(String brand, Stock stock) {
		
		for(Product product: stock.getProducts()) {
			if (product.getBrand().getName().equals(brand) && product.getNutritionalGrade().equals("a")) {
				System.out.println(product);
			}
		}

	}


}
