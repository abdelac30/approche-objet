package traitementFichier.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import traitementFichier.Allergene;
import traitementFichier.Product;
import traitementFichier.Stock;

public class DisplayAllergene {
public static void Display(Stock stock) {
		
		HashMap<Allergene, Integer> allergeneMap = new HashMap<Allergene, Integer>();

		for (Product product : stock.getProducts()) {

			for (Allergene allergene : product.getAllergenes()) {
				if (allergeneMap.get(allergene) != null) {
					allergeneMap.put(allergene, allergeneMap.get(allergene)+1);
				} else {
					allergeneMap.put(allergene, 1);
				}
			}
			List<Map.Entry<Allergene, Integer>> entryList = new ArrayList<>(allergeneMap.entrySet());
			Collections.sort(entryList, new ComparatorAllergeneNumber());
			
			for (Map.Entry<Allergene, Integer> entry : entryList) {
	            System.out.println(entry.getKey().getLibelle() +": "+ entry.getValue());
	        }
		}
	}

}
