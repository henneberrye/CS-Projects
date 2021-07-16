package AdditionalExamples;

public class Driver {

	public static void main(String[] args) {
		//Creates new instance of ArrayStack
		ArrayStack arrStack = new ArrayStack();
		// Create array for numbers to be putshed and poped
		int[] dataArray = {1,7,3,4,9,2};

		//Displays what is being pushed into the stack
		System.out.println("Lab 1 - ArrayStack");
		System.out.println("Pushing 1,7.3,4,9,2 into the stack");

		//Loop that pushes the integers into the stack
		for(int i = 0; i < dataArray.length; i++) {
			arrStack.push(dataArray[i]);
			System.out.println("\nNumbers in the stack " + arrStack.size());
		}
		System.out.println("Total numbers in the stack " + arrStack.size());

		//Loop that pops the top number off the stack
		for (int i = 0; i < dataArray.length; i++) {
			System.out.println("\nTop number being removed from the stack " + arrStack.pop());
			System.out.println("Numbers lef in the stack " + arrStack.size());
		}
		System.out.println("The stack is now " + arrStack.size());

		//Creates new instance of the LinkedStack
		LinkedStack linkStack = new LinkedStack();

		// Displays what is being pushed into the stack
		System.out.println("\nLab 1 - LinkedStack");
		System.out.println("Pushing numbers into the stack");

		//Loop that pushes numbers into the stack
		for(int i = 0; i < dataArray.length; i++) {
			linkStack.push(dataArray[i]);
			System.out.println("\nNumbers in the stack " + linkStack.toString());
		}

		//Loop that pops the top number off the stack
		for (int i = 0; i < dataArray.length; i ++) {
			System.out.println("\nNumbers left in the stack " + linkStack.toString());
			System.out.println("\nTop number being removed from the stack " + linkStack.pop());
		}
		System.out.println("The stack is now " + linkStack.size());
