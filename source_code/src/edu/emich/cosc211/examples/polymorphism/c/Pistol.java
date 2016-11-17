package edu.emich.cosc211.examples.polymorphism.c;

public class Pistol extends ShootingWeapon implements Chuckable {

	public Pistol() {
		super("Pistol");
		this.attackStrength = 9;
	}

	@Override
	public String chuck() {
		return " chucks the Pistol as a distraction";
	}

}
