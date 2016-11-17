package edu.emich.cosc211.examples.polymorphism.b;

public class Produce extends Food {
	private double weight;

	private double pricePerWeight;
	public Produce(String name, double weight, double pricePerWeight) {
		super(name);
		this.weight = weight;
		this.pricePerWeight = pricePerWeight;
	}

	@Override
	public double getCost() {
		return weight * pricePerWeight;
	}

}
