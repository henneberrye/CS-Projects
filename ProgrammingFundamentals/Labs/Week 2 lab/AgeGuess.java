//***************************************************************************************
//	AgeGuess.java 		CPSC21000-Lab2-Exercise 1		Eugene Henneberry 11/5/2020
//
// This is an age guessing game. 
//***************************************************************************************

import java.util.Scanner;

import java.util.Random;

public class AgeGuess {

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

		System.out.println("Your guess is: " + ageGuess);

		System.out.println("The age is: " + age);

	}
}
