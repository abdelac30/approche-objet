package set;

import java.util.HashSet;
import java.util.Iterator;

public class TestSetString {

	public static void main(String[] args) {
		HashSet<String> list = new HashSet<String>();
		list.add("USA");
		list.add("France");
		list.add("Allemagne");
		list.add("UK");
		list.add("Italie");
		list.add("Japon");
		list.add("Chine");
		list.add("Russie");
		list.add("Inde");
		
		Iterator<String> iterator= list.iterator();
		String PaysLong="";
		while (iterator.hasNext()) {
			String pays = iterator.next();
			if(pays.length()> PaysLong.length()) {
				PaysLong= pays;
			}
			
		}
		list.remove(PaysLong);
		System.out.println(list);
	}

}
