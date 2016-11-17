package edu.emich.cosc211.lab4;


/**
 * Village class contains a collection of Sapients
 * 
 * @author eddie gurnee
 * @version 10/11/2016
 */
public class Village {
	private static final int VILLAGE_LIMIT = 30;

	private Villager[] villagers;
	private int pointer;

	/**
	 * No argument constuctor gets the village initialized.
	 */
	public Village() {
		this.villagers = new Villager[VILLAGE_LIMIT];
	}

	/**
	 * Retrieves a villager at a specific location.
	 * 
	 * @param index
	 *            the index of which villager to retrieve
	 * @return the villager at the given index
	 */
	public Villager get(int index) {
		return this.villagers[index];
	}

	/**
	 * Removes a villager from the village. Villager is given at a specific location.
	 * 
	 * @param index
	 *            the index of which villager to remove
	 * @return the villager removed from the village
	 */
	public Villager removeVillager(int index) {
		Villager toReturn = this.villagers[index];
		for (int i = index; i < villagers.length - 1; i++) {
			this.villagers[i] = this.villagers[i + 1];
		}
		
		this.pointer--;
		
		return toReturn;
	}

	/**
	 * Adds a villager to the villager.
	 * 
	 * @param villager
	 *            the villager to be added to the village
	 */
	public void add(Villager villager) {
		this.villagers[this.pointer++] = villager;
	}

	/**
	 * Checks if the village is full.
	 * 
	 * @return true if the village is full
	 */
	public boolean isFull() {
		return this.pointer == this.villagers.length;
	}

	/**
	 * Gets the number of villagers currently housed.
	 * 
	 * @return the number of villagers in the village
	 */
	public int size() {
		return this.pointer;
	}
	
	/*
	 * TODO: find out how much money the whole town has
	 */
	
}
