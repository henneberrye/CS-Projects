//***************************************************************************************
//	DistCalc.java 		CPSC21000-Lab2-Exercise 2		Eugene Henneberry 11/5/2020
//
// This program measures the distance between (x,y) coordinates of two points
//***************************************************************************************

import java.util.Scanner;

import java.math.RoundingMode;
import java.text.DecimalFormat;

public class DistCalc {

	public static void main(String[] args) {

/// Creates keyboard input for X and Y coordinates.

		Scanner Keyboard = new Scanner(System.in);

/// Creates the variables for the coordinates.

		double x1, y1, x2, y2;

/// Receive user input for coordinate 1.

		System.out.println("Enter the coordinates for point1: ");

		x1 = Keyboard.nextDouble();

		y1 = Keyboard.nextDouble();

/// Receive user input for coordinate 2.

		System.out.println("Enter the coordinates for point 2: ");

		x2 = Keyboard.nextDouble();

		y2 = Keyboard.nextDouble();

/// Computes the distance between points 1 and 2.

		double distance = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));

/// Formats the calculate distance to three decimal places.
		DecimalFormat df = new DecimalFormat("#.###");

		df.setRoundingMode(RoundingMode.CEILING);

/// Prints the calculated distance to three decimal places.

		System.out.println("The distance between point 1 and point 2 is: " + df.format(distance));

	}

}
