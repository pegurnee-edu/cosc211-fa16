package edu.emich.cosc211.examples.polymorphism.c;

public abstract class SlashingWeapon extends Weapon {

	public SlashingWeapon(String name) {
		super(name);
	}

	@Override
	public int getAttackStrength() {
		return this.attackStrength;
	}
	
	@Override
	public String getAttackText() {
		return "swinging the " + this.getName();
	}
}
