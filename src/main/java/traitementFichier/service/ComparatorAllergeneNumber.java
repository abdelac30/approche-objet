package traitementFichier.service;

import java.util.Comparator;
import java.util.Map;

import traitementFichier.Allergene;

public class ComparatorAllergeneNumber implements Comparator<Map.Entry<Allergene, Integer>>{

		@Override
		 public int compare(Map.Entry<Allergene, Integer> o1, Map.Entry<Allergene, Integer> o2) {
	        // Sort in descending order of occurrences
	        return o2.getValue().compareTo(o1.getValue());
	    }

}
