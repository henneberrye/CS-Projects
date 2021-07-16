
/*Eugene Henneberry
Programming Fundamentals-FA20-CPSC-21000-LT1
November 8, 2020
Programming Assignment #1: Cipher
 */
import java.util.*;

public class Cipher {

	public static void main(String[] args) {

		// Heading

		System.out.println("Programming Fundamentals \n" + "NAME:Eugene Henneberry \n" + "PROGRAMMING ASSIGNMENT 1 \n");

		// Setting variables

		int[] userInputArray = new int[5];
		int plainText = 0;
		int key, digit1, digit2;
		Scanner keyboard;

		// Creating Scanner to ask for user input
		// Creates random number generator

		Random generator = new Random();
		keyboard = new Scanner(System.in);

		// Creating message for user input and accepting the user input
		System.out.println("Welcome to the Cipher program.");
		System.out.println("Please enter 5 numbers between 0 and 19");
		System.out.print("1st number: ");
		userInputArray[0] = keyboard.nextInt();
		System.out.print("2nd number: ");
		userInputArray[1] = keyboard.nextInt();
		System.out.print("3rd number: ");
		userInputArray[2] = keyboard.nextInt();
		System.out.print("4th number: ");
		userInputArray[3] = keyboard.nextInt();
		System.out.print("5th number: ");
		userInputArray[4] = keyboard.nextInt();
		System.out.println();
		keyboard.close();

		// Reading the inputed numbers and adding them up

		for (int i = 0; i < 5; i++) {
			if (userInputArray[i] < 0 && userInputArray[i] > 19) {
				System.out.println("Please read directions and try again!");
				System.exit(0);
			}
			plainText += userInputArray[i];
		}

		// Creating the random number to be used for the key

		key = 0 + generator.nextInt((9 - 0 + 1));

		// Printing the plain text number and the key

		System.out.println("Total = " + plainText);
		System.out.println("Your random key is " + key);

		// Preparing the plain text value for encryption

		digit1 = plainText / 10;
		digit2 = plainText % 10;

		// Encrypting the number

		digit1 = digit1 + key;
		digit2 = digit2 + key;
		digit1 = digit1 % 10;
		digit2 = digit2 % 10;

		// Printing the encrypted number

		System.out.println("Your encoded number is " + digit1 + digit2);
	}

}
