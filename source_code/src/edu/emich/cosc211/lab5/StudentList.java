package edu.emich.cosc211.lab5;
/**
 * A list of student objects.
 * 
 * @author eddie gurnee
 *
 */
public class StudentList {
	private static final int DEFAULT_LIST_SIZE = 10;
	private int pointer;
	private Student[] students;

	public StudentList() {
		this.students = new Student[DEFAULT_LIST_SIZE];
		this.pointer = 0;
	}

	/**
	 * Adds a student element at a given location.
	 * 
	 * @param index
	 *            location of the new student to add
	 * @param element
	 *            the new student to add
	 */
	public void add(int index, Student element) {
		if (this.pointer == this.students.length) {
			ensureCapacity();
		}

		for (int i = this.pointer; i > index + 1; i--) {
			this.students[i] = this.students[i - 1];
		}

		this.students[index] = element;

		this.pointer++;
	}

	private void ensureCapacity() {
		Student[] newStudents = new Student[this.students.length + DEFAULT_LIST_SIZE];
		for (int i = 0; i < this.pointer; i++) {
			newStudents[i] = this.students[i];
		}
		this.students = newStudents;
	}

	/**
	 * Adds a student to the end of the list.
	 * 
	 * @param e
	 *            the student to add
	 * @return true if the list add was successful
	 */
	public boolean add(Student e) {
		this.add(this.pointer, e);

		return true;
	}

	/**
	 * Resets the list.
	 */
	public void clear() {
		this.pointer = 0;
	}

	/**
	 * Checks if the StudentList contains a provided student.
	 * 
	 * @param e
	 *            the student to check
	 * @return true if the student is included
	 */
	public boolean contains(Student e) {
		return this.indexOf(e) > -1;
	}

	/**
	 * Gets a student value at a given index.
	 * 
	 * @param index
	 *            location of student value
	 * @return the student value at requested index
	 */
	public Student get(int index) {
		return this.students[index];
	}

	/**
	 * Gets the index of a given student object.
	 * 
	 * @param e
	 *            the student object to search
	 * @return the index of a given student
	 */
	public int indexOf(Student e) {
		int toReturn = -1;
		for (int i = 0; i < this.pointer; i++) {
			if (this.students[i].equals(e)) {
				toReturn = i;
				break;
			}
		}
		return toReturn;
	}

	/**
	 * Checks if the list is empty.
	 * 
	 * @return true if the list is empty
	 */
	public boolean isEmpty() {
		return this.pointer == 0;
	}

	/**
	 * Removes a student at a given index.
	 * 
	 * @param index
	 *            location of student to remove
	 * @return the student removed
	 */
	public Student remove(int index) {
		Student toReturn = this.students[index];

		for (int i = index; i < this.pointer - 1; i++) {
			this.students[i] = this.students[i + 1];
		}

		this.pointer--;

		return toReturn;
	}

	/**
	 * Removes a student located in the list.
	 * 
	 * @param e
	 *            the student to remove
	 * @return true if the student was removed
	 */
	public boolean remove(Student e) {
		int index = this.indexOf(e);
		boolean toReturn = false;

		if (index > -1) {
			toReturn = true;
			this.remove(index);
		}

		return toReturn;
	}

	/**
	 * Sets the value of a given index to a specific student.
	 * 
	 * @param index
	 *            location of student to set
	 * @param element
	 *            the specific student value to set
	 * @return the student overwritten, if any
	 */
	public Student set(int index, Student element) {
		Student toReturn = this.students[index];

		this.students[index] = element;

		return toReturn;
	}

	/**
	 * Checks the size of the list.
	 * 
	 * @return the size of the list
	 */
	public int size() {
		return this.pointer;
	}

}
