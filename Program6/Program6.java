//********************************************************************
//
//  Author:        Brittany Sifford
//
//  Program #:     Six
//
//  File Name:     Program6.java
//
//  Course:        ITSE 2321 Object-Oriented Programming
//
//  Due Date:     10/16/2023
//
//  Instructor:    Prof. Fred Kumi 
//
//  Chapter:       Chapter #6
//
//  Description:   This program calculates and displays the average
//                 of six test scores, all integers, after the lowest
//                 score has been dropped.
//
//                 Do not modify the main method or the header of any
//                 method.  You will not receive credit for Program 6
//                 if you do.  
//
//********************************************************************
import java.util.Scanner; 

public class Program6
{
   Scanner input = new Scanner(System.in);
   
   //***************************************************************
   //
   //  Method:       main
   // 
   //  Description:  The main method of the program.
   //                Do NOT modify this method. If you modify it, you
   //                will not receive credit for this program.
   //
   //  Parameters:   A String Array
   //
   //  Returns:      N/A 
   //
   //**************************************************************
   public static void main(String[] args)
   {
      Program6 object = new Program6();
	  
      int test1 = 0;
	   int test2 = 0;
      int test3 = 0;
      int test4 = 0;
      int test5 = 0;
      int test6 = 0;
	   int lowest = 0;
	   double average = 0.0;
		 
      developerInfo();
      displayMessage();

      // Call getScore once for each of the six test scores
      test1 = object.getScore("Please enter the 1st test scores: ");
      test2 = object.getScore("Please enter the 2nd test scores: ");
      test3 = object.getScore("Please enter the 3rd test scores: ");
      test4 = object.getScore("Please enter the 4th test scores: ");
      test5 = object.getScore("Please enter the 5th test scores: ");
      test6 = object.getScore("Please enter the 6th test scores: ");
	  
	  // Call findLowest to find and return the lowest
      lowest = object.findLowest(test1, test2, test3, test4, test5, test6);

      // Call calcAverage to calculate and return the average
      average = object.calcAverage(test1, test2, test3, test4, test5, test6, lowest);
   
      // Print the average to two decimal places
      object.printAverage(lowest, average);

   } // End of the main method

   //***************************************************************
   //
   //  Method:       displayMessage
   // 
   //  Description:  This method displays a message to screen 
   //
   //  Parameters:   None
   //
   //  Returns:      N/A 
   //
   //**************************************************************
   public static void displayMessage()
   {
      System.out.print("This program calculates and displays ");
      System.out.println("the average of six test");
      System.out.print("scores, all integers, after the lowest ");
      System.out.println("score has been dropped. \n");
   }
   
   //***************************************************************
   //
   //  Function:     getScore
   // 
   //  Description: Prompts user to enter score returns integer input while input is greater than or equal to 0 and less or equal to 100;
   //
   //  Parameters: String
   //
   //  Returns: int
   //
   //**************************************************************
   public int getScore(String prompt)
   {
      //Print the prompt
      System.out.println(prompt);
      //Grab the score from user
      int score = input.nextInt();

      while(score < 0 || score > 100){
         //Let user know of error
         System.out.println("Score should be greater than or equal to 0 and less than or equal to 100.");
         //Prompt user to resubmit score
         System.out.println(prompt);
         score = input.nextInt();
      }

      return score;
   }// end of the getScore method
   
   //***************************************************************
   //
   //  method:       calcAverage
   // 
   //  Description: Takes 6 test scores (s1-s6) and the lowest score int and calculates the average after removing the lowest score.
   //
   //  Parameters:  7 int
   //
   //  Returns: double
   //
   //**************************************************************
   public double calcAverage(int s1, int s2, int s3, int s4, int s5, int s6, int lowest)
   {
      int total = (s1 + s2 + s3 + s4 + s5 + s6) - lowest;
      return (double) total / 5; // We've subtracted 1 score thus 5 scores to cal avg

   }// end of calcAverage method

   //***************************************************************
   //
   //  method:       findLowest
   // 
   //  Description:  Takes 6 test scores and returns the lowest value
   //
   //  Parameters:  6 int 
   //
   //  Returns: int 
   //
   //**************************************************************
   public int findLowest(int s1, int s2, int s3, int s4, int s5, int s6)
   {
      int[] scores = {s1, s2, s3, s4, s5, s6};//create array to loop through
      int lowest = scores[0]; // set as the first number we encounter

      for(int i = 0; i < scores.length; i++){
         if(scores[i] < lowest){ // If the current number we are iterating upon is lower than the current number stored in lowest 
            lowest = scores[i]; // update lowest to be the current number
         }
      }

      return lowest;
   } // end of the findLowest method
   
   //***************************************************************
   //
   //  Method:       printAverage
   // 
   //  Description:  This method prints the average of the test scores, and the lowest test score
   //
   //  Parameters:   average
   //                lowest
   //
   //  Returns:      N/A 
   //
   //**************************************************************
   public void printAverage(int lowest, double average)
   {
      System.out.printf("Average: %.2f\n", average);
      System.out.println("Lowest: " + lowest);
   } // end of printAverage method

   
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
      System.out.println("Program: Six \n");

   } // End of the developerInfo method

} // End of Program6

