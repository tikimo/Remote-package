package booliLaskuri;

class Ingredient {
	private String name;
	private double precentage;
	private double size_ltr;

	public Ingredient(String name, int precentage, double size_ltr){
		this.name = name;
		this.precentage = Double.parseDouble(precentage+"")/100;
		this.size_ltr = size_ltr;
	}
	
	public Ingredient(String name, int precentage){
		this.name = name;
		this.precentage = Double.parseDouble(precentage+"")/100;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrecentage() {
		return precentage;
	}

	public void setPrecentage(double precentage) {
		this.precentage = precentage;
	}
	
	public double getNoAlc() {
		return (size_ltr * 1-precentage);
	}

}
