//***************************************************************************************
//	Numbers.java 		CPSC21000-Lab4-Exercise 4		Eugene Henneberry 11/12/2020
//
// 
//***************************************************************************************

public class Numbers{
	
	// The method that accepts the arry 
	public static void nextLargest(int array[]) {
		// Setting and initializing variables
		int max;
		// Loop that looks threw the array
		for (int i = 0; i < array.length; i ++){
			max = Integer.MAX_VALUE;
			for (int j = 0; j < array.length; j++){
				if (array[j] > array[i] && array[j] < max) {
					max = array[j];
				}
			}
			// Prints the output
			System.out.println(array[i] + " : " + max + " ");
		}
	}
	
	public static void main(String[] args) {
		// Sample array to test the program.
		int array[] = {78,22,56,99,12,14,17,15,1,144,37,23,47,88,3,19};
		nextLargest(array);
	}
}