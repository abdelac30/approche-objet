package maps;
import java.util.HashMap;

import liste.Ville;
public class MapVilles {

	public static void main(String[] args) {
		HashMap<String, Ville> mapVilles= new HashMap<>();
		mapVilles.put("Nice",new Ville("Nice",343000));
		mapVilles.put("Carcassonne",new Ville("Carcassonne",47800));
		mapVilles.put("Narbonne",new Ville("Narbonne",53000));
		mapVilles.put("Lyon",new Ville("Lyon",484000));
		mapVilles.put("Foix",new Ville("Foix",9700));
		mapVilles.put("Pau",new Ville("Pau",72200));
		mapVilles.put("Marseille",new Ville("Marseille",850700));
		mapVilles.put("Tarbes",new Ville("Tarbes",40600));
		
		String cleVilleMin="Nice";
		for (String cle: mapVilles.keySet()) {
			if(mapVilles.get(cle).nbHabitant<mapVilles.get(cleVilleMin).nbHabitant) {
				cleVilleMin=cle;
			}
		}
		mapVilles.remove(cleVilleMin);
		System.out.println(mapVilles);
	}

}
