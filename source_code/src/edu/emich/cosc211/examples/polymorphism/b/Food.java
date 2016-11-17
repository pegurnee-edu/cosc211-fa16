package edu.emich.cosc211.examples.polymorphism.b;

public abstract class Food {
	private String name;
	
	public Food(String name) {
		this.name = name;
	}
	
	public abstract double getCost();
	
	public String getName() {
		return this.name;
	}
}
