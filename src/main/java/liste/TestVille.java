package liste;

import java.util.ArrayList;
import java.util.Iterator;

public class TestVille {

	public static void main(String[] args) {
		ArrayList<Ville> villes= new ArrayList<Ville>();
		villes.add(new Ville("Nice",343000));
		villes.add(new Ville("Carcassonne",47800));
		villes.add(new Ville("Narbonne",53000));
		villes.add(new Ville("Lyon",484000));
		villes.add(new Ville("Foix",9700));
		villes.add(new Ville("Pau",72200));
		villes.add(new Ville("Marseille",850700));
		villes.add(new Ville("Tarbes",40600));
		
		Ville villePlusPeuplée  = villes.get(0);
		Ville villeMoinsPeuplée  = villes.get(0);
        for (int i = 0; i < villes.size(); i++) {
            Ville ville = villes.get(i);
            if (villePlusPeuplée.nbHabitant < ville.nbHabitant) {
            	villePlusPeuplée = ville;
            }
            if (villeMoinsPeuplée.nbHabitant > ville.nbHabitant) {
            	villeMoinsPeuplée = ville;
            }
            if(ville.nbHabitant>100000) {
                ville.nom=ville.nom.toUpperCase();
                villes.set(i, ville);
            }
        }
        villes.remove(villeMoinsPeuplée);
	System.out.println(villePlusPeuplée);
	System.out.println(villes);
	
	}
	//lien correction: https://github.com/DiginamicFormation/approche-objet-2024-M02

}
