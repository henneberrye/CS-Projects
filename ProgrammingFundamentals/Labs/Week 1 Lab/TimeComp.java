// Exercise 3

import java.util.Scanner;

public class TimeComp {
  public static void main(String[] args) {

    // Creating Scanner object for user input
    Scanner in = new Scanner(System.in);

    // Initializing constants
    int secondsHours = 3600;
    int secondsMinute = 60;

    // Print Statement for user input
    System.out.print("Enter the amount of time in seconds: ");

    // Reading user input
    int secondsInput = in.nextInt();

    // Initializing the hours variable to the amount the user entered divided by the constant
    // secondHours
    int hours = secondsInput / secondsHours;

    // Intializing the minutes variable to the amount the user entered modified by the secondsHours
    // constant which is all divided by the SecondMinute constant.
    int minutes = (secondsInput % secondsHours) / secondsMinute;

    // Initializing the seconds variable to the amount the user enterd oded by the secondsinute
    // constant.
    int seconds = secondsInput % secondsMinute;

    // Printing and empty line to create speperation between user input and output
    System.out.println();
    System.out.print(
        "Total time formatted as HH:MM:SS is: " + hours + ":" + minutes + ":" + seconds);
  }
}
