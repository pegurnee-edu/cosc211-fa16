package edu.emich.cosc211.lab3;

import edu.emich.cosc211.lab3.animals.Animal;
import edu.emich.cosc211.lab3.food.Food;
import edu.emich.cosc211.lab3.food.FoodFactory;

/**
 * Zoo class contains a collection of animals.
 * 
 * @author eddie gurnee
 * @version 10/04/2016
 */
public class Zoo {
	private static final int ZOO_LIMIT = 10;

	private Animal[] animals;
	private int pointer;

	/**
	 * No argument constuctor gets the zoo initialized.
	 */
	public Zoo() {
		this.animals = new Animal[ZOO_LIMIT];
	}

	/**
	 * Retrieves an animal at a specific location.
	 * 
	 * @param index
	 *            the index of which animal to retrieve
	 * @return the animal at the given index
	 */
	public Animal getAnimal(int index) {
		return this.animals[index];
	}

	/**
	 * Removes an animal from the zoo. Animal is given at a specific location.
	 * 
	 * @param index
	 *            the index of which animal to remove
	 * @return the animal removed from the zoo
	 */
	public Animal removeAnimal(int index) {
		Animal toReturn = this.animals[index];
		for (int i = index; i < animals.length - 1; i++) {
			this.animals[i] = this.animals[i + 1];
		}
		return toReturn;
	}

	/**
	 * Adds an animal to the zoo.
	 * 
	 * @param animal
	 *            the animal to be added to the zoo
	 */
	public void addAnimal(Animal animal) {
		this.animals[this.pointer++] = animal;
	}

	/**
	 * Checks if the zoo is full.
	 * 
	 * @return true if the zoo is full
	 */
	public boolean isZooFull() {
		return this.pointer == this.animals.length;
	}

	/**
	 * Gets the number of animals currently housed.
	 * 
	 * @return the number of animals in the zoo
	 */
	public int size() {
		return this.pointer;
	}

	/*
	 * TODO: feed all animals the food that they want
	 */
	public String feedAllAnimals() {
		// TODO Auto-generated method stub
		String toReturn = "";
		for (int i = 0; i < this.pointer; i++) {
			String preferredFood = this.animals[i].getPreferredFood();
			
			Food thePreferredFood = FoodFactory.getFoodFromPreference(preferredFood);
			
			toReturn += this.animals[i].eat(thePreferredFood);
		}
		return toReturn;
	}

	/**
	 * Watches the aminals as they play
	 * 
	 * @return information of all of the animals playtime
	 */
	public String watchAnimalsPlay() {
		String toReturn = "";
		for (int i = 0; i < this.pointer; i++) {
			toReturn += this.animals[i].play() + "\n";
		}
		return toReturn;
	}

}
