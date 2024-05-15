package liste;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestListString {

	public static void main(String[] args) {
		List<String> liste1 = new ArrayList<String>();
		liste1.add("Nice");
		liste1.add("Carcassonne");
		liste1.add("Narbonne");
		liste1.add("Lyon");
		liste1.add("Foix");
		liste1.add("Pau");
		liste1.add("Marseille");
		liste1.add("Tarbes");

		 String nomLong = liste1.get(0);
	        for (int i = 0; i < liste1.size(); i++) {
	            String nom = liste1.get(i);
	            if (nomLong.length() < nom.length()) {
	                nomLong = nom;
	            }
	            liste1.set(i, liste1.get(i).toUpperCase());
	        }
		System.out.println(nomLong);
		
		
		Iterator<String> iterator= liste1.iterator();
		while (iterator.hasNext()) {
			String ville = iterator.next();
			if(ville.charAt(0) == 'N') {
				iterator.remove();
			}
			
		}
		System.out.println(liste1);
		
	}
}
