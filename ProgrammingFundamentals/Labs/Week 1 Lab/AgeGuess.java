// Exercise 2
import java.util.Scanner;
public class AgeGuess {
  public static void main (String [] args){

  /// Initializing Variables
  int ageGuess;
  String Name;

  /// Ccreating Scanner object for user input
  Scanner keyboard = new Scanner(System.in);

  /// Ccreating user input statment
  System.out.print("Enter your name");
  Name = keyboard.nextLine();
  System.out.print("Enter your age");
  ageGuess = keyboard.nextInt();
  System.out.println("Name is"+Name);
  System.out.println("Age is " +ageGuess);

  }

}
