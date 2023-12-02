
//********************************************************************
//
//  Author:       Brittany Sifford
//
//  Program #:     Program8
//
//  File Name:     Program8.java
//
//  Course:        ITSE 2321 Object-Oriented Programming
//
//  Due Date:      NOV 21, 2023
//
//  Instructor:    Prof. Fred Kumi 
//
//  Chapter:       Chapters 1-8
//
//  Description:  Program8 creates and tests a SavingsAccount class, simulating a savings account with methods for monthly interest, deposits, withdrawals, interest rate modification, and obtaining a string representation. The main method initializes two accounts, performs operations, and prints balances over 12 months.
//
//********************************************************************

public class Program8 {
 
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

   
         // Instantiate two objects
         SavingsAccount saver1 = new SavingsAccount(2000.00);
         SavingsAccount saver2 = new SavingsAccount(3000.00);
 
         // Set annual interest rate to 4%
         SavingsAccount.modifyInterestRate(4.0);
        
         // Calculate and print monthly interest for 12 months
         for (int i = 1; i <= 12; i++) {
             saver1.calculateMonthlyInterest();
             saver2.calculateMonthlyInterest();
             System.out.println("Month " + i + ":\t Saver1 " + saver1.toString() + "\t Saver2 " + saver2.toString());
         }
 
         // Deposit $1500.00 to saver1's account 
         saver1.depositAmount(1500.00);
         // Withdraw $550.00 from saver2's account
         saver2.withdrawAmount(550.00);
 
         // Set annual interest rate to 5%
         SavingsAccount.modifyInterestRate(5.0);

         System.out.print("\n\n");
         System.out.println("Balance for next month after 5% interest");
 
         // Calculate and print next month's interest
         saver1.calculateMonthlyInterest();
         saver2.calculateMonthlyInterest();
         System.out.println("Next Month :\t Saver1 " + saver1.toString() + "\t Saver2 " + saver2.toString());

    
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
      System.out.println("Program: Eight \n");

  } // End of the developerInfo method


}
