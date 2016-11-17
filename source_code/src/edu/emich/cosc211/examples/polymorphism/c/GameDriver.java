package edu.emich.cosc211.examples.polymorphism.c;

public class GameDriver {

	public static void main(String[] args) {
		Hero beowulf = new Hero("Beowulf");
		
		Weapon weapon;
		
		int command = 6;
		
		switch (command) {
		case 1:
			weapon = new Katana();
			break;
		case 2:
			weapon = new Longsword();
			break;
		case 3:
			weapon = new Pistol();
			break;
		case 4:
			weapon = new Bow();
			break;
		case 5:
			weapon = new Dagger();
			break;
		case 6:
		default:
			weapon = new MagicTome();
			break;
		}
		
		beowulf.setWeapon(weapon);
		
		System.out.println(beowulf.attack());
		System.out.println("Beowulf dealt " + beowulf.getDamageDealt() + " damage");
		System.out.println(beowulf.chuckWeapon());
	}

}
