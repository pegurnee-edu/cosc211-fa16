package edu.emich.cosc211.examples.inheritance.b;

public class EasternPerson extends Person {
	public EasternPerson(int age) {
		super(age);
	}

	private String eid;

	public String getEid() {
		return eid;
	}

	public EasternPerson(int age, String eid) {
		this(age);
		this.eid = eid;
	}

	public void setEid(String eid) {
		this.eid = eid;
	}

	public String getGreeting() {
		return "Go Eagles!";
	}
}
