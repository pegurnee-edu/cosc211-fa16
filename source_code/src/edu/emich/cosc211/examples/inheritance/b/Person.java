package edu.emich.cosc211.examples.inheritance.b;

public class Person {
	private int age;
	protected double money;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Person(int age) {
		super();
		this.age = age;
		this.money = 0;
	}

	public String getGreeting() {
		return "Hello.";
	}

	public double getMoney() {
		return this.money;
	}
}
