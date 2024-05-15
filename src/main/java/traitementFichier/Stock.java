package traitementFichier;

import java.util.ArrayList;

public class Stock {
	private ArrayList<Product> products;

	public Stock(ArrayList<Product> products) {
		this.products = products;
	}

	public ArrayList<Product> getProducts() {
		return products;
	}

	public void setProducts(ArrayList<Product> products) {
		this.products = products;
	}

	@Override
	public String toString() {
		return "Stock [products=" + products + "]";
	}

}
