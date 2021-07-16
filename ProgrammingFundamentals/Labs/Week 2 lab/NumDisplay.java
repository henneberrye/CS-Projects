//***************************************************************************************
//	NumDisplay.java 		CPSC21000-Lab2-Exercise 6		Eugene Henneberry 11/5/2020
//
// This is displays the text of the number the user input.
//***************************************************************************************

import java.util.Scanner;

public class NumDisplay {

	public static void main(String[] args) {

/// Crates scanner for user input

		Scanner User_input = new Scanner(System.in);

		System.out.println("Please enter a number between 0 and 9");

		int Entered_Num = User_input.nextInt();

/// Displays the corresponding word for the number that was entered using a switch statement.

		switch (Entered_Num) {

		case 0:
			System.out.println("Zero");
			break;
		case 1:
			System.out.println("One");
			break;
		case 2:
			System.out.println("Two");
			break;
		case 3:
			System.out.println("Three");
			break;
		case 4:
			System.out.println("Four");
			break;
		case 5:
			System.out.println("Five");
			break;
		case 6:
			System.out.println("Six");
			break;
		case 7:
			System.out.println("Seven");
			break;
		case 8:
			System.out.println("Eight");
			break;
		case 9:
			System.out.println("Nine");
			break;
		default:
			System.out.println("Try again please enter a number between 0 an 9");

		}
	}
}
