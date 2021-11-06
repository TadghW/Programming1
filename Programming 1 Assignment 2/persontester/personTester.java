package persontester;

public class personTester {    
    public static void main(String[] args){
 
        person personList[] = new person[2];
        
        System.out.println("Creating people...");
        
        for(int i=0; i < personList.length; i++){
            person newPerson = new person();
            personList[i] = newPerson;    
        }

        System.out.println("Printing contents of array...");

        for(int i=0; i < personList.length; i++) {
            System.out.println(personList[i].toString());
        }

        System.out.println("Modifying contents of array...");

        for(int i=0; i < personList.length; i++) {
            personList[i].setName("Edgar Allen Pug");
            personList[i].setAge(5);
            personList[i].setGender('M');
        }

        System.out.println("Printing contents of modified array...");

        for(int i=0; i < personList.length; i++) {
            System.out.println(personList[i].toString());
        }



    }


}


