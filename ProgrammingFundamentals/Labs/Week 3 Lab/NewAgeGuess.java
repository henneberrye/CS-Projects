//***************************************************************************************************
//	AgeGuess.java 		CPSC21000-Lab2-Exercise 1		Eugene Henneberry 11/12/2020
//
// This is an age guessing game. 
//***************************************************************************************************

import java.util.*;

public class NewAgeGuess {

	public static void main(String[] args) {

		/// Initializing Variables
		int ageGuess = 0;
		int age = 1 + (int) (Math.random() * 99);

		/// Creating Scanner object for user input
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Guess a age between 0 and 100: ");

		// Loop that asks for the age until the user guesses right.
		while (age != ageGuess) {
			ageGuess = keyboard.nextInt();
			if (age < ageGuess) {
				System.out.print("Guess again! Younger: ");
			} else if (age > ageGuess) {
				System.out.print("Guess again! Older: ");
			}
		}
		System.out.println("You are correct!");

		// Closes the scanner.
		keyboard.close();

	}
}