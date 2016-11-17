package edu.emich.cosc211.lab5;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * ClassroomDatabasePrinter holds a classroom and some helpful methods to print
 * out information about the classroom.
 * 
 * @author eddie gurnee
 *
 */
public class ClassroomDatabasePrinter {
	private StudentList students;
	private String dbFile;

	private static final String DEFAULT_DB_FILE = "AllStudents.txt";

	public ClassroomDatabasePrinter() {
		this(DEFAULT_DB_FILE);
	}

	public ClassroomDatabasePrinter(String dbFileName) {
		this.students = new StudentList();
		this.dbFile = dbFileName;
	}

	/**
	 * TODO: EXPLAIN the following code
	 * 
	 * @throws FileNotFoundException
	 */
	public void init() throws FileNotFoundException {
		Scanner infile = new Scanner(new FileInputStream(this.dbFile));

		while (infile.hasNext()) {
			String name = infile.next();
			char grade = infile.next().charAt(0);
			int year = infile.nextInt();
			String color = infile.next();

			this.students.add(new Student(name, grade, year, color));
		}

		infile.close();
	}

	/**
	 * Given a PrintStream, print out all student information.
	 * 
	 * @param out
	 *            the PrintStream to display information
	 */
	public void printAll(PrintStream out) {
		for (int i = 0; i < this.students.size(); i++) {
			out.println(this.students.get(i));
		}
	}

	/**
	 * Specifies which type to print by.
	 * 
	 * @param printByType
	 *            the type selected
	 */
	public void printBy(String printByType) {
		switch (printByType) {
		case "color":
			printByColor();
			break;
		case "year":
			printByYear();
			break;

		default:
			break;
		}

	}

	private void printByYear() {
		// TODO Print into their own separate files, the students information,
		// along with the number of students and average grade as a footer at
		// the top of each file

	}

	private void printByColor() {
		// TODO Print into their own separate files, the students information,
		// along with the number of students and average grade as a footer at
		// the top of each file
		String[] colors = { "red", "green", "blue", "yellow" };

		PrintWriter[] outs = new PrintWriter[colors.length];
		try {
			for (int i = 0; i < outs.length; i++) {
				outs[i] = new PrintWriter(new FileOutputStream(colors[i] + ".txt"));
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		int[] runningAverages = new int[colors.length];
		int[] numStudents = new int[colors.length];

		for (int i = 0; i < this.students.size(); i++) {
			String studentColor = this.students.get(i).getColor();

			switch (studentColor) {
			case "red":
				outs[0].println(this.students.get(i));
				char grade = this.students.get(i).getGrade();
				int score = ClassroomUtils.getScoreFromGrade(grade);
				runningAverages[0] += score;
				numStudents[0]++;
				break;
			case "green":
				outs[1].println(this.students.get(i));

				break;
			case "blue":
				outs[2].println(this.students.get(i));

				break;
			case "yellow":
				outs[3].println(this.students.get(i));

				break;

			default:
				break;
			}

		}

		for (int i = 0; i < outs.length; i++) {
			double average = runningAverages[i] / (double) numStudents[i];
			outs[i].println("Student average: " + ClassroomUtils.getGradeFromScore(average));
			outs[i].println("Num students: " + numStudents[i]);

			outs[i].close();
		}
	}

	public void addStudent(Student newStudent) {
		// TODO: add student to list of currently available students
		// TODO: ALSO store the new student in the db file
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
