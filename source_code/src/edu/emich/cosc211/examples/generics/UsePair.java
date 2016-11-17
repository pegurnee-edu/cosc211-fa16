package edu.emich.cosc211.examples.generics;

import edu.emich.cosc211.examples.generics.prior.Student;

public class UsePair {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String firstName = "Eddie";
		String lastName = "Gurnee";
		
		Name eddie = new Name("Eddie", "Gurnee");
		Name tyler = new Name("Tyler", "Hoffman");
		
		Pair<String> eddieName = new Pair<>(firstName, lastName);
		
		Student a = new Student("Blaise", 'T', 4, "green");
		Student b = new Student("Cormac", 'D', 5, "red");
		
		Pair<Student> students = new Pair<>(a, b);
		
	}
	

}
