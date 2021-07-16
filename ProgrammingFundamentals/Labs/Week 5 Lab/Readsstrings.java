import java.io.IOException;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.util.*;

public class Readsstrings {
	public static void main(String[] args) throws IOException {

		// Give the file path for the output
		BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\Gene\\Desktop\\userStrings.txt"));

		// Get string from user input
		Scanner userInput = new Scanner(System.in);
		String userString;

		System.out.println("\n Please enter a string, Enter DONE when you want to stop");
		boolean choice = true;

		// Loop that runs untill the user enters DONE

		do {
			userString = userInput.nextLine();

			if (userString.toLowerCase().equals("done")) {
				choice = false;
				break;
			} else {
				// Write string to the file
				writer.write(userString);
				writer.newLine();
			}

		}

		while (choice);
		// close the file
		writer.close();

	}

}
