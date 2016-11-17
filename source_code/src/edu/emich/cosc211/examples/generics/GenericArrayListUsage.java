package edu.emich.cosc211.examples.generics;

import edu.emich.cosc211.examples.generics.prior.Animal;
import edu.emich.cosc211.examples.generics.prior.Player;
import edu.emich.cosc211.examples.generics.prior.Student;
import edu.emich.cosc211.examples.generics.prior.Villager;

public class GenericArrayListUsage {
	public static void main(String[] args) {
		GenericArrayList<Villager> village = new GenericArrayList<>(10);
		
		GenericArrayList<Animal> zoo = new GenericArrayList<>(10);
		
		GenericArrayList<Player> highscorelist = new GenericArrayList<>();
		
		GenericArrayList<Student> classroom = new GenericArrayList<>(20);
		classroom.add(new Student("Zacharias", 'P', 4, "yellow"));
		classroom.add(new Student("Ernie", 'D', 4, "yellow"));
		classroom.add(new Student("Blaise", 'E', 4, "green"));
		
		for (int i = 0; i < classroom.size(); i++) {
			Student student = classroom.get(i);
			System.out.println(student);
		}
		
		
	}
}
