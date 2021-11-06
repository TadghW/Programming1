import java.util.Scanner;

class rainfall {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        float[] monthlyRainfall = new float[12];
        float rainfallTotal = 0;

        for(int i = 0; i < monthlyRainfall.length; i++){
        
            System.out.println("Enter rainfall in cm for month " + (i + 1));
            float thisMonthRainfall = Float.parseFloat(sc.nextLine());
            monthlyRainfall[i] = thisMonthRainfall;
        
        }

        for(int i = 0; i < monthlyRainfall.length; i++){ 
        rainfallTotal = rainfallTotal + monthlyRainfall[i];
        }

        float averageRainfall = rainfallTotal / monthlyRainfall.length;

        System.out.println("Annual Average Rainfall = " + averageRainfall + " cm.");

        sc.close();

    }
}