package edu.emich.cosc211.examples.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ScannerExceptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);

		System.out.println("Enter your name: ");
		String name = keyboard.nextLine();

		boolean needsAge = true;
		int age = -1;

		while (needsAge) {
			System.out.println("Enter your age: ");

			try {
				age = keyboard.nextInt();

				keyboard.nextLine();
				needsAge = false;
			} catch (InputMismatchException e) {
				System.err.println("Invalid input");
				keyboard.nextLine();
			}
		}

		System.out.println("Enter your favorite color: ");
		String color = keyboard.nextLine();

		System.out.println("Hello " + name + "\naged: " + age + "\nfavy color: " + color);

		keyboard.close();
	}

}
