
//***************************************************************************************
// AgeGuess.java   CPSC21000-Lab2-Exercise 4A  Eugene Henneberry 11/5/2020
//
// This is an age guessing game.
//***************************************************************************************

import java.util.Scanner;



import java.util.Random;



public class ModAgeGuess {

 public static void main (String [] args){

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

/// If statement checking to see if the guess is correct



 if (ageGuess != age);


  System.out.println("You guessed wrong!");


 /// Displays the guess and the answer.

 System.out.println("You guessed wrong!");

 System.out.println("Your guess is: " + ageGuess);

 System.out.println("The age is: " + age);


 }

}
