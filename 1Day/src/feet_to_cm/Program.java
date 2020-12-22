package feet_to_cm;

import java.util.Scanner;

public class Program
{
	public static void main(String[] args) { //using Method Overloading. 

        double feetDouble;
        float feetFloat;
	    Scanner input = new Scanner(System.in);
	    
        System.out.println("Enter the value in feet(double): ");
        feetDouble=Double.parseDouble(input.next());
        System.out.println(feetDouble+" feet= "+ calcFeetToCentimeters(feetDouble) + " cm");
        System.out.println("Enter the value in feet(float): ");
        feetFloat=Float.parseFloat(input.next());
        System.out.println(feetFloat+" feet= "+ calcFeetToCentimeters(feetFloat) + " cm");
    }
    private static float calcFeetToCentimeters(float feet) {
    	return (float) (feet * 30.48);
    }
    
    public static double calcFeetToCentimeters(double feet){
    	return (feet * 30.48);
    }
}
    