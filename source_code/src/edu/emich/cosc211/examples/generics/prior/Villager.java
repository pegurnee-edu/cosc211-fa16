package edu.emich.cosc211.examples.generics.prior;

public abstract class Villager {
	private String name;
	private int money;
	
	public Villager(String name) {
		this.name = name;
		this.money = 0;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getMoney() {
		return this.money;
	}
	
	public void addMoney(int money) {
		this.money += money;
	}
	
	public abstract void work();

}
