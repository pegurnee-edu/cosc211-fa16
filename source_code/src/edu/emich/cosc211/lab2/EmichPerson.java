package edu.emich.cosc211.lab2;

/**
 * Contains information about a given emich person. Base class for both Teacher and Student.
 * 
 * @author eddie gurnee
 *
 */
public class EmichPerson {
	private static int currentId = 1;

	private String eid;
	private String name;

	public EmichPerson(String name) {
		this.name = name;
		this.eid = "E" + String.format("%08d", EmichPerson.currentId);

		EmichPerson.currentId++;
	}

	public String getEid() {
		return this.eid;
	}

	public String getName() {
		return this.name;
	}

}
