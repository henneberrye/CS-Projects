
/**
 * Eugene Henneberry
 * Object Oriented Programming.
 * CPSC-24500-LT1
 * Week 1 Read/Write Assignment.
 */

import java.io.*;
import java.util.*;

public class HenneberryReadWrite {

	public static void main(String[] args) throws IOException {

		/*
		 * This is the main method. In this section the application calls on the
		 * mainMenue, newFile, printToFile, fileScanner, absentData, accRecord, and
		 * fileSearch methods. Local variables are also declared.
		 */

		// Variable declaration
		String pupilName = "", pupilYear = "", answer = "1";
		double pupilGPA = 1;
		int voidRecord = 0, absentQuestion;
		Scanner newScanner = new Scanner(System.in);
		File newFile = new File(newFilePath(newScanner));

		do {
			/*
			 * Calls the mainMenu method. Checks for input by the user and displays
			 * appropriate response.
			 */
			mainMenu();
			System.out.print("Please make a selection. ");
			System.out.print("");
			// Stores user response in the answer variable.
			answer = newScanner.next();

			// Checks if the user entered the number 1.
			if (answer.equals("1")) {
				// Asks the user to input the students name.
				System.out.print("\nPlease enter the students name: ");
				// Stores the student name in the pupilName variable
				pupilName = newScanner.next();

			}
			// Checks if the user enter the number 2.
			else if (answer.equals("2")) {
				// Asks the user for the students year in school.
				System.out.print("\nPlease enter the students year in school: ");
				// Stores the user input in the pupilYear variable and changes it to lower case.
				pupilYear = newScanner.next().toLowerCase();
				// Calls the accpRecord method and checks to see if the user input is
				// acceptable.
				voidRecord = accpRecord(pupilYear, 0);
				if (voidRecord > 0) {
					pupilYear = "";
				}
				newScanner.nextLine();
				System.out.println("\nPress enter to clear the screen");
				newScanner.nextLine();
			}
			// Check if the user enter the number 3.
			else if (answer.equals("3")) {
				// Asks the user for the students GPA.
				System.out.print("\nPlease enter the students GPA: ");
				try {
					// Stores the students GPA in the pupilGPA variable
					pupilGPA = newScanner.nextDouble();
					// Call the accpRecord method and checks to see if the user input is acceptable.
					voidRecord = accpRecord("senior", pupilGPA);
					if (voidRecord > 0) {
						pupilGPA = -1;
					}
					// Clears the screen
					newScanner.nextLine();
					System.out.println("\nPress enter to clear the screen");
					newScanner.nextLine();
					clearScreen();
				}
				// Tests to make sure the GPA is in the range of 0.0 and 4.0
				catch (Exception ex) {
					System.out.println("\nPlease enter a number such as 3.5 and try again: ");
					pupilGPA = -1;
					newScanner.nextLine();
					System.out.println("\nPress enter to clear the screen");
					newScanner.nextLine();
					clearScreen();
				}
			}
			// Prints out the information currently stored in the the variables pupilName,
			// pupilYear, and pupilGPA
			else if (answer.equals("4")) {
				// Prints out the recently entered information
				System.out.println("The students name is: " + pupilName);
				System.out.println("The students year is: " + pupilYear);
				System.out.println("The students GPA is: " + pupilGPA);
				newScanner.nextLine();
				System.out.println("Press enter to clear the screen.");
				newScanner.nextLine();
			}
			// Writes the currently stored information to the csv file.
			else if (answer.equals("5")) {
				absentQuestion = absentData(pupilName, pupilYear, pupilGPA);
				if (absentQuestion == 0 && voidRecord == 0) {
					printToFile(pupilName, pupilYear, pupilGPA, newFile);
					newScanner.nextLine();
					System.out.println("Press enter to clear the screen");
					newScanner.nextLine();
					clearScreen();
				} else {
					System.out.print("A few categories are wrong.");
					newScanner.nextLine();
					System.out.print("Press enter to clear the screen.");
					newScanner.nextLine();
					clearScreen();
				}
			}
			// Calls the fileScanner method
			else if (answer.equals("6")) {
				ArrayList<String> data = readCsv(newFile);
				ArrayList<String> studentName = new ArrayList<String>();
				ArrayList<String> studentYear = new ArrayList<String>();
				ArrayList<String> studentGpa = new ArrayList<String>();
				ArrayList<String> studentInfo = new ArrayList<String>();
				for (String line : data) {
					studentName.add(extractUserInfo(line, 0));
					studentYear.add(extractUserInfo(line, 1));
					studentGpa.add(extractUserInfo(line, 2));
					studentInfo.add(
							extractUserInfo(line, 0) + "," + extractUserInfo(line, 1) + "," + extractUserInfo(line, 2));
				}
				printCsv(studentInfo);
			}
			// ATTEMPT AT SEARCH FUNCTION COULD NOT GET TO WORK
			// else if (answer.equals("7")) {

			// }

			else if (answer.equals("8")) {

			} else {
				System.out.println("Please select and option between 1 and 5");
				newScanner.nextLine();
				clearScreen();
			}

		} while (!answer.equals("8"));
	}

