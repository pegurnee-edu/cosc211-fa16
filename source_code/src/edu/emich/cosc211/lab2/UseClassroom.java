package edu.emich.cosc211.lab2;

import java.util.Scanner;

/**
 * Gives an example use of the classroom.
 * 
 * TODO: NOTHING! This class should not be modified at all.
 * 
 * @author eddie gurnee
 *
 */
public class UseClassroom {

	public static void main(String[] args) {
		// Instantiate a number of students, teachers, and classrooms
		Classroom classroom = new Classroom("COSC 211", 13382, "Programming Data Structures");

		Teacher eddie = new Teacher("Eddie Gurnee");

		Student isaac = new Student("Isaac Kane");
		Student steve = new Student("Steven Sotok");
		Student samah = new Student("Samah Majadla");
		Student tyler = new Student("Tyler Hoffman");
		Student peter = new Student("Peter James");

		// instantiate keyboard
		Scanner keyboard = new Scanner(System.in);

		// apply information to students and teachers
		isaac.setYear("Junior");
		steve.setYear("Junior");
		samah.setYear("Graduate");
		tyler.setYear("Graduate");
		peter.setYear("Freshman");

		eddie.setResearchFocus("Web Development");

		// add students and teachers to classroom
		classroom.setTeacher(eddie);
		classroom.addStudent(isaac);
		classroom.addStudent(steve);
		classroom.addStudent(samah);
		classroom.addStudent(tyler);
		classroom.addStudent(peter);

		int command;
		do {
			// print menu
			System.out.println("Enter a command:");
			System.out.println("1) List students");
			System.out.println("2) Display classroom");
			System.out.println("3) Add student");
			System.out.println("4) Remove student");
			System.out.println("0) Exit");

			// read in command and remove newline character from buffer
			command = keyboard.nextInt();
			keyboard.nextLine();

			// handle command input
			switch (command) {
			case 1: //list
				System.out.println(classroom.getStudentsAsCsv());
				break;
			case 2: //pretty display
				System.out.println(classroom.getDisplayInfo());
				break;
			case 3: //add student
				if (classroom.isClassFull()) {
					System.out.println("Cannot add new student, class is full.");
				} else {
					System.out.println("Enter student name:");
					String newStudentName = keyboard.nextLine();
					System.out.println("Enter student year:");
					String newStudentYear = keyboard.nextLine();

					Student newlyAddedStudent = new Student(newStudentName, newStudentYear);
					classroom.addStudent(newlyAddedStudent);
				}
				break;
			case 4: //remove student
				System.out.println("Enter student name to remove:");
				String targetStudentName = keyboard.nextLine();
				Student deletedStudent = classroom.removeStudent(targetStudentName);
				if (null == deletedStudent) {
					System.out.println("Student not found.");
				} else {
					System.out.println("Student: " + deletedStudent.getName() + " (EID: " + deletedStudent.getEid()
							+ ") has been removed from class.");
				}
				break;
			case 0:
				System.out.println("Logout complete.");
			default:
				break;
			}
		} while (command != 0);

		// closed finished resources
		keyboard.close();
	}

}
