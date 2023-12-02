//********************************************************************
//
//  Author:       Brittany Sifford
//
//  Program #:     Program5
//
//  File Name:     Program5.java
//
//  Course:        ITSE 2321 Object-Oriented Programming
//
//  Due Date:      10/07/2023
//
//  Instructor:    Prof. Fred Kumi 
//
//  Chapter:       5
//
//  Description:  This program calculates the occupancy rate for a hotel by collecting information on the number of floors, rooms, and occupancy status for each floor, and then displaying statistics including total rooms, occupied rooms, unoccupied rooms, and the occupancy percentage
//
//********************************************************************

//Import the scanner
import java.util.Scanner;

public class Program5 {
 
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
 
    //Create a Scanner object for uesr input
    Scanner input = new Scanner(System.in);

    //Have user enter num of floors dynamically used for our loop
    System.out.print("Enter the number of floors in the hotel: ");
    int numFloors = input.nextInt();


    int totalRooms = 0;
    int totalOccupiedRooms = 0;


    // Blank line for separation
    System.out.println();

    //Loop through floors and figure out occupied rooms
    for (int floor = 1; floor <= numFloors; floor++) {

        System.out.print("Enter the number of rooms on floor " + floor + ": ");
        int numRooms = input.nextInt();
        totalRooms += numRooms;

        System.out.print("Enter the number of occupied rooms on floor " + floor + ": ");
        int numOccupiedRooms = input.nextInt();
        totalOccupiedRooms += numOccupiedRooms;
        
        // Blank line for separation
        System.out.println();
    }

    //Close the scanner object
    input.close();

    //Calculate open rooms
    int unoccupiedRooms = totalRooms - totalOccupiedRooms;
    //Calculate occupancy %
    double occupancyRate = (double) totalOccupiedRooms / totalRooms * 100.0;

    System.out.println("Total rooms in the hotel: " + totalRooms);
    System.out.println("Occupied rooms: " + totalOccupiedRooms);
    System.out.println("Unoccupied rooms: " + unoccupiedRooms);
    System.out.printf("Occupancy rate: %.1f%%\n", occupancyRate);

    
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
      System.out.println("Program: Five \n");

  } // End of the developerInfo method


}


