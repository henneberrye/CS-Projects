import java.util.*;

public class HenneberryReadingWriting02 {

    public static void main(String[] args) {

        // variables
        Scanner myScanner = new Scanner(System.in);
        String studentName = "";
        String newYear = "";
        String userSelection = "";
        double newGPA = 1;
        Student newStudent = new Student(studentName, newYear, newGPA);

        do {
            //Calls the mainMenu method to display mainMenu.
            mainMenu();
            //Asks the user to make a selection
            System.out.print("Please make a selection ");
            userSelection = myScanner.next();
            // Loop for taking in user student information.
            // Asks for the students name and stores it in the student class
            if (userSelection.equals("1")) {
                System.out.print("Please enter the students name: ");
                studentName = myScanner.next();
                newStudent.setName(studentName);
                // Asks for the students academic year and stores it.
            } else if (userSelection.equals("2")) {
                System.out.print("Please enter the students academic year: ");
                newYear = myScanner.next();
                newStudent.setYear(newYear);
                // Asks for the students GPA and stores it.
            } else if (userSelection.equals("3")) {
                System.out.print("Please enter the students GPA: ");
                newGPA = myScanner.nextDouble();
                newStudent.setGPA(newGPA);
                System.out.println("Press enter to clear the screen. ");
                clearScreen();
                // Prints out the student information.
            } else if (userSelection.equals("4")) {
                System.out.println("The Students name is: " + newStudent.getName());
                System.out.println("The Students Academic Year is: " + newStudent.getYear());
                System.out.println("The Students GPA is: " + newStudent.getgpa());
                System.out.println("Press enter to clear the screen. ");
                clearScreen();
                // Exits the program.
            } else if (userSelection.equals("5")) {
                System.out.print("Exit");
                System.exit(0);
            }

        } while (!userSelection.equals("5"));
        myScanner.close();
    }

    // Method to create the main menu.
    public static void mainMenu() {
        // Main menu
        System.out.println("\n" + "1. Enter The Students Name: ");
        System.out.println("2. Enter The Students Academic Year: ");
        System.out.println("3. Enter the Students GPA: ");
        System.out.println("4. Display The Students Info: ");
        System.out.println("5. Exit" + "\n");
    }

    // Method to clear the screen.
    public static void clearScreen() {
        try {
            final String os = System.getProperty("os.name");
            if (os.startsWith("Windows")) {
                Runtime.getRuntime().exec("cls");
            } else {
                Runtime.getRuntime().exec("clear");
            }
        } catch (final Exception e) {

        }

    }
}
