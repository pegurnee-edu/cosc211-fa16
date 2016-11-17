package edu.emich.cosc211.examples.inheritance.b;

public class EasternStudent extends EasternPerson {

	public EasternStudent(int age) {
		super(age);
	}

	public EasternStudent(int age, String eid) {
		super(age, eid);
	}

	public String getGreeting() {
		return "Just let me sleep.";
	}

	public void study() {

	}

	public void payForClasses() {
		this.money -= 3000;
	}

}
