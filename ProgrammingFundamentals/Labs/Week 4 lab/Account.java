//***************************************************************************************
//	Accounts.java 		CPSC21000-Lab4-Exercise 2		Eugene Henneberry 11/12/2020
//
// 
//***************************************************************************************

public class Account {

	// Setting a static variable for the program
	static int numAccounts = 0;
	
	Account(){
		// The variable will be incremented each time an account is created.
		numAccounts = numAccounts +1;
	}
	
	public static int getNumAccounts() {
		// Getting the number of accounts
		return numAccounts;
		
	}
	public static void main(String[] args) {
		// Accounts to test the program.
		Account NewAccount1 = new Account();
		Account NewAccount2 = new Account();
		Account NewAccount3 = new Account();
		
		// Printing out the number of accounts
		System.out.println("Number of account = " +getNumAccounts());	
	}
	
}
