package edu.emich.cosc211.lab3.animals;

import edu.emich.cosc211.lab3.food.Food;

public class Herbivore extends Animal {

	@Override
	public String eat(Food food) {
		return this.getName() + " eats the soul of the " + food.getName();
	}

	@Override
	public String getPreferredFood() {
		return "vegetables";
	}

	@Override
	public String play() {
		return this.getName() + " the " + this.getType() + " loves to play in the grass.";
	}

}
