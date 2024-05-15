package traitementFichier;

import java.util.ArrayList;

public class Product {
	private Category category;
	private Brand brand;
	private String name;
	private String nutritionalGrade;
//	private String nutritionalData;
	private ArrayList<Ingredient> ingredients;
	private ArrayList<Allergene> allergenes;
	private ArrayList<Additive> additives;
	
	
	


	public Product(Category category, Brand brand, String name, String nutritionalGrade,
			ArrayList<Ingredient> ingredients, ArrayList<Allergene> allergenes, ArrayList<Additive> additives) {
		this.category = category;
		this.brand = brand;
		this.name = name;
		this.nutritionalGrade = nutritionalGrade;
		this.ingredients = ingredients;
		this.allergenes = allergenes;
		this.additives = additives;
	}


	public Category getCategory() {
		return category;
	}


	public void setCategory(Category category) {
		this.category = category;
	}


	public Brand getBrand() {
		return brand;
	}


	public void setBrand(Brand brand) {
		this.brand = brand;
	}


	public String getNutritionalGrade() {
		return nutritionalGrade;
	}


	public void setNutritionalGrade(String nutritionalGrade) {
		this.nutritionalGrade = nutritionalGrade;
	}


//	public String getNutritionalData() {
//		return nutritionalData;
//	}
//
//
//	public void setNutritionalData(String nutritionalData) {
//		this.nutritionalData = nutritionalData;
//	}


	public ArrayList<Ingredient> getIngredients() {
		return ingredients;
	}


	public void setIngredients(ArrayList<Ingredient> ingredients) {
		this.ingredients = ingredients;
	}


	public ArrayList<Allergene> getAllergenes() {
		return allergenes;
	}


	public void setAllergenes(ArrayList<Allergene> allergenes) {
		this.allergenes = allergenes;
	}


	public ArrayList<Additive> getAdditives() {
		return additives;
	}


	public void setAdditives(ArrayList<Additive> additives) {
		this.additives = additives;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	@Override
	public String toString() {
		return "Product [category=" + category + ", brand=" + brand + ", name=" + name + ", nutritionalGrade="
				+ nutritionalGrade + ", ingredients=" + ingredients + ", allergenes=" + allergenes + ", additives="
				+ additives + "]";
	}


	
	
	
	
}
