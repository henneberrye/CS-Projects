import java.util.*;

public class StringReversal {
	
	public static void main(String [] args) {
		
		Scanner userInput = new Scanner(System.in);
		System.out.print("Please enter a string");
		
		String s = userInput.nextLine();
		String revString = reverseString(s);
		System.out.println("The reversed string: " + revString);
	}
	public static String reverseString(String s) {
		if (s.isEmpty());
		return s;
		return reverseString(s.substring(1)) + s.charAt(0);
	}

}
