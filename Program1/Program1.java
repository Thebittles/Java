//********************************************************************
//
//  Author:        Brittany Sifford
//
//  Program #:     Program1
//
//  File Name:     Program1.java
//
//  Course:        ITSE 2321 Object-Oriented Programming
//
//  Due Date:      **********
//
//  Instructor:    Prof. Fred Kumi 
//
//  Chapter:       1
//
//  Description:   <An explanation of what the program is designed to do>
//
//********************************************************************

public class Program1
{
    //***************************************************************
    //
    //  Method:       main
    // 
    //  Description:  This program determines the total cost of a meal with a tax rate of 8.25% and 
    // tip amount of 15%  on a restaurant bill with a meal charge of $4
    //
    //  Parameters:   String array
    //
    //  Returns:      N/A 
    //
    //**************************************************************
	public static void main(String[] args)
    {
       // Declare more variables here
	   double amount = 44.50; // Meal charge
       double taxRate = 0.0825;// Tax Rate 
       double tipPercent = 0.15; // Tip Percent
	   
       //Calculate tax and total cost
       double taxAmount = amount * taxRate;

       // Add taxAmount to the meal amount
       double subTotal = amount + taxAmount;

       // Calculate Tip 
       double tipAmount = subTotal * tipPercent;

       // Add the tip to the subTotal
       double totalAmount = subTotal + tipAmount;

       developerInfo();
    
       // Printing
       System.out.printf("Meal Cost:          %6.2f%n", amount);
       System.out.printf("Tax Amount(8.25%%):  %6.2f%n", taxAmount);
       System.out.printf("Sub Total:          %6.2f%n", subTotal);
       System.out.printf("Tip Amount(15%%):    %6.2f%n", tipAmount);
       System.out.printf("Total Amount:       %6.2f%n", totalAmount);

    } // End of the main method
	
	//***************************************************************
    //
    //  Method:       developerInfo
    // 
    //  Description:  The developer information method of the program
    //
    //  Parameters:   None
    //
    //  Returns:      N/A 
    //
    //**************************************************************
    public static void developerInfo()
    {
       System.out.println("Name:    Brittany Sifford");
       System.out.println("Course:  ITSE 2321 Object-Oriented Programming");
       System.out.println("Program: One \n");

    } // End of the developerInfo method
}