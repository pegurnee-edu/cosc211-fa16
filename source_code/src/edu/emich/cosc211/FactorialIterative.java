package edu.emich.cosc211;

public class FactorialIterative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("expected: 120, actual: " + factorial(5));
		System.out.println("expected: 720, actual: " + factorial(6));
		System.out.println("expected: 24, actual: " + factorial(4));
		System.out.println(factorial(18));
	}

	public static long factorial(int n) {
		long toReturn = 1;

		// have to implement factorial maths
		for (; n > 0; n--) {
			toReturn *= n;
		}

		return toReturn;
	}

}
