package edu.emich.cosc211.examples.polymorphism.a;

public class SalariedEmployee extends Employee {
	private double salary;
	private static final int PAY_PERIODS = 26;

	public SalariedEmployee(String name, double salary) {
		super(name);
		this.salary = salary;
	}

	@Override
	public double getPay() {
		return salary / PAY_PERIODS;
	}

}
