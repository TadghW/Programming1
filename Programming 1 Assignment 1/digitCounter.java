//Import the scanner utility
import java.util.Scanner;

public class digitCounter {

    public static void main(String[] args) {
        
        //Describe the program function and exit mechanism to the user
        System.out.println("This program counts the number of digits in an integer entered by the user");
        System.out.println("Enter -1 to exit");

        //I created the boolean "isRunning" indicate whether the program should be running or not
        boolean isRunning = true;
        
        //If it should be running it runs the following logic
        while(isRunning) {

            //Create a new scanner instance
            Scanner sc1 = new Scanner(System.in);

            //Prompt the user for an input
            System.out.println("Enter a number");
            
            //Store user input as "number"
            int number = sc1.nextInt();

            //If the user has entered -1, close the scanner util and end the program
            if(number == -1) {
                System.out.println("Terminating Program...");
                sc1.close();
                isRunning = false;
            } else {
                
                //Convert the integer to a String that is the value of number
                String numberString = String.valueOf(number);

                //Clean the numberString (accounts for user inputting a negative number)
                numberString = numberString.replace("-", "");

                int noOfDigits = numberString.length();

                System.out.println("Number of digits in " + number + " is " + noOfDigits);
            }
        }

        //If "isRunning" is still true, the loop will continue and the user will be prompted to enter another number
    }
}