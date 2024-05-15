package fichier;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CreerFichier {

	public static void main(String[] args) throws IOException {
		Path recensementPath= Paths.get("C:/Users/poupl/Downloads/recensement.csv");
		List<String> lines=Files.readAllLines(recensementPath);
		List<String> linesNewF= new ArrayList();
		
		for(int i=0; i<100; i++) {
			linesNewF.add(lines.get(i));
		}
		
		Path recensementCopyPath= Paths.get("C:/Users/poupl/Downloads/recensementCopy.csv");
		Files.write(recensementCopyPath, linesNewF);

	}

}
