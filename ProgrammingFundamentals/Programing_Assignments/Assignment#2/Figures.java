/*Eugene Henneberry
Programming Fundamentals-FA20-CPSC-21000-LT1
November 22, 2020
Programming Assignment #1: Cipher
 */
import java.util.*;

public class Figures {
	// Main method
	public static void main(String[] args) {

		// Heading
		System.out.println("Programming Fundamentals \n" + "NAME:Eugene Henneberry \n" + "PROGRAMMING ASSIGNMENT 2 \n");

		// Variable declaration.
		int size, choice;

		// Creating Scanner for user input.
		Scanner userInput = new Scanner(System.in);
		System.out.print("Enter the size of the figure (odd number): ");
		size = userInput.nextInt();

		// Loop that asks for user input then displays option to run program.
		while (size % 2 == 0) {
			System.out.println("Invalid figure size - must be an odd number");
			System.out.print("\nRenter the size of the figure: ");
			size = userInput.nextInt();
		}
		do {
			// Options for user to select.
			System.out.println("\nMENU:");
			System.out.println("1. Print box");
			System.out.println("2. Print diamond");
			System.out.println("3. Print X");
			System.out.println("4. Quit program");
			System.out.print("\nPlease select an option: ");

			// Calls each method for printBox, printDiamond, printX, and quit.
			choice = userInput.nextInt();
			switch (choice) {
			case 1:
				printBox(size);
				break;
			case 2:
				printDiamond(size);
				break;
			case 3:
				printX(size);
				break;
			case 4:
				quit();
				break;
			default:
				System.out.println("Invalid option");
			}
		} while (choice < 4 && choice > 0);
		// Closes the scanner
		userInput.close();

	}

	// Method for printing the box.
	static void printBox(int size) {
		// Puts a space between the printed method and the menu.
		System.out.println();

		// Sets variables
		int i, j;
		// Loop for the rows
		for (i = 1; i <= size; i++) {
			// Loop for the columns
			for (j = 1; j <= size; j++) {
				// Prints out the X
				System.out.print("X");
			}
			System.out.println();
		}
	}

	// Method for print the diamond
	private static void printDiamond(int size) {
		// Puts a space between the printed method and the menu
		System.out.println();

		// Sets variables
		int i, j, m, newSize;
		newSize = size + 1;
		m = newSize / 2;

		// Loop that sets spacing and prints the appropriate X
		// for the top left side and point of the diamond.
		for (i = 1; i <= m; i++) {
			for (j = 1; j <= (m - i); j++) {
				System.out.print(" ");
			}
			if (i == 1) {
				System.out.print("XX");
			} else {
				System.out.print("X");
				// Loop that sets spacing and prints the X for the right side of the diamond.
				for (int k = 1; k <= 2 * i - 2; k++) {
					System.out.print(" ");
				}
				System.out.print("X");
			}
			// Prints a new line after one of the conditions is met(XX, X).
			System.out.println();
		}
		// Loop that sets the spacing for the bottom left side
		// and point of the diamond.
		for (i = m + 1; i < newSize; i++) {
			for (j = 1; j <= i - m; j++) {
				System.out.print(" ");
			}
			if (i == newSize - 1) {
				System.out.print("XX");
			} else {
				System.out.print("X");
			}
			// Loop that sets the spacing and prints the X
			// for the bottom right of the diamond.
			for (int k = 1; k <= 2 * (newSize - i) - 2; k++) {
				System.out.print(" ");
			}
			if (i < newSize - 1) {
				System.out.println("X");
			}
		}
		System.out.println();
	}

	// Method to print the X
	private static void printX(int size) {

		// Puts a space between the printed method and the menu.
		System.out.println();

		// Loop that check for the appropriate spacing and prints the X's.
		for (int i = 1; i <= size; i++) {
			for (int j = 1; j <= size; j++) {
				if (j == i) {
					System.out.print("X");
				} else if (j == size - (i - 1)) {
					System.out.print("X");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println(" ");
		}
	}

	// Method to quit
	static void quit() {

		// Puts a space between the printed method and the menu.
		System.out.println();

		// Closes out the program.
		System.out.println("Good bye!");
		System.exit(0);
	}

}
