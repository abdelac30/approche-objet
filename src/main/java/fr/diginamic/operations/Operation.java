package fr.diginamic.operations;

public class Operation {
	
	public static int calcul (int a, int b, char c) {
		int resultat = 0;
	    switch (c) {
	        case '+':
	            resultat = a + b;
	            break;
	        case '-':
	            resultat = a - b;
	            break;
	        case '*':
	            resultat = a * b;
	            break;
	        case '/':
	                resultat = a / b;
	            break;
	        default:
	            System.out.println("Opération non valide !");
	    }
	    return resultat;
	}

}
