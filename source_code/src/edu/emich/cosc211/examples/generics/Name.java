package edu.emich.cosc211.examples.generics;

public class Name {
	private String firstName;
	private String lastName;
	
	public Name(String first, String last) {
		this.firstName = first;
		this.lastName = last;
	}
	
	public String getFirstName() {
		return this.firstName;
	}
	
	public String getLastName() {
		return this.lastName;
	}
}
