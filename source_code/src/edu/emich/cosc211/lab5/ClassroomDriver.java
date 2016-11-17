package edu.emich.cosc211.lab5;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ClassroomDriver {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		ClassroomDatabasePrinter cdp = new ClassroomDatabasePrinter("AllStudents.txt");

		try {
			cdp.init();
		} catch (FileNotFoundException e) {
			System.out.println("Input file not found. Turning off.");
			System.exit(0);
		}

		int command;
		do {
			command = getCommandOption(keyboard);

			switch (command) {
			case 1:
				cdp.printAll(System.out);
				break;
			case 2:
				cdp.printBy("year");
				break;
			case 3:
				cdp.printBy("color");
				System.out.println("print successful.");
				break;
			case 4:
				cdp.addStudent(createNewStudent(keyboard));
				break;
			default:
				break;
			}
		} while (command != 0);

		keyboard.close();
	}

	private static Student createNewStudent(Scanner keyboard) {
		System.out.println("Enter student name:");
		String name = keyboard.nextLine();

		System.out.println("Enter student grade [T, D, P, A, E, O]: ");
		char grade = keyboard.nextLine().charAt(0);

		System.out.println("Enter student year [1 - 7]: ");
		int year = keyboard.nextInt();
		keyboard.nextLine();

		System.out.println("Enter student color: [red, blue, green, yellow]: ");
		String color = keyboard.nextLine();

		Student student = new Student(name, grade, year, color);
		return student;
	}

	private static int getCommandOption(Scanner keyboard) {
		int command;
		System.out.println("1) Print students to console");
		System.out.println("2) Print students to file - by year");
		System.out.println("3) Print students to file - by color");
		System.out.println("4) Add student to database");
		System.out.println("0) Save and exit");
		command = keyboard.nextInt();
		return command;
	}
}
