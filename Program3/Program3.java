public class Program3 {
    // ***************************************************************
    //
    // Method: main
    //
    // Description: The main method of the program
    //
    // Parameters: String array
    //
    // Returns: N/A
    //
    // **************************************************************
    public static void main(String[] args) {
        developerInfo();

        //Create Employee instances
        Employee firstEmp = new Employee("John", "Doe", 2875.00);
        Employee secondEmp = new Employee("Jane", "Doe", 3150.75);

        // Display each employee's Monthly salary
        System.out.printf("%-10s %-10s %15s %n", "First Name", "Last Name", "Monthly Salary");
        // Display the information for the first employee
        System.out.printf("%-10s %-10s $%,12.2f%n", firstEmp.getFirstName(), firstEmp.getLastName(),
                firstEmp.getMonthlySalary());
        // Display the information for the second employee
        System.out.printf("%-10s %-10s $%,12.2f%n", secondEmp.getFirstName(), secondEmp.getLastName(),
                secondEmp.getMonthlySalary());

        System.out.println("\n");

        //Display Yearly Salary
        System.out.printf("%-10s %-10s %15s %n", "First Name", "Last Name", "Yearly Salary");
        // Display the information for the first employee
        System.out.printf("%-10s %-10s $%,12.2f%n", firstEmp.getFirstName(), firstEmp.getLastName(),
                (firstEmp.getMonthlySalary() * 12));
        // Display the information for the second employee
        System.out.printf("%-10s %-10s $%,12.2f%n", secondEmp.getFirstName(), secondEmp.getLastName(),
                (secondEmp.getMonthlySalary() * 12));


        // Give each employee a 20% raise using the setter setMonthlySalary method
        firstEmp.setMonthlySalary(firstEmp.getMonthlySalary() * 1.20);
        secondEmp.setMonthlySalary(secondEmp.getMonthlySalary() * 1.20);

        System.out.println("\nAfter a 20% raise:\n");

        // Display Yearly Salary again
        System.out.printf("%-10s %-10s %15s %n", "First Name", "Last Name", "Yearly Salary");
        // Display the updated information for the first employee
        System.out.printf("%-10s %-10s $%,12.2f%n", firstEmp.getFirstName(), firstEmp.getLastName(),
                (firstEmp.getMonthlySalary() * 12));
        // Display the updated information for the second employee
        System.out.printf("%-10s %-10s $%,12.2f%n", secondEmp.getFirstName(), secondEmp.getLastName(),
                (secondEmp.getMonthlySalary() * 12));




    } // End of the main method

    // ***************************************************************
    //
    // Method: developerInfo
    //
    // Description: The developer information method of the program
    //
    // Parameters: None
    //
    // Returns: N/A
    //
    // **************************************************************
    public static void developerInfo() {
        System.out.println("Name:    Brittany Sifford");
        System.out.println("Course:  ITSE 2321 Object-Oriented Programming");
        System.out.println("Program: Three \n");

    } // End of the developerInfo method
}