package maps;

import java.util.ArrayList;
import java.util.HashMap;

public class ComptagePaysParContinent {

	public static void main(String[] args) {
		ArrayList<Pays> pays= new ArrayList<Pays>();
		
		pays.add(new Pays("France", 65000000 , "Europe"));
	
		pays.add(new Pays("Allemagne", 80000000, "Europe"));
		
		pays.add(new Pays("Belgique", 10000000, "Europe"));
		
		pays.add(new Pays("Russie", 150000000, "Asie"));
		
		pays.add(new Pays("Chine", 1400000000, "Asie"));
		
		pays.add(new Pays("Indonésie", 220000000, "Océanie"));
		
		pays.add(new Pays("Australie", 20000000, "Océanie"));
		
		HashMap<String,Integer> paysMap= new HashMap<String,Integer>();
		
		for (Pays pay: pays) {
			if(paysMap.get(pay.continent) != null){
				paysMap.put(pay.continent,paysMap.get(pay.continent)+1);
			}
			else {paysMap.put(pay.continent,1);}
		}
		System.out.println(paysMap);

	}

}
