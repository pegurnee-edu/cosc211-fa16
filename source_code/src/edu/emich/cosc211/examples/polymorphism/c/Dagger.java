package edu.emich.cosc211.examples.polymorphism.c;

public class Dagger extends StabbingWeapon implements Chuckable {

	public Dagger() {
		super("Dagger");
		this.attackStrength = 4;
	}

	@Override
	public String chuck() {
		return " chucks the Dagger directly at the enemy";
	}

}
