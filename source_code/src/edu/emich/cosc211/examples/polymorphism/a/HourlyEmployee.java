package edu.emich.cosc211.examples.polymorphism.a;

/**
 * Employee who makes certain wage per hour.
 * 
 * @author eddie gurnee
 *
 */
public class HourlyEmployee extends Employee {
	private int hoursWorked;

	private double hourlyRate;

	/**
	 * Constructor for HourlyEmployee, takes a name, hoursWorked, and
	 * hourlyRate.
	 * 
	 * @param name
	 *            employee name
	 * @param hoursWorked
	 *            hours employee worked in time period
	 * @param hourlyRate
	 *            amount paid per hour
	 */
	public HourlyEmployee(String name, int hoursWorked, double hourlyRate) {
		super(name);
		this.hoursWorked = hoursWorked;
		this.hourlyRate = hourlyRate;
	}

	@Override
	public double getPay() {
		return this.hourlyRate * this.hoursWorked;
	}

	@Override
	public String toString() {
		return "HourlyEmployee [hoursWorked=" + hoursWorked + ", hourlyRate=" + hourlyRate + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(hourlyRate);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + hoursWorked;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		HourlyEmployee other = (HourlyEmployee) obj;
		if (Double.doubleToLongBits(hourlyRate) != Double.doubleToLongBits(other.hourlyRate))
			return false;
		if (hoursWorked != other.hoursWorked)
			return false;
		if (this.getName().equals(other.getName())) {
			return false;
		}
		return true;
	}

	public static void main(String[] args) {
		String name = "isaac";
		HourlyEmployee steve1 = new HourlyEmployee(name, 24, 0.10);
		HourlyEmployee steve2 = new HourlyEmployee(new String("isaac"), 24, 0.10);
		
		System.out.println(steve1);
		System.out.println(steve2);
		
		System.out.println(steve1.equals(steve2));
		
		
	}

}
