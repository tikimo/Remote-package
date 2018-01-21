package booliLaskuri;

import java.util.ArrayList;

public class laskuri {

	public static void main(String[] args) {

		double strength = 0.15;
		double size = 8;
		double bottle_min = 0.5;
		ArrayList<Ingredient> ingredients = new ArrayList<Ingredient>();
		
		Ingredient vodka = new Ingredient("Vodka", 35, 0.5); ingredients.add(vodka);
		Ingredient liqour = new Ingredient("Bols Blue Curacao", 21, 0.5); ingredients.add(liqour);
		Ingredient wine = new Ingredient("Champaigne", 12, 0.75); ingredients.add(wine);
		Ingredient blender = new Ingredient("Sprite", 0); ingredients.add(blender);
		
		double no_alc_size = vodka.getNoAlc();
		System.out.println(no_alc_size);
	}

}

