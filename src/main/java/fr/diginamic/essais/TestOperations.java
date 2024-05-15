package fr.diginamic.essais;
import fr.diginamic.operations.Operation;

public class TestOperations {

	public static void main(String[] args) {
		System.out.println(Operation.calcul(1, 2, '+'));
		System.out.println(Operation.calcul(1, 4, '-'));
		System.out.println(Operation.calcul(12, 6, '/'));
		System.out.println(Operation.calcul(4, 8, '*'));

	}

}
