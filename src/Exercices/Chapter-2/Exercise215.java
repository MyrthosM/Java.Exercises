// Prentice Hall Java 10 book excercise 2.15
// Ask the user to input two integers and print out their sum, product, Difference, Quotient.
// This exercise will be using only whole numbers. If a floating point number is entered the program will crash.


import java.util.Scanner;

public class Exercise215{
	
	public static void main (String [] args){
		int x = 0; // First Number entered.
		int y = 0; // Second Number entered.
		int z = 0; // Result.
		
		Scanner input = new Scanner(System.in); //Take input from user.
		
		System.out.print("Please enter first whole number: ");
		x = input.nextInt();
		
		System.out.print("Please enter second whole number: ");
		y = input.nextInt();
		z = y + x;
		System.out.printf("The sum of the two numbers is %d%n", z);
		z = y * x;
		System.out.printf("The product of the two nombers is %d%n", z);
		z = y - x;
		System.out.printf("The difference between these two numbers is %d%n", z);
		z = y / x;
		System.out.printf("The quotient of these two numbers is %d%n", z);
		
	}
}
