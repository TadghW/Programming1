package persontester;

public class person {

    private int age;
    private String name;
    private char gender;

    public person(){
        this.age = 0;
        this.name = "Unassigned";
        this.gender = 'U';
    }

    public person(String personName, int personAge, char personGender){
        this.name = personName;
        this.age = personAge;
        this.gender = personGender;
    }

    public int getAge(){
        return this.age;
    }

    public char getGender() {
        return this.gender;
    }

    public String getName() {
        return this.name;
    }

    public void setAge(int personAge) {
        this.age = personAge;
    }

    public void setGender(char personGender){
        this.gender = personGender;
    }

    public void setName(String personName){
        this.name = personName;
    }

    @Override
    public String toString() {
        return getName() + " " + getAge() + " " + getGender();
    }


}
