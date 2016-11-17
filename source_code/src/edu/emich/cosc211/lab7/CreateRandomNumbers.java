package edu.emich.cosc211.lab7;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Random;

public class CreateRandomNumbers {
	private static final String FILENAME = "numbers";
	private static final int MAX_NUMBERS = 5_000;
	private static final int NUMBER_LIMIT = 20_000;
	private static final long SEED = 1L;

	public static void main(String[] args) throws FileNotFoundException {
		PrintWriter output = new PrintWriter(new FileOutputStream(FILENAME));
		
		final Random rand = new Random(SEED);
		
		output.println(MAX_NUMBERS);
		
		for (int i = 0; i < MAX_NUMBERS; i++) {
			int number = rand.nextInt(NUMBER_LIMIT);
			output.println(number);
		}
		
		output.close();
		
		System.out.println("all numbers printed");
	}
}
