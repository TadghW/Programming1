package studentclasstester;
import java.util.Scanner;

public class tester {
    
        //Testing method
        public static void main(String[] args){

            //Introduction and list length input
            System.out.println("Welcome! Student class tester initialised...");
            System.out.println("How many students do you wish add?");           
            
            //I take the input as a new line and parse it into an int so that the scanner consumes the user's return key input
			Scanner sc = new Scanner(System.in);
            int x = Integer.parseInt(sc.nextLine());
            System.out.println("Creating a list with " + x + " spaces...");
            
            //Create an array of student objects called "studentList" to the specified length;
            student[] studentList = new student[x];

            for(int i=0; i < studentList.length; i++){
                
                //Request and store student name and ID
                System.out.println("Please enter the name of Student " + (i+1));
                String name = sc.nextLine() + " - ";
                System.out.println("Please enter the StudentID of Student " + (i+1));
                Long idNumber = Long.parseLong(sc.nextLine());
                
                //Create a new student object with the user's paramters
                student student = new student(name, idNumber);
                
                //Store that student in the studentList at the current counter number 
                studentList[i]=student;
                System.out.println("Student added!");
            }

            System.out.println("\nStudent list includes: \n");

            for(int i=0; i < studentList.length; i++){
                System.out.println(studentList[i]);
            }
            
            sc.close();
        } 
    }