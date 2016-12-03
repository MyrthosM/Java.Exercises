// Prentice Hall Java 10 book excercise 2.25
/* Write an application that reads an integer and determines and prints whether it’s odd or even.
[Hint: Use the remainder operator. An even number is a multiple of 2. Any multiple of 2 leaves a remainder of 0 when divided by 2.*/

import java.util.Scanner; // Importing the library for obtaining user input

public class Exercise225 {
	public static void main (String [] args) {
		//Declaration and initzialization of the program variables.
		int x = 0;
		int y = 0;
		
		//Obtaining input
		Scanner input = new Scanner(System.in);
		
		//Main program.
		System.out.print("Enter a whole number : ");
		x = input.nextInt();
		
		y = x%2;
		
		if(y == 0){
			System.out.printf("The number you have entred is even : %d%n", x);
		}
		else {
			System.out.printf("The number you have entred is odd : %d%n", x);
		}
		
				
	}
}