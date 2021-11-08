package ACMEBikes;

    //Class is abstract so that it can store an abstract method

    abstract class SalesEmployee {

        private String firstName;
        private String lastName;
        private static int bikeEmployeeNumber = 0;
        private String ppsNumber;
        protected double sales;
        protected double commission;
        private int employeeNumber;
        
        SalesEmployee() {
            this.firstName = "UNDEFINED";
            this.lastName = "UNDEFINED";
            this.ppsNumber = "UNDEFINED";
            this.employeeNumber = ++SalesEmployee.bikeEmployeeNumber;
        }

        SalesEmployee(String firstName, String lastName, String ppsNumber) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.ppsNumber = ppsNumber;
            this.employeeNumber = ++SalesEmployee.bikeEmployeeNumber;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public void setPpsNumber(String ppsNumber) {
            this.ppsNumber = ppsNumber;
        }

        public String getFirstName() {
            return this.firstName;
        }

        public String getLastName() {
            return this.lastName;
        }

        public String getPpsNumber() {
            return this.ppsNumber;
        }

        @Override
        public String toString() {
            return " First Name: " + firstName + " Last Name: " + lastName + " PPS Number: " + ppsNumber + " Employee Number: " + employeeNumber + " Sales: " + sales + " Commission: " + commission;
        }

        abstract public void calculateCommission();

    }

    class SalesAgent extends SalesEmployee {
        
        SalesAgent() {
            this.setFirstName("UNDECLARED");
            this.setLastName("UNDECLARED");
            this.setPpsNumber("UNDECLARED");
        }

        SalesAgent(String firstName, String lastName, String ppsNumber) {
            this.setFirstName(firstName);
            this.setLastName(lastName);
            this.setPpsNumber(ppsNumber);
        }

        public void calculateCommission() {
            this.commission = this.sales * 0.10;
        }

    }

    class SalesPerson extends SalesEmployee {
    
        SalesPerson() {
            this.setFirstName("UNDECLARED");
            this.setLastName("UNDECLARED");
            this.setPpsNumber("UNDECLARED");
        }

        SalesPerson(String firstName, String lastName, String ppsNumber) {
            this.setFirstName(firstName);
            this.setLastName(lastName);
            this.setPpsNumber(ppsNumber);
        }

        public void calculateCommission() {
            this.commission = this.sales * 0.15;
        }
        
    }


