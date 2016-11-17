package edu.emich.cosc211.examples.fileio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class CopyFile {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("What filename do you want?");
		String filename = keyboard.nextLine();

		Scanner input = null;
		try {
			input = new Scanner(new FileInputStream(filename));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		PrintWriter output = null;
		
		try {
			output = new PrintWriter(new FileOutputStream(filename + " copy"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		while(input.hasNext()) {
			output.println(input.nextLine());
		}
		
		keyboard.close();
		output.close();
		input.close();

	}
}














