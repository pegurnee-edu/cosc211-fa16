package edu.emich.cosc211.examples.generics.prior;

/**
 * Student object with all of the student information.
 * 
 * @author eddie gurnee
 *
 */
public class Student {
	private String name;

	private char grade;

	private int year;

	private String color;

	/**
	 * Student constructor taking all variables required.
	 * 
	 * @param name
	 *            name of student
	 * @param grade
	 *            overall grade for student
	 * @param year
	 *            year of student in school
	 * @param color
	 *            preferred color
	 */
	public Student(String name, char grade, int year, String color) {
		super();
		this.name = name;
		this.grade = grade;
		this.year = year;
		this.color = color;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Student))
			return false;
		Student other = (Student) obj;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		if (grade != other.grade)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (year != other.year)
			return false;
		return true;
	}

	public String getColor() {
		return color;
	}

	public char getGrade() {
		return grade;
	}

	public String getName() {
		return name;
	}

	public int getYear() {
		return year;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + grade;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + year;
		return result;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setGrade(char grade) {
		this.grade = grade;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", grade=" + grade + ", year=" + year + ", color=" + color + "]";
	}

}
