package set;

import java.util.HashSet;
import java.util.Iterator;

public class TestSetPays {

	public static void main(String[] args) {
HashSet<Pays> paysSet = new HashSet<Pays>();
        
        paysSet.add(new Pays("USA", 331_002_651, 65_298));
        paysSet.add(new Pays("France", 65_273_511, 42_878));
        paysSet.add(new Pays("Allemagne", 83_783_942, 53_946));
        paysSet.add(new Pays("UK", 67_886_011, 42_558));
        paysSet.add(new Pays("Italie", 60_461_826, 34_260));
        paysSet.add(new Pays("Japon", 126_476_461, 40_247));
        paysSet.add(new Pays("Chine", 1_439_323_776, 10_262));
        paysSet.add(new Pays("Russie", 145_934_462, 11_552));
        paysSet.add(new Pays("Inde", 1_380_004_385, 2_104));
        
        Iterator<Pays> iterator= paysSet.iterator();
        Pays PaysPIB = new Pays("test", 0, 0);
        Pays PaysPIBParH = new Pays("test", 0, 0);
        Pays PaysPIBmin = new Pays("test",Integer.MAX_VALUE,Double.MAX_VALUE );
        
		while (iterator.hasNext()) {
			Pays pays = iterator.next();
			if(pays.pibParHabitant> PaysPIBParH.pibParHabitant) {
				PaysPIBParH= pays;
			}
			if(pays.pibParHabitant*pays.nbHabitant> PaysPIB.pibParHabitant*PaysPIB.nbHabitant) {
				PaysPIB= pays;
			}
			if(pays.pibParHabitant*pays.nbHabitant< PaysPIBmin.pibParHabitant*PaysPIBmin.nbHabitant) {
				PaysPIBmin= pays;
			}
			
		}
		
		 for (Pays pays : paysSet) {
	            if (pays==PaysPIBmin) {
	                pays.nom=pays.nom.toUpperCase();
	            }
	        }
		 System.out.println(PaysPIBmin);
		System.out.println(PaysPIBParH);
		System.out.println(PaysPIB);
		paysSet.remove(PaysPIBmin);
		System.out.println(paysSet);
		
		
		
		

	}

}
