//***************************************************************************************
//	EvenNumSum.java 		CPSC21000-Lab2-Exercise 2		Eugene Henneberry 11/12/2020
//
// This finds the sum of even numbers between 2 and the user input. 
//***************************************************************************************

import java.util.*;

public class EvenNumSum {

	public static void main(String[] args) {
		// Sets and initializes variables.
		int Number;
		int Sum = 0;

		// Creates scanner object.
		Scanner input = new Scanner(System.in);

		// Loop that checks the user input.
		while (true) {
			// Asks for user input
			System.out.print("Please enter a number > 2: ");
			Number = input.nextInt();
			// Checks if user input is greater than or equal to 2.
			if (Number >= 2) {
				break; // breaks the loop if the user input is correct.
			}
			// Informs the user they need to enter a correct number.
			System.out.println("Error the number should be 2 or greater");
		}
		// Finding the sum of all even numbers between 2 and the user input.
		for (int i = 2; i <= Number; i += 2) {
			Sum += i;
		}
		// Displays the number the user entered and the sum of even numbers between 2
		// and the user input.
		System.out.println("The sum of the even numbers between 2 and " + Number + " is " + Sum);

		// Closes the scanner.
		input.close();
	}
}