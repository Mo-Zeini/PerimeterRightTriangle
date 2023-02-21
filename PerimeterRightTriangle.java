package PerimeterRightTriangle;

/**
* This class implements a simple program that asks the user to input 
* the length of the hypotenuse and a leg in order to compute 
* the perimeter of a right-angled triangle. 
* We know that the perimeter of a triangle is the sum of its three sides.
* However, Suppose I  want to make a program that computes the perimeter 
* of a right-angled triangle with only a hypotenuse and a leg. 
* Hence, in this case, we must first calculate the length of the other leg. 
* Then, we can get the perimeter.
*/

import java.util.Scanner; // Add the Scanner class to the program.

public class PerimeterRightTriangle {

	public static void main(String[] args) {
		
		Scanner stdin = new Scanner(System.in); // Create the Scanner.
		
		System.out.print("Enter the length of the hypotenuse in cm: ");
		double hypotenuse = stdin.nextDouble();
		
		System.out.print("Enter the length of one leg in cm: ");
		double leg1 = stdin.nextDouble();
		
		double leg2 = Math.sqrt(hypotenuse*hypotenuse - leg1*leg1); // Compute the length of the other leg.
		
		double Perimeter = hypotenuse + leg1 + leg2; // Compute the perimeter of the triangle.
		
		System.out.printf("The length of the other leg is %.2fcm %n", leg2);
		System.out.printf("The Perimeter of the right-angled triangle is %.2fcm %n", Perimeter);

	} // end of main()

} // end of class PerimeterRightTriangle
