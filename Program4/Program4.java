//********************************************************************
//
//  Author:       Brittany Sifford
//
//  Program #:     Program4
//
//  File Name:     Program4.java
//
//  Course:        ITSE 2321 Object-Oriented Programming
//
//  Due Date:      09/24/2023
//
//  Instructor:    Prof. Fred Kumi 
//
//  Chapter:       4
//
//  Description:   This program calculates a employees weekly gross pay, overtime pay, deductions, and net pay based on employee ID, hourly rate, and hours worked, with formatting to two decimal places
//
//********************************************************************

//Import the scanner
import java.util.Scanner;

public class Program4 {
 
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

public static void main(String[] args){
  //Call Method Developer Info
  developerInfo();

  // Create a Scanner object for user input
  Scanner scanner = new Scanner(System.in);


    // Input employee information
    System.out.print("ID Number: ");
    int employeeId = scanner.nextInt();

    //Input PayRate
    System.out.print("Pay Rate: $");
    double payRate = scanner.nextDouble();

    // Input TotalHours
    System.out.print("Hours worked: ");
    double totalHours = scanner.nextDouble();


    // Blank line for separation
    System.out.println();

    // Calculate regular hours and overtime hours
    double regularHours = Math.min(totalHours, 40); // Takes the lower of the two numbers if total is over 40 regHours is 40
    double overtimeHours = Math.max(totalHours - 40, 0);// If totalHours - 40 is neg we know person did not work 40 and will put ot hours as 0

    // Calculate regular pay
    double regularPay = regularHours * payRate;

    // Calculate overtime pay
    double overtimePay = overtimeHours * (payRate * 1.5);

    // Calculate gross pay
    double grossPay = regularPay + overtimePay;

    // Calculate income tax
    double incomeTax = (grossPay > 750.00) ? (0.1275 * grossPay) : 0;

    // Calculate deductions
    double deductions = incomeTax + 35.00;

    // Calculate net pay
    double netPay = grossPay - deductions;

    // Display the results
    System.out.println("Regular Hours: " + regularHours);
    System.out.println("Overtime Hours: " + overtimeHours);
    System.out.println("Total Hours: " + totalHours);
    System.out.printf("Regular Pay: $%.2f%n", regularPay);
    System.out.printf("Overtime Pay: $%.2f%n", overtimePay);
    System.out.printf("Gross Pay: $%.2f%n", grossPay);
    System.out.printf("Tax: $%.2f%n", incomeTax);
    System.out.printf("Deductions: $%.2f%n", deductions);
    System.out.printf("Net Pay: $%.2f%n", netPay);


    // Close the scanner
    scanner.close();




  } // End of main method



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
      System.out.println("Program: Four \n");

  } // End of the developerInfo method


}


