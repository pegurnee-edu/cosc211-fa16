package edu.emich.cosc211.examples.polymorphism.b;

public class PackagedFood extends Food {
	private int quantity;

	private double pricePerItem;
	public PackagedFood(String name, int quantity, double pricePerItem) {
		super(name);
		this.quantity = quantity;
		this.pricePerItem = pricePerItem;
	}

	@Override
	public double getCost() {
		return this.pricePerItem * (double) this.quantity;
	}

}