	// Method that prints out the extracted file.
	public static void printCsv(ArrayList<String> data) {
		for (String userData : data) {
			System.out.println("Student Name" + "," + "Acidemic Year" + "," + "Student GPA");
			System.out.println(userData);
		}
	}

	// Method that extracts the data from the csv file that's stored in the array.
	public static String extractUserInfo(String row, int position) {
		String[] placeHolder = row.split(",");
		return placeHolder[position];
	}

	// Method that reads in the csv file.
	public static ArrayList<String> readCsv(File newFilePath) {
		// File dataFile = new File(newFilePath);
		String row = "";
		ArrayList<String> newArray = new ArrayList<String>();
		try {
			Scanner myScanner = new Scanner(newFilePath);
			while (myScanner.hasNextLine()) {
				row = myScanner.nextLine();
				newArray.add(row);
			}
			myScanner.close();
		} catch (Exception myEx) {
			System.out.println("error");
		}
		return newArray;

	}

	// Method to clear the screen.
	public static void clearScreen() {
		System.out.print("");
		System.out.flush();
	}

	// Method for the file path.
	public static String newFilePath(Scanner reader) {
		// Variable deceleration.
		String custom = "n";
		String ownPath = "";
		// Asks the user if they want to created there own file or use the default file.
		System.out.print("Enter a file path(Y/N)");
		// Stores the user response in the variable custom.
		custom = reader.nextLine();
		// Converts the user input to lower case.
		custom = custom.toLowerCase();
		switch (custom) {
		case "y":
			// If the user selects "Y" prompts user to enter the file path.
			System.out.println("Enter a file path");
			ownPath = reader.nextLine();
			break;
		// Default file.
		default:
			ownPath = "UserDatabase.csv";

		}
		// Returns the file and its path.
		return ownPath;
	}

	// Method that writes user information to the file
	public static void printToFile(String studentName, String gradeYear, double gpa, File newFile) {
		// Variable deceleration.
		String pupilGpaString = String.valueOf((gpa));
		// Attempt to write the user input to the file.
		try {
			// Creates the file writer.
			FileWriter newFileWriter = new FileWriter(newFile, true);
			// Tests to see if the file was created.
			if (newFile.createNewFile()) {
				System.out.println("\nFile has been created.");
			} else {
				System.out.println("\nThe file has already been created.");
			}
			// Writes the information to the new file.
			// This will overwrite the old file.
			newFileWriter.write(studentName + "," + gradeYear + "," + pupilGpaString + "\n");
			// Closes the file writer.
			newFileWriter.close();
		}
		// checks for any errors.
		catch (IOException e) {
			System.out.println("An error has occurred");
			e.printStackTrace();
		}
	}

	// Method to check for any missing information.
	public static int absentData(String studentName, String studentYear, double studentGpa) {
		// Array that is used to check if all questions were answered.
		String[] questionsAsked = { "The students name ", "The students year in school ", "The students GPA " };
		// Variable deceleration.
		int missingQuestions = 0;
		// Check to see if each questions has a response.
		if (studentName.isEmpty()) {
			System.out.println("You left " + questionsAsked[0] + " empty");
			missingQuestions++;
		}
		if (studentYear.isEmpty()) {
			System.out.println("You left " + questionsAsked[1] + " empty");
			missingQuestions++;
		}
		if (studentGpa < 0) {
			System.out.println("You left " + questionsAsked[2] + " empty");
			missingQuestions++;
		}
		return missingQuestions;

	}

	// Method that checks to see if the academic year and the GPA are valid.
	public static int accpRecord(String studentYear, double studentGpa) {
		// Array to hold the acceptable academic year.
		ArrayList<String> accpArray = new ArrayList<String>();

		// Adds the accepted entries to the array.
		accpArray.add("freshman");
		accpArray.add("sophomore");
		accpArray.add("junior");
		accpArray.add("senior");
		// Variable that hold the accepted GPA range.
		double lowGpa = 0.0;
		double highGpa = 4.0;

		// Checks to see if the academic year and GPA are acceptable entries.
		// and displays the appropriate response to the user.
		if (!accpArray.contains(studentYear) && (studentGpa < lowGpa || studentGpa > highGpa)) {
			System.out.println(
					"The accidemic year entered is not accptable. The students GPA is outside the accpted scale.");
			return 1;
		} else if (!accpArray.contains(studentYear)) {
			System.out.println("The accidemic year entered is not accptable.");
			return 1;
		} else if (studentGpa < lowGpa || studentGpa > highGpa) {
			System.out.println("The studnets GPA is outside the acppted scale.");
			return 1;
		}
		return 0;
	}

	// Main menu that the user see.
	private static void mainMenu() {
		System.out.println("\n1. Please enter the students name: ");
		System.out.println("2. Please enter the students year in school: ");
		System.out.println("3. Please enter the students current GPA: ");
		System.out.println("4. Show students information: ");
		System.out.println("5. Write information to the file: ");
		System.out.println("6. Read the information in the file: ");
		// System.out.println("7. Search for a student : ");
		System.out.println("8. Exit the program: \n");

	}
}
