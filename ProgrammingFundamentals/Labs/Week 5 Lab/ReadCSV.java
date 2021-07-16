import java.io.*;
import java.util.*;
public class ReadCSV {

	public static void main(String[] args) {
		try {
			Scanner userInput = new Scanner(new FileInputStream("input.csv"));
			String[] newString;
			int max, num;
			String line;
			int row = 1;
			while (userInput.hasNextLine()) {
				line = userInput.nextLine();
				newString = line.trim().split(",");
				max =Integer.parseInt(newString[0]);
				for(int i = 0; i < newString.length; i++) {
					num = Integer.parseInt(newString[i]);
					if ( num > max) {
						max = num;
					}
				}
				System.out.println("ROW " + row + ": " + max);
				row++;
			}
			userInput.close();
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		
		}
	}

}
