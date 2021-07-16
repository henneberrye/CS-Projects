//***************************************************************************************
//	VowelCounter.java 		CPSC21000-Lab2-Exercise 3		Eugene Henneberry 11/12/2020
//
// This counts the vowels and non-vowels in the string. 
//***************************************************************************************

import java.util.*;

public class VowelCounter {

	public static void main(String[] args) {
		// Sets and initializes variables.
		int a = 0, e = 0, x = 0, o = 0, u = 0, nonvowels = 0;
		String UserInput;

		// Creates the scanner.
		Scanner Keyboard = new Scanner(System.in);

		// Asks for the users input
		System.out.println("Enter a pharse to find out how many vowels and non-vowels there are");
		UserInput = Keyboard.nextLine();

		// Checks for and counts the vowels and non-vowels.
		for (int i = 0; i < UserInput.length(); i++) {
			char C = UserInput.charAt(i);

			if (C == 'a')
				a++;
			else if (C == 'e')
				e++;
			else if (C == 'i')
				x++;
			else if (C == 'o')
				o++;
			else if (C == 'u')
				u++;
			else
				nonvowels++;
		}
		// Prints out the vowel and non-vowel count.
		System.out.println("a: " + a + "\n" + "e: " + e + "\n" + "i: " + x + " \n" + "o: " + o + "\n" + "u: " + u + "\n"
				+ "nonvowels: " + nonvowels);

		Keyboard.close();
	}
}
