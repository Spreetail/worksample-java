package com.multivaluedictionary;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Program {

	public static void main(String[] args) throws IOException{
		System.out.println("Running program");

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		while(true) {
			System.out.print("> ");
			String command = reader.readLine();

			// Printing the read line
			System.out.println("You entered " + command);
		}
	}

}
