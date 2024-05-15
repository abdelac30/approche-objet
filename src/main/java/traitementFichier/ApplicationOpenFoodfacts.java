package traitementFichier;

import java.io.IOException;

import traitementFichier.service.ExportData;
import traitementFichier.service.MenuApplication;

public class ApplicationOpenFoodfacts {

	public static void main(String[] args) throws IOException {
		Stock stock= ExportData.getStockFromCSV();
		MenuApplication.menu(stock);
	}

}
