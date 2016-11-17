package edu.emich.cosc211;

public class FactorialRecursive {
	public static void main(String[] args) {

		System.out.println("expected: 120, actual: " + factorial(5));
		System.out.println("expected: 720, actual: " + factorial(6));
		System.out.println("expected: 24, actual: " + factorial(4));
		System.out.println(factorial(18));

		/*
		 * if (n < 1) { throw new ArithmeticException("Bad Factorial"); }
		 */
	}

	private static long factorial(int n) {
		if (n == 1) {
			return 1;
		}
		return n * factorial(n - 1);
	}
}
