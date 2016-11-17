package edu.emich.cosc211.examples.polymorphism.c;

public abstract class ShootingWeapon extends Weapon {

	public ShootingWeapon(String name) {
		super(name);
	}

	@Override
	public int getAttackStrength() {
		return this.attackStrength;
	}

	@Override
	public String getAttackText() {
		return "shooting the " + this.getName();
	}

}
