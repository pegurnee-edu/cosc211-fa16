package edu.emich.cosc211.examples.polymorphism.c;

public class MagicTome extends Weapon {

	public MagicTome() {
		super("Magic Tome");
		this.attackStrength = 11;
	}

	@Override
	public int getAttackStrength() {
		return (int) (this.attackStrength + ((Math.random() * 5) + 1));
	}

	@Override
	public String getAttackText() {
		return "casting magic missile";
	}

}
