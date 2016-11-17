package edu.emich.cosc211.lab3.food;

/**
 * Factory to create food.
 * 
 * @author eddie gurnee
 *
 */
public class FoodFactory {
	/**
	 * Gets a food object from a string preference
	 * 
	 * @param foodName
	 *            name of food type to get
	 * @return food object of requested type
	 */
	public static Food getFoodFromPreference(String foodName) {
		Food toReturn;

		if ("vegetable".equals(foodName)) {
			toReturn = new Vegetable("karat");
		} else {
			toReturn = new Meat("bacon");
		}

		return toReturn;
	}
}
