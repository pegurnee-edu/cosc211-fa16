package edu.emich.cosc211.lab3.food;

/**
 * Vegetable class that is eaten by herbivores.
 * 
 * @author eddie gurnee
 *
 */
public class Vegetable extends Food {

	public Vegetable(String name) {
		super(name);
	}

	@Override
	public String getName() {
		return "Veggie: " + this.name;
	}

}
