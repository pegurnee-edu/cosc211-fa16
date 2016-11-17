package edu.emich.cosc211.lab3.food;

/**
 * Abstract food class.
 * 
 * @author eddie gurnee
 *
 */
public abstract class Food {
	protected String name;

	public Food(String name) {
		this.name = name;
	}

	public abstract String getName();
}
