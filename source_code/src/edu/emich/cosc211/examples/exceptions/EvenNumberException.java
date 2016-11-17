package edu.emich.cosc211.examples.exceptions;

public class EvenNumberException extends Exception {
	private double troubleNumber;

	public EvenNumberException(double troubleNumber) {
		super("EvenNumberException");
		this.troubleNumber = troubleNumber;
	}

	public double getTroubleNumber() {
		return troubleNumber;
	}
}
