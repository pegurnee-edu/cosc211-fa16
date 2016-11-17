package edu.emich.cosc211.lab4;

public class Gnome extends Villager implements CanDoMagic, CanFarm, CanFight, CanMine {

	public Gnome(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int mine() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int fight() {
		// gnomes have lucky attacks, return range 1 - 6
		return ((int)Math.random() * 6) + 1;
	}

	@Override
	public int farm() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int doMagic() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void work() {
		// TODO Auto-generated method stub
		
	}

}
