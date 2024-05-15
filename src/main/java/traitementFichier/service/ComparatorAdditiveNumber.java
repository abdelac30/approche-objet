package traitementFichier.service;

import java.util.Comparator;
import java.util.Map;

import traitementFichier.Additive;


public class ComparatorAdditiveNumber implements Comparator<Map.Entry<Additive, Integer>>{

	@Override
	 public int compare(Map.Entry<Additive, Integer> o1, Map.Entry<Additive, Integer> o2) {
        // Sort in descending order of occurrences
        return o2.getValue().compareTo(o1.getValue());
    }


	

}