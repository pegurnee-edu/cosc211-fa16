package edu.emich.cosc211.examples.polymorphism.c;

public class Hero {
	private Weapon weapon;
	private String name;
	private int strength;

	public Hero() {
		this("Gawain");
		this.strength = 8;
	}

	public Hero(String name) {
		this.name = name;
	}

	public String attack() {
		return this.name + " attacks by " + this.weapon.getAttackText();
	}

	public String chuckWeapon() {
		String toReturn;

		if (weapon instanceof Chuckable) {
			Chuckable chuckableWeapon = (Chuckable) weapon;
			toReturn = this.name + chuckableWeapon.chuck();

			this.setWeapon(null);
		} else {
			toReturn = this.name + " can't chuck their " + this.weapon.getName();
		}

		return toReturn;
	}

	public int getDamageDealt() {
		int attackStrength = this.weapon.getAttackStrength();

		if (weapon instanceof SlashingWeapon) {
			attackStrength += this.strength;
		} else if (weapon instanceof StabbingWeapon) {
			attackStrength += this.strength / 2;
		}
		return attackStrength;
	}

	public void setWeapon(Weapon weapon) {
		this.weapon = weapon;
	}

}
