import java.util.Scanner;

public class temperatureConverter {
    
    static double celsiusToFahrenheit(float celsius){
        return 9.0/5.0 * celsius + 32; 
    }

    static double fahrenheitToCelsius(float fahrenheit){
        return 5.0/9.0*(fahrenheit - 32);
    }
    public static void main (String[] args) {

        boolean isRunning = true;
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the fahrenheit to celcius conversion tool");

        while(isRunning){

            System.out.println("Available functions:");
            System.out.println("1. - Convert celcius to fahrhenheit \n2. - Convert fahrhenheit to celcius \n3. - Exit");
            System.out.println("Please select a function to continue");
            
            switch(sc.nextLine()) {
                case "1":
                    System.out.println("Enter celcius value:");
                    float celciusValue = Float.parseFloat(sc.nextLine());
                    System.out.println(celciusValue + " celcius is equal to " + celsiusToFahrenheit(celciusValue) + " fahrhenheit");
                    break;
                case "2":
                    System.out.println("Enter fahrenheit value:");
                    float fahrenheitValue = Float.parseFloat(sc.nextLine());
                    System.out.println(fahrenheitValue + " fahrhenheit is equal to "+ fahrenheitToCelsius(fahrenheitValue) + "celcius");
                    break;
                case "3":
                    System.out.println("Exiting program...");
                    isRunning = false;
                    break;
                default: 
                    System.out.println("Invalid input - please input 1, 2, or 3");
                    break;
                }
        }

        sc.close();
        
    }
}