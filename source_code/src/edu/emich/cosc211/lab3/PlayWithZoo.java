package edu.emich.cosc211.lab3;

import java.util.Scanner;

import edu.emich.cosc211.lab3.animals.Animal;
import edu.emich.cosc211.lab3.animals.Herbivore;

/**
 * A driver program to play with the zoo.
 * 
 * @author eddie gurnee
 * @version 10/04/2016
 */
public class PlayWithZoo {

	public static void main(String[] args) {
		Zoo zoo = new Zoo();
		Scanner keyboard = new Scanner(System.in);

		int command;

		do {
			System.out.println("Enter a command:");
			System.out.println("1) Add animal");
			System.out.println("2) Sell animal");
			System.out.println("3) Feed all animals");
			System.out.println("4) Watch animals play");
			System.out.println("0) Destroy the zoo and exit.");

			command = keyboard.nextInt();
			keyboard.nextLine();

			switch (command) {
			case 1:
				
				if (zoo.isZooFull()) {
					System.out.println("The zoo is full, please remove an animal first.");
					break;
				}
				
				Animal theNewAnimal = null;
				System.out.println("What type of animal would you like to add?");
				System.out.println("1) Beluga Whale");
				System.out.println("2) Colorado River Cutthroat Trout");
				System.out.println("3) Eurasian beaver");
				System.out.println("4) Honey Possum");
				System.out.println("5) Ruffed lemur");
				System.out.println("6) Pink Fairy Armadillo");

				int newAnimalType = keyboard.nextInt();
				keyboard.nextLine();
				
				String animalType = null;
				switch (newAnimalType) {
				case 1:
					animalType = "Beluga Whale";
					break;
				case 2:
					animalType = "Colorado River Cutthroat Trout";
					break;
				case 3:
					animalType = "Eurasian beaver";
					break;
				case 4:
					animalType = "Honey Possum";
					break;
				case 5:
					animalType = "Ruffed lemur";
					break;
				case 6:
					animalType = "Pink Fairy Armadillo";
					break;
				default:
					break;
				}

				System.out.println("What would you like to name the new animal? ");
				String animalName = keyboard.nextLine();
				
				switch (newAnimalType) {
				case 1: case 2: case 3: case 6:
					theNewAnimal = new Carnivore(animalType, animalName);
					break;
				case 4: case 5:
					theNewAnimal = new Herbivore(animalType, animalName);
					break;
				default:
					break;
				}

				zoo.addAnimal(theNewAnimal);
				break;
			case 2:
				System.out.println("Which animal would you like to remove?");
				int indexOfRemoveAnimal = keyboard.nextInt();
				keyboard.nextLine();
				
				Animal removedAnimal = zoo.removeAnimal(indexOfRemoveAnimal);
				System.out.println(removedAnimal.getName() + " the " + removedAnimal.getType() + " has been removed.");
				
				break;
			case 3:
				System.out.println(zoo.feedAllAnimals());
				break;
			case 4:
				System.out.println(zoo.watchAnimalsPlay());
				break;
			case 0:
				System.out.println("Zoo and all exhibits destroyed.");
			default:
				break;
			}
		} while (command != 0);
		
		
		keyboard.close();
	}

}
