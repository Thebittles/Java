



public class Employee {
//***************************************************************
//
//  Method:       Employee
// 
//  Description:  Class Constructor
//
//  Parameters:   String, String, double
//
//  Returns:      N/A 
//
//**************************************************************

    //Class Attributes
    private String firstName;
    private String lastName;
    private double monthlySalary;

        //Constructor
        public Employee(String firstName, String lastName, double monthlySalary){
            //Set the firstname 
            this.firstName = firstName;
            //Set the lastname
            this.lastName = lastName;

            //Check to see if the salary is positive
            if(monthlySalary >= 0){
                this.monthlySalary = monthlySalary;
            }

        }

        //Setters
        public void setFirstName(String firstName){
            this.firstName = firstName;
        }

        public void setLastName(String lastName){
            this.lastName = lastName;
        }

        public void setMonthlySalary(double monthlySalary){
            if(monthlySalary >= 0){
                this.monthlySalary = monthlySalary;
            }
        }

        //Getters
        public String getFirstName(){
            return firstName;
        }

        public String getLastName(){
            return lastName;
        }

        public double getMonthlySalary(){
            return monthlySalary;
        }

}
