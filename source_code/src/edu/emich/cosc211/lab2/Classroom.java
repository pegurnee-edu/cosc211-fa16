package edu.emich.cosc211.lab2;

/**
 * Classrooms hold information regarding the personel inside of a class, along
 * with specific information regarding topic.
 * 
 * @author eddie gurnee
 * @version 09/27/2016
 */
public class Classroom {
	private static final int CLASSROOM_LIMIT = 30;

	private Teacher teacher;
	private Student[] students;
	private int studentIndex;

	private String course;
	private int crn;
	private String title;

	/**
	 * No argument constructor
	 */
	public Classroom() {
		this.course = null;
		this.crn = -1;
		this.title = "no class";

		this.studentIndex = 0;
		this.students = new Student[CLASSROOM_LIMIT];
	}

	/**
	 * Constructor allows for course name, CRN, and class title to be provided.
	 * 
	 * @param course
	 *            name of the course, i.e. COSC 211
	 * @param crn
	 *            record number for the course, i.e. 13382
	 * @param title
	 *            descriptive name for the course, i.e. Programming Data
	 *            Structures
	 */
	public Classroom(String course, int crn, String title) {
		this.course = course;
		this.crn = crn;
		this.title = title;

		this.studentIndex = 0;
		this.students = new Student[CLASSROOM_LIMIT];
	}

	/**
	 * Returns a String of all student information in csv formatting.
	 * 
	 * @return csv representation of student information
	 */
	public String getStudentsAsCsv() {
		String toReturn = "";
		for (int i = 0; i < this.studentIndex; i++) {
			Student student = students[i];
			toReturn += student.getName() + ",";
			toReturn += student.getEid() + ",";
			toReturn += student.getYear() + ",";
			toReturn += this.title + "\n";
		}
		return toReturn;
	}

	/*
	 * TODO: Implement getDisplayInfo to return a "pretty formatted" String
	 * representation of all of the classroom information, including teacher,
	 * students, course, crn, and title.
	 */
	public String getDisplayInfo() {
		return null;
	}

	/**
	 * Adds a student to the classroom. May throw an
	 * ArrayIndexOutOfBoundsException if the classroom is full. Should check if
	 * class is full first.
	 * 
	 * @param student
	 *            student to be added
	 */
	public void addStudent(Student student) {
		this.students[this.studentIndex] = student;
		this.studentIndex += 1;
	}

	/**
	 * Gets a student object at a given index.
	 * 
	 * @param index
	 *            the location of the student to retrieve
	 * @return the requested student object
	 */
	public Student getStudent(int index) {
		return this.students[index];
	}

	/**
	 * Removes a student.
	 * 
	 * @param studentName
	 *            String name of student to remove
	 * @return the removed student, or null if not found
	 */
	public Student removeStudent(String studentName) {
		// find index of student - search
		int targetIndex = -1;
		Student returnStudent = null;

		for (int i = 0; i < this.studentIndex; i++) {
			if (studentName.equals(this.students[i].getName())) {
				targetIndex = i;
				break;
			}
		}
		if (targetIndex > -1) {
			// "remove" student
			returnStudent = this.students[targetIndex];
			// move down
			for (int i = targetIndex; i < this.studentIndex - 1; i++) {
				this.students[i] = this.students[i + 1];
			}

			// lower student pointer
			this.studentIndex -= 1;
		}

		return returnStudent;
	}

	/**
	 * Checks if the class is full.
	 * 
	 * @return true if the class is full, otherwise false
	 */
	public boolean isClassFull() {
		int numStudents = this.studentIndex;
		int maxClassSize = this.students.length;

		return numStudents == maxClassSize;
	}

	/*
	 * TODO: get the number of students that are currently enrolled
	 */
	public int getNumberOfStudents() {
		return 0;
	}

	public void setTeacher(Teacher eddie) {
		// TODO Auto-generated method stub

	}

	/*
	 * TODO: Create getters and setters for teacher, course, crn, title
	 */

}
