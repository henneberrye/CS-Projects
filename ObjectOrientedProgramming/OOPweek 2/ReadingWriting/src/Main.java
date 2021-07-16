

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //track user attempts
        int attempts = 0;
        //establish list of approved users
        String[] approvedUsers = {"John", "Joe", "Sara"};
        //a user variable to hold what user is attempting to log in
        String user;
        //continue variable for if our user is approved
        int contin = 0;
        //set variables for our division program
        int x = 0;
        int y = 0;
        double result = 0;
        //setup scanner to read user input
        Scanner myScanner = new Scanner(System.in);
        do {
            //ask for the user name
            System.out.print("Enter Username:");
            user = myScanner.next();
            //is the user authorized if so contain will be greater than 0
            contin = valid(approvedUsers, user);
            if (contin > 0) {
                //check to make sure user is entering an integer
                try {
                    //get x and y numbers
                    System.out.print("Enter a number for x: ");
                    x = myScanner.nextInt();
                    System.out.print("Enter a number for y: ");
                    y = myScanner.nextInt();
                    //divide x by y
                    result = x / y;
                    //force attempts to 3 to kick user out once program completes
                    attempts = 3;
                } catch (Exception ex) {
                    //handle if user enters something different than an integer
                    System.out.println("You need to enter an integer. Try again");
                    attempts = 0; //let's the valid user try again
                }
            } else {
                //inform the user they aren't authorized to log in
                System.out.println("You are not authorized");
                //myScanner.nextLine();
                //increment our attempts counter
                attempts++;
            }
            myScanner.nextLine();
        } while (attempts < 3); //give the user 3 attempts to log in

        if (result > 0) {
            //print out the result
            System.out.println("The result is: " + result);
        }

    }

    //validate our user
    public static int valid(String[] approvedUsers, String user) {
        int successful = 0;
        for (String s : approvedUsers) {
            if (s.equals(user)) {
                //if the user is valid welcome them
                System.out.println("Welcome " + user);
                successful++;
            } else {
                //otherwise set successful to 0 to kick unauthorized users out
                //successful=0;
            }
        }
        return successful;
    }

}