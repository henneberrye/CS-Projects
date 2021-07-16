//***************************************************************************************
//	UserNames.java 		CPSC21000-Lab2-Exercise 3		Eugene Henneberry 11/5/2020
//
// This program generates a new user name.
//***************************************************************************************

import java.util.Scanner;

import java.util.*;

public class UserNames {

	public static void main(String args[]) {

/// Setting variables

		String FirstName, LastName, UserName;

		int NumRan;

/// Creating scanner for user input

		Scanner input = new Scanner(System.in);

/// Asking user for there first and last name

		System.out.println("Please enter your first name: ");

		FirstName = input.nextLine();

		System.out.println("Please enter your last name: ");

		LastName = input.nextLine();

/// Random number generator

		Random generator = new Random();

		NumRan = 10 + generator.nextInt(99);

/// Creating the new user name

		UserName = LastName.substring(0, 4) + FirstName.substring(0, 1) + NumRan;

/// Display the user name.

		System.out.println("Your user name is: " + UserName);

	}

}
