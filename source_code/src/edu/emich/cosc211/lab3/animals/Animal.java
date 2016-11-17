package edu.emich.cosc211.lab3.animals;

import edu.emich.cosc211.lab3.food.Food;

/**
 * Animal abstract class that all animals inherit from.
 * 
 * @author eddie gurnee
 * @version 10/04/2016
 */
public abstract class Animal {
	private String type;
	private String name;

	/**
	 * Zero argument constructor
	 */
	public Animal() {
		this.type = "not an animal";
		this.name = "nameless";
	}

	/**
	 * Constructor taking the animal type and name
	 * 
	 * @param type
	 *            the type of animal
	 * @param name
	 *            the name of the animal
	 */
	public Animal(String type, String name) {
		this.type = type;
		this.name = name;
	}

	/**
	 * Animal eats some sort of food.
	 * 
	 * @param food
	 *            a food object to eat
	 * @return the information about the food consumed
	 */
	public abstract String eat(Food food);

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Finds out what type of food the animal prefers to eat.
	 * 
	 * @return the name of the food the animal prefers
	 */
	public abstract String getPreferredFood();

	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * Animal plays like a delighted animal
	 * 
	 * @return the information about the playtime
	 */
	public abstract String play();

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
}
