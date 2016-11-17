package edu.emich.cosc211.lab7;

import edu.emich.cosc211.lab7.util.GenericArrayList;
import edu.emich.cosc211.util.GenericLinkedList;

public class PlayWithNumbers {
	public static void main(String[] args) {
		int[] numbers = { 6, 14, 7, 3, 21, 5 };

		GenericArrayList<Integer> alNumbers = new GenericArrayList<>();

		long startAddTimeAL = System.nanoTime();
		for (int i = 0; i < numbers.length; i++) {
			alNumbers.add(numbers[i]);
		}
		long timeSpentAddingAL = System.nanoTime() - startAddTimeAL;

		long startGetTimeAL = System.nanoTime();
		for (int i = 0; i < alNumbers.size(); i++) {
			System.out.println(alNumbers.get(i));
		}
		long timeSpentGettingAL = System.nanoTime() - startGetTimeAL;

		GenericLinkedList<Integer> llNumbers = new GenericLinkedList<>();

		long startAddTimeLL = System.nanoTime();
		for (int i = 0; i < numbers.length; i++) {
			llNumbers.add(numbers[i]);
		}
		long timeSpentAddingLL = System.nanoTime() - startAddTimeLL;

		long startGetTimeLL = System.nanoTime();
		for (int i = 0; i < llNumbers.size(); i++) {
			System.out.println(llNumbers.get(i));
		}
		long timeSpentGettingLL = System.nanoTime() - startGetTimeLL;

		System.out.printf("%10s || %10s | %10s%n", "", "adding", "getting");
		System.out.printf("%10s || %10s | %10s%n", "linked", timeSpentAddingLL, timeSpentGettingLL);
		System.out.printf("%10s || %10s | %10s%n", "array", timeSpentAddingAL, timeSpentGettingAL);
	}
}
