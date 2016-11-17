package edu.emich.cosc211.examples.exceptions;

public class MathExceptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			System.out.println(divide(5, 4));
		} catch (EvenNumberException e4) {
			// TODO Auto-generated catch block
			e4.printStackTrace();
		}
		try {
			System.out.println(divide(5, 2));
		} catch (EvenNumberException e3) {
			// TODO Auto-generated catch block
			e3.printStackTrace();
		}
		try {
			System.out.println(divide(5, 0));
		} catch (EvenNumberException|ArithmeticException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		try {
			System.out.println(divide(5, 3));
		} catch (EvenNumberException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			System.out.println(divide(5, 6));
		} catch (EvenNumberException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static double divide(double n1, double n2) throws EvenNumberException {
		if (n2 == 0) {
			throw new ArithmeticException("Divide by zero");
		}
		if (n2 % 2 == 0) {
			throw new EvenNumberException(n2);
		}
		return n1 / n2;
	}

}
