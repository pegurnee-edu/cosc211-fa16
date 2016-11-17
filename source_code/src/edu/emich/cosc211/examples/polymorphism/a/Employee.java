package edu.emich.cosc211.examples.polymorphism.a;

/**
 * Employee objects. Got some sort of pay. Should be addressed by name. Is an
 * abstract class.
 * 
 * @author eddie gurnee
 *
 */
public abstract class Employee {
	private String name;

	/**
	 * Constructor that takes a name.
	 * 
	 * @param name
	 *            name of the employee
	 */
	public Employee(String name) {
		this.name = name;
	}

	/**
	 * Gets the name of the employee.
	 * 
	 * @return the name of the employee
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * Gets the pay for the employee.
	 * 
	 * @return amount to be paid to employee
	 */
	public abstract double getPay();

	/**
	 * Gets pay based on normal amount of pay, with additional provided bonus.
	 * 
	 * @param bonusPay
	 *            whatever the bonus is
	 * @return amount to be paid to employee
	 */
	public double getPay(double bonusPay) {
		return this.getPay(bonusPay, 0);
	}

	/**
	 * Gets pay with bonus added and taxes removed.
	 * 
	 * @param bonusPay
	 *            some amount of bonus
	 * @param taxes
	 *            some amount to the government
	 * @return amount to be paid to employee
	 */
	public double getPay(double bonusPay, double taxes) {
		return this.getPay() + bonusPay - taxes;
	}
}
