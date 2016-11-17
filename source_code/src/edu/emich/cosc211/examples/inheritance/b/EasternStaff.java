package edu.emich.cosc211.examples.inheritance.b;

public class EasternStaff extends EasternPerson {

	public EasternStaff(int age) {
		super(age);
	}

	public EasternStaff(int age, String eid) {
		super(age, eid);
	}

	public void getPaid() {
		this.money += 10;
	}
}
