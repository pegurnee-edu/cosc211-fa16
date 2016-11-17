package edu.emich.cosc211.lab3.food;

/**
 * Meat is a type of food for carnivores.
 * 
 * @author eddie gurnee
 *
 */
public class Meat extends Food {

	public Meat(String name) {
		super(name);
	}

	@Override
	public String getName() {
		return "Meat: " + this.name;
	}

}
