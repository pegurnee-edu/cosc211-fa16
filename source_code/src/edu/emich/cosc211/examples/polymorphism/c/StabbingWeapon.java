package edu.emich.cosc211.examples.polymorphism.c;

public abstract class StabbingWeapon extends Weapon {

	public StabbingWeapon(String name) {
		super(name);
	}

	@Override
	public int getAttackStrength() {
		return this.attackStrength;
	}

	@Override
	public String getAttackText() {
		return "stabbing the " + this.getName();
	}

}
