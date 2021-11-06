package contacttester;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

    class tester{

    public static void main(String args[]) {

        //create an ArrayList of contacts
        ArrayList<Contact> contacts = new ArrayList<Contact>();

        //add contacts
        contacts.add(new Contact("Tadgh", 1111));
        contacts.add(new Contact("Francesca", 2222));
        contacts.add(new Contact("Tarah", 3333));
        contacts.add(new Contact("Yingchun", 4444));

        //create an ArrayList listIterator for contacts
        ListIterator<Contact> iterator = contacts.listIterator(); 

        //using a while loop to cycle through contents of array
        System.out.println("ArrayList printed forward");
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        //iterate through ArrayList in reverse
        System.out.println("ArrayList printed backwards");
        while(iterator.hasPrevious()){
            System.out.println(iterator.previous());
        }

        /*ALTERNATE SOLUTION

        //create a reverse ArrayList listIterator for contacts
        ListIterator<Contact> reverseIterator = contacts.listIterator(contacts.size()); 
        
        //iterate through ArrayList in reverse
        System.out.println("ArrayList printed backwards");
        while(reverseIterator.hasPrevious()){
            System.out.println(reverseIterator.previous());
        }

        */


        //print size of ArrayList
        System.out.println(contacts.size());

        //Store user input to check against the names of other contacts
        Scanner sc = new Scanner(System.in);
        System.out.println("Which contact would you like to delete?");
        String searchName = sc.nextLine();

        //Initialising variable to store the index of a potential match
        int iterIndex = -1;

        //Enhanced for loop to search for match
        for(Contact currentContact : contacts) {

            System.out.print("Name: " + iterator.next());

            //If you find a match, store the index of that match
            if(currentContact.getName().equals(searchName)){
                System.out.println(" - Match!");
                System.out.println("Contact no: " + (contacts.indexOf(currentContact) + 4));
                iterIndex = contacts.indexOf(currentContact);
            } else {
                System.out.println(" - No match");
            }       
        }

        //if a match has been found (signified by stored index) remove the object at that index
        if(iterIndex > -1) {
            System.out.println("Contact number " + (iterIndex + 1) + " removed.");
            contacts.remove(iterIndex);
        }


        //print the contact list
        for(Contact currentContact : contacts) {

            System.out.println(currentContact);
        
        }

        sc.close();
    }
}