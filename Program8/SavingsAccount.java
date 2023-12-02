
//********************************************************************
//
//  Author:       Brittany Sifford
//
//  Program #:     Program8
//
//  File Name:     SavingsAccount.java
//
//  Course:        ITSE 2321 Object-Oriented Programming
//
//  Due Date:      NOV 21, 2023
//
//  Instructor:    Prof. Fred Kumi 
//
//  Chapter:       Chapters 1-8
//
//  Description:   SavingsAccount class models a savings account. Features methods for initializing, calculating monthly interest, depositing, withdrawing, modifying the annual interest rate, and obtaining a string representation of the account balance. The class ensures valid operations and allows for a universal adjustment of the annual interest rate.
//
//********************************************************************



public class SavingsAccount {
    static double annualInterestRate = 0;
    private double savingsBalance;


// ***************************************************************
//
// Constructor: SavingsAccount
//
// Description: Initializes a SavingsAccount object with the specified balance
//
// Parameters: double balance - The initial balance for the savings account
//
// Returns: N/A
//
// **************************************************************

    // Constructor
    public SavingsAccount(double balance) {
        savingsBalance = balance;
    }



// ***************************************************************
//
// Method: calculateMonthlyInterest
//
// Description: Calculates the monthly interest for the savings account
//
// Parameters: None
//
// Returns: N/A
//
// **************************************************************

    // Monthly interest calculation
    public void calculateMonthlyInterest() {
        //Calculate the monthlyInterest rate
        double monthlyInterest = (savingsBalance * annualInterestRate) / 12;
        //Increment the current saving balance with the monthlyInterest
        savingsBalance += monthlyInterest;
    }



//========================== SETTERS ===============================//

// ***************************************************************
//
// Method: depositAmount
//
// Description: Deposits money into the savings account
//
// Parameters: double amount - The amount to be deposited must be greater than 0
//
// Returns: N/A
//
// **************************************************************



    // Deposit money into the account
    public void depositAmount(double amount) {
        if (amount > 0) {
            savingsBalance += amount;
        } else {
            System.out.println("Invalid deposit amount. Amount must be positive.");

        }
    }


// ***************************************************************
//
// Method: withdrawAmount
//
// Description: Withdraws money from the savings account
//
// Parameters: double amount - The amount to be withdrawn, must be greater than 0 and not exceed the current balance
//
// Returns: N/A
//
// **************************************************************


    // Withdraw money from the account
    public void withdrawAmount(double amount) {
        if (amount > 0 && amount <= savingsBalance) {
            savingsBalance -= amount;
        } else {
            System.out.println("Invalid withdrawal amount or insufficient funds.");
        }
    }


// ***************************************************************
//
// Method: modifyInterestRate
//
// Description: Modifies the annual interest rate for all instances of savings account class
//
// Parameters: double newRate - The new annual interest rate, must be between 2.0 and 5.0
//
// Returns: N/A
//
// **************************************************************

// Modify annual interest rate
public static void modifyInterestRate(double newRate) {
    if (newRate >= 2.0 && newRate <= 5.0) {
        annualInterestRate = newRate / 100.0; // Convert percentage to decimal
    } else {
        System.out.println("Invalid interest rate. Rate must be between 2 and 5.");
    }
}



//========================== GETTERS =======================================//


// ***************************************************************
//
// Method: toString
//
// Description: Gets the string representation of the SavingsAccount object
//
// Parameters: None
//
// Returns: String - The string representation of the savings account balance
//
// **************************************************************



    // Get string representation of SavingsAccount object
    public String toString() {
        return "Balance: $" + String.format("%.2f", savingsBalance);
    }


}



