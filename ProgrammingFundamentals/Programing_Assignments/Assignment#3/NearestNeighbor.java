
/*Eugene Henneberry
Programming Fundamentals-FA20-CPSC-21000-LT1
November 22, 2020
Programming Assignment #3: NearestNeighbor
 */
import java.io.*;
import java.util.*;

public class NearestNeighbor {
	// Setting and initializing data arrays
	static double[][] testVal = new double[75][4];
	static double[][] trainingVal = new double[75][4];

	// Setting and initializing distance arrays
	static double[] distance = new double[75];
	static double shortDist = 0;

	// Setting and initializing the accuracy variable
	static double accuracy = 0;

	// Setting and initializing the flower type arrays
	static String[] testFlowerType = new String[75];
	static String[] trainingFlowerType = new String[75];
	static String[] closestFlowType = new String[75];

	// Close scanner
	
	// Main method
	public static void main(String[] args) throws FileNotFoundException {
		// Heading
		System.out.println("Programming Fundamentals");
		System.out.println("Name: Eugene Henneberry");
		System.out.println("PROGRAMMING ASSIGNMENT 3\n");

		// Searching and analyzing the data
		trainDataSearch();
		testDataSearch();
		nearestFlowerSearch();

		// Print out the results
		printResults();

	}

	// Searching the training data.
	static double[][] trainDataSearch() throws FileNotFoundException {
		// Setting local variables and creating scanner
		String trainFile;
		Scanner userInput = new Scanner(System.in);
		System.out.print("Enter the name of the training file: ");
		trainFile = userInput.nextLine();
		File training = new File(trainFile);
		Scanner trainingData = new Scanner(training);
		int row = 0;

		while (trainingData.hasNext()) {
			String lineNum = trainingData.nextLine();
			String[] lineNumParts = lineNum.split(",");

			// Getting the flower petal and sepal data.
			for (int colum = 0; colum < 4; colum++) {
				trainingVal[row][colum] = Double.parseDouble(lineNumParts[colum]);
			}
			// Locate the flower name.
			trainingFlowerType[row] = lineNumParts[4];
			row++;
		}
		// Closes the scanner.
		trainingData.close();

		// Returns the training values
		return trainingVal;

	}

	// Searching the testing data.
	static double[][] testDataSearch() throws FileNotFoundException {
		// Setting local variables and creating scanner
		String testFile;
		Scanner userInput = new Scanner(System.in);
		System.out.print("Enter the name of the testing file: ");
		testFile = userInput.nextLine();
		File test = new File(testFile);
		Scanner testData = new Scanner(test);
		int row = 0;

		while (testData.hasNext()) {
			String lineNum = testData.nextLine();
			String[] lineNumParts = lineNum.split(",");

			// Getting the flower petal and sepal data.
			for (int colum = 0; colum < 4; colum++) {
				testVal[row][colum] = Double.parseDouble(lineNumParts[colum]);
			}
			// Locate the flower name.
			testFlowerType[row] = lineNumParts[4];
			row++;
		}
		// Closing the scanners
		testData.close();

		// Returns test data.
		return testVal;

	}

	// Finding the nearest data point.
	static String[] nearestFlowerSearch() {
		// Setting local variable
		int rowShort = 0;

		for (int rowTraining = 0; rowTraining < 75; rowTraining++) {
			for (int rowTesting = 0; rowTesting < 75; rowTesting++) {
				// Calculating the distance
				double sepalLenDiff = testVal[rowTesting][0] - trainingVal[rowTraining][0];
				double sepalWidDiff = testVal[rowTesting][1] - trainingVal[rowTraining][1];
				double petalLenDiff = testVal[rowTesting][2] - trainingVal[rowTraining][2];
				double petalWidDiff = testVal[rowTesting][3] - trainingVal[rowTraining][3];

				double discriminant = Math.pow(sepalLenDiff, 2) + Math.pow(sepalWidDiff, 2) + Math.pow(petalLenDiff, 2)
						+ Math.pow(petalWidDiff, 2);
				distance[rowTraining] = Math.sqrt(discriminant);

				// If the distance is less than the shortest distance make it the shortest
				if (rowTesting == 0 || distance[rowTraining] < shortDist) {
					rowShort = rowTesting;
					shortDist = distance[rowTraining];
				}
			}

			// Setting the closest data point equal to the closest training data point
			closestFlowType[rowTraining] = testFlowerType[rowShort];
		}

		// Returns the closest flower type
		return closestFlowType;
	}

	// Testing the accuracy of the test data
	static double predicAcc() {
		// Setting local variables
		int correctMatch = 0;
		for (int row = 0; row < 75; row++) {
			switch (closestFlowType[row]) {
			// The case when the closest flower type is Iris-setosa.
			case "Iris-setosa":
				// When the closest flower type and the training flower type match
				if (closestFlowType[row].equals(trainingFlowerType[row])) {
					correctMatch++;
				}
				break;
			// The case when the closest flower type is Iris-versicolor.
			case "Iris-versicolor":
				// When the closest flower type and the training flower type match
				if (closestFlowType[row].equals(trainingFlowerType[row])) {
					correctMatch++;
				}
				break;

			// The case when the closest flower type is Iris-virginica
			case "Iris-virginica":
				// When the closest flower type and the training flower type match
				if (closestFlowType[row].equals(trainingFlowerType[row])) {
					correctMatch++;
				}
				break;
			}
		}
		// Returning the accuracy
		accuracy = (double) correctMatch / 75.0;
		return accuracy;
	}

	// Printing the results
	static void printResults() {
		// Column labels
		System.out.println("\nEX#: TRUE LABEL, PREDICTED LABEL");

		// Printing the data results, true lable and predicted label
		for (int row = 0; row < 75; row++) {
			// Printing the trial number
			System.out.print(row + 1 + ": ");

			// Print the flower names
			System.out.print(trainingFlowerType[row] + " ");
			System.out.print(closestFlowType[row] + "\n");
		}

		// Printing out the accuracy of this test
		predicAcc();
		System.out.println("ACCURACY: " + accuracy + "\n");
	}
}
