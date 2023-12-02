//********************************************************************
//
//  Author:       Brittany Sifford
//
//  Program #:     Program2
//
//  File Name:     Program2.java
//
//  Course:        ITSE 2321 Object-Oriented Programming
//
//  Due Date:      09/12/2023
//
//  Instructor:    Prof. Fred Kumi 
//
//  Chapter:       2
//
//  Description:    designed to calculate and display the annual property tax 
//                  for a piece of property based on user input for the property's actual value
//                  and the tax rate per $100.00 of assessed value
//
//********************************************************************

import java.util.Scanner;

public class Program2 {
    // ***************************************************************
    //
    // Method: main
    //
    // Description: 
    //
    //
    // Parameters: String array
    //
    // Returns: N/A
    //
    // **************************************************************
    public static void main(String[] args) {
        developerInfo();

        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in); //Specify where we are reading data from

        // Prompt the user for the actual value of the property
        System.out.print("Enter the Property Value: $");
        double propertyValue = scanner.nextDouble();

        // Prompt the user for the tax rate for each $100.00 of assessed value
        System.out.print("Enter the Tax Rate (per $100.00 of assessed value): $");
        double taxRate = scanner.nextDouble();

        //Calculate the assessed value of the property
        double assessedValue = propertyValue * .6;

        //Calculate the property tax
        double propertyTax = (assessedValue / 100) * taxRate;


        System.out.printf("The Actual Value is: $%6.2f%n", propertyValue);
        System.out.printf("The Assessed Value is: $%6.2f%n", assessedValue);
        System.out.printf("The Tax Rate is: $%6.2f%n", taxRate);
        System.out.printf("The Property Tax is: $%6.2f%n", propertyTax);

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
        System.out.println("Program: Two \n");

    } // End of the developerInfo method
}