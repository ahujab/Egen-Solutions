package Carpetcalculator;

import java.util.Scanner;

public class CarpetCalculator
{
public static void main(String[] args)
{
double CARPET_PRICE; // Price per square foot
double length; // To input room length
double width; // To input room width
RoomDimension dimensions; // To hold room dimensions
RoomCarpet room; // To determine cost
// Create a Scanner object for keyboard input.
Scanner keyboard = new Scanner(System.in);
  

  
// Get the length of the room.
System.out.print("Enter the length first: ");
length = keyboard.nextDouble();
  
// Get the width of the room.
System.out.print("Now enter the width: ");
width = keyboard.nextDouble();

System.out.print("Lastly, Enter the Cost per Sq ft of the carpet: ");
CARPET_PRICE = keyboard.nextDouble();
  
// Create RoomDimension and RoomCarpet objects.
dimensions = new RoomDimension(length, width);
room = new RoomCarpet(dimensions, CARPET_PRICE);
  
// Display the dimensions and cost.
System.out.println(room);
keyboard.close();
}
}