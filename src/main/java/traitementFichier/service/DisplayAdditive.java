package traitementFichier.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import traitementFichier.Additive;
import traitementFichier.Product;
import traitementFichier.Stock;

public class DisplayAdditive {

	public static void Display(Stock stock) {
		
		HashMap<Additive, Integer> additiveMap = new HashMap<Additive, Integer>();

		for (Product product : stock.getProducts()) {

			for (Additive additive : product.getAdditives()) {
				if (additiveMap.get(additive) != null) {
					additiveMap.put(additive, additiveMap.get(additive)+1);
				} else {
					additiveMap.put(additive, 1);
				}
			}
			List<Map.Entry<Additive, Integer>> entryList = new ArrayList<>(additiveMap.entrySet());
			Collections.sort(entryList, new ComparatorAdditiveNumber());
			
			for (Map.Entry<Additive, Integer> entry : entryList) {
	            System.out.println(entry.getKey().getLibelle() +": "+ entry.getValue());
	        }
		}
	}
}
