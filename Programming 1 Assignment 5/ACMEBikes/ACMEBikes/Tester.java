package ACMEBikes;

import java.util.ArrayList;
import java.util.Scanner;

class tester {

    public static void main(String[] args){


        //Initialise ArrayList
        ArrayList<SalesEmployee> sales = new ArrayList<SalesEmployee>();

        //Create SalesAgent objects
        SalesAgent marie = new SalesAgent("Marie", "Davis", "0000001");
        SalesAgent sam = new SalesAgent("Sam", "Williams", "0000002");
        SalesAgent kent = new SalesAgent("Kent", "Houseproud", "0000003");

        //Create SalesPerson objects
        SalesPerson charlie = new SalesPerson("Charlie", "Day", "0000004");
        SalesPerson elizabeth = new SalesPerson("Elizabeth", "McMillan", "0000005");
        SalesPerson michael = new SalesPerson("Michael", "Allen", "000006");

        //Store SalesAgent / SalesPerson objects in ArrayList
        sales.add(marie);
        sales.add(sam);
        sales.add(kent);
        sales.add(charlie);
        sales.add(elizabeth);
        sales.add(michael);

        //Print ArrayList pre-edit 
        System.out.println("------------------- ACMEBikes Sales Employees -------------------");
        for(SalesEmployee employee : sales){
            employee.toString();
        }

        //Request sales figures from the user
        Scanner sc = new Scanner(System.in);
        System.out.println("How much did each SalesEmployee sell this month?");
        
        //Store sales figures from the user per employee, use to calculate commission
        for(SalesEmployee employee : sales){
            System.out.println("Enter the the total value sold by " + employee.getFirstName() + " " + employee.getLastName() + " this month... ");
            double salesFigure = Double.parseDouble(sc.nextLine());
            employee.sales = salesFigure;
            employee.calculateCommission();
        }

        //Print employee name, pps number, sales value, and commission
        for(SalesEmployee employee : sales){
            System.out.println(employee.getFirstName() + " " + employee.getLastName() + " " + employee.getPpsNumber());
            System.out.println("Total sales: " + employee.sales + " Total commission: " + employee.commission);
        }

        //Close scanner
        sc.close();
    }

}