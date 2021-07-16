//***************************************************************************************
//	Box.java 		CPSC21000-Lab2-Exercise 4		Eugene Henneberry 11/12/2020
//
// This prints out * in box form
//***************************************************************************************

public class Box {

	// Creates and initializes the size instance variable.
	int size = 0;

	// Creates the printBox method
	public void printBox() {
		// Loop for the rows
		for (int rows = 0; rows < size; rows++) {
			// Loop for the columns
			for (int columns = 0; columns < size; columns++) {
				// Prints out the ampersand
				System.out.print("*");
			}
			// Prints out the next line
			System.out.println();
		}
	}
	
	// Main method
	public static void main(String[] args) {
		// Creates the object for the Box class.
		Box NewBox = new Box();
		// Changes the size of the box using the dot operator
		NewBox.size = 5;
		// Invokes the printBox method
		NewBox.printBox();
		
	}
}
