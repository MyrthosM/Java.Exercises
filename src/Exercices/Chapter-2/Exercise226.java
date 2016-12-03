// Prentice Hall Java 10 book excercise 2.26
/* Write an application that reads two integers, determines whether the first is a
multiple of the second and prints the result. [Hint: Use the remainder operator.]*/

import java.util.Scanner; // Importing the library for obtaining user input

public class Exercise226 {
	public static void main (String [] args) {
		//Declaration and initzialization of the program variables.
		int x = 0;
		int y = 0;
		int z = 0;
		
		//Obtaining input
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter First Number : ");
		x = input.nextInt();
		
		System.out.print("Enter Second Number : ");
		y = input.nextInt();
		
		z = y%x;
		
		if (z == 0){
			System.out.printf("The first number is a multiple of the second %d", x);
		}
		else {
			System.out.printf("The first number is not a multiple of the second %d", x);
		}
		
	}
}