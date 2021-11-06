package studentclasstester;

public class student {
    
        //Student variables
        private String name;
        private long idNumber;
    
        //Default constructor values
        public student(){
            this.name = "DEFAULT DEFAULT";
            this.idNumber = 10000000l;
        }
    
        //Overloaded constructor with parameters for name and ID
        public student(String name, long idNumber) {
            this.name = name;
            this.idNumber = idNumber;
        }
        
        //Getter and setter methods for Student instance
        public String getName(){
            return name;
        }
    
        public long getNumber() {
            return idNumber;
        }
    
        public void setName(String name){
            this.name = name;
        } 
    
        public void setIDNumber(long idNumber) {
            this.idNumber = idNumber;
        }
    
        public String toString() {
            return this.name + this.idNumber;
        }
    }