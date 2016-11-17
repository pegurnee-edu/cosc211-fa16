package edu.emich.cosc211.examples.fileio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFromFile {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("What filename do you want?");
		String filename = keyboard.nextLine();

		FileInputStream fileIn = null;
		try {
			fileIn = new FileInputStream(filename);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		Scanner input = new Scanner(fileIn);
		
		while (input.hasNext()) {
			System.out.println(input.nextLine());
		}
		
		input.close();
		keyboard.close();
	}
}
