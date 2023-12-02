//********************************************************************
//
//  Author:        Brittany Sifford
//
//  Program #:     Seven
//
//  File Name:     Program7.java
//
//  Course:        ITSE 2321 Object-Oriented Programming
//
//  Due Date:      10/27/2023
//
//  Instructor:    Prof. Fred Kumi 
//
//  Chapter:       Chapters 2-6 & 15 
//
//  Description:   This program reads data from a file calculates and displays faculty pay raises based on salary ranges. Displays faculty details in a formatted table and provides statistics such as total raises, average raise, and payroll totals and writes them to an output file.
//
//********************************************************************



// imports
import java.io.IOException;
import java.util.NoSuchElementException;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Formatter;



public class Program7
{
   private Scanner input;
   private Formatter outputFile;
   private ArrayList<Double> oldSalaries;
   private ArrayList<Double> raisePercentages;
   private ArrayList<Double> payRaises;
   private ArrayList<Double> newSalaries;

   //Constructor
   public Program7() {
      oldSalaries = new ArrayList<>();
      raisePercentages = new ArrayList<>();
      payRaises = new ArrayList<>();
      newSalaries = new ArrayList<>();
  }

   //***************************************************************
   //
   //  Method:       main
   // 
   //  Description:  The main method of the program
   //
   //  Parameters:   A String Array
   //
   //  Returns:      N/A 
   //
   //**************************************************************
   public static void main(String[] args)
   {
      //Create new object
	   Program7 myObject = new Program7();
	   
      //Dev Info
	   developerInfo();
	   
      //Calling Open File Method
      myObject.openFile();

      //Read the data from the file and store it in array lists
      myObject.readRecords();



      //Write to records File
      myObject.writeToFile();

      //Write totals and averages to File
      myObject.calculateTotalsAndAverages();

      //Close Files
      myObject.closeFiles();

	  
      System.out.println("Program Complete!");
   } 

   //***************************************************************
   //
   //  Method:       openFile
   // 
   //  Description:  Opens the input file "Program7.txt" for reading
   //
   //  Parameters:   None
   //
   //  Returns:      N/A 
   //
   //**************************************************************
   public void openFile()
   {
      try
      {
         // Open the input file
         input = new Scanner(Paths.get("Program7.txt")); 


         // //Close the input file
         // input.close();
      } 
      catch (IOException ioException)
      {
         System.err.println("Error opening file. Terminating.");
         System.exit(1);
      }
   }
   
   
   //***************************************************************
   //
   //  Method:       readRecords
   // 
   //  Description:  Reads records of old salaries from input file, calculates raise percentages, pay raises, new salaries, and stores the data in ArrayLists.
   //
   //  Parameters:   None
   //
   //  Returns:      N/A 
   //
   //**************************************************************
   public void readRecords()
   {
      try 
      {
         while (input.hasNext()){ // while there is more to read 

            //Store the original value
            double oldSalary = input.nextDouble();

            //Variables 
            double raisePercentage;
            double payRaise;
            double newSalary;

            //If earning more than 70k
            if (oldSalary > 70000.00) {
                raisePercentage = 0.04;
            // If earning more than 50k up to 70k
            } else if (oldSalary > 50000.00) {
                raisePercentage = 0.07;
            //Everything else
            } else {
                raisePercentage = 0.055;
            }
            //Calculate Pay raise
            payRaise = raisePercentage * oldSalary;

            //Calculate new Salary
            newSalary = oldSalary + payRaise;

            //Add the data to our Array lists
            oldSalaries.add(oldSalary);
            raisePercentages.add(raisePercentage);
            payRaises.add(payRaise);
            newSalaries.add(newSalary);
         }

      } 
      catch (NoSuchElementException elementException)
      {
       System.err.println("File improperly formed. Terminating.");
		 System.exit(1); // terminate the program
      } 
      catch (IllegalStateException stateException)
      {
         System.err.println("Error reading from file. Terminating.");
		 System.exit(1); // terminate the program
      } 
   }


   //***************************************************************
   //
   //  Method:       writeToFile
   // 
   //  Description:  Creates output file, iterates through ArrayLists and writes the data from each list. 
   //
   //  Parameters:   None
   //
   //  Returns:      N/A 
   //
   //**************************************************************
   public void writeToFile(){

      try {
         //Create a new file for output
         outputFile = new Formatter("Program7-output.txt");

         // Write column headers to the output file
         outputFile.format("%12s%12s%10s%12s%12s%n", "Faculty #", "Old Salary", "Raise %", "Pay Raise", "New Salary");
         outputFile.format("----------------------------------------------------------%n");

         //Loop through old salaries arraylist based on size
         for (int i = 0; i < oldSalaries.size(); i++) {

            //Get facultyNumber
            double facultyNumber = i + 1;
            //Get Old Salary
            double oldSalary = oldSalaries.get(i);

            //Get Raise Percentage
            double raisePercentage = raisePercentages.get(i);

            //Get pay raise Amount
            double payRaise = payRaises.get(i);

            //Get new salary
            double newSalary = newSalaries.get(i);

            //Write them to file
            outputFile.format("%12.0f%12.2f%10.2f%12.2f%12.2f%n", facultyNumber, oldSalary, raisePercentage, payRaise, newSalary);
         }


      } catch (SecurityException e) {
         System.err.println("Permission denied: " + e.getMessage());
      } catch (Exception e) {
         System.err.println("An error occurred: " + e.getMessage());
      }
   }

   //***************************************************************
   //
   //  Method:       calculateTotalsAndAverages
   // 
   //  Description:  Loops through payRaises, oldSalaries, newSalaries and calculates totals, averages and then writes them to output file.
   //
   //  Parameters:   None
   //
   //  Returns:      N/A 
   //
   //**************************************************************

    public void calculateTotalsAndAverages() {
      //Variables to store totals
      double totalRaise = 0.0;
      double totalOldSalary = 0.0;
      double totalNewSalary = 0.0;
  
      // Calculate totals
      for (int i = 0; i < oldSalaries.size(); i++) {
          totalRaise += payRaises.get(i);
          totalOldSalary += oldSalaries.get(i);
          totalNewSalary += newSalaries.get(i);
      }
  
      //Calculate Averages
      double averageRaise = totalRaise / oldSalaries.size();
      double averageOldSalary = totalOldSalary / oldSalaries.size();
      double averageNewSalary = totalNewSalary / oldSalaries.size();
  
      
       //Creating Space
       outputFile.format("----------------------------------------------------------%n");
       outputFile.format("%n%n");

       //Writing Totals and Averages
       outputFile.format("Total amount of raises:       $%,15.2f%n", totalRaise);
       outputFile.format("Average of raises:            $%,15.2f%n%n", averageRaise);
       
       outputFile.format("Total payroll before raise:   $%,15.2f%n", totalOldSalary);
       outputFile.format("Total payroll after raise:    $%,15.2f%n%n", totalNewSalary);
       
       outputFile.format("Average payroll before raise: $%,15.2f%n", averageOldSalary);
       outputFile.format("Average payroll after raise:  $%,15.2f%n%n", averageNewSalary);
  }


   //***************************************************************
   //
   //  Method:       closeFiles
   // 
   //  Description:  Closes input and output file
   //
   //  Parameters:   None
   //
   //  Returns:      N/A 
   //
   //**************************************************************


  //Close Files 
  public void closeFiles() {
   if (input != null) {
       input.close();
   }
   if (outputFile != null) {
       outputFile.close();
   }
}
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
      System.out.println("Program: Seven \n");
	  
   } // End of developerInfo
}