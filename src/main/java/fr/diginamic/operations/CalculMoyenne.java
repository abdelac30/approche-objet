package fr.diginamic.operations;
import java.util.Arrays;

public class CalculMoyenne {
	double[] tableau= new double[0];
	
	public void ajout(double a) {
		tableau=Arrays.copyOf(tableau, tableau.length + 1);
		tableau[tableau.length - 1] = a;
	}
	public double calcul() {
		double result=0;
		for (int i = 0; i < tableau.length; i++) {
			result += tableau[i];
		}
		return result/tableau.length;
	}

}
