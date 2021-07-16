import java.util.*;

public class DivisorCalc {
	
	public static void main(String[]args) {
		
		// Variable declaration.
		int num1, num2;
		
		// Scanner to collect user input.
		Scanner userInput = new Scanner(System.in);
		System.out.print("Enter the first number ");
		num1 = userInput.nextInt();
		System.out.print("Enter the second number ");
		num2 = userInput.nextInt();
		
		// Calls the method by passing userInput as an argument.
		int greatestComDiv = gcd(num1, num2);
		
		// Displaying the GCD of two numbers;
		System.out.println("The GCD of " +num1 + " and  " + num2 + " is: " + greatestComDiv);
		
	}
	// Static method to calculate the GDC of two numbers using recursion
	private static int gcd(int num1, int num2) {
		if (num1 % num2 == 0) {
			return num2;
		}
		return gcd(num2, num1 % num2);
	}

}
