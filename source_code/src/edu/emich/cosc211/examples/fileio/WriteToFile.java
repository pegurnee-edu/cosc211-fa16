package edu.emich.cosc211.examples.fileio;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class WriteToFile {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("What filename do you want?");
		String filename = keyboard.nextLine();
		
		boolean append = true;
		
		FileOutputStream theOutputStream = null;
		try {
			theOutputStream = new FileOutputStream(filename, append);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		PrintWriter writer = new PrintWriter(theOutputStream);
		
		String nextText;
		do {
			System.out.println("Enter some text [q to quit]: ");
			nextText = keyboard.nextLine();
			
			writer.println(nextText);
		} while (!nextText.equals("q"));
		
		writer.close();
		keyboard.close();
	}
}
