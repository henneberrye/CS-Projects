//***************************************************************************************
//	AgeGuess.java 		CPSC21000-Lab2-Exercise 5A		Eugene Henneberry 11/5/2020
//
// 
//***************************************************************************************

public class FloatEqu {

	public static void main(String[] args) {

/// Initalizing double variables

		double Num_1 = (1.0 / 10) * (1.0 / 10);

		double Num_2 = (1.0 / 100);

/// If else if statement comparing the two variables	

		if (Num_1 == Num_2)

			System.out.println("EQUAL");

		else if (Math.abs(Num_1 - Num_2) < 0.000001)

			System.out.println("Approximately equal");
		else

			System.out.println("NOT EQUAL");

	}
}
