package fichier;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LectureFichier {

	public static void main(String[] args) throws IOException {
		ArrayList<Ville> villes = new ArrayList<Ville>();
		
		
		Path recensementPath= Paths.get("C:/Users/poupl/Downloads/recensement.csv");
		List<String> lines=Files.readAllLines(recensementPath);
		for(int i =1; i<lines.size(); i++) {
			String[] tokens = lines.get(i).split(";");
			villes.add(new Ville(tokens[6],tokens[2],tokens[1],tokens[9]));
			
		}
		Collections.sort(villes);
		List<String> newlines= new ArrayList<String>();
		String[] firstLine = lines.get(0).split(";");
		newlines.add(firstLine[6]+";"+firstLine[2]+";"+firstLine[1]+";"+firstLine[9]+";");
		for (int i=0; i<villes.size(); i++) {
			String populationString = villes.get(i).Population.replaceAll("[^\\d]", "");
			int population = Integer.parseInt(populationString);
			if(population > 25000) {
				newlines.add(villes.get(i).nom+";"+villes.get(i).CodeDepartement+";"+villes.get(i).nomRegion+";"+villes.get(i).Population+";");
			};
		}
		
		
		Path recensementNewPath= Paths.get("C:/Users/poupl/Downloads/recensementNew.csv");
		Files.write(recensementNewPath, newlines);

	}

}
