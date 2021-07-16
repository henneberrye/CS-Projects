//***************************************************************************************
//	AgeGuess.java 		CPSC21000-Lab2-Exercise 4B		Eugene Henneberry 11/5/2020
//
// This is an age guessing game. 
//***************************************************************************************

import java.util.Scanner;

import java.util.Random;

public class ModAgeGuess {

	public static void main(String[] args) {

		/// Initializing Variables

		int ageGuess, age;

		/// Creating random number generator

		Random generator = new Random();

		age = generator.nextInt(100) + 1;

		/// Creating Scanner object for user input

		Scanner keyboard = new Scanner(System.in);

		/// Creating user input statement

		System.out.print("Guess the age from 0 to 100: ");

		ageGuess = keyboard.nextInt();

		/// Nested if statement to determine if the guess is correct or incorrect or if the answer is older or younger.

		if (ageGuess != age) {

			System.out.println("You guessed wrong!");

			if (ageGuess < age) {

				System.out.println("Older");

			} else if (ageGuess > age)

				System.out.println("Younger");

			else if (ageGuess == age)

				System.out.println("Correct!");
		}

	}
}